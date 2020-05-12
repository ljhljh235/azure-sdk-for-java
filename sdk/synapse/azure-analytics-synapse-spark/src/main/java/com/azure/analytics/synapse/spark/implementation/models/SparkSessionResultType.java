// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for SparkSessionResultType.
 */
public final class SparkSessionResultType extends ExpandableStringEnum<SparkSessionResultType> {
    /**
     * Static value Uncertain for SparkSessionResultType.
     */
    public static final SparkSessionResultType UNCERTAIN = fromString("Uncertain");

    /**
     * Static value Succeeded for SparkSessionResultType.
     */
    public static final SparkSessionResultType SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for SparkSessionResultType.
     */
    public static final SparkSessionResultType FAILED = fromString("Failed");

    /**
     * Static value Cancelled for SparkSessionResultType.
     */
    public static final SparkSessionResultType CANCELLED = fromString("Cancelled");

    /**
     * Creates or finds a SparkSessionResultType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SparkSessionResultType.
     */
    @JsonCreator
    public static SparkSessionResultType fromString(String name) {
        return fromString(name, SparkSessionResultType.class);
    }

    /**
     * @return known SparkSessionResultType values.
     */
    public static Collection<SparkSessionResultType> values() {
        return values(SparkSessionResultType.class);
    }
}
