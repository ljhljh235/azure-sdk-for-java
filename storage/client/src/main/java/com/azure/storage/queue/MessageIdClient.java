package com.azure.storage.queue;

import com.azure.core.util.Context;
import com.azure.storage.queue.models.QueueMessage;
import com.azure.storage.queue.models.UpdatedMessage;

import java.time.Duration;

public final class MessageIdClient {
    private final MessageIdRawClient client;

    MessageIdClient(MessageIdRawClient client) {
        this.client = client;
    }

    public static MessageIdClientBuilder builder() {
        return new MessageIdClientBuilder();
    }

    public MessageIdRawClient getRawClient() {
        return client;
    }

    public UpdatedMessage update(QueueMessage queueMessage, String popReceipt, int visibilityTimeout) {
        return client.update(queueMessage, popReceipt, visibilityTimeout, Duration.ZERO, Context.NONE).value();
    }

    public void delete(String popReceipt) {
        client.delete(popReceipt, Duration.ZERO, Context.NONE);
    }
}
