// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SparkStatementOptions model.
 */
@Fluent
public final class SparkStatementOptions {
    /*
     * The code property.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The kind property.
     */
    @JsonProperty(value = "kind")
    private SparkStatementLanguageType kind;

    /**
     * Get the code property: The code property.
     * 
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: The code property.
     * 
     * @param code the code value to set.
     * @return the SparkStatementOptions object itself.
     */
    public SparkStatementOptions setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the kind property: The kind property.
     * 
     * @return the kind value.
     */
    public SparkStatementLanguageType getKind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind property.
     * 
     * @param kind the kind value to set.
     * @return the SparkStatementOptions object itself.
     */
    public SparkStatementOptions setKind(SparkStatementLanguageType kind) {
        this.kind = kind;
        return this;
    }
}
