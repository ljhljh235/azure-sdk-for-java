// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark.implementation;

import com.azure.analytics.synapse.spark.models.SparkBatchJob;
import com.azure.analytics.synapse.spark.models.SparkBatchJobCollection;
import com.azure.analytics.synapse.spark.models.SparkBatchJobOptions;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SparkBatches. */
public final class SparkBatchesImpl {
    /** The proxy service used to perform REST calls. */
    private final SparkBatchesService service;

    /** The service client containing this operation class. */
    private final SparkClientImpl client;

    /**
     * Initializes an instance of SparkBatchesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SparkBatchesImpl(SparkClientImpl client) {
        this.service =
                RestProxy.create(SparkBatchesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SparkClientSparkBatches to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SparkClientSparkBatc")
    private interface SparkBatchesService {
        @Get("/livyApi/versions/{livyApiVersion}/sparkPools/{sparkPoolName}/batches")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<SparkBatchJobCollection>> getSparkBatchJobs(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "livyApiVersion", encoded = true) String livyApiVersion,
                @PathParam(value = "sparkPoolName", encoded = true) String sparkPoolName,
                @QueryParam("from") Integer from,
                @QueryParam("size") Integer size,
                @QueryParam("detailed") Boolean detailed,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/livyApi/versions/{livyApiVersion}/sparkPools/{sparkPoolName}/batches")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<SparkBatchJob>> createSparkBatchJob(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "livyApiVersion", encoded = true) String livyApiVersion,
                @PathParam(value = "sparkPoolName", encoded = true) String sparkPoolName,
                @QueryParam("detailed") Boolean detailed,
                @BodyParam("application/json") SparkBatchJobOptions sparkBatchJobOptions,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/livyApi/versions/{livyApiVersion}/sparkPools/{sparkPoolName}/batches/{batchId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<SparkBatchJob>> getSparkBatchJob(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "livyApiVersion", encoded = true) String livyApiVersion,
                @PathParam(value = "sparkPoolName", encoded = true) String sparkPoolName,
                @PathParam("batchId") int batchId,
                @QueryParam("detailed") Boolean detailed,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/livyApi/versions/{livyApiVersion}/sparkPools/{sparkPoolName}/batches/{batchId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> cancelSparkBatchJob(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "livyApiVersion", encoded = true) String livyApiVersion,
                @PathParam(value = "sparkPoolName", encoded = true) String sparkPoolName,
                @PathParam("batchId") int batchId,
                Context context);
    }

    /**
     * List all spark batch jobs which are running under a particular spark pool.
     *
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list. By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for batch list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SparkBatchJobCollection>> getSparkBatchJobsWithResponseAsync(
            Integer from, Integer size, Boolean detailed) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.getSparkBatchJobs(
                                this.client.getEndpoint(),
                                this.client.getLivyApiVersion(),
                                this.client.getSparkPoolName(),
                                from,
                                size,
                                detailed,
                                accept,
                                context));
    }

    /**
     * List all spark batch jobs which are running under a particular spark pool.
     *
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list. By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for batch list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SparkBatchJobCollection>> getSparkBatchJobsWithResponseAsync(
            Integer from, Integer size, Boolean detailed, Context context) {
        final String accept = "application/json";
        return service.getSparkBatchJobs(
                this.client.getEndpoint(),
                this.client.getLivyApiVersion(),
                this.client.getSparkPoolName(),
                from,
                size,
                detailed,
                accept,
                context);
    }

    /**
     * List all spark batch jobs which are running under a particular spark pool.
     *
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list. By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for batch list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkBatchJobCollection> getSparkBatchJobsAsync(Integer from, Integer size, Boolean detailed) {
        return getSparkBatchJobsWithResponseAsync(from, size, detailed)
                .flatMap(
                        (Response<SparkBatchJobCollection> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * List all spark batch jobs which are running under a particular spark pool.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for batch list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkBatchJobCollection> getSparkBatchJobsAsync() {
        final Integer from = null;
        final Integer size = null;
        final Boolean detailed = null;
        return getSparkBatchJobsWithResponseAsync(from, size, detailed)
                .flatMap(
                        (Response<SparkBatchJobCollection> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * List all spark batch jobs which are running under a particular spark pool.
     *
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list. By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for batch list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkBatchJobCollection> getSparkBatchJobsAsync(
            Integer from, Integer size, Boolean detailed, Context context) {
        return getSparkBatchJobsWithResponseAsync(from, size, detailed, context)
                .flatMap(
                        (Response<SparkBatchJobCollection> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * List all spark batch jobs which are running under a particular spark pool.
     *
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list. By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for batch list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkBatchJobCollection getSparkBatchJobs(Integer from, Integer size, Boolean detailed) {
        return getSparkBatchJobsAsync(from, size, detailed).block();
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
        final Integer from = null;
        final Integer size = null;
        final Boolean detailed = null;
        return getSparkBatchJobsAsync(from, size, detailed).block();
    }

    /**
     * List all spark batch jobs which are running under a particular spark pool.
     *
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list. By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for batch list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SparkBatchJobCollection> getSparkBatchJobsWithResponse(
            Integer from, Integer size, Boolean detailed, Context context) {
        return getSparkBatchJobsWithResponseAsync(from, size, detailed, context).block();
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
    public Mono<Response<SparkBatchJob>> createSparkBatchJobWithResponseAsync(
            SparkBatchJobOptions sparkBatchJobOptions, Boolean detailed) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.createSparkBatchJob(
                                this.client.getEndpoint(),
                                this.client.getLivyApiVersion(),
                                this.client.getSparkPoolName(),
                                detailed,
                                sparkBatchJobOptions,
                                accept,
                                context));
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
    public Mono<Response<SparkBatchJob>> createSparkBatchJobWithResponseAsync(
            SparkBatchJobOptions sparkBatchJobOptions, Boolean detailed, Context context) {
        final String accept = "application/json";
        return service.createSparkBatchJob(
                this.client.getEndpoint(),
                this.client.getLivyApiVersion(),
                this.client.getSparkPoolName(),
                detailed,
                sparkBatchJobOptions,
                accept,
                context);
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
    public Mono<SparkBatchJob> createSparkBatchJobAsync(SparkBatchJobOptions sparkBatchJobOptions, Boolean detailed) {
        return createSparkBatchJobWithResponseAsync(sparkBatchJobOptions, detailed)
                .flatMap(
                        (Response<SparkBatchJob> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
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
    public Mono<SparkBatchJob> createSparkBatchJobAsync(SparkBatchJobOptions sparkBatchJobOptions) {
        final Boolean detailed = null;
        return createSparkBatchJobWithResponseAsync(sparkBatchJobOptions, detailed)
                .flatMap(
                        (Response<SparkBatchJob> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
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
    public Mono<SparkBatchJob> createSparkBatchJobAsync(
            SparkBatchJobOptions sparkBatchJobOptions, Boolean detailed, Context context) {
        return createSparkBatchJobWithResponseAsync(sparkBatchJobOptions, detailed, context)
                .flatMap(
                        (Response<SparkBatchJob> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
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
        return createSparkBatchJobAsync(sparkBatchJobOptions, detailed).block();
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
        final Boolean detailed = null;
        return createSparkBatchJobAsync(sparkBatchJobOptions, detailed).block();
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
    public Response<SparkBatchJob> createSparkBatchJobWithResponse(
            SparkBatchJobOptions sparkBatchJobOptions, Boolean detailed, Context context) {
        return createSparkBatchJobWithResponseAsync(sparkBatchJobOptions, detailed, context).block();
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
    public Mono<Response<SparkBatchJob>> getSparkBatchJobWithResponseAsync(int batchId, Boolean detailed) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.getSparkBatchJob(
                                this.client.getEndpoint(),
                                this.client.getLivyApiVersion(),
                                this.client.getSparkPoolName(),
                                batchId,
                                detailed,
                                accept,
                                context));
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
    public Mono<Response<SparkBatchJob>> getSparkBatchJobWithResponseAsync(
            int batchId, Boolean detailed, Context context) {
        final String accept = "application/json";
        return service.getSparkBatchJob(
                this.client.getEndpoint(),
                this.client.getLivyApiVersion(),
                this.client.getSparkPoolName(),
                batchId,
                detailed,
                accept,
                context);
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
    public Mono<SparkBatchJob> getSparkBatchJobAsync(int batchId, Boolean detailed) {
        return getSparkBatchJobWithResponseAsync(batchId, detailed)
                .flatMap(
                        (Response<SparkBatchJob> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
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
    public Mono<SparkBatchJob> getSparkBatchJobAsync(int batchId) {
        final Boolean detailed = null;
        return getSparkBatchJobWithResponseAsync(batchId, detailed)
                .flatMap(
                        (Response<SparkBatchJob> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
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
    public Mono<SparkBatchJob> getSparkBatchJobAsync(int batchId, Boolean detailed, Context context) {
        return getSparkBatchJobWithResponseAsync(batchId, detailed, context)
                .flatMap(
                        (Response<SparkBatchJob> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
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
        return getSparkBatchJobAsync(batchId, detailed).block();
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
        final Boolean detailed = null;
        return getSparkBatchJobAsync(batchId, detailed).block();
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
    public Response<SparkBatchJob> getSparkBatchJobWithResponse(int batchId, Boolean detailed, Context context) {
        return getSparkBatchJobWithResponseAsync(batchId, detailed, context).block();
    }

    /**
     * Cancels a running spark batch job.
     *
     * @param batchId Identifier for the batch job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelSparkBatchJobWithResponseAsync(int batchId) {
        return FluxUtil.withContext(
                context ->
                        service.cancelSparkBatchJob(
                                this.client.getEndpoint(),
                                this.client.getLivyApiVersion(),
                                this.client.getSparkPoolName(),
                                batchId,
                                context));
    }

    /**
     * Cancels a running spark batch job.
     *
     * @param batchId Identifier for the batch job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelSparkBatchJobWithResponseAsync(int batchId, Context context) {
        return service.cancelSparkBatchJob(
                this.client.getEndpoint(),
                this.client.getLivyApiVersion(),
                this.client.getSparkPoolName(),
                batchId,
                context);
    }

    /**
     * Cancels a running spark batch job.
     *
     * @param batchId Identifier for the batch job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelSparkBatchJobAsync(int batchId) {
        return cancelSparkBatchJobWithResponseAsync(batchId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Cancels a running spark batch job.
     *
     * @param batchId Identifier for the batch job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelSparkBatchJobAsync(int batchId, Context context) {
        return cancelSparkBatchJobWithResponseAsync(batchId, context).flatMap((Response<Void> res) -> Mono.empty());
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
        cancelSparkBatchJobAsync(batchId).block();
    }

    /**
     * Cancels a running spark batch job.
     *
     * @param batchId Identifier for the batch job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> cancelSparkBatchJobWithResponse(int batchId, Context context) {
        return cancelSparkBatchJobWithResponseAsync(batchId, context).block();
    }
}
