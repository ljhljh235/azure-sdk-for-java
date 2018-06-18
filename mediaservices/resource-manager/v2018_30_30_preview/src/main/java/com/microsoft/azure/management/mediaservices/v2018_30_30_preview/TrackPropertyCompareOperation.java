/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TrackPropertyCompareOperation.
 */
public enum TrackPropertyCompareOperation {
    /** Unknown track property compare operation. */
    UNKNOWN("Unknown"),

    /** Equal operation. */
    EQUAL("Equal");

    /** The actual serialized value for a TrackPropertyCompareOperation instance. */
    private String value;

    TrackPropertyCompareOperation(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TrackPropertyCompareOperation instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TrackPropertyCompareOperation object, or null if unable to parse.
     */
    @JsonCreator
    public static TrackPropertyCompareOperation fromString(String value) {
        TrackPropertyCompareOperation[] items = TrackPropertyCompareOperation.values();
        for (TrackPropertyCompareOperation item : items) {
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
