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
 * The integration account agreement content.
 */
public class AgreementContent {
    /**
     * The AS2 agreement content.
     */
    @JsonProperty(value = "aS2")
    private AS2AgreementContent aS2;

    /**
     * The X12 agreement content.
     */
    @JsonProperty(value = "x12")
    private X12AgreementContent x12;

    /**
     * The EDIFACT agreement content.
     */
    @JsonProperty(value = "edifact")
    private EdifactAgreementContent edifact;

    /**
     * Get the aS2 value.
     *
     * @return the aS2 value
     */
    public AS2AgreementContent aS2() {
        return this.aS2;
    }

    /**
     * Set the aS2 value.
     *
     * @param aS2 the aS2 value to set
     * @return the AgreementContent object itself.
     */
    public AgreementContent withAS2(AS2AgreementContent aS2) {
        this.aS2 = aS2;
        return this;
    }

    /**
     * Get the x12 value.
     *
     * @return the x12 value
     */
    public X12AgreementContent x12() {
        return this.x12;
    }

    /**
     * Set the x12 value.
     *
     * @param x12 the x12 value to set
     * @return the AgreementContent object itself.
     */
    public AgreementContent withX12(X12AgreementContent x12) {
        this.x12 = x12;
        return this;
    }

    /**
     * Get the edifact value.
     *
     * @return the edifact value
     */
    public EdifactAgreementContent edifact() {
        return this.edifact;
    }

    /**
     * Set the edifact value.
     *
     * @param edifact the edifact value to set
     * @return the AgreementContent object itself.
     */
    public AgreementContent withEdifact(EdifactAgreementContent edifact) {
        this.edifact = edifact;
        return this;
    }

}
