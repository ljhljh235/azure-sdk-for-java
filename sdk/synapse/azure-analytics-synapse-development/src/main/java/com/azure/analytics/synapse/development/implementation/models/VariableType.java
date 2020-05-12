// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for VariableType.
 */
public final class VariableType extends ExpandableStringEnum<VariableType> {
    /**
     * Static value String for VariableType.
     */
    public static final VariableType STRING = fromString("String");

    /**
     * Static value Bool for VariableType.
     */
    public static final VariableType BOOL = fromString("Bool");

    /**
     * Static value Boolean for VariableType.
     */
    public static final VariableType BOOLEAN = fromString("Boolean");

    /**
     * Static value Array for VariableType.
     */
    public static final VariableType ARRAY = fromString("Array");

    /**
     * Creates or finds a VariableType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VariableType.
     */
    @JsonCreator
    public static VariableType fromString(String name) {
        return fromString(name, VariableType.class);
    }

    /**
     * @return known VariableType values.
     */
    public static Collection<VariableType> values() {
        return values(VariableType.class);
    }
}
