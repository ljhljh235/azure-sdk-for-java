// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServerPublicNetworkAccessState. */
public final class ServerPublicNetworkAccessState extends ExpandableStringEnum<ServerPublicNetworkAccessState> {
    /** Static value Enabled for ServerPublicNetworkAccessState. */
    public static final ServerPublicNetworkAccessState ENABLED = fromString("Enabled");

    /** Static value Disabled for ServerPublicNetworkAccessState. */
    public static final ServerPublicNetworkAccessState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a ServerPublicNetworkAccessState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServerPublicNetworkAccessState.
     */
    @JsonCreator
    public static ServerPublicNetworkAccessState fromString(String name) {
        return fromString(name, ServerPublicNetworkAccessState.class);
    }

    /** @return known ServerPublicNetworkAccessState values. */
    public static Collection<ServerPublicNetworkAccessState> values() {
        return values(ServerPublicNetworkAccessState.class);
    }
}
