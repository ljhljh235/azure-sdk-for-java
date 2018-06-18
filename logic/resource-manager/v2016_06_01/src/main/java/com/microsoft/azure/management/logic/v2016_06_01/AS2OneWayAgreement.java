/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The integration account AS2 one-way agreement.
 */
public class AS2OneWayAgreement {
    /**
     * The sender business identity.
     */
    @JsonProperty(value = "senderBusinessIdentity", required = true)
    private BusinessIdentity senderBusinessIdentity;

    /**
     * The receiver business identity.
     */
    @JsonProperty(value = "receiverBusinessIdentity", required = true)
    private BusinessIdentity receiverBusinessIdentity;

    /**
     * The AS2 protocol settings.
     */
    @JsonProperty(value = "protocolSettings", required = true)
    private AS2ProtocolSettings protocolSettings;

    /**
     * Get the senderBusinessIdentity value.
     *
     * @return the senderBusinessIdentity value
     */
    public BusinessIdentity senderBusinessIdentity() {
        return this.senderBusinessIdentity;
    }

    /**
     * Set the senderBusinessIdentity value.
     *
     * @param senderBusinessIdentity the senderBusinessIdentity value to set
     * @return the AS2OneWayAgreement object itself.
     */
    public AS2OneWayAgreement withSenderBusinessIdentity(BusinessIdentity senderBusinessIdentity) {
        this.senderBusinessIdentity = senderBusinessIdentity;
        return this;
    }

    /**
     * Get the receiverBusinessIdentity value.
     *
     * @return the receiverBusinessIdentity value
     */
    public BusinessIdentity receiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }

    /**
     * Set the receiverBusinessIdentity value.
     *
     * @param receiverBusinessIdentity the receiverBusinessIdentity value to set
     * @return the AS2OneWayAgreement object itself.
     */
    public AS2OneWayAgreement withReceiverBusinessIdentity(BusinessIdentity receiverBusinessIdentity) {
        this.receiverBusinessIdentity = receiverBusinessIdentity;
        return this;
    }

    /**
     * Get the protocolSettings value.
     *
     * @return the protocolSettings value
     */
    public AS2ProtocolSettings protocolSettings() {
        return this.protocolSettings;
    }

    /**
     * Set the protocolSettings value.
     *
     * @param protocolSettings the protocolSettings value to set
     * @return the AS2OneWayAgreement object itself.
     */
    public AS2OneWayAgreement withProtocolSettings(AS2ProtocolSettings protocolSettings) {
        this.protocolSettings = protocolSettings;
        return this;
    }

}
