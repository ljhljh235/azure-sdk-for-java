/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the disk to attach.
 */
public class AttachDiskProperties {
    /**
     * The resource ID of the Lab virtual machine to which the disk is
     * attached.
     */
    @JsonProperty(value = "leasedByLabVmId")
    private String leasedByLabVmId;

    /**
     * Get the resource ID of the Lab virtual machine to which the disk is attached.
     *
     * @return the leasedByLabVmId value
     */
    public String leasedByLabVmId() {
        return this.leasedByLabVmId;
    }

    /**
     * Set the resource ID of the Lab virtual machine to which the disk is attached.
     *
     * @param leasedByLabVmId the leasedByLabVmId value to set
     * @return the AttachDiskProperties object itself.
     */
    public AttachDiskProperties withLeasedByLabVmId(String leasedByLabVmId) {
        this.leasedByLabVmId = leasedByLabVmId;
        return this;
    }

}
