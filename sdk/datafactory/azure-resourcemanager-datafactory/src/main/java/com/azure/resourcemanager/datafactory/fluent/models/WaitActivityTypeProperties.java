// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Wait activity properties. */
@Fluent
public final class WaitActivityTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WaitActivityTypeProperties.class);

    /*
     * Duration in seconds.
     */
    @JsonProperty(value = "waitTimeInSeconds", required = true)
    private Object waitTimeInSeconds;

    /**
     * Get the waitTimeInSeconds property: Duration in seconds.
     *
     * @return the waitTimeInSeconds value.
     */
    public Object waitTimeInSeconds() {
        return this.waitTimeInSeconds;
    }

    /**
     * Set the waitTimeInSeconds property: Duration in seconds.
     *
     * @param waitTimeInSeconds the waitTimeInSeconds value to set.
     * @return the WaitActivityTypeProperties object itself.
     */
    public WaitActivityTypeProperties withWaitTimeInSeconds(Object waitTimeInSeconds) {
        this.waitTimeInSeconds = waitTimeInSeconds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (waitTimeInSeconds() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property waitTimeInSeconds in model WaitActivityTypeProperties"));
        }
    }
}
