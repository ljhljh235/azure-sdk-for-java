// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.http;

import com.azure.common.http.ProxyOptions.Type;
import io.netty.buffer.ByteBuf;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * HttpClient that is implemented using reactor-netty.
 */
public class HttpUrlConnectionClient implements HttpClient {
    private ProxyOptions proxyOptions;

    /**
     * Creates default ReactorNettyClient.
     */
    HttpUrlConnectionClient() {
    }

    public HttpResponse send(final HttpRequest request) {
        HttpURLConnection connection = null;
        try {
            if (proxyOptions == null) {
                connection = (HttpURLConnection) request.url().openConnection();
            } else {
                Proxy proxy = new Proxy(proxyOptions.type() == Type.HTTP? Proxy.Type.HTTP: Proxy.Type.SOCKS, proxyOptions.address());
                connection = (HttpURLConnection) request.url().openConnection(proxy);
            }
            if (request.httpMethod() == HttpMethod.PATCH) {
                throw new UnsupportedOperationException("HttpUrlConnection cannot handle PATCH requests");
            }
            connection.setRequestMethod(request.httpMethod().name());
            for (Map.Entry<String, String> header : request.headers().toMap().entrySet()) {
                connection.setRequestProperty(header.getKey(), header.getValue());
            }
            if (request.body() != null) {
                connection.setDoOutput(true);
                OutputStream out = connection.getOutputStream();
                try {
                    out.write(request.body().toByteArray());
                } catch (UnsupportedOperationException e) {
                    out.write(request.body().toByteArrayAsync().block());
                }
                out.flush();
            }
            connection.connect();

            int statusCode = connection.getResponseCode();
            HttpHeaders headers = new HttpHeaders(connection.getHeaderFields().entrySet().stream()
                .filter(entry -> entry.getKey() != null)
                .collect(Collectors.toMap(Map.Entry::getKey, val -> String.join(",", val.getValue()))));
            byte[] buffer = new byte[1024];
            int bytesRead;
            InputStream in;
            if (statusCode < 400) {
                in = connection.getInputStream();
            } else {
                in = connection.getErrorStream();
            }
            HttpBody body;
            if (in == null) {
                body = HttpBody.empty();
            } else {
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                while ((bytesRead = in.read(buffer)) != -1) {
                    output.write(buffer, 0, bytesRead);
                }
                body = HttpBody.fromByteArray(output.toByteArray());
            }
            return new HttpResponse() {
                @Override
                public int statusCode() {
                    return statusCode;
                }

                @Override
                public String headerValue(String name) {
                    return headers.value(name);
                }

                @Override
                public HttpHeaders headers() {
                    return headers;
                }

                @Override
                public HttpBody body() {
                    return body;
                }
            }.withRequest(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    @Override
    public Mono<HttpResponse> sendAsync(final HttpRequest request) {
        return Mono.defer(() -> {
            HttpResponse sync = send(request);
            return Mono.just(sync);
        });
    }

    @Override
    public final HttpClient proxy(Supplier<ProxyOptions> proxyOptionsSupplier) {
        this.proxyOptions = proxyOptionsSupplier.get();
        return this;
    }

    @Override
    public final HttpClient wiretap(boolean enableWiretap) {
        return this;
    }

    @Override
    public final HttpClient port(int port) {
        return this;
    }


}
