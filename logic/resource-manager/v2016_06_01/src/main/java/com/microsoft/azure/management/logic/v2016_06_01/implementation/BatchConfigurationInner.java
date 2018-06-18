/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.BatchConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The batch configuration resource definition.
 */
@SkipParentValidation
public class BatchConfigurationInner extends Resource {
    /**
     * The batch configuration properties.
     */
    @JsonProperty(value = "properties", required = true)
    private BatchConfigurationProperties properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public BatchConfigurationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the BatchConfigurationInner object itself.
     */
    public BatchConfigurationInner withProperties(BatchConfigurationProperties properties) {
        this.properties = properties;
        return this;
    }

}
