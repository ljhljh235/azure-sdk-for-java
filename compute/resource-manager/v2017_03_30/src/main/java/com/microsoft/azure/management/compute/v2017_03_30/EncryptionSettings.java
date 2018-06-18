/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Encryption settings for disk or snapshot.
 */
public class EncryptionSettings {
    /**
     * Set this flag to true and provide DiskEncryptionKey and optional
     * KeyEncryptionKey to enable encryption. Set this flag to false and remove
     * DiskEncryptionKey and KeyEncryptionKey to disable encryption. If
     * EncryptionSettings is null in the request object, the existing settings
     * remain unchanged.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Key Vault Secret Url and vault id of the disk encryption key.
     */
    @JsonProperty(value = "diskEncryptionKey")
    private KeyVaultAndSecretReference diskEncryptionKey;

    /**
     * Key Vault Key Url and vault id of the key encryption key.
     */
    @JsonProperty(value = "keyEncryptionKey")
    private KeyVaultAndKeyReference keyEncryptionKey;

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the EncryptionSettings object itself.
     */
    public EncryptionSettings withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the diskEncryptionKey value.
     *
     * @return the diskEncryptionKey value
     */
    public KeyVaultAndSecretReference diskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * Set the diskEncryptionKey value.
     *
     * @param diskEncryptionKey the diskEncryptionKey value to set
     * @return the EncryptionSettings object itself.
     */
    public EncryptionSettings withDiskEncryptionKey(KeyVaultAndSecretReference diskEncryptionKey) {
        this.diskEncryptionKey = diskEncryptionKey;
        return this;
    }

    /**
     * Get the keyEncryptionKey value.
     *
     * @return the keyEncryptionKey value
     */
    public KeyVaultAndKeyReference keyEncryptionKey() {
        return this.keyEncryptionKey;
    }

    /**
     * Set the keyEncryptionKey value.
     *
     * @param keyEncryptionKey the keyEncryptionKey value to set
     * @return the EncryptionSettings object itself.
     */
    public EncryptionSettings withKeyEncryptionKey(KeyVaultAndKeyReference keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
        return this;
    }

}
