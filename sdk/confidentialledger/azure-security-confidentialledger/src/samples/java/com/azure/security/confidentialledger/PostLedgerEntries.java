// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.confidentialledger;

import com.azure.core.http.HttpClient;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.identity.AzureCliCredentialBuilder;
import io.netty.handler.ssl.SslContextBuilder;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

/**
 * Sample for getting ledger entries using the ConfidentialLedgerBaseClient.
 */
public class PostLedgerEntries {
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
        JsonObject certResult = jsonReader.readObject();
        String tlsCert = certResult.getString("ledgerTlsCertificate");
        reactor.netty.http.client.HttpClient reactorClient = reactor.netty.http.client.HttpClient.create()
            .secure(sslContextSpec -> sslContextSpec.sslContext(SslContextBuilder.forClient()
                .trustManager(new ByteArrayInputStream(tlsCert.getBytes(StandardCharsets.UTF_8)))));
        HttpClient httpClient = new NettyAsyncHttpClientBuilder(reactorClient)
//            .proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress("jianghlu.redmond.corp.microsoft.com", 8888)))
            .wiretap(true).build();

        System.out.println("Creating Confidential Ledger client with the certificate...");

        ConfidentialLedgerAsyncClient confidentialLedgerClient = new ConfidentialLedgerClientBuilder()
            .ledgerUri(System.getenv("CONFIDENTIALLEDGER_URL"))
            .credential(new AzureCliCredentialBuilder().build())
            .httpClient(httpClient)
            .buildConfidentialLedgerAsyncClient();

        System.out.println("Posting ledger entries:");

        BinaryData postResult = confidentialLedgerClient.beginPostLedgerEntryAndWait(new RequestOptions()
            .addQueryParam("Name", "<ledger name>")
            .setBody(BinaryData.fromString("{\"contents\":\"The content of the ledger\"}")))
            .block();

        System.out.println("Created ledger: " + postResult.toString());

        System.out.println("Getting ledger entries:");

        confidentialLedgerClient.getLedgerEntries(null)
            .doOnNext(entry -> {
                JsonReader reader = Json.createReader(new StringReader(entry.toString()));
                JsonObject entryResult = reader.readObject();
                System.out.println("Sub leger " + entryResult.getString("subLedgerId") + ": " + entryResult.getString("contents"));
            }).blockLast();
    }
}
