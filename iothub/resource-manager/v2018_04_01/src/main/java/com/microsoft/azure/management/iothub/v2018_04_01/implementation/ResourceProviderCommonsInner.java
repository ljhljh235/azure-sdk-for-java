/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.iothub.v2018_04_01.ErrorDetailsException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ResourceProviderCommons.
 */
public class ResourceProviderCommonsInner {
    /** The Retrofit service to perform REST calls. */
    private ResourceProviderCommonsService service;
    /** The service client containing this operation class. */
    private IotHubClientImpl client;

    /**
     * Initializes an instance of ResourceProviderCommonsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ResourceProviderCommonsInner(Retrofit retrofit, IotHubClientImpl client) {
        this.service = retrofit.create(ResourceProviderCommonsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ResourceProviderCommons to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ResourceProviderCommonsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.iothub.v2018_04_01.ResourceProviderCommons list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Devices/usages")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get the number of iot hubs in the subscription.
     * Get the number of free and paid iot hubs in the subscription.
     *
     * @return the PagedList<UserSubscriptionQuotaInner> object if successful.
     */
    public PagedList<UserSubscriptionQuotaInner> list() {
        PageImpl1<UserSubscriptionQuotaInner> page = new PageImpl1<>();
        page.setItems(listWithServiceResponseAsync().toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<UserSubscriptionQuotaInner>(page) {
            @Override
            public Page<UserSubscriptionQuotaInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Get the number of iot hubs in the subscription.
     * Get the number of free and paid iot hubs in the subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<UserSubscriptionQuotaInner>> listAsync(final ServiceCallback<List<UserSubscriptionQuotaInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get the number of iot hubs in the subscription.
     * Get the number of free and paid iot hubs in the subscription.
     *
     * @return the observable to the List&lt;UserSubscriptionQuotaInner&gt; object
     */
    public Observable<Page<UserSubscriptionQuotaInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<UserSubscriptionQuotaInner>>, Page<UserSubscriptionQuotaInner>>() {
            @Override
            public Page<UserSubscriptionQuotaInner> call(ServiceResponse<List<UserSubscriptionQuotaInner>> response) {
                PageImpl1<UserSubscriptionQuotaInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Get the number of iot hubs in the subscription.
     * Get the number of free and paid iot hubs in the subscription.
     *
     * @return the observable to the List&lt;UserSubscriptionQuotaInner&gt; object
     */
    public Observable<ServiceResponse<List<UserSubscriptionQuotaInner>>> listWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<UserSubscriptionQuotaInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<UserSubscriptionQuotaInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<UserSubscriptionQuotaInner>> result = listDelegate(response);
                        List<UserSubscriptionQuotaInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<UserSubscriptionQuotaInner>> clientResponse = new ServiceResponse<List<UserSubscriptionQuotaInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<UserSubscriptionQuotaInner>> listDelegate(Response<ResponseBody> response) throws ErrorDetailsException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<UserSubscriptionQuotaInner>, ErrorDetailsException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<UserSubscriptionQuotaInner>>() { }.getType())
                .registerError(ErrorDetailsException.class)
                .build(response);
    }

}
