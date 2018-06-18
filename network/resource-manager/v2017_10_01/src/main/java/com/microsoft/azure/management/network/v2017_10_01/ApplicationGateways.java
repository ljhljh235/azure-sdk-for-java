/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.network.v2017_10_01.implementation.ApplicationGatewaysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ApplicationGateways.
 */
public interface ApplicationGateways extends SupportsCreating<ApplicationGateway.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<ApplicationGateway>, SupportsListingByResourceGroup<ApplicationGateway>, SupportsListing<ApplicationGateway>, HasInner<ApplicationGatewaysInner> {
    /**
     * Starts the specified application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable startAsync(String resourceGroupName, String applicationGatewayName);

    /**
     * Stops the specified application gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable stopAsync(String resourceGroupName, String applicationGatewayName);

    /**
     * Gets the backend health of the specified application gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationGatewayBackendHealth> backendHealthAsync(String resourceGroupName, String applicationGatewayName);

    /**
     * Lists all available web application firewall rule sets.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationGatewayAvailableWafRuleSetsResult> listAvailableWafRuleSetsAsync();

    /**
     * Lists available Ssl options for configuring Ssl policy.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationGatewayAvailableSslOptions> listAvailableSslOptionsAsync();

    /**
     * Lists all SSL predefined policies for configuring Ssl policy.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationGatewaySslPredefinedPolicy> listAvailableSslPredefinedPoliciesAsync();

    /**
     * Gets Ssl predefined policy with the specified policy name.
     *
     * @param predefinedPolicyName Name of Ssl predefined policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationGatewaySslPredefinedPolicy> getSslPredefinedPolicyAsync(String predefinedPolicyName);

}
