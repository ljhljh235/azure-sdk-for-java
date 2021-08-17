// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for Locations CheckQuotaAvailability. */
public final class LocationsCheckQuotaAvailabilitySamples {
    /**
     * Sample code: Locations_CheckQuotaAvailability.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void locationsCheckQuotaAvailability(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.locations().checkQuotaAvailabilityWithResponse("eastus", Context.NONE);
    }
}
