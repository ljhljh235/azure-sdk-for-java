// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The TriggerPipelineReference model.
 */
@Fluent
public final class TriggerPipelineReference {
    /*
     * Pipeline reference.
     */
    @JsonProperty(value = "pipelineReference")
    private PipelineReference pipelineReference;

    /*
     * Pipeline parameters.
     */
    @JsonProperty(value = "parameters")
    private Map<String, Object> parameters;

    /**
     * Get the pipelineReference property: Pipeline reference.
     * 
     * @return the pipelineReference value.
     */
    public PipelineReference getPipelineReference() {
        return this.pipelineReference;
    }

    /**
     * Set the pipelineReference property: Pipeline reference.
     * 
     * @param pipelineReference the pipelineReference value to set.
     * @return the TriggerPipelineReference object itself.
     */
    public TriggerPipelineReference setPipelineReference(PipelineReference pipelineReference) {
        this.pipelineReference = pipelineReference;
        return this;
    }

    /**
     * Get the parameters property: Pipeline parameters.
     * 
     * @return the parameters value.
     */
    public Map<String, Object> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Pipeline parameters.
     * 
     * @param parameters the parameters value to set.
     * @return the TriggerPipelineReference object itself.
     */
    public TriggerPipelineReference setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }
}
