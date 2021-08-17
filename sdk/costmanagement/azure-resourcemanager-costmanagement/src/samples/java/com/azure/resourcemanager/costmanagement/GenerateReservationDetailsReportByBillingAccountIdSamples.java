// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement;

import com.azure.core.util.Context;

/** Samples for GenerateReservationDetailsReport ByBillingAccountId. */
public final class GenerateReservationDetailsReportByBillingAccountIdSamples {
    /**
     * Sample code: ReservationDetails.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void reservationDetails(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .generateReservationDetailsReports()
            .byBillingAccountId("9845612", "2020-01-01", "2020-01-30", Context.NONE);
    }
}
