// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.models.ManagementPolicySchema;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The Storage Account ManagementPolicy properties. */
@Fluent
public final class ManagementPolicyProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementPolicyProperties.class);

    /*
     * Returns the date and time the ManagementPolicies was last modified.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * The Storage Account ManagementPolicy, in JSON format. See more details
     * in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     */
    @JsonProperty(value = "policy", required = true)
    private ManagementPolicySchema policy;

    /**
     * Get the lastModifiedTime property: Returns the date and time the ManagementPolicies was last modified.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the policy property: The Storage Account ManagementPolicy, in JSON format. See more details in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     *
     * @return the policy value.
     */
    public ManagementPolicySchema policy() {
        return this.policy;
    }

    /**
     * Set the policy property: The Storage Account ManagementPolicy, in JSON format. See more details in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     *
     * @param policy the policy value to set.
     * @return the ManagementPolicyProperties object itself.
     */
    public ManagementPolicyProperties withPolicy(ManagementPolicySchema policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policy() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property policy in model ManagementPolicyProperties"));
        } else {
            policy().validate();
        }
    }
}
