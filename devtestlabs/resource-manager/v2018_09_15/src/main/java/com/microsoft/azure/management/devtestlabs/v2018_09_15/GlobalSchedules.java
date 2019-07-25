/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.GlobalSchedulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing GlobalSchedules.
 */
public interface GlobalSchedules extends SupportsCreating<Schedule.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Schedule>, SupportsListingByResourceGroup<Schedule>, SupportsListing<Schedule>, HasInner<GlobalSchedulesInner> {
    /**
     * Execute a schedule. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable executeAsync(String resourceGroupName, String name);

    /**
     * Updates a schedule's target resource Id. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the schedule.
     * @param retargetScheduleProperties Properties for retargeting a virtual machine schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable retargetAsync(String resourceGroupName, String name, RetargetScheduleProperties retargetScheduleProperties);

}
