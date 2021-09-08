// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.AccessIdName;

/** Samples for TenantAccessGit RegenerateSecondaryKey. */
public final class TenantAccessGitRegenerateSecondaryKeySamples {
    /*
     * operationId: TenantAccessGit_RegenerateSecondaryKey
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementTenantAccessRegenerateKey
     */
    /**
     * Sample code: ApiManagementTenantAccessRegenerateKey.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementTenantAccessRegenerateKey(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .tenantAccessGits()
            .regenerateSecondaryKeyWithResponse("rg1", "apimService1", AccessIdName.ACCESS, Context.NONE);
    }
}
