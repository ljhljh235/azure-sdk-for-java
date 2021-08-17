// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StatusReason. */
public final class StatusReason extends ExpandableStringEnum<StatusReason> {
    /** Static value Expired for StatusReason. */
    public static final StatusReason EXPIRED = fromString("Expired");

    /** Static value UserRequested for StatusReason. */
    public static final StatusReason USER_REQUESTED = fromString("UserRequested");

    /** Static value NewerRequestInitiated for StatusReason. */
    public static final StatusReason NEWER_REQUEST_INITIATED = fromString("NewerRequestInitiated");

    /**
     * Creates or finds a StatusReason from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StatusReason.
     */
    @JsonCreator
    public static StatusReason fromString(String name) {
        return fromString(name, StatusReason.class);
    }

    /** @return known StatusReason values. */
    public static Collection<StatusReason> values() {
        return values(StatusReason.class);
    }
}
