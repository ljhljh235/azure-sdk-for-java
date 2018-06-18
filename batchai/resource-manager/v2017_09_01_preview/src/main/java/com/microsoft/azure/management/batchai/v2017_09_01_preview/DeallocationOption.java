/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DeallocationOption.
 */
public enum DeallocationOption {
    /** Enum value requeue. */
    REQUEUE("requeue"),

    /** Enum value terminate. */
    TERMINATE("terminate"),

    /** Enum value waitforjobcompletion. */
    WAITFORJOBCOMPLETION("waitforjobcompletion"),

    /** Enum value unknown. */
    UNKNOWN("unknown");

    /** The actual serialized value for a DeallocationOption instance. */
    private String value;

    DeallocationOption(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DeallocationOption instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DeallocationOption object, or null if unable to parse.
     */
    @JsonCreator
    public static DeallocationOption fromString(String value) {
        DeallocationOption[] items = DeallocationOption.values();
        for (DeallocationOption item : items) {
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
