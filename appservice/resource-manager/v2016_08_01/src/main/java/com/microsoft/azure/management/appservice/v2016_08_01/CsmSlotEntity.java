/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment slot parameters.
 */
public class CsmSlotEntity {
    /**
     * Destination deployment slot during swap operation.
     */
    @JsonProperty(value = "targetSlot", required = true)
    private String targetSlot;

    /**
     * &lt;code&gt;true&lt;/code&gt; to preserve Virtual Network to the slot
     * during swap; otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "preserveVnet", required = true)
    private boolean preserveVnet;

    /**
     * Get the targetSlot value.
     *
     * @return the targetSlot value
     */
    public String targetSlot() {
        return this.targetSlot;
    }

    /**
     * Set the targetSlot value.
     *
     * @param targetSlot the targetSlot value to set
     * @return the CsmSlotEntity object itself.
     */
    public CsmSlotEntity withTargetSlot(String targetSlot) {
        this.targetSlot = targetSlot;
        return this;
    }

    /**
     * Get the preserveVnet value.
     *
     * @return the preserveVnet value
     */
    public boolean preserveVnet() {
        return this.preserveVnet;
    }

    /**
     * Set the preserveVnet value.
     *
     * @param preserveVnet the preserveVnet value to set
     * @return the CsmSlotEntity object itself.
     */
    public CsmSlotEntity withPreserveVnet(boolean preserveVnet) {
        this.preserveVnet = preserveVnet;
        return this;
    }

}
