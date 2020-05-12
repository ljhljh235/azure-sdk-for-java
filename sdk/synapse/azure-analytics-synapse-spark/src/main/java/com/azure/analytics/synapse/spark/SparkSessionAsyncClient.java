// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark;

import com.azure.analytics.synapse.spark.implementation.SparkSessionsImpl;
import com.azure.analytics.synapse.spark.implementation.models.SparkSession;
import com.azure.analytics.synapse.spark.implementation.models.SparkSessionCollection;
import com.azure.analytics.synapse.spark.implementation.models.SparkSessionOptions;
import com.azure.analytics.synapse.spark.implementation.models.SparkStatement;
import com.azure.analytics.synapse.spark.implementation.models.SparkStatementCancellationResult;
import com.azure.analytics.synapse.spark.implementation.models.SparkStatementCollection;
import com.azure.analytics.synapse.spark.implementation.models.SparkStatementOptions;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
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
 * Initializes a new instance of the asynchronous SparkClient type.
 */
@ServiceClient(builder = SparkClientBuilder.class)
public final class SparkSessionAsyncClient {
    private SparkSessionsImpl serviceClient;

    /**
     * Initializes an instance of SparkSessions client.
     */
    SparkSessionAsyncClient(SparkSessionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List all spark sessions which are running under a particular spark pool.
     * 
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list.
     *             By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkSessionCollection>> getSparkSessionsWithResponse(Integer from, Integer size, Boolean detailed) {
        return this.serviceClient.getSparkSessionsWithResponseAsync(from, size, detailed);
    }

    /**
     * List all spark sessions which are running under a particular spark pool.
     * 
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list.
     *             By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkSessionCollection>> getSparkSessionsWithResponse(Integer from, Integer size, Boolean detailed, Context context) {
        return this.serviceClient.getSparkSessionsWithResponseAsync(from, size, detailed, context);
    }

    /**
     * List all spark sessions which are running under a particular spark pool.
     * 
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list.
     *             By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkSessionCollection> getSparkSessions(Integer from, Integer size, Boolean detailed) {
        return this.serviceClient.getSparkSessionsAsync(from, size, detailed);
    }

    /**
     * List all spark sessions which are running under a particular spark pool.
     * 
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list.
     *             By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkSessionCollection> getSparkSessions(Integer from, Integer size, Boolean detailed, Context context) {
        return this.serviceClient.getSparkSessionsAsync(from, size, detailed, context);
    }

    /**
     * List all spark sessions which are running under a particular spark pool.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkSessionCollection> getSparkSessions() {
        return this.serviceClient.getSparkSessionsAsync();
    }

    /**
     * Create new spark session.
     * 
     * @param sparkSessionOptions Livy compatible batch job request payload.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkSession>> createSparkSessionWithResponse(SparkSessionOptions sparkSessionOptions, Boolean detailed) {
        return this.serviceClient.createSparkSessionWithResponseAsync(sparkSessionOptions, detailed);
    }

    /**
     * Create new spark session.
     * 
     * @param sparkSessionOptions Livy compatible batch job request payload.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkSession>> createSparkSessionWithResponse(SparkSessionOptions sparkSessionOptions, Boolean detailed, Context context) {
        return this.serviceClient.createSparkSessionWithResponseAsync(sparkSessionOptions, detailed, context);
    }

    /**
     * Create new spark session.
     * 
     * @param sparkSessionOptions Livy compatible batch job request payload.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkSession> createSparkSession(SparkSessionOptions sparkSessionOptions, Boolean detailed) {
        return this.serviceClient.createSparkSessionAsync(sparkSessionOptions, detailed);
    }

    /**
     * Create new spark session.
     * 
     * @param sparkSessionOptions Livy compatible batch job request payload.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkSession> createSparkSession(SparkSessionOptions sparkSessionOptions, Boolean detailed, Context context) {
        return this.serviceClient.createSparkSessionAsync(sparkSessionOptions, detailed, context);
    }

    /**
     * Create new spark session.
     * 
     * @param sparkSessionOptions Livy compatible batch job request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkSession> createSparkSession(SparkSessionOptions sparkSessionOptions) {
        return this.serviceClient.createSparkSessionAsync(sparkSessionOptions);
    }

    /**
     * Gets a single spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkSession>> getSparkSessionWithResponse(int sessionId, Boolean detailed) {
        return this.serviceClient.getSparkSessionWithResponseAsync(sessionId, detailed);
    }

    /**
     * Gets a single spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkSession>> getSparkSessionWithResponse(int sessionId, Boolean detailed, Context context) {
        return this.serviceClient.getSparkSessionWithResponseAsync(sessionId, detailed, context);
    }

    /**
     * Gets a single spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkSession> getSparkSession(int sessionId, Boolean detailed) {
        return this.serviceClient.getSparkSessionAsync(sessionId, detailed);
    }

    /**
     * Gets a single spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkSession> getSparkSession(int sessionId, Boolean detailed, Context context) {
        return this.serviceClient.getSparkSessionAsync(sessionId, detailed, context);
    }

    /**
     * Gets a single spark session.
     * 
     * @param sessionId Identifier for the session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkSession> getSparkSession(int sessionId) {
        return this.serviceClient.getSparkSessionAsync(sessionId);
    }

    /**
     * Cancels a running spark session.
     * 
     * @param sessionId Identifier for the session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelSparkSessionWithResponse(int sessionId) {
        return this.serviceClient.cancelSparkSessionWithResponseAsync(sessionId);
    }

    /**
     * Cancels a running spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelSparkSessionWithResponse(int sessionId, Context context) {
        return this.serviceClient.cancelSparkSessionWithResponseAsync(sessionId, context);
    }

    /**
     * Cancels a running spark session.
     * 
     * @param sessionId Identifier for the session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelSparkSession(int sessionId) {
        return this.serviceClient.cancelSparkSessionAsync(sessionId);
    }

    /**
     * Cancels a running spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelSparkSession(int sessionId, Context context) {
        return this.serviceClient.cancelSparkSessionAsync(sessionId, context);
    }

    /**
     * Sends a keep alive call to the current session to reset the session timeout.
     * 
     * @param sessionId Identifier for the session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> resetSparkSessionTimeoutWithResponse(int sessionId) {
        return this.serviceClient.resetSparkSessionTimeoutWithResponseAsync(sessionId);
    }

    /**
     * Sends a keep alive call to the current session to reset the session timeout.
     * 
     * @param sessionId Identifier for the session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> resetSparkSessionTimeoutWithResponse(int sessionId, Context context) {
        return this.serviceClient.resetSparkSessionTimeoutWithResponseAsync(sessionId, context);
    }

    /**
     * Sends a keep alive call to the current session to reset the session timeout.
     * 
     * @param sessionId Identifier for the session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> resetSparkSessionTimeout(int sessionId) {
        return this.serviceClient.resetSparkSessionTimeoutAsync(sessionId);
    }

    /**
     * Sends a keep alive call to the current session to reset the session timeout.
     * 
     * @param sessionId Identifier for the session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> resetSparkSessionTimeout(int sessionId, Context context) {
        return this.serviceClient.resetSparkSessionTimeoutAsync(sessionId, context);
    }

    /**
     * Gets a list of statements within a spark session.
     * 
     * @param sessionId Identifier for the session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of statements within a spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkStatementCollection>> getSparkStatementsWithResponse(int sessionId) {
        return this.serviceClient.getSparkStatementsWithResponseAsync(sessionId);
    }

    /**
     * Gets a list of statements within a spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of statements within a spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkStatementCollection>> getSparkStatementsWithResponse(int sessionId, Context context) {
        return this.serviceClient.getSparkStatementsWithResponseAsync(sessionId, context);
    }

    /**
     * Gets a list of statements within a spark session.
     * 
     * @param sessionId Identifier for the session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of statements within a spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkStatementCollection> getSparkStatements(int sessionId) {
        return this.serviceClient.getSparkStatementsAsync(sessionId);
    }

    /**
     * Gets a list of statements within a spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of statements within a spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkStatementCollection> getSparkStatements(int sessionId, Context context) {
        return this.serviceClient.getSparkStatementsAsync(sessionId, context);
    }

    /**
     * Create statement within a spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param sparkStatementOptions Livy compatible batch job request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkStatement>> createSparkStatementWithResponse(int sessionId, SparkStatementOptions sparkStatementOptions) {
        return this.serviceClient.createSparkStatementWithResponseAsync(sessionId, sparkStatementOptions);
    }

    /**
     * Create statement within a spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param sparkStatementOptions Livy compatible batch job request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkStatement>> createSparkStatementWithResponse(int sessionId, SparkStatementOptions sparkStatementOptions, Context context) {
        return this.serviceClient.createSparkStatementWithResponseAsync(sessionId, sparkStatementOptions, context);
    }

    /**
     * Create statement within a spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param sparkStatementOptions Livy compatible batch job request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkStatement> createSparkStatement(int sessionId, SparkStatementOptions sparkStatementOptions) {
        return this.serviceClient.createSparkStatementAsync(sessionId, sparkStatementOptions);
    }

    /**
     * Create statement within a spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param sparkStatementOptions Livy compatible batch job request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkStatement> createSparkStatement(int sessionId, SparkStatementOptions sparkStatementOptions, Context context) {
        return this.serviceClient.createSparkStatementAsync(sessionId, sparkStatementOptions, context);
    }

    /**
     * Gets a single statement within a spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param statementId Identifier for the statement.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single statement within a spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkStatement>> getSparkStatementWithResponse(int sessionId, int statementId) {
        return this.serviceClient.getSparkStatementWithResponseAsync(sessionId, statementId);
    }

    /**
     * Gets a single statement within a spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param statementId Identifier for the statement.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single statement within a spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkStatement>> getSparkStatementWithResponse(int sessionId, int statementId, Context context) {
        return this.serviceClient.getSparkStatementWithResponseAsync(sessionId, statementId, context);
    }

    /**
     * Gets a single statement within a spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param statementId Identifier for the statement.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single statement within a spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkStatement> getSparkStatement(int sessionId, int statementId) {
        return this.serviceClient.getSparkStatementAsync(sessionId, statementId);
    }

    /**
     * Gets a single statement within a spark session.
     * 
     * @param sessionId Identifier for the session.
     * @param statementId Identifier for the statement.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single statement within a spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkStatement> getSparkStatement(int sessionId, int statementId, Context context) {
        return this.serviceClient.getSparkStatementAsync(sessionId, statementId, context);
    }

    /**
     * Kill a statement within a session.
     * 
     * @param sessionId Identifier for the session.
     * @param statementId Identifier for the statement.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkStatementCancellationResult>> cancelSparkStatementWithResponse(int sessionId, int statementId) {
        return this.serviceClient.cancelSparkStatementWithResponseAsync(sessionId, statementId);
    }

    /**
     * Kill a statement within a session.
     * 
     * @param sessionId Identifier for the session.
     * @param statementId Identifier for the statement.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SparkStatementCancellationResult>> cancelSparkStatementWithResponse(int sessionId, int statementId, Context context) {
        return this.serviceClient.cancelSparkStatementWithResponseAsync(sessionId, statementId, context);
    }

    /**
     * Kill a statement within a session.
     * 
     * @param sessionId Identifier for the session.
     * @param statementId Identifier for the statement.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkStatementCancellationResult> cancelSparkStatement(int sessionId, int statementId) {
        return this.serviceClient.cancelSparkStatementAsync(sessionId, statementId);
    }

    /**
     * Kill a statement within a session.
     * 
     * @param sessionId Identifier for the session.
     * @param statementId Identifier for the statement.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkStatementCancellationResult> cancelSparkStatement(int sessionId, int statementId, Context context) {
        return this.serviceClient.cancelSparkStatementAsync(sessionId, statementId, context);
    }
}
