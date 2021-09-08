// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VmssZonalUpgradeMode. */
public final class VmssZonalUpgradeMode extends ExpandableStringEnum<VmssZonalUpgradeMode> {
    /** Static value Parallel for VmssZonalUpgradeMode. */
    public static final VmssZonalUpgradeMode PARALLEL = fromString("Parallel");

    /** Static value Hierarchical for VmssZonalUpgradeMode. */
    public static final VmssZonalUpgradeMode HIERARCHICAL = fromString("Hierarchical");

    /**
     * Creates or finds a VmssZonalUpgradeMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VmssZonalUpgradeMode.
     */
    @JsonCreator
    public static VmssZonalUpgradeMode fromString(String name) {
        return fromString(name, VmssZonalUpgradeMode.class);
    }

    /** @return known VmssZonalUpgradeMode values. */
    public static Collection<VmssZonalUpgradeMode> values() {
        return values(VmssZonalUpgradeMode.class);
    }
}
