// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.AlertIntent;
import com.azure.resourcemanager.security.models.AlertSeverity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** IoT alert type. */
@JsonFlatten
@Immutable
public class IotAlertTypeInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotAlertTypeInner.class);

    /*
     * The display name of the alert
     */
    @JsonProperty(value = "properties.alertDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String alertDisplayName;

    /*
     * The severity of the alert
     */
    @JsonProperty(value = "properties.severity", access = JsonProperty.Access.WRITE_ONLY)
    private AlertSeverity severity;

    /*
     * Description of the suspected vulnerability and meaning.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The name of the alert provider or internal partner
     */
    @JsonProperty(value = "properties.providerName", access = JsonProperty.Access.WRITE_ONLY)
    private String providerName;

    /*
     * The name of the product which published this alert
     */
    @JsonProperty(value = "properties.productName", access = JsonProperty.Access.WRITE_ONLY)
    private String productName;

    /*
     * The name of a component inside the product which generated the alert
     */
    @JsonProperty(value = "properties.productComponentName", access = JsonProperty.Access.WRITE_ONLY)
    private String productComponentName;

    /*
     * The name of the vendor that raise the alert
     */
    @JsonProperty(value = "properties.vendorName", access = JsonProperty.Access.WRITE_ONLY)
    private String vendorName;

    /*
     * Kill chain related intent behind the alert. Could contain multiple enum
     * values (separated by commas)
     */
    @JsonProperty(value = "properties.intent", access = JsonProperty.Access.WRITE_ONLY)
    private AlertIntent intent;

    /*
     * Manual action items to take to remediate the alert
     */
    @JsonProperty(value = "properties.remediationSteps", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> remediationSteps;

    /**
     * Get the alertDisplayName property: The display name of the alert.
     *
     * @return the alertDisplayName value.
     */
    public String alertDisplayName() {
        return this.alertDisplayName;
    }

    /**
     * Get the severity property: The severity of the alert.
     *
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.severity;
    }

    /**
     * Get the description property: Description of the suspected vulnerability and meaning.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the providerName property: The name of the alert provider or internal partner.
     *
     * @return the providerName value.
     */
    public String providerName() {
        return this.providerName;
    }

    /**
     * Get the productName property: The name of the product which published this alert.
     *
     * @return the productName value.
     */
    public String productName() {
        return this.productName;
    }

    /**
     * Get the productComponentName property: The name of a component inside the product which generated the alert.
     *
     * @return the productComponentName value.
     */
    public String productComponentName() {
        return this.productComponentName;
    }

    /**
     * Get the vendorName property: The name of the vendor that raise the alert.
     *
     * @return the vendorName value.
     */
    public String vendorName() {
        return this.vendorName;
    }

    /**
     * Get the intent property: Kill chain related intent behind the alert. Could contain multiple enum values
     * (separated by commas).
     *
     * @return the intent value.
     */
    public AlertIntent intent() {
        return this.intent;
    }

    /**
     * Get the remediationSteps property: Manual action items to take to remediate the alert.
     *
     * @return the remediationSteps value.
     */
    public List<String> remediationSteps() {
        return this.remediationSteps;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
