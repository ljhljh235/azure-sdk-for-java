/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.locks.v2016_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LockLevel.
 */
public final class LockLevel extends ExpandableStringEnum<LockLevel> {
    /** Static value NotSpecified for LockLevel. */
    public static final LockLevel NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value CanNotDelete for LockLevel. */
    public static final LockLevel CAN_NOT_DELETE = fromString("CanNotDelete");

    /** Static value ReadOnly for LockLevel. */
    public static final LockLevel READ_ONLY = fromString("ReadOnly");

    /**
     * Creates or finds a LockLevel from its string representation.
     * @param name a name to look for
     * @return the corresponding LockLevel
     */
    @JsonCreator
    public static LockLevel fromString(String name) {
        return fromString(name, LockLevel.class);
    }

    /**
     * @return known LockLevel values
     */
    public static Collection<LockLevel> values() {
        return values(LockLevel.class);
    }
}
