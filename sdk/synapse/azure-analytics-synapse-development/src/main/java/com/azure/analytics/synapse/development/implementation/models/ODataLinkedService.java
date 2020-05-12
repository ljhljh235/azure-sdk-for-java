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
 * The ODataLinkedService model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("OData")
@JsonFlatten
@Fluent
public class ODataLinkedService extends LinkedService {
    /*
     * The URL of the OData service endpoint. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /*
     * Type of authentication used to connect to the OData service.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private ODataAuthenticationType authenticationType;

    /*
     * User name of the OData service. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /*
     * Password of the OData service.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * Specify the tenant information (domain name or tenant ID) under which
     * your application resides. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /*
     * Specify the application id of your application registered in Azure
     * Active Directory. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * Specify the resource you are requesting authorization to use Directory.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.aadResourceId")
    private Object aadResourceId;

    /*
     * Specify the credential type (key or cert) is used for service principal.
     */
    @JsonProperty(value = "typeProperties.aadServicePrincipalCredentialType")
    private ODataAadServicePrincipalCredentialType aadServicePrincipalCredentialType;

    /*
     * Specify the secret of your application registered in Azure Active
     * Directory. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * Specify the base64 encoded certificate of your application registered in
     * Azure Active Directory. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalEmbeddedCert")
    private SecretBase servicePrincipalEmbeddedCert;

    /*
     * Specify the password of your certificate if your certificate has a
     * password and you are using AadServicePrincipal authentication. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalEmbeddedCertPassword")
    private SecretBase servicePrincipalEmbeddedCertPassword;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the url property: The URL of the OData service endpoint. Type:
     * string (or Expression with resultType string).
     * 
     * @return the url value.
     */
    public Object getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The URL of the OData service endpoint. Type:
     * string (or Expression with resultType string).
     * 
     * @param url the url value to set.
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService setUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the authenticationType property: Type of authentication used to
     * connect to the OData service.
     * 
     * @return the authenticationType value.
     */
    public ODataAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Type of authentication used to
     * connect to the OData service.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService setAuthenticationType(ODataAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the userName property: User name of the OData service. Type: string
     * (or Expression with resultType string).
     * 
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: User name of the OData service. Type: string
     * (or Expression with resultType string).
     * 
     * @param userName the userName value to set.
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: Password of the OData service.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password of the OData service.
     * 
     * @param password the password value to set.
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the tenant property: Specify the tenant information (domain name or
     * tenant ID) under which your application resides. Type: string (or
     * Expression with resultType string).
     * 
     * @return the tenant value.
     */
    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: Specify the tenant information (domain name or
     * tenant ID) under which your application resides. Type: string (or
     * Expression with resultType string).
     * 
     * @param tenant the tenant value to set.
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the servicePrincipalId property: Specify the application id of your
     * application registered in Azure Active Directory. Type: string (or
     * Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: Specify the application id of your
     * application registered in Azure Active Directory. Type: string (or
     * Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the aadResourceId property: Specify the resource you are requesting
     * authorization to use Directory. Type: string (or Expression with
     * resultType string).
     * 
     * @return the aadResourceId value.
     */
    public Object getAadResourceId() {
        return this.aadResourceId;
    }

    /**
     * Set the aadResourceId property: Specify the resource you are requesting
     * authorization to use Directory. Type: string (or Expression with
     * resultType string).
     * 
     * @param aadResourceId the aadResourceId value to set.
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService setAadResourceId(Object aadResourceId) {
        this.aadResourceId = aadResourceId;
        return this;
    }

    /**
     * Get the aadServicePrincipalCredentialType property: Specify the
     * credential type (key or cert) is used for service principal.
     * 
     * @return the aadServicePrincipalCredentialType value.
     */
    public ODataAadServicePrincipalCredentialType getAadServicePrincipalCredentialType() {
        return this.aadServicePrincipalCredentialType;
    }

    /**
     * Set the aadServicePrincipalCredentialType property: Specify the
     * credential type (key or cert) is used for service principal.
     * 
     * @param aadServicePrincipalCredentialType the
     * aadServicePrincipalCredentialType value to set.
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService setAadServicePrincipalCredentialType(ODataAadServicePrincipalCredentialType aadServicePrincipalCredentialType) {
        this.aadServicePrincipalCredentialType = aadServicePrincipalCredentialType;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: Specify the secret of your
     * application registered in Azure Active Directory. Type: string (or
     * Expression with resultType string).
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: Specify the secret of your
     * application registered in Azure Active Directory. Type: string (or
     * Expression with resultType string).
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the servicePrincipalEmbeddedCert property: Specify the base64
     * encoded certificate of your application registered in Azure Active
     * Directory. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalEmbeddedCert value.
     */
    public SecretBase getServicePrincipalEmbeddedCert() {
        return this.servicePrincipalEmbeddedCert;
    }

    /**
     * Set the servicePrincipalEmbeddedCert property: Specify the base64
     * encoded certificate of your application registered in Azure Active
     * Directory. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalEmbeddedCert the servicePrincipalEmbeddedCert
     * value to set.
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService setServicePrincipalEmbeddedCert(SecretBase servicePrincipalEmbeddedCert) {
        this.servicePrincipalEmbeddedCert = servicePrincipalEmbeddedCert;
        return this;
    }

    /**
     * Get the servicePrincipalEmbeddedCertPassword property: Specify the
     * password of your certificate if your certificate has a password and you
     * are using AadServicePrincipal authentication. Type: string (or
     * Expression with resultType string).
     * 
     * @return the servicePrincipalEmbeddedCertPassword value.
     */
    public SecretBase getServicePrincipalEmbeddedCertPassword() {
        return this.servicePrincipalEmbeddedCertPassword;
    }

    /**
     * Set the servicePrincipalEmbeddedCertPassword property: Specify the
     * password of your certificate if your certificate has a password and you
     * are using AadServicePrincipal authentication. Type: string (or
     * Expression with resultType string).
     * 
     * @param servicePrincipalEmbeddedCertPassword the
     * servicePrincipalEmbeddedCertPassword value to set.
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService setServicePrincipalEmbeddedCertPassword(SecretBase servicePrincipalEmbeddedCertPassword) {
        this.servicePrincipalEmbeddedCertPassword = servicePrincipalEmbeddedCertPassword;
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
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
