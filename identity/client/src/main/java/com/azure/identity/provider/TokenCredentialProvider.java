package com.azure.identity.provider;

import com.azure.common.credentials.TokenCredential;
import com.azure.identity.exception.CredentialNotFoundException;
import reactor.core.publisher.Mono;

/**
 * The base class defining a credential provider that provides token credentials.
 */
public abstract class TokenCredentialProvider {
    /**
     * Provide a token credential instance asynchronously.
     * @return a Publisher that emits a token credential instance.
     * @throws CredentialNotFoundException if no valid credential can be created or found
     */
    protected abstract Mono<TokenCredential> getCredentialAsync();

    /**
     * Acquires a token from the token credential this provide provides.
     * @param resource the resource or audience this token is for
     * @return a Publisher that emits a single token string
     */
    public Mono<String> getTokenAsync(String resource) {
        return getCredentialAsync()
            .flatMap(c -> c.getTokenAsync(resource));
    }
}
