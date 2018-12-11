/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_10_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The operation list response that contains all operations for Azure Container
 * Instance service.
 */
public class OperationListResultInner {
    /**
     * The list of operations.
     */
    @JsonProperty(value = "value")
    private List<OperationInner> value;

    /**
     * The URI to fetch the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the list of operations.
     *
     * @return the value value
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set the list of operations.
     *
     * @param value the value value to set
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the URI to fetch the next page of operations.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the URI to fetch the next page of operations.
     *
     * @param nextLink the nextLink value to set
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
