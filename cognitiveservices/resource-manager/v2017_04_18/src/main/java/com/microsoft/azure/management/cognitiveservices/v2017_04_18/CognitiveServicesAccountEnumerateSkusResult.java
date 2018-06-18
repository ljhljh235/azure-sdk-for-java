/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation.CognitiveServicesManager;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation.CognitiveServicesAccountEnumerateSkusResultInner;
import java.util.List;

/**
 * Type representing CognitiveServicesAccountEnumerateSkusResult.
 */
public interface CognitiveServicesAccountEnumerateSkusResult extends HasInner<CognitiveServicesAccountEnumerateSkusResultInner>, HasManager<CognitiveServicesManager> {
    /**
     * @return the value value.
     */
    List<CognitiveServicesResourceAndSku> value();

}
