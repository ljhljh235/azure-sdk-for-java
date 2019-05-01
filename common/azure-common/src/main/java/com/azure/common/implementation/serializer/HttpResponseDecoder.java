// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.implementation.serializer;

import com.azure.common.http.HttpResponse;
import reactor.core.publisher.Mono;

import java.io.Closeable;
import java.lang.reflect.Type;

/**
 * Decode {@link HttpResponse} to {@link HttpDecodedResponse}.
 */
public final class HttpResponseDecoder {
    // The adapter for deserialization
    private final SerializerAdapter serializer;

    /**
     * Creates HttpResponseDecoder.
     *
     * @param serializer the serializer
     */
    public HttpResponseDecoder(SerializerAdapter serializer) {
        this.serializer = serializer;
    }

    /**
     * Asynchronously decodes a {@link HttpResponse}.
     *
     * @param response the publisher that emits response to be decoded
     * @param decodeData the necessary data required to decode the response emitted by {@code response}
     * @return a publisher that emits decoded HttpResponse upon subscription
     */
    public Mono<HttpDecodedResponse> decode(Mono<HttpResponse> response, HttpResponseDecodeData decodeData) {
        return response.map(r -> new HttpDecodedResponse(r, this.serializer, decodeData));
    }

    /**
     * Synchronously decodes a {@link HttpResponse}.
     *
     * @param response the response to be decoded
     * @param decodeData the necessary data required to decode the response emitted by {@code response}
     * @return the decoded HttpResponse
     */
    public HttpDecodedResponse decode(HttpResponse response, HttpResponseDecodeData decodeData) {
        return new HttpDecodedResponse(response, this.serializer, decodeData);
    }

    /**
     * A decorated HTTP response which has subscribable body and headers that supports lazy decoding.
     *
     * Subscribing to body kickoff http content reading, it's decoding then emission of decoded object.
     * Subscribing to header kickoff header decoding and emission of decoded object.
     */
    public static final class HttpDecodedResponse implements Closeable {
        private final HttpResponse response;
        private final SerializerAdapter serializer;
        private final HttpResponseDecodeData decodeData;
        private Mono<Object> bodyCached;
        private Object bodyDecoded;
        private Object headersDecoded;

        /**
         * Creates HttpDecodedResponse.
         * Package private Ctr.
         *
         * @param response the publisher that emits the raw response upon subscription which needs to be decoded
         * @param serializer the decoder
         * @param decodeData the necessary data required to decode a Http response
         */
        HttpDecodedResponse(final HttpResponse response, SerializerAdapter serializer, HttpResponseDecodeData decodeData) {
            if (HttpResponseBodyDecoder.isDecodable(response, decodeData)) {
                this.response = response.buffer();
            } else {
                this.response = response;
            }
            this.serializer = serializer;
            this.decodeData = decodeData;
        }

        /**
         * @return get the raw response that this decoded response based on
         */
        public HttpResponse sourceResponse() {
            return this.response;
        }

        /**
         * Gets the publisher when subscribed the http content gets read, decoded
         * and emitted. {@code Mono.empty()} gets emitted if the content is not
         * decodable.
         *
         * @return publisher that emits decoded http content
         */
        public Mono<Object> decodedBodyAsync() {
            if (this.bodyCached == null && this.bodyDecoded == null) {
                this.bodyCached = HttpResponseBodyDecoder.decodeAsync(this.response,
                        this.serializer,
                        this.decodeData).cache();
            }
            if (this.bodyCached != null) {
                return this.bodyCached;
            }
            else if (this.bodyDecoded != null) {
                this.bodyCached = Mono.just(bodyDecoded);
            }
            return this.bodyCached;
        }

        /**
         * Gets the publisher when subscribed the http content gets read, decoded
         * and emitted. {@code Mono.empty()} gets emitted if the content is not
         * decodable.
         *
         * @return the decoded http content
         */
        public Object decodedBody() {
            if (this.bodyCached == null && this.bodyDecoded == null) {
                this.bodyDecoded = HttpResponseBodyDecoder.decode(this.response,
                        this.serializer,
                        this.decodeData);
            }
            if (this.bodyDecoded != null) {
                return this.bodyDecoded;
            }
            else if (this.bodyCached != null) {
                this.bodyDecoded = this.bodyCached.block();
            }
            return bodyDecoded;
        }

        /**
         * Gets the publisher when subscribed the http header gets decoded and emitted.
         * {@code Mono.empty()} gets emitted if the headers are not decodable.
         *
         * @return publisher that emits entity instance representing decoded http headers
         */
        public Object decodedHeaders() {
            if (this.headersDecoded == null) {
                this.headersDecoded = HttpResponseHeaderDecoder.decode(this.response,
                        this.serializer,
                        this.decodeData);
            }
            return this.headersDecoded;
        }

        /**
         * @return the {@code java.lang.reflect.Type} used to decode the response body,
         * null if the body is not decodable
         */
        public Type decodedType() {
            return HttpResponseBodyDecoder.decodedType(this.response, this.decodeData);
        }

        /**
         * @return true if the response status code is considered as error, false otherwise
         */
        public boolean isErrorStatus() {
            return HttpResponseBodyDecoder.isErrorStatus(this.response, this.decodeData);
        }

        @Override
        public void close() {
            this.response.close();
        }
    }
}
