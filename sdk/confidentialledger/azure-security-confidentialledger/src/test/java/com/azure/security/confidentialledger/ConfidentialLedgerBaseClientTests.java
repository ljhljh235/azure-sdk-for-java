// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.confidentialledger;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConfidentialLedgerBaseClientTests extends ConfidentialLedgerClientTestBase {
    private ConfidentialLedgerClient client;

    @Override
    protected void beforeTest() {
        client = clientSetup(httpPipeline -> {
            return new ConfidentialLedgerClientBuilder()
                .ledgerUri(getConfidentialLedgerUrl())
                .identityServiceUri(getConfidentialIdentityUrl())
                .pipeline(httpPipeline)
                .buildConfidentialLedgerClient();
        });
    }

    @Test
    public void getLedgerEntries()
    {
        PagedIterable<BinaryData> response = client.getLedgerEntries(null);
        assertTrue(response.stream().count() > 0);
    }
}
