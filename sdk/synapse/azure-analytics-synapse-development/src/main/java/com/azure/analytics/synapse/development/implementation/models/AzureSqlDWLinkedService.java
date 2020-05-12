// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The AzureSqlDWLinkedService model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureSqlDW")
@JsonFlatten
@Fluent
public class AzureSqlDWLinkedService extends LinkedService {
    /*
     * The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString", required = true)
    private Object connectionString;

    /*
     * The Azure key vault secret reference of password in connection string.
     */
    @JsonProperty(value = "typeProperties.password")
    private AzureKeyVaultSecretReference password;

    /*
     * The ID of the service principal used to authenticate against Azure SQL
     * Data Warehouse. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The key of the service principal used to authenticate against Azure SQL
     * Data Warehouse.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the connectionString property: The connection string. Type: string,
     * SecureString or AzureKeyVaultSecretReference. Type: string, SecureString
     * or AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string. Type: string,
     * SecureString or AzureKeyVaultSecretReference. Type: string, SecureString
     * or AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the AzureSqlDWLinkedService object itself.
     */
    public AzureSqlDWLinkedService setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the password property: The Azure key vault secret reference of
     * password in connection string.
     * 
     * @return the password value.
     */
    public AzureKeyVaultSecretReference getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The Azure key vault secret reference of
     * password in connection string.
     * 
     * @param password the password value to set.
     * @return the AzureSqlDWLinkedService object itself.
     */
    public AzureSqlDWLinkedService setPassword(AzureKeyVaultSecretReference password) {
        this.password = password;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the service principal
     * used to authenticate against Azure SQL Data Warehouse. Type: string (or
     * Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the service principal
     * used to authenticate against Azure SQL Data Warehouse. Type: string (or
     * Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureSqlDWLinkedService object itself.
     */
    public AzureSqlDWLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key of the service principal
     * used to authenticate against Azure SQL Data Warehouse.
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The key of the service principal
     * used to authenticate against Azure SQL Data Warehouse.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureSqlDWLinkedService object itself.
     */
    public AzureSqlDWLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the
     * service principal belongs. Type: string (or Expression with resultType
     * string).
     * 
     * @return the tenant value.
     */
    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the
     * service principal belongs. Type: string (or Expression with resultType
     * string).
     * 
     * @param tenant the tenant value to set.
     * @return the AzureSqlDWLinkedService object itself.
     */
    public AzureSqlDWLinkedService setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for
     * authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for
     * authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureSqlDWLinkedService object itself.
     */
    public AzureSqlDWLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
