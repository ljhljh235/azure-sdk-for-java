// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cognitiveservices.computervision.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * An object describing additional category details.
 */
@Fluent
public final class CategoryDetail {
    /*
     * An array of celebrities if any identified.
     */
    @JsonProperty(value = "celebrities")
    private List<CelebritiesModel> celebrities;

    /*
     * An array of landmarks if any identified.
     */
    @JsonProperty(value = "landmarks")
    private List<LandmarksModel> landmarks;

    /**
     * Get the celebrities property: An array of celebrities if any identified.
     *
     * @return the celebrities value.
     */
    public List<CelebritiesModel> getCelebrities() {
        return this.celebrities;
    }

    /**
     * Set the celebrities property: An array of celebrities if any identified.
     *
     * @param celebrities the celebrities value to set.
     * @return the CategoryDetail object itself.
     */
    public CategoryDetail setCelebrities(List<CelebritiesModel> celebrities) {
        this.celebrities = celebrities;
        return this;
    }

    /**
     * Get the landmarks property: An array of landmarks if any identified.
     *
     * @return the landmarks value.
     */
    public List<LandmarksModel> getLandmarks() {
        return this.landmarks;
    }

    /**
     * Set the landmarks property: An array of landmarks if any identified.
     *
     * @param landmarks the landmarks value to set.
     * @return the CategoryDetail object itself.
     */
    public CategoryDetail setLandmarks(List<LandmarksModel> landmarks) {
        this.landmarks = landmarks;
        return this;
    }
}
