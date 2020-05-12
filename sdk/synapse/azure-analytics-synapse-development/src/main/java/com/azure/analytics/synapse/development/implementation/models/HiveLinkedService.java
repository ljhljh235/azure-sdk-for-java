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
 * The HiveLinkedService model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Hive")
@JsonFlatten
@Fluent
public class HiveLinkedService extends LinkedService {
    /*
     * IP address or host name of the Hive server, separated by ';' for
     * multiple hosts (only when serviceDiscoveryMode is enable).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /*
     * The TCP port that the Hive server uses to listen for client connections.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /*
     * The type of Hive server.
     */
    @JsonProperty(value = "typeProperties.serverType")
    private HiveServerType serverType;

    /*
     * The transport protocol to use in the Thrift layer.
     */
    @JsonProperty(value = "typeProperties.thriftTransportProtocol")
    private HiveThriftTransportProtocol thriftTransportProtocol;

    /*
     * The authentication method used to access the Hive server.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private HiveAuthenticationType authenticationType;

    /*
     * true to indicate using the ZooKeeper service, false not.
     */
    @JsonProperty(value = "typeProperties.serviceDiscoveryMode")
    private Object serviceDiscoveryMode;

    /*
     * The namespace on ZooKeeper under which Hive Server 2 nodes are added.
     */
    @JsonProperty(value = "typeProperties.zooKeeperNameSpace")
    private Object zooKeeperNameSpace;

    /*
     * Specifies whether the driver uses native HiveQL queries,or converts them
     * into an equivalent form in HiveQL.
     */
    @JsonProperty(value = "typeProperties.useNativeQuery")
    private Object useNativeQuery;

    /*
     * The user name that you use to access Hive Server.
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * The password corresponding to the user name that you provided in the
     * Username field
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The partial URL corresponding to the Hive server.
     */
    @JsonProperty(value = "typeProperties.httpPath")
    private Object httpPath;

    /*
     * Specifies whether the connections to the server are encrypted using SSL.
     * The default value is false.
     */
    @JsonProperty(value = "typeProperties.enableSsl")
    private Object enableSsl;

    /*
     * The full path of the .pem file containing trusted CA certificates for
     * verifying the server when connecting over SSL. This property can only be
     * set when using SSL on self-hosted IR. The default value is the
     * cacerts.pem file installed with the IR.
     */
    @JsonProperty(value = "typeProperties.trustedCertPath")
    private Object trustedCertPath;

    /*
     * Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     */
    @JsonProperty(value = "typeProperties.useSystemTrustStore")
    private Object useSystemTrustStore;

    /*
     * Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value
     * is false.
     */
    @JsonProperty(value = "typeProperties.allowHostNameCNMismatch")
    private Object allowHostNameCNMismatch;

    /*
     * Specifies whether to allow self-signed certificates from the server. The
     * default value is false.
     */
    @JsonProperty(value = "typeProperties.allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the host property: IP address or host name of the Hive server,
     * separated by ';' for multiple hosts (only when serviceDiscoveryMode is
     * enable).
     * 
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: IP address or host name of the Hive server,
     * separated by ';' for multiple hosts (only when serviceDiscoveryMode is
     * enable).
     * 
     * @param host the host value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: The TCP port that the Hive server uses to listen
     * for client connections.
     * 
     * @return the port value.
     */
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port that the Hive server uses to listen
     * for client connections.
     * 
     * @param port the port value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the serverType property: The type of Hive server.
     * 
     * @return the serverType value.
     */
    public HiveServerType getServerType() {
        return this.serverType;
    }

    /**
     * Set the serverType property: The type of Hive server.
     * 
     * @param serverType the serverType value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setServerType(HiveServerType serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * Get the thriftTransportProtocol property: The transport protocol to use
     * in the Thrift layer.
     * 
     * @return the thriftTransportProtocol value.
     */
    public HiveThriftTransportProtocol getThriftTransportProtocol() {
        return this.thriftTransportProtocol;
    }

    /**
     * Set the thriftTransportProtocol property: The transport protocol to use
     * in the Thrift layer.
     * 
     * @param thriftTransportProtocol the thriftTransportProtocol value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setThriftTransportProtocol(HiveThriftTransportProtocol thriftTransportProtocol) {
        this.thriftTransportProtocol = thriftTransportProtocol;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication method used to
     * access the Hive server.
     * 
     * @return the authenticationType value.
     */
    public HiveAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication method used to
     * access the Hive server.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setAuthenticationType(HiveAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the serviceDiscoveryMode property: true to indicate using the
     * ZooKeeper service, false not.
     * 
     * @return the serviceDiscoveryMode value.
     */
    public Object getServiceDiscoveryMode() {
        return this.serviceDiscoveryMode;
    }

    /**
     * Set the serviceDiscoveryMode property: true to indicate using the
     * ZooKeeper service, false not.
     * 
     * @param serviceDiscoveryMode the serviceDiscoveryMode value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setServiceDiscoveryMode(Object serviceDiscoveryMode) {
        this.serviceDiscoveryMode = serviceDiscoveryMode;
        return this;
    }

    /**
     * Get the zooKeeperNameSpace property: The namespace on ZooKeeper under
     * which Hive Server 2 nodes are added.
     * 
     * @return the zooKeeperNameSpace value.
     */
    public Object getZooKeeperNameSpace() {
        return this.zooKeeperNameSpace;
    }

    /**
     * Set the zooKeeperNameSpace property: The namespace on ZooKeeper under
     * which Hive Server 2 nodes are added.
     * 
     * @param zooKeeperNameSpace the zooKeeperNameSpace value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setZooKeeperNameSpace(Object zooKeeperNameSpace) {
        this.zooKeeperNameSpace = zooKeeperNameSpace;
        return this;
    }

    /**
     * Get the useNativeQuery property: Specifies whether the driver uses
     * native HiveQL queries,or converts them into an equivalent form in
     * HiveQL.
     * 
     * @return the useNativeQuery value.
     */
    public Object getUseNativeQuery() {
        return this.useNativeQuery;
    }

    /**
     * Set the useNativeQuery property: Specifies whether the driver uses
     * native HiveQL queries,or converts them into an equivalent form in
     * HiveQL.
     * 
     * @param useNativeQuery the useNativeQuery value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setUseNativeQuery(Object useNativeQuery) {
        this.useNativeQuery = useNativeQuery;
        return this;
    }

    /**
     * Get the username property: The user name that you use to access Hive
     * Server.
     * 
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: The user name that you use to access Hive
     * Server.
     * 
     * @param username the username value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name
     * that you provided in the Username field.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name
     * that you provided in the Username field.
     * 
     * @param password the password value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the httpPath property: The partial URL corresponding to the Hive
     * server.
     * 
     * @return the httpPath value.
     */
    public Object getHttpPath() {
        return this.httpPath;
    }

    /**
     * Set the httpPath property: The partial URL corresponding to the Hive
     * server.
     * 
     * @param httpPath the httpPath value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setHttpPath(Object httpPath) {
        this.httpPath = httpPath;
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the
     * server are encrypted using SSL. The default value is false.
     * 
     * @return the enableSsl value.
     */
    public Object getEnableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the
     * server are encrypted using SSL. The default value is false.
     * 
     * @param enableSsl the enableSsl value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the trustedCertPath property: The full path of the .pem file
     * containing trusted CA certificates for verifying the server when
     * connecting over SSL. This property can only be set when using SSL on
     * self-hosted IR. The default value is the cacerts.pem file installed with
     * the IR.
     * 
     * @return the trustedCertPath value.
     */
    public Object getTrustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file
     * containing trusted CA certificates for verifying the server when
     * connecting over SSL. This property can only be set when using SSL on
     * self-hosted IR. The default value is the cacerts.pem file installed with
     * the IR.
     * 
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get the useSystemTrustStore property: Specifies whether to use a CA
     * certificate from the system trust store or from a specified PEM file.
     * The default value is false.
     * 
     * @return the useSystemTrustStore value.
     */
    public Object getUseSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set the useSystemTrustStore property: Specifies whether to use a CA
     * certificate from the system trust store or from a specified PEM file.
     * The default value is false.
     * 
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get the allowHostNameCNMismatch property: Specifies whether to require a
     * CA-issued SSL certificate name to match the host name of the server when
     * connecting over SSL. The default value is false.
     * 
     * @return the allowHostNameCNMismatch value.
     */
    public Object getAllowHostNameCNMismatch() {
        return this.allowHostNameCNMismatch;
    }

    /**
     * Set the allowHostNameCNMismatch property: Specifies whether to require a
     * CA-issued SSL certificate name to match the host name of the server when
     * connecting over SSL. The default value is false.
     * 
     * @param allowHostNameCNMismatch the allowHostNameCNMismatch value to set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setAllowHostNameCNMismatch(Object allowHostNameCNMismatch) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow
     * self-signed certificates from the server. The default value is false.
     * 
     * @return the allowSelfSignedServerCert value.
     */
    public Object getAllowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow
     * self-signed certificates from the server. The default value is false.
     * 
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to
     * set.
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
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
     * @return the HiveLinkedService object itself.
     */
    public HiveLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
