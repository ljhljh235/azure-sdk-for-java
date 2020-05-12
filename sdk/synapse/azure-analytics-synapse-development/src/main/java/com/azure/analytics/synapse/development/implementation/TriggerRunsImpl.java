// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation;

import com.azure.analytics.synapse.development.implementation.models.CloudErrorException;
import com.azure.analytics.synapse.development.implementation.models.RunFilterParameters;
import com.azure.analytics.synapse.development.implementation.models.TriggerRunsQueryResponse;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * TriggerRuns.
 */
public final class TriggerRunsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final TriggerRunsService service;

    /**
     * The service client containing this operation class.
     */
    private final DevelopmentClientImpl client;

    /**
     * Initializes an instance of TriggerRunsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    TriggerRunsImpl(DevelopmentClientImpl client) {
        this.service = RestProxy.create(TriggerRunsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for DevelopmentClientTriggerRuns
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "DevelopmentClientTri")
    private interface TriggerRunsService {
        @Post("/triggers/{triggerName}/triggerRuns/{runId}/rerun")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<Void>> rerunTriggerInstance(@HostParam("endpoint") String endpoint, @PathParam("triggerName") String triggerName, @PathParam("runId") String runId, @QueryParam("api-version") String apiVersion, Context context);

        @Post("/queryTriggerRuns")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<SimpleResponse<TriggerRunsQueryResponse>> queryTriggerRunsByWorkspace(@HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") RunFilterParameters filterParameters, Context context);
    }

    /**
     * Rerun single trigger instance by runId.
     * 
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> rerunTriggerInstanceWithResponseAsync(String triggerName, String runId) {
        return FluxUtil.withContext(context -> service.rerunTriggerInstance(this.client.getEndpoint(), triggerName, runId, this.client.getApiVersion(), context));
    }

    /**
     * Rerun single trigger instance by runId.
     * 
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> rerunTriggerInstanceWithResponseAsync(String triggerName, String runId, Context context) {
        return service.rerunTriggerInstance(this.client.getEndpoint(), triggerName, runId, this.client.getApiVersion(), context);
    }

    /**
     * Rerun single trigger instance by runId.
     * 
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> rerunTriggerInstanceAsync(String triggerName, String runId) {
        return rerunTriggerInstanceWithResponseAsync(triggerName, runId)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Rerun single trigger instance by runId.
     * 
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> rerunTriggerInstanceAsync(String triggerName, String runId, Context context) {
        return rerunTriggerInstanceWithResponseAsync(triggerName, runId, context)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Rerun single trigger instance by runId.
     * 
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void rerunTriggerInstance(String triggerName, String runId) {
        rerunTriggerInstanceAsync(triggerName, runId).block();
    }

    /**
     * Rerun single trigger instance by runId.
     * 
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void rerunTriggerInstance(String triggerName, String runId, Context context) {
        rerunTriggerInstanceAsync(triggerName, runId, context).block();
    }

    /**
     * Query trigger runs.
     * 
     * @param filterParameters Query parameters for listing runs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<TriggerRunsQueryResponse>> queryTriggerRunsByWorkspaceWithResponseAsync(RunFilterParameters filterParameters) {
        return FluxUtil.withContext(context -> service.queryTriggerRunsByWorkspace(this.client.getEndpoint(), this.client.getApiVersion(), filterParameters, context));
    }

    /**
     * Query trigger runs.
     * 
     * @param filterParameters Query parameters for listing runs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<TriggerRunsQueryResponse>> queryTriggerRunsByWorkspaceWithResponseAsync(RunFilterParameters filterParameters, Context context) {
        return service.queryTriggerRunsByWorkspace(this.client.getEndpoint(), this.client.getApiVersion(), filterParameters, context);
    }

    /**
     * Query trigger runs.
     * 
     * @param filterParameters Query parameters for listing runs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TriggerRunsQueryResponse> queryTriggerRunsByWorkspaceAsync(RunFilterParameters filterParameters) {
        return queryTriggerRunsByWorkspaceWithResponseAsync(filterParameters)
            .flatMap((SimpleResponse<TriggerRunsQueryResponse> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Query trigger runs.
     * 
     * @param filterParameters Query parameters for listing runs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TriggerRunsQueryResponse> queryTriggerRunsByWorkspaceAsync(RunFilterParameters filterParameters, Context context) {
        return queryTriggerRunsByWorkspaceWithResponseAsync(filterParameters, context)
            .flatMap((SimpleResponse<TriggerRunsQueryResponse> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Query trigger runs.
     * 
     * @param filterParameters Query parameters for listing runs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TriggerRunsQueryResponse queryTriggerRunsByWorkspace(RunFilterParameters filterParameters) {
        return queryTriggerRunsByWorkspaceAsync(filterParameters).block();
    }

    /**
     * Query trigger runs.
     * 
     * @param filterParameters Query parameters for listing runs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TriggerRunsQueryResponse queryTriggerRunsByWorkspace(RunFilterParameters filterParameters, Context context) {
        return queryTriggerRunsByWorkspaceAsync(filterParameters, context).block();
    }
}
