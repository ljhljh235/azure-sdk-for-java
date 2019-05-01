// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common;

import com.azure.common.credentials.BasicAuthenticationCredentials;
import com.azure.common.credentials.TokenCredential;
import com.azure.common.http.HttpMethod;
import com.azure.common.http.HttpPipeline;
import com.azure.common.http.HttpRequest;
import com.azure.common.http.MockHttpClient;
import com.azure.common.http.policy.CredentialsPolicy;
import com.azure.common.http.policy.HttpPipelinePolicy;
import org.junit.Assert;
import org.junit.Test;
import reactor.core.publisher.Mono;

import java.net.URL;

public class CredentialsTests {

    @Test
    public void basicCredentialsTest() throws Exception {
        BasicAuthenticationCredentials credentials = new BasicAuthenticationCredentials("user", "pass");

        HttpPipelinePolicy auditorPolicy =  (context, next) -> {
            String headerValue = context.httpRequest().headers().value("Authorization");
            Assert.assertEquals("Basic dXNlcjpwYXNz", headerValue);
            return next.process();
        };
        //
        final HttpPipeline pipeline = new HttpPipeline(new MockHttpClient(),
                new CredentialsPolicy(credentials),
                auditorPolicy);


        HttpRequest request = new HttpRequest(HttpMethod.GET, new URL("http://localhost"));
        pipeline.send(request).block();
    }

    @Test
    public void tokenCredentialsTest() throws Exception {
        TokenCredential credentials = new TokenCredential() {
            @Override
            public Mono<String> getTokenAsync(String resource) {
                return Mono.just("this_is_a_token");
            }
        };

        HttpPipelinePolicy auditorPolicy =  (context, next) -> {
            String headerValue = context.httpRequest().headers().value("Authorization");
            Assert.assertEquals("Bearer this_is_a_token", headerValue);
            return next.process();
        };

        final HttpPipeline pipeline = new HttpPipeline(new MockHttpClient(),
                new CredentialsPolicy(credentials),
                auditorPolicy);

        HttpRequest request = new HttpRequest(HttpMethod.GET, new URL("http://localhost"));
        pipeline.send(request).block();
    }
}
