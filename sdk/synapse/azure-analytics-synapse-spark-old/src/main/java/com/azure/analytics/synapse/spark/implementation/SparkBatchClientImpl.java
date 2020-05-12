// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/**
 * Initializes a new instance of the SparkBatchClient type.
 */
public final class SparkBatchClientImpl {
    /**
     * The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     */
    private String endpoint;

    /**
     * Gets The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Sets The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     * 
     * @param endpoint the endpoint value.
     * @return the service client itself.
     */
    public SparkBatchClientImpl setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Valid api-version for the request.
     */
    private String livyApiVersion;

    /**
     * Gets Valid api-version for the request.
     * 
     * @return the livyApiVersion value.
     */
    public String getLivyApiVersion() {
        return this.livyApiVersion;
    }

    /**
     * Sets Valid api-version for the request.
     * 
     * @param livyApiVersion the livyApiVersion value.
     * @return the service client itself.
     */
    public SparkBatchClientImpl setLivyApiVersion(String livyApiVersion) {
        this.livyApiVersion = livyApiVersion;
        return this;
    }

    /**
     * Name of the spark pool.
     */
    private String sparkPoolName;

    /**
     * Gets Name of the spark pool.
     * 
     * @return the sparkPoolName value.
     */
    public String getSparkPoolName() {
        return this.sparkPoolName;
    }

    /**
     * Sets Name of the spark pool.
     * 
     * @param sparkPoolName the sparkPoolName value.
     * @return the service client itself.
     */
    public SparkBatchClientImpl setSparkPoolName(String sparkPoolName) {
        this.sparkPoolName = sparkPoolName;
        return this;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The SparkBatchsImpl object to access its operations.
     */
    private final SparkBatchsImpl sparkBatchs;

    /**
     * Gets the SparkBatchsImpl object to access its operations.
     * 
     * @return the SparkBatchsImpl object.
     */
    public SparkBatchsImpl getSparkBatchs() {
        return this.sparkBatchs;
    }

    /**
     * Initializes an instance of SparkBatchClient client.
     */
    public SparkBatchClientImpl() {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build());
    }

    /**
     * Initializes an instance of SparkBatchClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public SparkBatchClientImpl(HttpPipeline httpPipeline) {
        this.httpPipeline = httpPipeline;
        this.sparkBatchs = new SparkBatchsImpl(this);
    }
}
