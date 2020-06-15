// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.faceapi.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Coordinate model. */
@Fluent
public final class Coordinate {
    /*
     * The horizontal component, in pixels.
     */
    @JsonProperty(value = "x", required = true)
    private float x;

    /*
     * The vertical component, in pixels.
     */
    @JsonProperty(value = "y", required = true)
    private float y;

    /**
     * Get the x property: The horizontal component, in pixels.
     *
     * @return the x value.
     */
    public float getX() {
        return this.x;
    }

    /**
     * Set the x property: The horizontal component, in pixels.
     *
     * @param x the x value to set.
     * @return the Coordinate object itself.
     */
    public Coordinate setX(float x) {
        this.x = x;
        return this;
    }

    /**
     * Get the y property: The vertical component, in pixels.
     *
     * @return the y value.
     */
    public float getY() {
        return this.y;
    }

    /**
     * Set the y property: The vertical component, in pixels.
     *
     * @param y the y value to set.
     * @return the Coordinate object itself.
     */
    public Coordinate setY(float y) {
        this.y = y;
        return this;
    }
}
