// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development;

import com.azure.analytics.synapse.development.implementation.TriggerRunsImpl;
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
import com.azure.core.annotation.ServiceClient;
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
 * Initializes a new instance of the synchronous DevelopmentClient type.
 */
@ServiceClient(builder = DevelopmentClientBuilder.class)
public final class TriggerRunClient {
    private TriggerRunsImpl serviceClient;

    /**
     * Initializes an instance of TriggerRuns client.
     */
    TriggerRunClient(TriggerRunsImpl serviceClient) {
        this.serviceClient = serviceClient;
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
        this.serviceClient.rerunTriggerInstance(triggerName, runId);
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
        this.serviceClient.rerunTriggerInstance(triggerName, runId, context);
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
        return this.serviceClient.queryTriggerRunsByWorkspace(filterParameters);
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
        return this.serviceClient.queryTriggerRunsByWorkspace(filterParameters, context);
    }
}
