package com.azure.common.credentials;

import com.azure.common.http.HttpHeader;
import com.azure.common.http.HttpRequest;
import reactor.core.publisher.Mono;

/**
 * The base class for credentials that can provide a token.
 */
public abstract class TokenCredential implements Credential {
    private final String scheme;

    /**
     * Creates a token credential with scheme "Bearer";
     */
    protected TokenCredential() {
        this("Bearer");
    }

    /**
     * Creates a token credential with the provided scheme.
     * @param scheme the scheme for the token.
     */
    protected TokenCredential(String scheme) {
        this.scheme = scheme;
    }

    /**
     * @return the scheme of the token
     */
    public String scheme() {
        return scheme;
    }

    /**
     * Asynchronously get a token for a given resource/audience.
     * @param resource the resource/audience the token will be used for
     * @return a Publisher that emits a single token
     */
    public abstract Mono<String> getTokenAsync(String resource);

    @Override
    public Mono<HttpHeader> getAuthenticationHeaderAsync(String resource, HttpRequest request) {
        return getTokenAsync(resource)
            .map(token -> new HttpHeader("Authorization", scheme + " " + token));
    }
}
