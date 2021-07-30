package com.azure.security.confidentialledger.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.PollingContext;
import com.azure.core.util.polling.PollingStrategy;
import com.azure.core.util.serializer.TypeReference;
import reactor.core.publisher.Mono;

import java.util.function.Function;

public class PostLedgerEntriesPollingStrategy implements PollingStrategy<BinaryData> {
    private static final String X_MS_CCF_TRANSACTION_ID = "x-ms-ccf-transaction-id";

    private final Function<String, Mono<BinaryData>> getTransactionStatusOperation;

    public PostLedgerEntriesPollingStrategy(Function<String, Mono<BinaryData>> getTransactionStatusOperation) {
        this.getTransactionStatusOperation = getTransactionStatusOperation;
    }

    @Override
    public Mono<Boolean> canPoll(Response<?> initialResponse) {
        return Mono.just(initialResponse.getStatusCode() == 200
            && initialResponse.getHeaders().get(X_MS_CCF_TRANSACTION_ID) != null);
    }

    @Override
    public Mono<LongRunningOperationStatus> onInitialResponse(Response<?> response, PollingContext<BinaryData> pollingContext) {
        pollingContext.setData(X_MS_CCF_TRANSACTION_ID, response.getHeaders().get(X_MS_CCF_TRANSACTION_ID).getValue());
        return Mono.just(LongRunningOperationStatus.IN_PROGRESS);
    }

    @Override
    public Mono<PollResponse<BinaryData>> poll(PollingContext<BinaryData> pollingContext) {
        return getTransactionStatusOperation.apply(pollingContext.getData(X_MS_CCF_TRANSACTION_ID))
            .flatMap(binaryData -> binaryData.toObjectAsync(TransactionStatusResult.class)
                .map(result -> {
                    LongRunningOperationStatus lroStatus;
                    if ("Pending".equalsIgnoreCase(result.state)) {
                        lroStatus = LongRunningOperationStatus.IN_PROGRESS;
                    } else if ("Committed".equalsIgnoreCase(result.state)) {
                        lroStatus = LongRunningOperationStatus.SUCCESSFULLY_COMPLETED;
                    } else {
                        lroStatus = LongRunningOperationStatus.FAILED;
                    }
                    return new PollResponse<>(lroStatus, binaryData);
                }));
    }

    @Override
    public Mono<BinaryData> getResult(PollingContext<BinaryData> pollingContext, TypeReference<BinaryData> resultType) {
        return Mono.just(pollingContext.getActivationResponse().getValue());
    }

    @Override
    public Mono<BinaryData> cancel(PollingContext<BinaryData> pollingContext, PollResponse<BinaryData> initialResponse) {
        return Mono.error(new IllegalStateException("Cancellation is not supported for PostLedgerEntries operation"));
    }

    private static class TransactionStatusResult {
        private String state;

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }
}
