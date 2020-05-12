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
 * The SapCloudForCustomerResourceDataset model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapCloudForCustomerResource")
@JsonFlatten
@Fluent
public class SapCloudForCustomerResourceDataset extends Dataset {
    /*
     * The path of the SAP Cloud for Customer OData entity. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.path", required = true)
    private Object path;

    /**
     * Get the path property: The path of the SAP Cloud for Customer OData
     * entity. Type: string (or Expression with resultType string).
     * 
     * @return the path value.
     */
    public Object getPath() {
        return this.path;
    }

    /**
     * Set the path property: The path of the SAP Cloud for Customer OData
     * entity. Type: string (or Expression with resultType string).
     * 
     * @param path the path value to set.
     * @return the SapCloudForCustomerResourceDataset object itself.
     */
    public SapCloudForCustomerResourceDataset setPath(Object path) {
        this.path = path;
        return this;
    }
}
