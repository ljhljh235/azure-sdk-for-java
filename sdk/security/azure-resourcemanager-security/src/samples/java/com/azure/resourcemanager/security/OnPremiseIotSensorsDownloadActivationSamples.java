// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for OnPremiseIotSensors DownloadActivation. */
public final class OnPremiseIotSensorsDownloadActivationSamples {
    /**
     * Sample code: Download activation file.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void downloadActivationFile(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.onPremiseIotSensors().downloadActivationWithResponse("mySensor", Context.NONE);
    }
}
