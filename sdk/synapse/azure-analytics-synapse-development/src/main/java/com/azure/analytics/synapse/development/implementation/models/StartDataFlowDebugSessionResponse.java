// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StartDataFlowDebugSessionResponse model.
 */
@Fluent
public final class StartDataFlowDebugSessionResponse {
    /*
     * The ID of data flow debug job version.
     */
    @JsonProperty(value = "jobVersion")
    private String jobVersion;

    /**
     * Get the jobVersion property: The ID of data flow debug job version.
     * 
     * @return the jobVersion value.
     */
    public String getJobVersion() {
        return this.jobVersion;
    }

    /**
     * Set the jobVersion property: The ID of data flow debug job version.
     * 
     * @param jobVersion the jobVersion value to set.
     * @return the StartDataFlowDebugSessionResponse object itself.
     */
    public StartDataFlowDebugSessionResponse setJobVersion(String jobVersion) {
        this.jobVersion = jobVersion;
        return this;
    }
}
