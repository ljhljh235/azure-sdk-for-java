// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The CustomDataSourceLinkedService model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CustomDataSource")
@Fluent
public final class CustomDataSourceLinkedService extends LinkedService {
    /*
     * Custom linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private Object typeProperties;

    /**
     * Get the typeProperties property: Custom linked service properties.
     * 
     * @return the typeProperties value.
     */
    public Object getTypeProperties() {
        return this.typeProperties;
    }

    /**
     * Set the typeProperties property: Custom linked service properties.
     * 
     * @param typeProperties the typeProperties value to set.
     * @return the CustomDataSourceLinkedService object itself.
     */
    public CustomDataSourceLinkedService setTypeProperties(Object typeProperties) {
        this.typeProperties = typeProperties;
        return this;
    }
}
