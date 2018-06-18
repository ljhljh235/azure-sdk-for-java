/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The encryption settings on the storage account.
 */
public class Encryption {
    /**
     * List of services which support encryption.
     */
    @JsonProperty(value = "services")
    private EncryptionServices services;

    /**
     * The encryption keySource (provider). Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.Keyvault. Possible values include:
     * 'Microsoft.Storage', 'Microsoft.Keyvault'.
     */
    @JsonProperty(value = "keySource", required = true)
    private KeySource keySource;

    /**
     * Properties provided by key vault.
     */
    @JsonProperty(value = "keyvaultproperties")
    private KeyVaultProperties keyVaultProperties;

    /**
     * Get the services value.
     *
     * @return the services value
     */
    public EncryptionServices services() {
        return this.services;
    }

    /**
     * Set the services value.
     *
     * @param services the services value to set
     * @return the Encryption object itself.
     */
    public Encryption withServices(EncryptionServices services) {
        this.services = services;
        return this;
    }

    /**
     * Get the keySource value.
     *
     * @return the keySource value
     */
    public KeySource keySource() {
        return this.keySource;
    }

    /**
     * Set the keySource value.
     *
     * @param keySource the keySource value to set
     * @return the Encryption object itself.
     */
    public Encryption withKeySource(KeySource keySource) {
        this.keySource = keySource;
        return this;
    }

    /**
     * Get the keyVaultProperties value.
     *
     * @return the keyVaultProperties value
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties value.
     *
     * @param keyVaultProperties the keyVaultProperties value to set
     * @return the Encryption object itself.
     */
    public Encryption withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

}
