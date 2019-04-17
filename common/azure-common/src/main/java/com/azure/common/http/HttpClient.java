// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.http;

import reactor.core.publisher.Mono;

import java.nio.charset.Charset;
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
    Mono<AsyncHttpResponse> sendAsync(HttpRequest request);

    default HttpResponse send(HttpRequest request) {
        return sendAsync(request).flatMap(ahr -> ahr.bodyAsByteArrayAsync()
            .map(bytes -> new HttpResponse() {
                @Override
                public int statusCode() {
                    return ahr.statusCode();
                }

                @Override
                public String headerValue(String name) {
                    return ahr.headerValue(name);
                }

                @Override
                public HttpHeaders headers() {
                    return ahr.headers();
                }

                @Override
                public byte[] bodyAsByteArray() {
                    return bytes;
                }

                @Override
                public String bodyAsString() {
                    return new String(bytes);
                }

                @Override
                public String bodyAsString(Charset charset) {
                    return new String(bytes, charset);
                }
            })
        ).block();
    }

    /**
     * Create default HttpClient instance.
     *
     * @return the HttpClient
     */
    static HttpClient createDefault() {
        return new ReactorNettyClient();
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
