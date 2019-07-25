/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about an artifact's parameter.
 */
public class ParameterInfo {
    /**
     * The name of the artifact parameter.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The value of the artifact parameter.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name of the artifact parameter.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the artifact parameter.
     *
     * @param name the name value to set
     * @return the ParameterInfo object itself.
     */
    public ParameterInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of the artifact parameter.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value of the artifact parameter.
     *
     * @param value the value value to set
     * @return the ParameterInfo object itself.
     */
    public ParameterInfo withValue(String value) {
        this.value = value;
        return this;
    }

}
