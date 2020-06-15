// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.faceapi.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the take operation. */
public final class SnapshotsTakeResponse extends ResponseBase<SnapshotsTakeHeaders, Void> {
    /**
     * Creates an instance of SnapshotsTakeResponse.
     *
     * @param request the request which resulted in this SnapshotsTakeResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public SnapshotsTakeResponse(
            HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, SnapshotsTakeHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
