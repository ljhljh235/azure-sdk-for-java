// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import java.util.Map;

public class PostProcessor {
    public Map<String, String> process(Map<String, String> files) {
        String clientImplPath = "src/main/java/com/azure/messaging/servicebus/implementation/ServiceBusManagementClientImpl.java";
        String clientImpl = files.get(clientImplPath);
        clientImpl = clientImpl.replace("return this.serializerAdapter;", "return serializerAdapter;");
        files.put(clientImplPath, clientImpl);
        return files;
    }
}
