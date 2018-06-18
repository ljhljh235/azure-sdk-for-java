/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import com.microsoft.azure.management.appservice.v2016_03_01.ValidateResponseError;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the result of resource validation.
 */
public class ValidateResponseInner {
    /**
     * Result of validation.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Error details for the case when validation fails.
     */
    @JsonProperty(value = "error")
    private ValidateResponseError error;

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the ValidateResponseInner object itself.
     */
    public ValidateResponseInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ValidateResponseError error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the ValidateResponseInner object itself.
     */
    public ValidateResponseInner withError(ValidateResponseError error) {
        this.error = error;
        return this;
    }

}
