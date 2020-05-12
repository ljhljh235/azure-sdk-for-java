// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The DataFlowDebugStatisticsRequest model.
 */
@Fluent
public final class DataFlowDebugStatisticsRequest {
    /*
     * The ID of data flow debug session.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /*
     * The data flow which contains the debug session.
     */
    @JsonProperty(value = "dataFlowName")
    private String dataFlowName;

    /*
     * The output stream name.
     */
    @JsonProperty(value = "streamName")
    private String streamName;

    /*
     * List of column names.
     */
    @JsonProperty(value = "columns")
    private List<String> columns;

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
     * @return the DataFlowDebugStatisticsRequest object itself.
     */
    public DataFlowDebugStatisticsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the dataFlowName property: The data flow which contains the debug
     * session.
     * 
     * @return the dataFlowName value.
     */
    public String getDataFlowName() {
        return this.dataFlowName;
    }

    /**
     * Set the dataFlowName property: The data flow which contains the debug
     * session.
     * 
     * @param dataFlowName the dataFlowName value to set.
     * @return the DataFlowDebugStatisticsRequest object itself.
     */
    public DataFlowDebugStatisticsRequest setDataFlowName(String dataFlowName) {
        this.dataFlowName = dataFlowName;
        return this;
    }

    /**
     * Get the streamName property: The output stream name.
     * 
     * @return the streamName value.
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * Set the streamName property: The output stream name.
     * 
     * @param streamName the streamName value to set.
     * @return the DataFlowDebugStatisticsRequest object itself.
     */
    public DataFlowDebugStatisticsRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * Get the columns property: List of column names.
     * 
     * @return the columns value.
     */
    public List<String> getColumns() {
        return this.columns;
    }

    /**
     * Set the columns property: List of column names.
     * 
     * @param columns the columns value to set.
     * @return the DataFlowDebugStatisticsRequest object itself.
     */
    public DataFlowDebugStatisticsRequest setColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }
}
