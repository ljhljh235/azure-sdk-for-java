// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The ODataResourceDataset model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ODataResource")
@JsonFlatten
@Fluent
public class ODataResourceDataset extends Dataset {
    /*
     * The OData resource path. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.path")
    private Object path;

    /**
     * Get the path property: The OData resource path. Type: string (or
     * Expression with resultType string).
     * 
     * @return the path value.
     */
    public Object getPath() {
        return this.path;
    }

    /**
     * Set the path property: The OData resource path. Type: string (or
     * Expression with resultType string).
     * 
     * @param path the path value to set.
     * @return the ODataResourceDataset object itself.
     */
    public ODataResourceDataset setPath(Object path) {
        this.path = path;
        return this;
    }
}
