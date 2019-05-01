// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.http;

import reactor.core.publisher.Mono;

import java.util.function.Supplier;

/**
 * A generic interface for sending HTTP requests and getting responses.
 */
public interface HttpClient {
    /**
     * Send the provided request asynchronously.
     *
     * @param request The HTTP request to send
     * @return A {@link Mono} that emits response asynchronously
     */
    Mono<HttpResponse> sendAsync(HttpRequest request);

    default HttpResponse send(HttpRequest request) {
        return sendAsync(request).block();
    }

    /**
     * Create default HttpClient instance.
     *
     * @return the HttpClient
     */
    static HttpClient createDefault() {
        Class<?> httpClientClass = null;
        try {
            httpClientClass = Class.forName("com.azure.common.netty.ReactorNettyClient");
        } catch (ClassNotFoundException e) { /* Netty not found, try other options */ }
        // Repeat for other Http clients
        if (httpClientClass == null) {
            try {
                httpClientClass = Class.forName("com.azure.common.http.HttpUrlConnectionClient");
            } catch (ClassNotFoundException e) {
                // Last built-in option
                throw new NoClassDefFoundError("Cannot find any class implementing HttpClient");
            }
        }
        try {
            return (HttpClient) httpClientClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Apply the provided proxy configuration to the HttpClient.
     *
     * @param proxyOptions the proxy configuration supplier
     * @return a HttpClient with proxy applied
     */
    HttpClient proxy(Supplier<ProxyOptions> proxyOptions);

    /**
     * Apply or remove a wire logger configuration.
     *
     * @param enableWiretap wiretap config
     * @return a HttpClient with wire logging enabled or disabled
     */
    HttpClient wiretap(boolean enableWiretap);

    /**
     * Set the port that client should connect to.
     *
     * @param port the port
     * @return a HttpClient with port applied
     */
    HttpClient port(int port);
}
