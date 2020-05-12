// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CreateRunResponse model.
 */
@Fluent
public final class CreateRunResponse {
    /*
     * Identifier of a run.
     */
    @JsonProperty(value = "runId", required = true)
    private String runId;

    /**
     * Get the runId property: Identifier of a run.
     * 
     * @return the runId value.
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * Set the runId property: Identifier of a run.
     * 
     * @param runId the runId value to set.
     * @return the CreateRunResponse object itself.
     */
    public CreateRunResponse setRunId(String runId) {
        this.runId = runId;
        return this;
    }
}
