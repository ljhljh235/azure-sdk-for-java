// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.netty;

import com.azure.common.http.HttpClient;
import com.azure.common.implementation.RestProxyTests;

public class RestProxyWithNettyTests extends RestProxyTests {

    @Override
    protected HttpClient createHttpClient() {
        return HttpClient.createDefault();
    }
}
