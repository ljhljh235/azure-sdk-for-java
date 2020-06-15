// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.faceapi.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for NoiseLevel. */
public enum NoiseLevel {
    /** Enum value Low. */
    LOW("Low"),

    /** Enum value Medium. */
    MEDIUM("Medium"),

    /** Enum value High. */
    HIGH("High");

    /** The actual serialized value for a NoiseLevel instance. */
    private final String value;

    NoiseLevel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a NoiseLevel instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed NoiseLevel object, or null if unable to parse.
     */
    @JsonCreator
    public static NoiseLevel fromString(String value) {
        NoiseLevel[] items = NoiseLevel.values();
        for (NoiseLevel item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
