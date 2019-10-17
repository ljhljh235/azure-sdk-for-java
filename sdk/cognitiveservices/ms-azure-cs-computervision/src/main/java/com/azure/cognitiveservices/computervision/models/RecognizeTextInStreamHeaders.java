// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cognitiveservices.computervision.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for RecognizeTextInStream operation.
 */
@Fluent
public final class RecognizeTextInStreamHeaders {
    /*
     * URL to query for status of the operation. The operation ID will expire
     * in 48 hours.
     */
    @JsonProperty(value = "Operation-Location")
    private String operationLocation;

    /**
     * Get the operationLocation property: URL to query for status of the
     * operation. The operation ID will expire in 48 hours.
     *
     * @return the operationLocation value.
     */
    public String getOperationLocation() {
        return this.operationLocation;
    }

    /**
     * Set the operationLocation property: URL to query for status of the
     * operation. The operation ID will expire in 48 hours.
     *
     * @param operationLocation the operationLocation value to set.
     * @return the RecognizeTextInStreamHeaders object itself.
     */
    public RecognizeTextInStreamHeaders setOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }
}
