// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.http;

import com.azure.common.implementation.util.FluxUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.ByteBufFlux;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * The body of an HTTP request of response.
 */
public class HttpBody {
    private Flux<ByteBuf> asyncBody;
    private byte[] syncBody;

    private HttpBody(Flux<ByteBuf> asyncBody) {
        this.asyncBody = asyncBody;
    }

    private HttpBody(byte[] syncBody) {
        this.syncBody = syncBody;
    }

    public static HttpBody empty() {
        return new HttpBody(new byte[0]);
    }

    public static HttpBody fromByteBuf(Flux<ByteBuf> body) {
        return new HttpBody(body);
    }

    public static HttpBody fromByteArray(byte[] body) {
        return new HttpBody(body);
    }

    public static HttpBody fromString(String body) {
        return new HttpBody(body.getBytes(StandardCharsets.UTF_8));
    }

    public static HttpBody fromString(String body, Charset charset) {
        return new HttpBody(body.getBytes(charset));
    }

    public Flux<ByteBuf> toByteBufAsync() {
        if (asyncBody != null) {
            return asyncBody;
        } else if (syncBody != null) {
            return Flux.just(Unpooled.wrappedBuffer(syncBody));
        }
        return ByteBufFlux.empty();
    }

    public byte[] toByteArray() {
        if (syncBody != null) {
            return syncBody;
        } else if (asyncBody != null) {
            throw new UnsupportedOperationException("Getting body synchronously from an async body. Use toByteArrayAsync() instead");
        }
        return new byte[0];
    }

    public Mono<byte[]> toByteArrayAsync() {
        if (syncBody != null) {
            return Mono.just(syncBody);
        } else if (asyncBody != null) {
            return FluxUtil.collectBytesInByteBufStream(asyncBody, true);
        }
        return Mono.just(new byte[0]);
    }

    public String toString() {
        if (syncBody != null) {
            return new String(syncBody, StandardCharsets.UTF_8);
        } else if (asyncBody != null) {
            throw new UnsupportedOperationException("Getting body synchronously from an async body. Use toStringAsync() instead");
        }
        return "";
    }

    public String toString(Charset charset) {
        if (syncBody != null) {
            return new String(syncBody, charset);
        } else if (asyncBody != null) {
            throw new UnsupportedOperationException("Getting body synchronously from an async body. Use toStringAsync() instead");
        }
        return "";
    }

    public Mono<String> toStringAsync() {
        if (syncBody != null) {
            return Mono.just(new String(syncBody, StandardCharsets.UTF_8));
        } else if (asyncBody != null) {
            return FluxUtil.collectBytesInByteBufStream(asyncBody, true).map(b -> new String(b, StandardCharsets.UTF_8));
        }
        return Mono.just("");
    }

    public Mono<String> toStringAsync(Charset charset) {
        if (syncBody != null) {
            return Mono.just(new String(syncBody, charset));
        } else if (asyncBody != null) {
            return FluxUtil.collectBytesInByteBufStream(asyncBody, true).map(b -> new String(b, charset));
        }
        return Mono.just("");
    }

    public HttpBody buffer() {
        if (asyncBody != null) {
            return HttpBody.fromByteBuf(asyncBody.cache());
        } else if (syncBody != null) {
            return HttpBody.fromByteArray(syncBody);
        }
        return this;
    }
}
