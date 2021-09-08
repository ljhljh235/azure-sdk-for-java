// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The managed resources in customer subscription. */
@Immutable
public class ManagedResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedResources.class);

    /*
     * Gets the managed event hub namespace resource identifier.
     */
    @JsonProperty(value = "eventHubNamespace", access = JsonProperty.Access.WRITE_ONLY)
    private String eventHubNamespace;

    /*
     * Gets the managed resource group resource identifier. This resource group
     * will host resource dependencies for the account.
     */
    @JsonProperty(value = "resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /*
     * Gets the managed storage account resource identifier.
     */
    @JsonProperty(value = "storageAccount", access = JsonProperty.Access.WRITE_ONLY)
    private String storageAccount;

    /**
     * Get the eventHubNamespace property: Gets the managed event hub namespace resource identifier.
     *
     * @return the eventHubNamespace value.
     */
    public String eventHubNamespace() {
        return this.eventHubNamespace;
    }

    /**
     * Get the resourceGroup property: Gets the managed resource group resource identifier. This resource group will
     * host resource dependencies for the account.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the storageAccount property: Gets the managed storage account resource identifier.
     *
     * @return the storageAccount value.
     */
    public String storageAccount() {
        return this.storageAccount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
