// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for ManagedPrivateEndpoints ListByFactory. */
public final class ManagedPrivateEndpointsListByFactorySamples {
    /**
     * Sample code: ManagedPrivateEndpoints_ListByFactory.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void managedPrivateEndpointsListByFactory(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .managedPrivateEndpoints()
            .listByFactory(
                "exampleResourceGroup", "exampleFactoryName", "exampleManagedVirtualNetworkName", Context.NONE);
    }
}
