// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cognitiveservices.face.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing occlusions on a given face.
 */
@Fluent
public final class Occlusion {
    /*
     * A boolean value indicating whether forehead is occluded.
     */
    @JsonProperty(value = "foreheadOccluded")
    private boolean foreheadOccluded;

    /*
     * A boolean value indicating whether eyes are occluded.
     */
    @JsonProperty(value = "eyeOccluded")
    private boolean eyeOccluded;

    /*
     * A boolean value indicating whether the mouth is occluded.
     */
    @JsonProperty(value = "mouthOccluded")
    private boolean mouthOccluded;

    /**
     * Get the foreheadOccluded property: A boolean value indicating whether
     * forehead is occluded.
     *
     * @return the foreheadOccluded value.
     */
    public boolean isForeheadOccluded() {
        return this.foreheadOccluded;
    }

    /**
     * Set the foreheadOccluded property: A boolean value indicating whether
     * forehead is occluded.
     *
     * @param foreheadOccluded the foreheadOccluded value to set.
     * @return the Occlusion object itself.
     */
    public Occlusion setForeheadOccluded(boolean foreheadOccluded) {
        this.foreheadOccluded = foreheadOccluded;
        return this;
    }

    /**
     * Get the eyeOccluded property: A boolean value indicating whether eyes
     * are occluded.
     *
     * @return the eyeOccluded value.
     */
    public boolean isEyeOccluded() {
        return this.eyeOccluded;
    }

    /**
     * Set the eyeOccluded property: A boolean value indicating whether eyes
     * are occluded.
     *
     * @param eyeOccluded the eyeOccluded value to set.
     * @return the Occlusion object itself.
     */
    public Occlusion setEyeOccluded(boolean eyeOccluded) {
        this.eyeOccluded = eyeOccluded;
        return this;
    }

    /**
     * Get the mouthOccluded property: A boolean value indicating whether the
     * mouth is occluded.
     *
     * @return the mouthOccluded value.
     */
    public boolean isMouthOccluded() {
        return this.mouthOccluded;
    }

    /**
     * Set the mouthOccluded property: A boolean value indicating whether the
     * mouth is occluded.
     *
     * @param mouthOccluded the mouthOccluded value to set.
     * @return the Occlusion object itself.
     */
    public Occlusion setMouthOccluded(boolean mouthOccluded) {
        this.mouthOccluded = mouthOccluded;
        return this;
    }
}
