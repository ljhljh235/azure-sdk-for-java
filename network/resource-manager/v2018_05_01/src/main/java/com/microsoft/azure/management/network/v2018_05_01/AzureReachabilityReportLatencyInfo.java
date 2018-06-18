/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details on latency for a time series.
 */
public class AzureReachabilityReportLatencyInfo {
    /**
     * The time stamp.
     */
    @JsonProperty(value = "timeStamp")
    private DateTime timeStamp;

    /**
     * The relative latency score between 1 and 100, higher values indicating a
     * faster connection.
     */
    @JsonProperty(value = "score")
    private Integer score;

    /**
     * Get the timeStamp value.
     *
     * @return the timeStamp value
     */
    public DateTime timeStamp() {
        return this.timeStamp;
    }

    /**
     * Set the timeStamp value.
     *
     * @param timeStamp the timeStamp value to set
     * @return the AzureReachabilityReportLatencyInfo object itself.
     */
    public AzureReachabilityReportLatencyInfo withTimeStamp(DateTime timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    /**
     * Get the score value.
     *
     * @return the score value
     */
    public Integer score() {
        return this.score;
    }

    /**
     * Set the score value.
     *
     * @param score the score value to set
     * @return the AzureReachabilityReportLatencyInfo object itself.
     */
    public AzureReachabilityReportLatencyInfo withScore(Integer score) {
        this.score = score;
        return this;
    }

}
