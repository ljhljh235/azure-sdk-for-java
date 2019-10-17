// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cognitiveservices.computervision.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A brand detected in an image.
 */
@Fluent
public final class DetectedBrand {
    /*
     * Label for the brand.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Confidence score of having observed the brand in the image, as a value
     * ranging from 0 to 1.
     */
    @JsonProperty(value = "confidence", access = JsonProperty.Access.WRITE_ONLY)
    private double confidence;

    /*
     * Approximate location of the detected brand.
     */
    @JsonProperty(value = "rectangle", access = JsonProperty.Access.WRITE_ONLY)
    private BoundingRect rectangle;

    /**
     * Get the name property: Label for the brand.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the confidence property: Confidence score of having observed the
     * brand in the image, as a value ranging from 0 to 1.
     *
     * @return the confidence value.
     */
    public double getConfidence() {
        return this.confidence;
    }

    /**
     * Get the rectangle property: Approximate location of the detected brand.
     *
     * @return the rectangle value.
     */
    public BoundingRect getRectangle() {
        return this.rectangle;
    }
}
