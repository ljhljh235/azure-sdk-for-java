package com.azure.identity.provider;

import com.azure.common.credentials.TokenCredential;
import com.azure.identity.credential.ClientSecretCredential;
import com.azure.identity.exception.CredentialNotFoundException;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * A credential provider that provides token credentials based on environment
 * variables.
 */
public class EnvironmentCredentialProvider extends TokenCredentialProvider {
    private Map<Variable, String> variables = new HashMap<>();

    /**
     * Creates an instance of the default environment credential provider.
     */
    public EnvironmentCredentialProvider() {
        for (Variable var : Variable.values()) {
            String value = System.getenv(var.name);
            if (value != null) {
                variables.put(var, value);
            }
        }
    }

    @Override
    protected Mono<TokenCredential> getCredentialAsync() {
        return Mono.fromSupplier(() -> {
            if (variables.containsKey(Variable.CLIENT_ID)
                && variables.containsKey(Variable.CLIENT_SECRET)
                && variables.containsKey(Variable.TENANT_ID)) {
                // ClientSecretCredential
                if (!variables.containsKey(Variable.AAD_ENDPOINT)) {
                    return new ClientSecretCredential(
                        variables.get(Variable.CLIENT_ID),
                        variables.get(Variable.CLIENT_SECRET),
                        variables.get(Variable.TENANT_ID));
                } else {
                    return new ClientSecretCredential(
                        variables.get(Variable.CLIENT_ID),
                        variables.get(Variable.CLIENT_SECRET),
                        variables.get(Variable.TENANT_ID),
                        variables.get(Variable.AAD_ENDPOINT));
                }
            }
            // Other environment variables
            throw new CredentialNotFoundException("Cannot create any credentials with the current environment variables");
        });
    }

    /**
     * Known environment variables that are useful for creating a credential.
     */
    public enum Variable {
        CLIENT_ID("AZURE_CLIENT_ID"),
        CLIENT_SECRET("AZURE_CLIENT_SECRET"),
        TENANT_ID("AZURE_TENANT_ID"),
        AAD_ENDPOINT("AZURE_AAD_ENDPOINT");
        // here goes other possible environment variables for authentication

        private String name;

        Variable(String name) {
            this.name = name;
        }
    }
}
