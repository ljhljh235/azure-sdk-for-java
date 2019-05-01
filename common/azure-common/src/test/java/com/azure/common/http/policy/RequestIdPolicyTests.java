// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.http.policy;

import com.azure.common.http.HttpBody;
import com.azure.common.http.HttpHeaders;
import com.azure.common.http.HttpMethod;
import com.azure.common.http.HttpPipeline;
import com.azure.common.http.HttpRequest;
import com.azure.common.http.HttpResponse;
import com.azure.common.http.MockHttpClient;
import org.junit.Assert;
import org.junit.Test;
import reactor.core.publisher.Mono;

import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class RequestIdPolicyTests {
    private final HttpResponse mockResponse = new HttpResponse() {
        @Override
        public int statusCode() {
            return 500;
        }

        @Override
        public String headerValue(String name) {
            return null;
        }

        @Override
        public HttpHeaders headers() {
            return new HttpHeaders();
        }

        @Override
        public HttpBody body() {
            return HttpBody.empty();
        }
    };

    private static final String REQUEST_ID_HEADER = "x-ms-client-request-id";

    @Test
    public void newRequestIdForEachCall() throws Exception {
        HttpPipeline pipeline = new HttpPipeline(new MockHttpClient() {
            String firstRequestId = null;
            @Override
            public Mono<HttpResponse> sendAsync(HttpRequest request) {
                if (firstRequestId != null) {
                    String newRequestId = request.headers().value(REQUEST_ID_HEADER);
                    Assert.assertNotNull(newRequestId);
                    Assert.assertNotEquals(newRequestId, firstRequestId);
                }

                firstRequestId = request.headers().value(REQUEST_ID_HEADER);
                if (firstRequestId == null) {
                    Assert.fail();
                }
                return Mono.just(mockResponse);
            }
        },
        new RequestIdPolicy());

        pipeline.sendAsync(new HttpRequest(HttpMethod.GET, new URL("http://localhost/"))).block();
        pipeline.sendAsync(new HttpRequest(HttpMethod.GET, new URL("http://localhost/"))).block();
    }

    @Test
    public void sameRequestIdForRetry() throws Exception {
        final HttpPipeline pipeline = new HttpPipeline(new MockHttpClient() {
            String firstRequestId = null;

            @Override
            public Mono<HttpResponse> sendAsync(HttpRequest request) {
                if (firstRequestId != null) {
                    String newRequestId = request.headers().value(REQUEST_ID_HEADER);
                    Assert.assertNotNull(newRequestId);
                    Assert.assertEquals(newRequestId, firstRequestId);
                }
                firstRequestId = request.headers().value(REQUEST_ID_HEADER);
                if (firstRequestId == null) {
                    Assert.fail();
                }
                return Mono.just(mockResponse);
            }
        },
        new RequestIdPolicy(),
        new RetryPolicy(1, Duration.of(0, ChronoUnit.SECONDS)));

        pipeline.sendAsync(new HttpRequest(HttpMethod.GET, new URL("http://localhost/"))).block();
    }
}
