/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Connection state snapshot.
 */
public class ConnectionStateSnapshot {
    /**
     * The connection state. Possible values include: 'Reachable',
     * 'Unreachable', 'Unknown'.
     */
    @JsonProperty(value = "connectionState")
    private ConnectionState connectionState;

    /**
     * The start time of the connection snapshot.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The end time of the connection snapshot.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * Connectivity analysis evaluation state. Possible values include:
     * 'NotStarted', 'InProgress', 'Completed'.
     */
    @JsonProperty(value = "evaluationState")
    private EvaluationState evaluationState;

    /**
     * List of hops between the source and the destination.
     */
    @JsonProperty(value = "hops", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectivityHop> hops;

    /**
     * Get the connectionState value.
     *
     * @return the connectionState value
     */
    public ConnectionState connectionState() {
        return this.connectionState;
    }

    /**
     * Set the connectionState value.
     *
     * @param connectionState the connectionState value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the evaluationState value.
     *
     * @return the evaluationState value
     */
    public EvaluationState evaluationState() {
        return this.evaluationState;
    }

    /**
     * Set the evaluationState value.
     *
     * @param evaluationState the evaluationState value to set
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withEvaluationState(EvaluationState evaluationState) {
        this.evaluationState = evaluationState;
        return this;
    }

    /**
     * Get the hops value.
     *
     * @return the hops value
     */
    public List<ConnectivityHop> hops() {
        return this.hops;
    }

}
