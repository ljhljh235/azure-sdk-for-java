// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.accesscontrol.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RoleAssignmentOptions model.
 */
@Fluent
public final class RoleAssignmentOptions {
    /*
     * Role ID of the Synapse Built-In Role
     */
    @JsonProperty(value = "roleId", required = true)
    private String roleId;

    /*
     * Object ID of the AAD principal or security-group
     */
    @JsonProperty(value = "principalId", required = true)
    private String principalId;

    /**
     * Get the roleId property: Role ID of the Synapse Built-In Role.
     * 
     * @return the roleId value.
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * Set the roleId property: Role ID of the Synapse Built-In Role.
     * 
     * @param roleId the roleId value to set.
     * @return the RoleAssignmentOptions object itself.
     */
    public RoleAssignmentOptions setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Get the principalId property: Object ID of the AAD principal or
     * security-group.
     * 
     * @return the principalId value.
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: Object ID of the AAD principal or
     * security-group.
     * 
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentOptions object itself.
     */
    public RoleAssignmentOptions setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
}
