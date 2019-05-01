// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.credentials;

import com.azure.common.http.HttpHeader;
import com.azure.common.http.HttpRequest;
import reactor.core.publisher.Mono;

/**
 * Provides credentials for an HTTP request.
 */
public interface Credential {
    /**
     * Given the {@param httpRequest}, generates the HTTP header for authentication.
     *
     * @param resource The resource / audience the authentication header is for.
     * @param httpRequest The HTTP request that requires an authorization header.
     * @return The value containing currently valid credentials to put in the HTTP header.
     */
    Mono<HttpHeader> getAuthenticationHeaderAsync(String resource, HttpRequest httpRequest);
}
