// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.confidentialledger;

import com.azure.core.experimental.http.DynamicResponse;
import com.azure.core.http.HttpClient;
import com.azure.core.http.ProxyOptions;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.BinaryData;
import com.azure.identity.AzureCliCredentialBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;
import io.netty.handler.ssl.SslContextBuilder;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Sample for getting ledger entries using the ConfidentialLedgerBaseClient.
 */
public class GetLedgerEntries {
    /**
     * Main method to invoke this demo.
     *
     * @param args Unused arguments to the program.
     */
    public static void main(final String[] args) throws Exception {
        ConfidentialLedgerIdentityServiceClient identityServiceClient = new ConfidentialLedgerClientBuilder()
            .identityServiceUri(System.getenv("CONFIDENTIALLEDGER_IDENTITY_URL"))
            .credential(new AzureCliCredentialBuilder().build())
            .buildConfidentialLedgerIdentityServiceClient();

        System.out.println("Getting certificate from Confidential Ledger Identity service...");

        String ledgerId = System.getenv("CONFIDENTIALLEDGER_URL")
            .replaceAll("\\w+://", "")
            .replaceAll("\\..*", "");
        BinaryData response = identityServiceClient.getLedgerIdentity(ledgerId, null);
        JsonReader jsonReader = Json.createReader(new StringReader(response.toString()));
        JsonObject result = jsonReader.readObject();
        String tlsCert = result.getString("ledgerTlsCertificate");
        reactor.netty.http.client.HttpClient reactorClient = reactor.netty.http.client.HttpClient.create()
            .secure(sslContextSpec -> sslContextSpec.sslContext(SslContextBuilder.forClient()
                .trustManager(new ByteArrayInputStream(tlsCert.getBytes(StandardCharsets.UTF_8)))));
        HttpClient httpClient = new NettyAsyncHttpClientBuilder(reactorClient)
//            .proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress("jianghlu.redmond.corp.microsoft.com", 8888)))
            .wiretap(true).build();

        System.out.println("Creating Confidential Ledger client with the certificate...");

        ConfidentialLedgerClient confidentialLedgerClient = new ConfidentialLedgerClientBuilder()
            .ledgerUri(System.getenv("CONFIDENTIALLEDGER_URL"))
            .credential(new AzureCliCredentialBuilder().build())
            .httpClient(httpClient)
            .buildConfidentialLedgerClient();

        System.out.println("Getting ledger entries:");

        PagedIterable<BinaryData> entries = confidentialLedgerClient.getLedgerEntries(null);

        for (BinaryData entry : entries) {
            jsonReader = Json.createReader(new StringReader(entry.toString()));
            result = jsonReader.readObject();
            System.out.println("Sub leger " + result.getString("subLedgerId") + ": " + result.getString("contents"));
        }
    }
}
