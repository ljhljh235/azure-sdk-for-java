// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.netty;

import com.azure.common.http.HttpClient;
import com.azure.common.http.ProxyOptions;
import com.azure.common.http.ProxyOptions.Type;
import com.azure.common.implementation.RestProxyTests;
import org.junit.Ignore;

import java.net.InetSocketAddress;

@Ignore("Should only be run manually when a local proxy server (e.g. Fiddler) is running")
public class RestProxyWithHttpProxyNettyTests extends RestProxyTests {

    @Override
    protected HttpClient createHttpClient() {
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 8888);
        return HttpClient.createDefault().proxy(() -> new ProxyOptions(Type.HTTP, address));
    }
}
