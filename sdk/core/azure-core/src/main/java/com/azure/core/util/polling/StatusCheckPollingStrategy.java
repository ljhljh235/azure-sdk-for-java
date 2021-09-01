// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util.polling;

import com.azure.core.exception.AzureException;
import com.azure.core.http.rest.Response;
import com.azure.core.implementation.serializer.DefaultJsonSerializer;
import com.azure.core.util.polling.implementation.PollingConstants;
import com.azure.core.util.polling.implementation.PollingUtils;
import com.azure.core.util.serializer.ObjectSerializer;
import com.azure.core.util.serializer.TypeReference;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * Fallback polling strategy that doesn't poll but exits successfully if no other polling strategies are detected
 * and status code is 2xx.
 *
 * @param <T> the type of the response type from a polling call, or BinaryData if raw response body should be kept
 * @param <U> the type of the final result object to deserialize into, or BinaryData if raw response body should be
 *           kept
 */
public class StatusCheckPollingStrategy<T, U> implements PollingStrategy<T, U> {
    private static final ObjectSerializer SERIALIZER = new DefaultJsonSerializer();

    @Override
    public Mono<Boolean> canPoll(Response<?> initialResponse) {
        return Mono.just(true);
    }

    @Override
    public Mono<PollResponse<T>> onInitialResponse(Response<?> response, PollingContext<T> pollingContext,
                                                              TypeReference<T> pollResponseType) {
        if (response.getStatusCode() == 200
                || response.getStatusCode() == 201
                || response.getStatusCode() == 202
                || response.getStatusCode() == 204) {
            String retryAfterValue = response.getHeaders().getValue(PollingConstants.RETRY_AFTER);
            Duration retryAfter = retryAfterValue == null ? null : Duration.ofSeconds(Long.parseLong(retryAfterValue));
            return PollingUtils.convertResponse(response.getValue(), SERIALIZER, pollResponseType)
                .map(value -> new PollResponse<>(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, value, retryAfter))
                .switchIfEmpty(Mono.defer(() -> Mono.just(new PollResponse<>(
                    LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, null, retryAfter))));
        } else {
            return Mono.error(new AzureException("Operation failed or cancelled: " + response.getStatusCode()));
        }
    }

    @Override
    public Mono<PollResponse<T>> poll(PollingContext<T> context, TypeReference<T> pollResponseType) {
        return Mono.error(new IllegalStateException("StatusCheckPollingStrategy doesn't support polling"));
    }

    @Override
    public Mono<U> getResult(PollingContext<T> pollingContext, TypeReference<U> resultType) {
        T activationResponse = pollingContext.getActivationResponse().getValue();
        return PollingUtils.convertResponse(activationResponse, SERIALIZER, resultType);
    }
}
