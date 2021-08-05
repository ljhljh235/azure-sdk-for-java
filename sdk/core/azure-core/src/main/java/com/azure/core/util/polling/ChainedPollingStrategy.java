// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util.polling;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.TypeReference;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * A polling strategy that chains multiple polling strategies, finds the first strategy that can poll the current
 * long running operation, and polls with that strategy.
 */
public class ChainedPollingStrategy<T, U> implements PollingStrategy<T, U> {
    private final List<PollingStrategy<T, U>> pollingStrategies;
    private PollingStrategy<T, U> pollableStrategy = null;

    /**
     * Creates an empty chained polling strategy.
     */
    public ChainedPollingStrategy() {
        this.pollingStrategies = new ArrayList<>();
    }

    /**
     * Creates a chained polling strategy with 3 known polling strategies, {@link OperationResourcePollingStrategy},
     * {@link LocationPollingStrategy}, and {@link StatusCheckPollingStrategy}, in this order. The first strategy that
     * can poll on the initial response will be used. The created chained polling strategy is capable of handling most
     * of the polling scenarios in Azure.
     *
     * @param httpPipeline an instance of {@link HttpPipeline} to send requests with
     * @param context additional metadata to pass along with the request
     * @return the initialized chained polling strategy with the default chain
     */
    public static <T, U> ChainedPollingStrategy<T, U> createDefault(
            HttpPipeline httpPipeline,
            Context context) {
        return new ChainedPollingStrategy<T, U>()
            .addPollingStrategy(new OperationResourcePollingStrategy<>(httpPipeline, context))
            .addPollingStrategy(new LocationPollingStrategy<>(httpPipeline, context))
            .addPollingStrategy(new StatusCheckPollingStrategy<>());
    }

    /**
     * Adds a polling strategy to the chain of polling strategies.
     * @param pollingStrategy the polling strategy to add
     * @return the modified ChainedPollingStrategy instance
     */
    public ChainedPollingStrategy<T, U> addPollingStrategy(PollingStrategy<T, U> pollingStrategy) {
        this.pollingStrategies.add(pollingStrategy);
        return this;
    }

    @Override
    public Mono<Boolean> canPoll(Response<?> initialResponse) {
        return Flux.fromIterable(pollingStrategies)
            .concatMap(strategy -> strategy.canPoll(initialResponse).doOnNext(canPoll -> {
                if (canPoll && pollableStrategy == null) {
                    this.pollableStrategy = strategy;
                }
            }))
            .any(canPoll -> canPoll)
            .switchIfEmpty(Mono.just(false));
    }

    @Override
    public Mono<U> getResult(PollingContext<T> context, TypeReference<U> resultType) {
        return pollableStrategy.getResult(context, resultType);
    }

    @Override
    public Mono<LongRunningOperationStatus> onInitialResponse(Response<?> response, PollingContext<T> pollingContext,
                                                              TypeReference<T> pollResultType) {
        return pollableStrategy.onInitialResponse(response, pollingContext, pollResultType);
    }

    @Override
    public Mono<PollResponse<T>> poll(PollingContext<T> context, TypeReference<T> pollResultType) {
        return pollableStrategy.poll(context, pollResultType);
    }

    @Override
    public Mono<T> cancel(PollingContext<T> pollingContext, PollResponse<T> initialResponse) {
        return pollableStrategy.cancel(pollingContext, initialResponse);
    }
}
