package com.azure.security.keyvault.secrets;

import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.implementation.http.UrlBuilder;
import com.azure.identity.credential.AuthorizationCodeCredential;
import com.azure.identity.credential.AuthorizationCodeCredentialBuilder;
import com.azure.security.keyvault.secrets.models.SecretBase;
import fi.iki.elonen.NanoHTTPD;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AuthorizationCodeLoginWebService {
    private static String authCode;
    private static String loginUri;
    private static List<String> secrets = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        int port = 8765;

        AuthorizationCodeCredential credential = new AuthorizationCodeCredentialBuilder()
            .clientId("04b07795-8ddb-461a-bbee-02f9e1bf7b46")
            .redirectUri("http://localhost:" + port)
            .authorizationCodeProvider(loginUri -> {
                AuthorizationCodeLoginWebService.loginUri = loginUri;
                return Mono.delay(Duration.ofSeconds(1))
                    .repeat()
                    .flatMap(aLong -> authCode != null ? Mono.just(authCode) : Mono.empty())
                    .next();
            })
            .build();

        Thread secretClient = new Thread(() -> {
            SecretClient client = new SecretClientBuilder()
                .endpoint("https://persistentcachedemo.vault.azure.net")
                .credential(credential)
                .httpClient(new NettyAsyncHttpClientBuilder().build())
                .buildClient();
            Iterable<SecretBase> secretBases = client.listSecrets();
            for (SecretBase base : secretBases) {
                secrets.add(base.getName());
            }
        });
        secretClient.start();

        NanoHTTPD server = new NanoHTTPD(port) {
            @Override
            public NanoHTTPD.Response serve(final IHTTPSession session) {

                String uriWithQueryParams = session.getUri() + "?" + session.getQueryParameterString();
                authCode = getCodeFromUri(uriWithQueryParams);
                if (authCode == null) {
                    try {
                        while (loginUri == null) {
                            Thread.sleep(1000);
                        }
                        return newFixedLengthResponse(String.format("<a href=%s><img src=https://docs.microsoft.com/ja-jp/azure/active-directory/develop/guidedsetups/media/active-directory-serversidewebapp-aspnetwebappowin-use/aspnetsigninbuttonsample.png /></a>",
                            loginUri));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        while (secretClient.isAlive()) {
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return newFixedLengthResponse("Secrets are " + String.join(", ", secrets));
                }
            }
        };

        server.start();
        Thread.sleep(300000);
        server.stop();
    }

    private static String getCodeFromUri(String uri) {
        UrlBuilder urlBuilder = UrlBuilder.parse(uri);
        for (String query : urlBuilder.getQuery().keySet()) {
            if ("code".equalsIgnoreCase(query)) {
                return urlBuilder.getQuery().get(query);
            }
        }
        return null;
    }
}
