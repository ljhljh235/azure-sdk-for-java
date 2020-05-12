// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * The DataFlowDebugSessionInfo model.
 */
@Fluent
public final class DataFlowDebugSessionInfo {
    /*
     * The name of the data flow.
     */
    @JsonProperty(value = "dataFlowName")
    private String dataFlowName;

    /*
     * Compute type of the cluster.
     */
    @JsonProperty(value = "computeType")
    private String computeType;

    /*
     * Core count of the cluster.
     */
    @JsonProperty(value = "coreCount")
    private Integer coreCount;

    /*
     * Node count of the cluster. (deprecated property)
     */
    @JsonProperty(value = "nodeCount")
    private Integer nodeCount;

    /*
     * Attached integration runtime name of data flow debug session.
     */
    @JsonProperty(value = "integrationRuntimeName")
    private String integrationRuntimeName;

    /*
     * The ID of data flow debug session.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /*
     * Start time of data flow debug session.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /*
     * Compute type of the cluster.
     */
    @JsonProperty(value = "timeToLiveInMinutes")
    private Integer timeToLiveInMinutes;

    /*
     * Last activity time of data flow debug session.
     */
    @JsonProperty(value = "lastActivityTime")
    private String lastActivityTime;

    /*
     * Data flow debug session info.
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Get the dataFlowName property: The name of the data flow.
     * 
     * @return the dataFlowName value.
     */
    public String getDataFlowName() {
        return this.dataFlowName;
    }

    /**
     * Set the dataFlowName property: The name of the data flow.
     * 
     * @param dataFlowName the dataFlowName value to set.
     * @return the DataFlowDebugSessionInfo object itself.
     */
    public DataFlowDebugSessionInfo setDataFlowName(String dataFlowName) {
        this.dataFlowName = dataFlowName;
        return this;
    }

    /**
     * Get the computeType property: Compute type of the cluster.
     * 
     * @return the computeType value.
     */
    public String getComputeType() {
        return this.computeType;
    }

    /**
     * Set the computeType property: Compute type of the cluster.
     * 
     * @param computeType the computeType value to set.
     * @return the DataFlowDebugSessionInfo object itself.
     */
    public DataFlowDebugSessionInfo setComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * Get the coreCount property: Core count of the cluster.
     * 
     * @return the coreCount value.
     */
    public Integer getCoreCount() {
        return this.coreCount;
    }

    /**
     * Set the coreCount property: Core count of the cluster.
     * 
     * @param coreCount the coreCount value to set.
     * @return the DataFlowDebugSessionInfo object itself.
     */
    public DataFlowDebugSessionInfo setCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
        return this;
    }

    /**
     * Get the nodeCount property: Node count of the cluster. (deprecated
     * property).
     * 
     * @return the nodeCount value.
     */
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * Set the nodeCount property: Node count of the cluster. (deprecated
     * property).
     * 
     * @param nodeCount the nodeCount value to set.
     * @return the DataFlowDebugSessionInfo object itself.
     */
    public DataFlowDebugSessionInfo setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get the integrationRuntimeName property: Attached integration runtime
     * name of data flow debug session.
     * 
     * @return the integrationRuntimeName value.
     */
    public String getIntegrationRuntimeName() {
        return this.integrationRuntimeName;
    }

    /**
     * Set the integrationRuntimeName property: Attached integration runtime
     * name of data flow debug session.
     * 
     * @param integrationRuntimeName the integrationRuntimeName value to set.
     * @return the DataFlowDebugSessionInfo object itself.
     */
    public DataFlowDebugSessionInfo setIntegrationRuntimeName(String integrationRuntimeName) {
        this.integrationRuntimeName = integrationRuntimeName;
        return this;
    }

    /**
     * Get the sessionId property: The ID of data flow debug session.
     * 
     * @return the sessionId value.
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: The ID of data flow debug session.
     * 
     * @param sessionId the sessionId value to set.
     * @return the DataFlowDebugSessionInfo object itself.
     */
    public DataFlowDebugSessionInfo setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the startTime property: Start time of data flow debug session.
     * 
     * @return the startTime value.
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of data flow debug session.
     * 
     * @param startTime the startTime value to set.
     * @return the DataFlowDebugSessionInfo object itself.
     */
    public DataFlowDebugSessionInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the timeToLiveInMinutes property: Compute type of the cluster.
     * 
     * @return the timeToLiveInMinutes value.
     */
    public Integer getTimeToLiveInMinutes() {
        return this.timeToLiveInMinutes;
    }

    /**
     * Set the timeToLiveInMinutes property: Compute type of the cluster.
     * 
     * @param timeToLiveInMinutes the timeToLiveInMinutes value to set.
     * @return the DataFlowDebugSessionInfo object itself.
     */
    public DataFlowDebugSessionInfo setTimeToLiveInMinutes(Integer timeToLiveInMinutes) {
        this.timeToLiveInMinutes = timeToLiveInMinutes;
        return this;
    }

    /**
     * Get the lastActivityTime property: Last activity time of data flow debug
     * session.
     * 
     * @return the lastActivityTime value.
     */
    public String getLastActivityTime() {
        return this.lastActivityTime;
    }

    /**
     * Set the lastActivityTime property: Last activity time of data flow debug
     * session.
     * 
     * @param lastActivityTime the lastActivityTime value to set.
     * @return the DataFlowDebugSessionInfo object itself.
     */
    public DataFlowDebugSessionInfo setLastActivityTime(String lastActivityTime) {
        this.lastActivityTime = lastActivityTime;
        return this;
    }

    /**
     * Get the additionalProperties property: Data flow debug session info.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Data flow debug session info.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the DataFlowDebugSessionInfo object itself.
     */
    public DataFlowDebugSessionInfo setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
