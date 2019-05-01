// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.http.policy;

import com.azure.common.credentials.Credential;
import com.azure.common.http.HttpPipelineCallContext;
import com.azure.common.http.HttpPipelineNextPolicy;
import com.azure.common.http.HttpResponse;
import reactor.core.publisher.Mono;

/**
 * The Pipeline policy that adds credentials from ServiceClientCredentials to a request.
 */
public class CredentialsPolicy implements HttpPipelinePolicy {
    private final Credential credential;

    /**
     * Creates CredentialsPolicy.
     *
     * @param credential the credential
     */
    public CredentialsPolicy(Credential credential) {
        this.credential = credential;
    }

    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        return credential.getAuthenticationHeaderAsync(context.httpRequest().url().getHost(), context.httpRequest())
            .doOnNext(h -> context.httpRequest().withHeader(h.name(), h.value()))
            .flatMap(h -> next.process());
    }
}
