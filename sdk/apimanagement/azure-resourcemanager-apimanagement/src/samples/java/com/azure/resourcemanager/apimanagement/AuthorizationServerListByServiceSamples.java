// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for AuthorizationServer ListByService. */
public final class AuthorizationServerListByServiceSamples {
    /*
     * operationId: AuthorizationServer_ListByService
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementListAuthorizationServers
     */
    /**
     * Sample code: ApiManagementListAuthorizationServers.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListAuthorizationServers(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.authorizationServers().listByService("rg1", "apimService1", null, null, null, Context.NONE);
    }
}
