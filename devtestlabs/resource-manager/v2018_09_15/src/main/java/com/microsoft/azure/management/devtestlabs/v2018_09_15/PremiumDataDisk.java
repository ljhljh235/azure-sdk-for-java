/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PremiumDataDisk.
 */
public final class PremiumDataDisk extends ExpandableStringEnum<PremiumDataDisk> {
    /** Static value Disabled for PremiumDataDisk. */
    public static final PremiumDataDisk DISABLED = fromString("Disabled");

    /** Static value Enabled for PremiumDataDisk. */
    public static final PremiumDataDisk ENABLED = fromString("Enabled");

    /**
     * Creates or finds a PremiumDataDisk from its string representation.
     * @param name a name to look for
     * @return the corresponding PremiumDataDisk
     */
    @JsonCreator
    public static PremiumDataDisk fromString(String name) {
        return fromString(name, PremiumDataDisk.class);
    }

    /**
     * @return known PremiumDataDisk values
     */
    public static Collection<PremiumDataDisk> values() {
        return values(PremiumDataDisk.class);
    }
}
