// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks GetVMGroup. */
public final class WorkloadNetworksGetVMGroupSamples {
    /**
     * Sample code: WorkloadNetworks_GetVMGroup.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksGetVMGroup(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.workloadNetworks().getVMGroupWithResponse("group1", "cloud1", "vmGroup1", Context.NONE);
    }
}
