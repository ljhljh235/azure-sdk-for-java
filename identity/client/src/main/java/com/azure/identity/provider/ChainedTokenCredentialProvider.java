package com.azure.identity.provider;

import com.azure.common.credentials.TokenCredential;
import com.azure.identity.exception.CredentialNotFoundException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

/**
 * A token credential provider that can provide a credential from a list of providers.
 */
public class ChainedTokenCredentialProvider extends TokenCredentialProvider {
    private final List<TokenCredentialProvider> providers;

    /**
     * Create an instance of chained token credential provider from a list of token
     * credential provider.
     * @param providers a list of providers to use
     */
    public ChainedTokenCredentialProvider(List<TokenCredentialProvider> providers) {
        this.providers = providers;
    }

    /**
     * Create an instance of chained token credential provider from a list of token
     * credential provider.
     * @param providers a list of providers to use
     */
    public ChainedTokenCredentialProvider(TokenCredentialProvider... providers) {
        this.providers = Arrays.asList(providers);
    }

    @Override
    protected Mono<TokenCredential> getCredentialAsync() {
        return Flux.fromIterable(providers)
            .flatMap(p -> p.getCredentialAsync())
            .next()
            .switchIfEmpty(Mono.error(new CredentialNotFoundException("No credential found in the chain")));
    }
}
