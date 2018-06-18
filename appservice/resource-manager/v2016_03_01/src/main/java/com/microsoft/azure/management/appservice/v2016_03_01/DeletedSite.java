/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_03_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2016_03_01.implementation.DeletedSiteInner;

/**
 * Type representing DeletedSite.
 */
public interface DeletedSite extends HasInner<DeletedSiteInner>, HasManager<AppServiceManager> {
    /**
     * @return the deletedTimestamp value.
     */
    String deletedTimestamp();

    /**
     * @return the id value.
     */
    Integer id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * @return the slot value.
     */
    String slot();

    /**
     * @return the subscription value.
     */
    String subscription();

}
