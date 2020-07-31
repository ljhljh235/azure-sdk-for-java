/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CheckNameResourceTypes.
 */
public final class CheckNameResourceTypes extends ExpandableStringEnum<CheckNameResourceTypes> {
    /** Static value Microsoft.NetApp/netAppAccounts for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_NET_APPNET_APP_ACCOUNTS = fromString("Microsoft.NetApp/netAppAccounts");

    /** Static value Microsoft.NetApp/netAppAccounts/capacityPools for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_NET_APPNET_APP_ACCOUNTSCAPACITY_POOLS = fromString("Microsoft.NetApp/netAppAccounts/capacityPools");

    /** Static value Microsoft.NetApp/netAppAccounts/capacityPools/volumes for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_NET_APPNET_APP_ACCOUNTSCAPACITY_POOLSVOLUMES = fromString("Microsoft.NetApp/netAppAccounts/capacityPools/volumes");

    /** Static value Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_NET_APPNET_APP_ACCOUNTSCAPACITY_POOLSVOLUMESSNAPSHOTS = fromString("Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots");

    /**
     * Creates or finds a CheckNameResourceTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding CheckNameResourceTypes
     */
    @JsonCreator
    public static CheckNameResourceTypes fromString(String name) {
        return fromString(name, CheckNameResourceTypes.class);
    }

    /**
     * @return known CheckNameResourceTypes values
     */
    public static Collection<CheckNameResourceTypes> values() {
        return values(CheckNameResourceTypes.class);
    }
}
