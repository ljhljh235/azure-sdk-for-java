// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.implementation.http;

import com.azure.common.http.HttpBody;
import com.azure.common.http.HttpHeaders;
import com.azure.common.http.HttpResponse;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * HTTP response which will buffer the response's body when/if it is read.
 */
public final class BufferedHttpResponse extends HttpResponse {
    private final HttpResponse innerHttpResponse;
    private final Flux<ByteBuf> cachedBody;

    /**
     * Creates a buffered HTTP response.
     *
     * @param innerHttpResponse The HTTP response to buffer
     */
    public BufferedHttpResponse(HttpResponse innerHttpResponse) {
        this.innerHttpResponse = innerHttpResponse;
        this.cachedBody = innerHttpResponse.body().buffer().toByteBufAsync();
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
    public HttpBody body() {
        return HttpBody.fromByteBuf(cachedBody);
    }

    @Override
    public BufferedHttpResponse buffer() {
        return this;
    }
}
