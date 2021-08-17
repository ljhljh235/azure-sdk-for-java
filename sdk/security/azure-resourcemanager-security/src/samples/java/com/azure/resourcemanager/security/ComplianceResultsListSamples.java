// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for ComplianceResults List. */
public final class ComplianceResultsListSamples {
    /**
     * Sample code: Get compliance results on subscription.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getComplianceResultsOnSubscription(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.complianceResults().list("subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23", Context.NONE);
    }
}
