// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Application Gateway global configuration. */
@Fluent
public final class ApplicationGatewayGlobalConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayGlobalConfiguration.class);

    /*
     * Enable request buffering.
     */
    @JsonProperty(value = "enableRequestBuffering")
    private Boolean enableRequestBuffering;

    /*
     * Enable response buffering.
     */
    @JsonProperty(value = "enableResponseBuffering")
    private Boolean enableResponseBuffering;

    /**
     * Get the enableRequestBuffering property: Enable request buffering.
     *
     * @return the enableRequestBuffering value.
     */
    public Boolean enableRequestBuffering() {
        return this.enableRequestBuffering;
    }

    /**
     * Set the enableRequestBuffering property: Enable request buffering.
     *
     * @param enableRequestBuffering the enableRequestBuffering value to set.
     * @return the ApplicationGatewayGlobalConfiguration object itself.
     */
    public ApplicationGatewayGlobalConfiguration withEnableRequestBuffering(Boolean enableRequestBuffering) {
        this.enableRequestBuffering = enableRequestBuffering;
        return this;
    }

    /**
     * Get the enableResponseBuffering property: Enable response buffering.
     *
     * @return the enableResponseBuffering value.
     */
    public Boolean enableResponseBuffering() {
        return this.enableResponseBuffering;
    }

    /**
     * Set the enableResponseBuffering property: Enable response buffering.
     *
     * @param enableResponseBuffering the enableResponseBuffering value to set.
     * @return the ApplicationGatewayGlobalConfiguration object itself.
     */
    public ApplicationGatewayGlobalConfiguration withEnableResponseBuffering(Boolean enableResponseBuffering) {
        this.enableResponseBuffering = enableResponseBuffering;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
