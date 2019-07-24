/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SecurityRuleProtocol.
 */
public final class SecurityRuleProtocol extends ExpandableStringEnum<SecurityRuleProtocol> {
    /** Static value Tcp for SecurityRuleProtocol. */
    public static final SecurityRuleProtocol TCP = fromString("Tcp");

    /** Static value Udp for SecurityRuleProtocol. */
    public static final SecurityRuleProtocol UDP = fromString("Udp");

    /** Static value Icmp for SecurityRuleProtocol. */
    public static final SecurityRuleProtocol ICMP = fromString("Icmp");

    /** Static value Esp for SecurityRuleProtocol. */
    public static final SecurityRuleProtocol ESP = fromString("Esp");

    /** Static value * for SecurityRuleProtocol. */
    public static final SecurityRuleProtocol ASTERISK = fromString("*");

    /**
     * Creates or finds a SecurityRuleProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding SecurityRuleProtocol
     */
    @JsonCreator
    public static SecurityRuleProtocol fromString(String name) {
        return fromString(name, SecurityRuleProtocol.class);
    }

    /**
     * @return known SecurityRuleProtocol values
     */
    public static Collection<SecurityRuleProtocol> values() {
        return values(SecurityRuleProtocol.class);
    }
}
