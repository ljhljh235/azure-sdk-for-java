// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.mgmt;

import com.azure.common.exception.ServiceRequestException;
import com.azure.common.http.AsyncHttpResponse;

public class MyAzureException extends ServiceRequestException {
    public MyAzureException(String message, AsyncHttpResponse response, HttpBinJSON body) {
        super(message, response, body);
    }

    @Override
    public HttpBinJSON value() {
        return (HttpBinJSON) super.value();
    }
}
