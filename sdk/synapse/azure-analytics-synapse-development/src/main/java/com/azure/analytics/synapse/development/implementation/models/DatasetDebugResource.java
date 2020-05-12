// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DatasetDebugResource model.
 */
@Fluent
public final class DatasetDebugResource extends SubResourceDebugResource {
    /*
     * Dataset properties.
     */
    @JsonProperty(value = "properties", required = true)
    private Dataset properties;

    /**
     * Get the properties property: Dataset properties.
     * 
     * @return the properties value.
     */
    public Dataset getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Dataset properties.
     * 
     * @param properties the properties value to set.
     * @return the DatasetDebugResource object itself.
     */
    public DatasetDebugResource setProperties(Dataset properties) {
        this.properties = properties;
        return this;
    }
}
