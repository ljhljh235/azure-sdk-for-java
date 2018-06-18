/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the operation to create a connection monitor.
 */
public class ConnectionMonitorParameters {
    /**
     * The source property.
     */
    @JsonProperty(value = "source", required = true)
    private ConnectionMonitorSource source;

    /**
     * The destination property.
     */
    @JsonProperty(value = "destination", required = true)
    private ConnectionMonitorDestination destination;

    /**
     * Determines if the connection monitor will start automatically once
     * created.
     */
    @JsonProperty(value = "autoStart")
    private Boolean autoStart;

    /**
     * Monitoring interval in seconds.
     */
    @JsonProperty(value = "monitoringIntervalInSeconds")
    private Integer monitoringIntervalInSeconds;

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public ConnectionMonitorSource source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withSource(ConnectionMonitorSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the destination value.
     *
     * @return the destination value
     */
    public ConnectionMonitorDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination value.
     *
     * @param destination the destination value to set
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withDestination(ConnectionMonitorDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the autoStart value.
     *
     * @return the autoStart value
     */
    public Boolean autoStart() {
        return this.autoStart;
    }

    /**
     * Set the autoStart value.
     *
     * @param autoStart the autoStart value to set
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }

    /**
     * Get the monitoringIntervalInSeconds value.
     *
     * @return the monitoringIntervalInSeconds value
     */
    public Integer monitoringIntervalInSeconds() {
        return this.monitoringIntervalInSeconds;
    }

    /**
     * Set the monitoringIntervalInSeconds value.
     *
     * @param monitoringIntervalInSeconds the monitoringIntervalInSeconds value to set
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
        return this;
    }

}
