// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.implementation.http;

import com.azure.common.http.HttpHeaders;
import com.azure.common.http.AsyncHttpResponse;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * HTTP response which will buffer the response's body when/if it is read.
 */
public final class BufferedHttpResponse extends AsyncHttpResponse {
    private final AsyncHttpResponse innerHttpResponse;
    private final Mono<byte[]> cachedBody;

    /**
     * Creates a buffered HTTP response.
     *
     * @param innerHttpResponse The HTTP response to buffer
     */
    public BufferedHttpResponse(AsyncHttpResponse innerHttpResponse) {
        this.innerHttpResponse = innerHttpResponse;
        this.cachedBody = innerHttpResponse.bodyAsByteArrayAsync().cache();
        this.withRequest(innerHttpResponse.request());
    }

    @Override
    public int statusCode() {
        return innerHttpResponse.statusCode();
    }

    @Override
    public String headerValue(String name) {
        return innerHttpResponse.headerValue(name);
    }

    @Override
    public HttpHeaders headers() {
        return innerHttpResponse.headers();
    }

    @Override
    public Mono<byte[]> bodyAsByteArrayAsync() {
        return cachedBody;
    }

    @Override
    public Flux<ByteBuf> bodyAsByteBufAsync() {
        return bodyAsByteArrayAsync().flatMapMany(bytes -> Flux.just(Unpooled.wrappedBuffer(bytes)));
    }

    @Override
    public Mono<String> bodyAsStringAsync() {
        return bodyAsByteArrayAsync()
                .map(bytes -> bytes == null ? null : new String(bytes, StandardCharsets.UTF_8));
    }

    @Override
    public Mono<String> bodyAsStringAsync(Charset charset) {
        return bodyAsByteArrayAsync()
                .map(bytes -> bytes == null ? null : new String(bytes, charset));
    }

    @Override
    public BufferedHttpResponse buffer() {
        return this;
    }
}
