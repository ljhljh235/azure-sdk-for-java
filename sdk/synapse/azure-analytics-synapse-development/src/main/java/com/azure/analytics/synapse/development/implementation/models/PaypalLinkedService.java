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
 * The PaypalLinkedService model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Paypal")
@JsonFlatten
@Fluent
public class PaypalLinkedService extends LinkedService {
    /*
     * The URL of the PayPal instance. (i.e. api.sandbox.paypal.com)
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /*
     * The client ID associated with your PayPal application.
     */
    @JsonProperty(value = "typeProperties.clientId", required = true)
    private Object clientId;

    /*
     * The client secret associated with your PayPal application.
     */
    @JsonProperty(value = "typeProperties.clientSecret")
    private SecretBase clientSecret;

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
     * Get the host property: The URL of the PayPal instance. (i.e.
     * api.sandbox.paypal.com).
     * 
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: The URL of the PayPal instance. (i.e.
     * api.sandbox.paypal.com).
     * 
     * @param host the host value to set.
     * @return the PaypalLinkedService object itself.
     */
    public PaypalLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the clientId property: The client ID associated with your PayPal
     * application.
     * 
     * @return the clientId value.
     */
    public Object getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client ID associated with your PayPal
     * application.
     * 
     * @param clientId the clientId value to set.
     * @return the PaypalLinkedService object itself.
     */
    public PaypalLinkedService setClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret associated with your
     * PayPal application.
     * 
     * @return the clientSecret value.
     */
    public SecretBase getClientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret associated with your
     * PayPal application.
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the PaypalLinkedService object itself.
     */
    public PaypalLinkedService setClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
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
     * @return the PaypalLinkedService object itself.
     */
    public PaypalLinkedService setUseEncryptedEndpoints(Object useEncryptedEndpoints) {
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
     * @return the PaypalLinkedService object itself.
     */
    public PaypalLinkedService setUseHostVerification(Object useHostVerification) {
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
     * @return the PaypalLinkedService object itself.
     */
    public PaypalLinkedService setUsePeerVerification(Object usePeerVerification) {
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
     * @return the PaypalLinkedService object itself.
     */
    public PaypalLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
