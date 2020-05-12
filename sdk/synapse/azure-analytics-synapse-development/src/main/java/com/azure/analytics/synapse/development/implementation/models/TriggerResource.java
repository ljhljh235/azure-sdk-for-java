// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TriggerResource model.
 */
@Fluent
public final class TriggerResource extends SubResource {
    /*
     * Properties of the trigger.
     */
    @JsonProperty(value = "properties", required = true)
    private Trigger properties;

    /**
     * Get the properties property: Properties of the trigger.
     * 
     * @return the properties value.
     */
    public Trigger getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the trigger.
     * 
     * @param properties the properties value to set.
     * @return the TriggerResource object itself.
     */
    public TriggerResource setProperties(Trigger properties) {
        this.properties = properties;
        return this;
    }
}
