// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for Assets GetEncryptionKey. */
public final class AssetsGetEncryptionKeySamples {
    /**
     * Sample code: Get Asset Storage Encryption Keys.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void getAssetStorageEncryptionKeys(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .assets()
            .getEncryptionKeyWithResponse("contoso", "contosomedia", "ClimbingMountSaintHelens", Context.NONE);
    }
}
