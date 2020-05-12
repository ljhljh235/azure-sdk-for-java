// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The IntegrationRuntimeReference model.
 */
@Fluent
public final class IntegrationRuntimeReference {
    /*
     * Type of integration runtime.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * Reference integration runtime name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /*
     * Arguments for integration runtime.
     */
    @JsonProperty(value = "parameters")
    private Map<String, Object> parameters;

    /**
     * Creates an instance of IntegrationRuntimeReference class.
     */
    public IntegrationRuntimeReference() {
        type = "IntegrationRuntimeReference";
    }

    /**
     * Get the type property: Type of integration runtime.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of integration runtime.
     * 
     * @param type the type value to set.
     * @return the IntegrationRuntimeReference object itself.
     */
    public IntegrationRuntimeReference setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the referenceName property: Reference integration runtime name.
     * 
     * @return the referenceName value.
     */
    public String getReferenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: Reference integration runtime name.
     * 
     * @param referenceName the referenceName value to set.
     * @return the IntegrationRuntimeReference object itself.
     */
    public IntegrationRuntimeReference setReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get the parameters property: Arguments for integration runtime.
     * 
     * @return the parameters value.
     */
    public Map<String, Object> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Arguments for integration runtime.
     * 
     * @param parameters the parameters value to set.
     * @return the IntegrationRuntimeReference object itself.
     */
    public IntegrationRuntimeReference setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }
}
