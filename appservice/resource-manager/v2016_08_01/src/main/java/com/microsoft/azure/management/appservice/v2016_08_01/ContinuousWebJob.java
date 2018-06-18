/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.ContinuousWebJobInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.AppServiceManager;
import java.util.Map;

/**
 * Type representing ContinuousWebJob.
 */
public interface ContinuousWebJob extends HasInner<ContinuousWebJobInner>, Indexable, Refreshable<ContinuousWebJob>, HasManager<AppServiceManager> {
    /**
     * @return the continuousWebJobName value.
     */
    String continuousWebJobName();

    /**
     * @return the detailedStatus value.
     */
    String detailedStatus();

    /**
     * @return the error value.
     */
    String error();

    /**
     * @return the extraInfoUrl value.
     */
    String extraInfoUrl();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the jobType value.
     */
    WebJobType jobType();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the logUrl value.
     */
    String logUrl();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the runCommand value.
     */
    String runCommand();

    /**
     * @return the settings value.
     */
    Map<String, Object> settings();

    /**
     * @return the status value.
     */
    ContinuousWebJobStatus status();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the url value.
     */
    String url();

    /**
     * @return the usingSdk value.
     */
    Boolean usingSdk();

}
