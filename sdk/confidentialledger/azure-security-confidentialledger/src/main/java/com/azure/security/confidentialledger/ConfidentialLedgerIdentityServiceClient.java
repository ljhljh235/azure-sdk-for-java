// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.confidentialledger;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.security.confidentialledger.implementation.ConfidentialLedgerIdentityServicesImpl;

/** Initializes a new instance of the synchronous ConfidentialLedgerClient type. */
@ServiceClient(builder = ConfidentialLedgerClientBuilder.class)
public final class ConfidentialLedgerIdentityServiceClient {
    private final ConfidentialLedgerIdentityServicesImpl serviceClient;

    /**
     * Initializes an instance of ConfidentialLedgerIdentityServices client.
     *
     * @param serviceClient the service client implementation.
     */
    ConfidentialLedgerIdentityServiceClient(ConfidentialLedgerIdentityServicesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets identity information for a Confidential Ledger instance.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     ledgerId: String
     *     ledgerTlsCertificate: String
     * }
     * }</pre>
     *
     * @param ledgerId Id of the Confidential Ledger instance to get information for.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return identity information for a Confidential Ledger instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BinaryData getLedgerIdentity(String ledgerId, RequestOptions requestOptions) {
        return this.serviceClient.getLedgerIdentity(ledgerId, requestOptions);
    }
}
