// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview;

import com.azure.resourcemanager.purview.models.AccountSku;
import com.azure.resourcemanager.purview.models.Name;

/** Samples for Accounts CreateOrUpdate. */
public final class AccountsCreateOrUpdateSamples {
    /*
     * operationId: Accounts_CreateOrUpdate
     * api-version: 2021-07-01
     * x-ms-examples: Accounts_CreateOrUpdate
     */
    /**
     * Sample code: Accounts_CreateOrUpdate.
     *
     * @param manager Entry point to PurviewManager.
     */
    public static void accountsCreateOrUpdate(com.azure.resourcemanager.purview.PurviewManager manager) {
        manager
            .accounts()
            .define("account1")
            .withRegion("West US 2")
            .withExistingResourceGroup("SampleResourceGroup")
            .withSku(new AccountSku().withCapacity(4).withName(Name.STANDARD))
            .withManagedResourceGroupName("custom-rgname")
            .create();
    }
}
