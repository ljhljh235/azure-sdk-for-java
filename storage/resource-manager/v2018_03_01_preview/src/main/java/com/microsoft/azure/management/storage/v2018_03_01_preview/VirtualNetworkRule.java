/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Virtual Network rule.
 */
public class VirtualNetworkRule {
    /**
     * Resource ID of a subnet, for example:
     * /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     */
    @JsonProperty(value = "id", required = true)
    private String virtualNetworkResourceId;

    /**
     * The action of virtual network rule. Possible values include: 'Allow'.
     */
    @JsonProperty(value = "action")
    private Action action;

    /**
     * Gets the state of virtual network rule. Possible values include:
     * 'provisioning', 'deprovisioning', 'succeeded', 'failed',
     * 'networkSourceDeleted'.
     */
    @JsonProperty(value = "state")
    private State state;

    /**
     * Get the virtualNetworkResourceId value.
     *
     * @return the virtualNetworkResourceId value
     */
    public String virtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    /**
     * Set the virtualNetworkResourceId value.
     *
     * @param virtualNetworkResourceId the virtualNetworkResourceId value to set
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withVirtualNetworkResourceId(String virtualNetworkResourceId) {
        this.virtualNetworkResourceId = virtualNetworkResourceId;
        return this;
    }

    /**
     * Get the action value.
     *
     * @return the action value
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set the action value.
     *
     * @param action the action value to set
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public State state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withState(State state) {
        this.state = state;
        return this;
    }

}
