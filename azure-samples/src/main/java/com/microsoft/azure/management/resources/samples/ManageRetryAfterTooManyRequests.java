/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.samples;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.credentials.ApplicationTokenCredentials;
import com.microsoft.azure.management.Azure;
import com.microsoft.azure.management.resources.ResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.resources.fluentcore.utils.SdkContext;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.LogLevel;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.RestException;
import com.microsoft.rest.protocol.ResponseBuilder;
import com.microsoft.rest.protocol.SerializerAdapter;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import rx.Observable;
import rx.schedulers.Schedulers;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Azure Resource sample for managing resource groups -
 * - Create a resource group
 * - Update a resource group
 * - Create another resource group
 * - List resource groups
 * - Delete a resource group.
 */

public final class ManageRetryAfterTooManyRequests {

    private static int count = 0;

    /**
     * Main function which runs the actual sample.
     * @param azure instance of the azure client
     * @return true if sample runs successfully
     */
    public static boolean runSample(Azure azure) {
        final String rgName = SdkContext.randomResourceName("rgRSMA", 24);
        try {
            //=============================================================
            // Get a resource group which doesn't exist.

            System.out.println("Trying to find resource group " + rgName);

            try {
                azure.resourceGroups().getByName(rgName);
            } catch (CloudException e) {
                if (!e.body().code().equals("ResourceGroupNotFound")) {
                    throw new AssertionError("Unexpected error code.");
                }
            }

            //=============================================================
            // Create resource group.

            System.out.println("Creating a resource group with name: " + rgName);

            final ResourceGroup resourceGroup = azure.resourceGroups().define(rgName)
                    .withRegion(Region.US_WEST)
                    .create();

            System.out.println("Created a resource group with name: " + rgName);

            //=============================================================
            // Update the resource group for 2000 times.
            Observable.just(resourceGroup)
                    .repeatWhen(observable -> (observable.delay(100, TimeUnit.MILLISECONDS)))
                    .takeUntil(rg -> count++ > 2000)
                    .flatMap(rg -> resourceGroup.update()
                        .withTag("tag" + count, "value" + count)
                        .applyAsync())
                    .flatMap(rg -> resourceGroup.update()
                        .withTags(new HashMap<>())
                        .applyAsync())
                    .subscribeOn(Schedulers.io())
                    .onErrorReturn(t -> null)
                    .toBlocking()
                    .subscribe();

            //=============================================================
            // Delete a resource group.

            System.out.println("Deleting resource group: " + rgName);

            azure.resourceGroups().beginDeleteByName(rgName);
            return true;
        } catch (Exception f) {

            System.out.println(f.getMessage());
            f.printStackTrace();

        } finally {

            try {
                System.out.println("Deleting Resource Group: " + rgName);
                azure.resourceGroups().beginDeleteByName(rgName);
            } catch (NullPointerException npe) {
                System.out.println("Did not create any resources in Azure. No clean up is necessary");
            } catch (Exception g) {
                g.printStackTrace();
            }
        }
        return false;
    }

    /**
     * Main entry point.
     *
     * @param args the parameters
     */
    public static void main(String[] args) {
        try {
            //=================================================================
            // Authenticate

            ApplicationTokenCredentials credentials = ApplicationTokenCredentials.fromFile(new File(System.getenv("AZURE_AUTH_LOCATION")));

            RestClient restClient = new RestClient.Builder()
                    .withBaseUrl(AzureEnvironment.AZURE, AzureEnvironment.Endpoint.RESOURCE_MANAGER)
                    .withCredentials(credentials)
                    .withSerializerAdapter(new AzureJacksonAdapter())
                    .withResponseBuilderFactory(new ResponseBuilder.Factory() {
                        private AzureResponseBuilder.Factory rawFactory = new AzureResponseBuilder.Factory();
                        @Override
                        public <T, E extends RestException> ResponseBuilder<T, E> newInstance(SerializerAdapter<?> serializerAdapter) {
                            return rawFactory.<T, E>newInstance(serializerAdapter).withThrowOnGet404(true);
                        }
                    })
                    .withMaxIdleConnections(10)
                    .withLogLevel(LogLevel.BODY_AND_HEADERS)
                    .withInterceptor(new ThrottlingInterceptor())
                    .build();

            Azure azure = Azure
                    .authenticate(restClient, credentials.domain())
                    .withDefaultSubscription();

            runSample(azure);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static class ThrottlingInterceptor implements Interceptor {
        private static final ReentrantLock lock = new ReentrantLock();

        @Override
        public Response intercept(Chain chain) throws IOException {
            // Gate control
            try {
                synchronized (lock) {
                    if (lock.isLocked()) {
                        lock.wait();
                    }
                }
            } catch (InterruptedException e) {
                throw new IOException(e);
            }
            Response response = chain.proceed(chain.request());
            if (response.code() != 429) {
                return response;
            }
            // Received 429!
//            synchronized (latch) {
//                try {
//                    latch.await();
//                } catch (InterruptedException e) {
//                    throw new IOException(e);
//                }
//                latch = new CountDownLatch(1);
//            }
            try {
                synchronized (lock) {
                    if (lock.isLocked()) {
                        lock.wait();
                        return chain.proceed(chain.request());
                    } else {
                        lock.lock();
                    }
                }
            } catch (InterruptedException e) {
                throw new IOException(e);
            }
            try {
                String retryAfterHeader = response.header("Retry-After");
                int retryAfter = 0;
                if (retryAfterHeader != null) {
                    retryAfter = Integer.parseInt(retryAfterHeader);
                }
                if (retryAfter <= 0) {
                    Pattern pattern = Pattern.compile("try again after '([0-9]*)' minutes", Pattern.CASE_INSENSITIVE);
                    Matcher matcher = pattern.matcher(content(response.body()));
                    if (matcher.find()) {
                        retryAfter = (int) TimeUnit.MINUTES.toSeconds(Integer.parseInt(matcher.group(1)));
                    }
                }
                if (retryAfter > 0) {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(retryAfter));
                }
            } catch (Throwable t) {
                throw new IOException(t);
            } finally {
                synchronized (lock) {
                    lock.unlock();
                    lock.notifyAll();
                }
            }
            return chain.proceed(chain.request());
        }

        private String content(ResponseBody responseBody) throws IOException {
            if (responseBody == null) {
                return null;
            }
            BufferedSource source = responseBody.source();
            source.request(Long.MAX_VALUE); // Buffer the entire body.
            Buffer buffer = source.buffer();
            return buffer.readUtf8();
        }
    }
}
