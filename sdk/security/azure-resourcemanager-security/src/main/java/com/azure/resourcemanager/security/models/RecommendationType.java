// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RecommendationType. */
public final class RecommendationType extends ExpandableStringEnum<RecommendationType> {
    /** Static value IoT_ACRAuthentication for RecommendationType. */
    public static final RecommendationType IO_T_ACRAUTHENTICATION = fromString("IoT_ACRAuthentication");

    /** Static value IoT_AgentSendsUnutilizedMessages for RecommendationType. */
    public static final RecommendationType IO_T_AGENT_SENDS_UNUTILIZED_MESSAGES =
        fromString("IoT_AgentSendsUnutilizedMessages");

    /** Static value IoT_Baseline for RecommendationType. */
    public static final RecommendationType IO_T_BASELINE = fromString("IoT_Baseline");

    /** Static value IoT_EdgeHubMemOptimize for RecommendationType. */
    public static final RecommendationType IO_T_EDGE_HUB_MEM_OPTIMIZE = fromString("IoT_EdgeHubMemOptimize");

    /** Static value IoT_EdgeLoggingOptions for RecommendationType. */
    public static final RecommendationType IO_T_EDGE_LOGGING_OPTIONS = fromString("IoT_EdgeLoggingOptions");

    /** Static value IoT_InconsistentModuleSettings for RecommendationType. */
    public static final RecommendationType IO_T_INCONSISTENT_MODULE_SETTINGS =
        fromString("IoT_InconsistentModuleSettings");

    /** Static value IoT_InstallAgent for RecommendationType. */
    public static final RecommendationType IO_T_INSTALL_AGENT = fromString("IoT_InstallAgent");

    /** Static value IoT_IPFilter_DenyAll for RecommendationType. */
    public static final RecommendationType IO_T_IPFILTER_DENY_ALL = fromString("IoT_IPFilter_DenyAll");

    /** Static value IoT_IPFilter_PermissiveRule for RecommendationType. */
    public static final RecommendationType IO_T_IPFILTER_PERMISSIVE_RULE = fromString("IoT_IPFilter_PermissiveRule");

    /** Static value IoT_OpenPorts for RecommendationType. */
    public static final RecommendationType IO_T_OPEN_PORTS = fromString("IoT_OpenPorts");

    /** Static value IoT_PermissiveFirewallPolicy for RecommendationType. */
    public static final RecommendationType IO_T_PERMISSIVE_FIREWALL_POLICY = fromString("IoT_PermissiveFirewallPolicy");

    /** Static value IoT_PermissiveInputFirewallRules for RecommendationType. */
    public static final RecommendationType IO_T_PERMISSIVE_INPUT_FIREWALL_RULES =
        fromString("IoT_PermissiveInputFirewallRules");

    /** Static value IoT_PermissiveOutputFirewallRules for RecommendationType. */
    public static final RecommendationType IO_T_PERMISSIVE_OUTPUT_FIREWALL_RULES =
        fromString("IoT_PermissiveOutputFirewallRules");

    /** Static value IoT_PrivilegedDockerOptions for RecommendationType. */
    public static final RecommendationType IO_T_PRIVILEGED_DOCKER_OPTIONS = fromString("IoT_PrivilegedDockerOptions");

    /** Static value IoT_SharedCredentials for RecommendationType. */
    public static final RecommendationType IO_T_SHARED_CREDENTIALS = fromString("IoT_SharedCredentials");

    /** Static value IoT_VulnerableTLSCipherSuite for RecommendationType. */
    public static final RecommendationType IO_T_VULNERABLE_TLSCIPHER_SUITE = fromString("IoT_VulnerableTLSCipherSuite");

    /**
     * Creates or finds a RecommendationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecommendationType.
     */
    @JsonCreator
    public static RecommendationType fromString(String name) {
        return fromString(name, RecommendationType.class);
    }

    /** @return known RecommendationType values. */
    public static Collection<RecommendationType> values() {
        return values(RecommendationType.class);
    }
}
