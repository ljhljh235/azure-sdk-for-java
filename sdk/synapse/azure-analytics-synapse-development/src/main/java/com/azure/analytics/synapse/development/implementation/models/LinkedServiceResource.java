// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LinkedServiceResource model.
 */
@Fluent
public final class LinkedServiceResource extends SubResource {
    /*
     * Properties of linked service.
     */
    @JsonProperty(value = "properties", required = true)
    private LinkedService properties;

    /**
     * Get the properties property: Properties of linked service.
     * 
     * @return the properties value.
     */
    public LinkedService getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of linked service.
     * 
     * @param properties the properties value to set.
     * @return the LinkedServiceResource object itself.
     */
    public LinkedServiceResource setProperties(LinkedService properties) {
        this.properties = properties;
        return this;
    }
}
