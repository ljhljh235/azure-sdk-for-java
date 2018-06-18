/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The Virtual Network gateway contract. This is used to give the Virtual
 * Network gateway access to the VPN package.
 */
@JsonFlatten
public class VnetGateway extends ProxyOnlyResource {
    /**
     * The Virtual Network name.
     */
    @JsonProperty(value = "properties.vnetName")
    private String vnetName;

    /**
     * The URI where the VPN package can be downloaded.
     */
    @JsonProperty(value = "properties.vpnPackageUri", required = true)
    private String vpnPackageUri;

    /**
     * Get the vnetName value.
     *
     * @return the vnetName value
     */
    public String vnetName() {
        return this.vnetName;
    }

    /**
     * Set the vnetName value.
     *
     * @param vnetName the vnetName value to set
     * @return the VnetGateway object itself.
     */
    public VnetGateway withVnetName(String vnetName) {
        this.vnetName = vnetName;
        return this;
    }

    /**
     * Get the vpnPackageUri value.
     *
     * @return the vpnPackageUri value
     */
    public String vpnPackageUri() {
        return this.vpnPackageUri;
    }

    /**
     * Set the vpnPackageUri value.
     *
     * @param vpnPackageUri the vpnPackageUri value to set
     * @return the VnetGateway object itself.
     */
    public VnetGateway withVpnPackageUri(String vpnPackageUri) {
        this.vpnPackageUri = vpnPackageUri;
        return this;
    }

}
