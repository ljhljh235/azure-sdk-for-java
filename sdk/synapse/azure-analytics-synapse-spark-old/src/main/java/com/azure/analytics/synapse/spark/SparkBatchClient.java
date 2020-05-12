// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark;

import com.azure.analytics.synapse.spark.implementation.SparkBatchsImpl;
import com.azure.analytics.synapse.spark.implementation.models.SparkBatchJob;
import com.azure.analytics.synapse.spark.implementation.models.SparkBatchJobCollection;
import com.azure.analytics.synapse.spark.implementation.models.SparkBatchJobOptions;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the synchronous SparkClient type.
 */
@ServiceClient(builder = SparkClientBuilder.class)
public final class SparkBatchClient {
    private SparkBatchsImpl serviceClient;

    /**
     * Initializes an instance of SparkBatchs client.
     */
    SparkBatchClient(SparkBatchsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List all spark batch jobs which are running under a particular spark pool.
     * 
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list.
     *             By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for batch list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkBatchJobCollection getSparkBatchJobs(Integer from, Integer size, Boolean detailed) {
        return this.serviceClient.getSparkBatchJobs(from, size, detailed);
    }

    /**
     * List all spark batch jobs which are running under a particular spark pool.
     * 
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list.
     *             By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for batch list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkBatchJobCollection getSparkBatchJobs(Integer from, Integer size, Boolean detailed, Context context) {
        return this.serviceClient.getSparkBatchJobs(from, size, detailed, context);
    }

    /**
     * List all spark batch jobs which are running under a particular spark pool.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for batch list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkBatchJobCollection getSparkBatchJobs() {
        return this.serviceClient.getSparkBatchJobs();
    }

    /**
     * Create new spark batch job.
     * 
     * @param sparkBatchJobOptions Livy compatible batch job request payload.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkBatchJob createSparkBatchJob(SparkBatchJobOptions sparkBatchJobOptions, Boolean detailed) {
        return this.serviceClient.createSparkBatchJob(sparkBatchJobOptions, detailed);
    }

    /**
     * Create new spark batch job.
     * 
     * @param sparkBatchJobOptions Livy compatible batch job request payload.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkBatchJob createSparkBatchJob(SparkBatchJobOptions sparkBatchJobOptions, Boolean detailed, Context context) {
        return this.serviceClient.createSparkBatchJob(sparkBatchJobOptions, detailed, context);
    }

    /**
     * Create new spark batch job.
     * 
     * @param sparkBatchJobOptions Livy compatible batch job request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkBatchJob createSparkBatchJob(SparkBatchJobOptions sparkBatchJobOptions) {
        return this.serviceClient.createSparkBatchJob(sparkBatchJobOptions);
    }

    /**
     * Gets a single spark batch job.
     * 
     * @param batchId Identifier for the batch job.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single spark batch job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkBatchJob getSparkBatchJob(int batchId, Boolean detailed) {
        return this.serviceClient.getSparkBatchJob(batchId, detailed);
    }

    /**
     * Gets a single spark batch job.
     * 
     * @param batchId Identifier for the batch job.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single spark batch job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkBatchJob getSparkBatchJob(int batchId, Boolean detailed, Context context) {
        return this.serviceClient.getSparkBatchJob(batchId, detailed, context);
    }

    /**
     * Gets a single spark batch job.
     * 
     * @param batchId Identifier for the batch job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single spark batch job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkBatchJob getSparkBatchJob(int batchId) {
        return this.serviceClient.getSparkBatchJob(batchId);
    }

    /**
     * Cancels a running spark batch job.
     * 
     * @param batchId Identifier for the batch job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancelSparkBatchJob(int batchId) {
        this.serviceClient.cancelSparkBatchJob(batchId);
    }

    /**
     * Cancels a running spark batch job.
     * 
     * @param batchId Identifier for the batch job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancelSparkBatchJob(int batchId, Context context) {
        this.serviceClient.cancelSparkBatchJob(batchId, context);
    }
}
