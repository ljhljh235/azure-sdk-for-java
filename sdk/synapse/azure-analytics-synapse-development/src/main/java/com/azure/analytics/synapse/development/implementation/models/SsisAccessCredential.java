// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SsisAccessCredential model.
 */
@Fluent
public final class SsisAccessCredential {
    /*
     * Domain for windows authentication.
     */
    @JsonProperty(value = "domain", required = true)
    private Object domain;

    /*
     * UseName for windows authentication.
     */
    @JsonProperty(value = "userName", required = true)
    private Object userName;

    /*
     * Password for windows authentication.
     */
    @JsonProperty(value = "password", required = true)
    private SecretBase password;

    /**
     * Get the domain property: Domain for windows authentication.
     * 
     * @return the domain value.
     */
    public Object getDomain() {
        return this.domain;
    }

    /**
     * Set the domain property: Domain for windows authentication.
     * 
     * @param domain the domain value to set.
     * @return the SsisAccessCredential object itself.
     */
    public SsisAccessCredential setDomain(Object domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the userName property: UseName for windows authentication.
     * 
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: UseName for windows authentication.
     * 
     * @param userName the userName value to set.
     * @return the SsisAccessCredential object itself.
     */
    public SsisAccessCredential setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: Password for windows authentication.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password for windows authentication.
     * 
     * @param password the password value to set.
     * @return the SsisAccessCredential object itself.
     */
    public SsisAccessCredential setPassword(SecretBase password) {
        this.password = password;
        return this;
    }
}
