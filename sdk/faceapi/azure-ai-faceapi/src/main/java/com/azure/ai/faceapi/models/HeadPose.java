// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.faceapi.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HeadPose model. */
@Fluent
public final class HeadPose {
    /*
     * The roll property.
     */
    @JsonProperty(value = "roll")
    private Float roll;

    /*
     * The yaw property.
     */
    @JsonProperty(value = "yaw")
    private Float yaw;

    /*
     * The pitch property.
     */
    @JsonProperty(value = "pitch")
    private Float pitch;

    /**
     * Get the roll property: The roll property.
     *
     * @return the roll value.
     */
    public Float getRoll() {
        return this.roll;
    }

    /**
     * Set the roll property: The roll property.
     *
     * @param roll the roll value to set.
     * @return the HeadPose object itself.
     */
    public HeadPose setRoll(Float roll) {
        this.roll = roll;
        return this;
    }

    /**
     * Get the yaw property: The yaw property.
     *
     * @return the yaw value.
     */
    public Float getYaw() {
        return this.yaw;
    }

    /**
     * Set the yaw property: The yaw property.
     *
     * @param yaw the yaw value to set.
     * @return the HeadPose object itself.
     */
    public HeadPose setYaw(Float yaw) {
        this.yaw = yaw;
        return this;
    }

    /**
     * Get the pitch property: The pitch property.
     *
     * @return the pitch value.
     */
    public Float getPitch() {
        return this.pitch;
    }

    /**
     * Set the pitch property: The pitch property.
     *
     * @param pitch the pitch value to set.
     * @return the HeadPose object itself.
     */
    public HeadPose setPitch(Float pitch) {
        this.pitch = pitch;
        return this;
    }
}
