// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity.credential;

import com.azure.core.annotation.Immutable;
import com.azure.core.credentials.AccessToken;
import com.azure.core.credentials.TokenCredential;
import com.azure.core.credentials.TokenRequest;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.identity.AuthorizationCodeProvider;
import com.azure.identity.implementation.IdentityClient;
import com.azure.identity.implementation.IdentityClientBuilder;
import com.azure.identity.implementation.IdentityClientOptions;
import com.azure.identity.implementation.MsalToken;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An AAD credential that acquires a token with an Oauth 2.0 authorization code grant
 * for an AAD application.
 */
@Immutable
public class AuthorizationCodeCredential implements TokenCredential {
    private final AuthorizationCodeProvider authCodeProvider;
    private final URI redirectUri;
    private final IdentityClient identityClient;
    private final AtomicReference<MsalToken> cachedToken;
    private final IdentityClientOptions identityClientOptions;
    private final String clientId;
    private final String tenantId;

    /**
     * Creates an AuthorizationCodeCredential with the given identity client options.
     *
     * @param clientId the client ID of the application
     * @param authCodeProvider the Oauth 2.0 authorization code grant
     * @param redirectUri the redirect URI used to authenticate to Azure Active Directory
     * @param identityClientOptions the options for configuring the identity client
     */
    AuthorizationCodeCredential(String clientId, String tenantId, AuthorizationCodeProvider authCodeProvider,
                                URI redirectUri, IdentityClientOptions identityClientOptions) {
        if (tenantId == null) {
            tenantId = "common";
        }
        identityClient = new IdentityClientBuilder()
            .tenantId(tenantId)
            .clientId(clientId)
            .identityClientOptions(identityClientOptions)
            .build();
        this.tenantId = tenantId;
        this.cachedToken = new AtomicReference<>();
        this.authCodeProvider = authCodeProvider;
        this.redirectUri = redirectUri;
        this.identityClientOptions = identityClientOptions;
        this.clientId = clientId;
    }

    @Override
    public Mono<AccessToken> getToken(TokenRequest request) {
        return Mono.defer(() -> {
            if (cachedToken.get() != null) {
                return identityClient.authenticateWithUserRefreshToken(request, cachedToken.get())
                    .onErrorResume(t -> Mono.empty());
            } else {
                return Mono.empty();
            }
        }).switchIfEmpty(
            Mono.defer(() -> {
                String uri = String.format("%s/%s/oauth2/v2.0/authorize?response_type=code&response_mode=query&prompt"
                        + "=select_account&client_id=%s&redirect_uri=%s&state=%s&scope=%s",
                    identityClientOptions.getAuthorityHost(), tenantId, clientId, redirectUri, UUID.randomUUID(),
                    String.join(" ", request.getScopes()));
                return authCodeProvider.getAuthorizationCode(uri)
                    .switchIfEmpty(Mono.error(new ClientAuthenticationException(
                        "Failed to acquire authorization code", null)))
                    .flatMap(authCode ->
                        identityClient.authenticateWithAuthorizationCode(request, authCode, redirectUri));
            }))
            .map(msalToken -> {
                cachedToken.set(msalToken);
                return msalToken;
            });
    }
}
