/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.features.v2015_12_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.features.v2015_12_01.Features;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Features resource management.
 */
public final class FeaturesManager extends ManagerCore<FeaturesManager, FeatureClientImpl> {
    private Features features;
    /**
    * Get a Configurable instance that can be used to create FeaturesManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new FeaturesManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of FeaturesManager that exposes Features resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the FeaturesManager
    */
    public static FeaturesManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new FeaturesManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of FeaturesManager that exposes Features resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the FeaturesManager
    */
    public static FeaturesManager authenticate(RestClient restClient, String subscriptionId) {
        return new FeaturesManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of FeaturesManager that exposes Features management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Features management API entry points that work across subscriptions
        */
        FeaturesManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Features.
     */
    public Features features() {
        if (this.features == null) {
            this.features = new FeaturesImpl(this);
        }
        return this.features;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public FeaturesManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return FeaturesManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private FeaturesManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new FeatureClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
