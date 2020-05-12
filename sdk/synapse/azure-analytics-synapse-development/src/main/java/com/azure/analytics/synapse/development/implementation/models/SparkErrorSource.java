// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for SparkErrorSource.
 */
public final class SparkErrorSource extends ExpandableStringEnum<SparkErrorSource> {
    /**
     * Static value System for SparkErrorSource.
     */
    public static final SparkErrorSource SYSTEM = fromString("System");

    /**
     * Static value User for SparkErrorSource.
     */
    public static final SparkErrorSource USER = fromString("User");

    /**
     * Static value Unknown for SparkErrorSource.
     */
    public static final SparkErrorSource UNKNOWN = fromString("Unknown");

    /**
     * Static value Dependency for SparkErrorSource.
     */
    public static final SparkErrorSource DEPENDENCY = fromString("Dependency");

    /**
     * Creates or finds a SparkErrorSource from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SparkErrorSource.
     */
    @JsonCreator
    public static SparkErrorSource fromString(String name) {
        return fromString(name, SparkErrorSource.class);
    }

    /**
     * @return known SparkErrorSource values.
     */
    public static Collection<SparkErrorSource> values() {
        return values(SparkErrorSource.class);
    }
}
