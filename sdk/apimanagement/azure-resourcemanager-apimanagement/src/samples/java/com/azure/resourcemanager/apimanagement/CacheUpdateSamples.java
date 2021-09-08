// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.CacheContract;

/** Samples for Cache Update. */
public final class CacheUpdateSamples {
    /*
     * operationId: Cache_Update
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementUpdateCache
     */
    /**
     * Sample code: ApiManagementUpdateCache.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementUpdateCache(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        CacheContract resource = manager.caches().getWithResponse("rg1", "apimService1", "c1", Context.NONE).getValue();
        resource.update().withUseFromLocation("westindia").withIfMatch("*").apply();
    }
}
