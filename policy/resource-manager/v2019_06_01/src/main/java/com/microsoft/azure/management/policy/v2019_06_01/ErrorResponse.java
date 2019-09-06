/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response indicates Azure Resource Manager is not able to process the
 * incoming request. The reason is provided in the error message.
 */
public class ErrorResponse {
    /**
     * Http status code.
     */
    @JsonProperty(value = "httpStatus")
    private String httpStatus;

    /**
     * Error code.
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /**
     * Error message indicating why the operation failed.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * Get http status code.
     *
     * @return the httpStatus value
     */
    public String httpStatus() {
        return this.httpStatus;
    }

    /**
     * Set http status code.
     *
     * @param httpStatus the httpStatus value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    /**
     * Get error code.
     *
     * @return the errorCode value
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set error code.
     *
     * @param errorCode the errorCode value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get error message indicating why the operation failed.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set error message indicating why the operation failed.
     *
     * @param errorMessage the errorMessage value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

}
