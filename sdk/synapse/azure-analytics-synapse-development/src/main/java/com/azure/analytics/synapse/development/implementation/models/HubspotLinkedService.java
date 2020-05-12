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
 * The HubspotLinkedService model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Hubspot")
@JsonFlatten
@Fluent
public class HubspotLinkedService extends LinkedService {
    /*
     * The client ID associated with your Hubspot application.
     */
    @JsonProperty(value = "typeProperties.clientId", required = true)
    private Object clientId;

    /*
     * The client secret associated with your Hubspot application.
     */
    @JsonProperty(value = "typeProperties.clientSecret")
    private SecretBase clientSecret;

    /*
     * The access token obtained when initially authenticating your OAuth
     * integration.
     */
    @JsonProperty(value = "typeProperties.accessToken")
    private SecretBase accessToken;

    /*
     * The refresh token obtained when initially authenticating your OAuth
     * integration.
     */
    @JsonProperty(value = "typeProperties.refreshToken")
    private SecretBase refreshToken;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     */
    @JsonProperty(value = "typeProperties.useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate
     * to match the host name of the server when connecting over SSL. The
     * default value is true.
     */
    @JsonProperty(value = "typeProperties.useHostVerification")
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     */
    @JsonProperty(value = "typeProperties.usePeerVerification")
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the clientId property: The client ID associated with your Hubspot
     * application.
     * 
     * @return the clientId value.
     */
    public Object getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client ID associated with your Hubspot
     * application.
     * 
     * @param clientId the clientId value to set.
     * @return the HubspotLinkedService object itself.
     */
    public HubspotLinkedService setClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret associated with your
     * Hubspot application.
     * 
     * @return the clientSecret value.
     */
    public SecretBase getClientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret associated with your
     * Hubspot application.
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the HubspotLinkedService object itself.
     */
    public HubspotLinkedService setClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the accessToken property: The access token obtained when
     * initially authenticating your OAuth integration.
     * 
     * @return the accessToken value.
     */
    public SecretBase getAccessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: The access token obtained when
     * initially authenticating your OAuth integration.
     * 
     * @param accessToken the accessToken value to set.
     * @return the HubspotLinkedService object itself.
     */
    public HubspotLinkedService setAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the refreshToken property: The refresh token obtained when
     * initially authenticating your OAuth integration.
     * 
     * @return the refreshToken value.
     */
    public SecretBase getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refreshToken property: The refresh token obtained when
     * initially authenticating your OAuth integration.
     * 
     * @param refreshToken the refreshToken value to set.
     * @return the HubspotLinkedService object itself.
     */
    public HubspotLinkedService setRefreshToken(SecretBase refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data
     * source endpoints are encrypted using HTTPS. The default value is true.
     * 
     * @return the useEncryptedEndpoints value.
     */
    public Object getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data
     * source endpoints are encrypted using HTTPS. The default value is true.
     * 
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the HubspotLinkedService object itself.
     */
    public HubspotLinkedService setUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the
     * host name in the server's certificate to match the host name of the
     * server when connecting over SSL. The default value is true.
     * 
     * @return the useHostVerification value.
     */
    public Object getUseHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the
     * host name in the server's certificate to match the host name of the
     * server when connecting over SSL. The default value is true.
     * 
     * @param useHostVerification the useHostVerification value to set.
     * @return the HubspotLinkedService object itself.
     */
    public HubspotLinkedService setUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the
     * identity of the server when connecting over SSL. The default value is
     * true.
     * 
     * @return the usePeerVerification value.
     */
    public Object getUsePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the
     * identity of the server when connecting over SSL. The default value is
     * true.
     * 
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the HubspotLinkedService object itself.
     */
    public HubspotLinkedService setUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
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
     * @return the HubspotLinkedService object itself.
     */
    public HubspotLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
