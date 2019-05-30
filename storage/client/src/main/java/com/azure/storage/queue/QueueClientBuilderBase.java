package com.azure.storage.queue;

import com.azure.core.configuration.Configuration;
import com.azure.core.credentials.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.TokenCredentialPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.implementation.http.policy.spi.HttpPolicyProviders;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class QueueClientBuilderBase {
    private final List<HttpPipelinePolicy> policies;

    private URL endpoint;
    private TokenCredential credentials; // Revert this to SharedKeyCredentials once it is implemented.
    private HttpClient httpClient;
    private HttpLogDetailLevel logLevel;
    private RetryPolicy retryPolicy;
    private Configuration configuration;

    QueueClientBuilderBase() {
        retryPolicy = new RetryPolicy();
        logLevel = HttpLogDetailLevel.NONE;
        policies = new ArrayList<>();
    }

    QueueAsyncRawClient build() {
        Objects.requireNonNull(endpoint);

        // Closest to API goes first, closest to wire goes last.
        final List<HttpPipelinePolicy> policies = new ArrayList<>();

        policies.add(new UserAgentPolicy(QueueConfiguration.NAME, QueueConfiguration.VERSION));
        policies.add(new RequestIdPolicy());
        policies.add(new AddDatePolicy());
        policies.add(new TokenCredentialPolicy(credentials));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);

        policies.add(retryPolicy);

        policies.addAll(this.policies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(logLevel));

        HttpPipeline pipeline = HttpPipeline.builder()
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .build();

        return new QueueAsyncRawClient(endpoint, pipeline);
    }

    public QueueClientBuilderBase endpoint(String endpoint) throws MalformedURLException {
        this.endpoint = new URL(endpoint);
        return this;
    }

    public QueueClientBuilderBase credentials(TokenCredential credentials) {
        this.credentials = credentials;
        return this;
    }

    public QueueClientBuilderBase connectionString(String connectionString) {
        // The connection string should contain the information needed to build the credentials and set the endpoint.
        return this;
    }

    public QueueClientBuilderBase httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    public QueueClientBuilderBase addPolicy(HttpPipelinePolicy pipelinePolicy) {
        this.policies.add(pipelinePolicy);
        return this;
    }

    public QueueClientBuilderBase httpLogDetailLevel(HttpLogDetailLevel logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    public QueueClientBuilderBase configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }
}
