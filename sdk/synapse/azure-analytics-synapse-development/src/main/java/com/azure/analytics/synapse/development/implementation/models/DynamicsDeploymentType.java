// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for DynamicsDeploymentType.
 */
public final class DynamicsDeploymentType extends ExpandableStringEnum<DynamicsDeploymentType> {
    /**
     * Static value Online for DynamicsDeploymentType.
     */
    public static final DynamicsDeploymentType ONLINE = fromString("Online");

    /**
     * Static value OnPremisesWithIfd for DynamicsDeploymentType.
     */
    public static final DynamicsDeploymentType ON_PREMISES_WITH_IFD = fromString("OnPremisesWithIfd");

    /**
     * Creates or finds a DynamicsDeploymentType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DynamicsDeploymentType.
     */
    @JsonCreator
    public static DynamicsDeploymentType fromString(String name) {
        return fromString(name, DynamicsDeploymentType.class);
    }

    /**
     * @return known DynamicsDeploymentType values.
     */
    public static Collection<DynamicsDeploymentType> values() {
        return values(DynamicsDeploymentType.class);
    }
}
