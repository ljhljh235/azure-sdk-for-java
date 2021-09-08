// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a database. */
@Fluent
public final class DatabaseProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseProperties.class);

    /*
     * The charset of the database.
     */
    @JsonProperty(value = "charset")
    private String charset;

    /*
     * The collation of the database.
     */
    @JsonProperty(value = "collation")
    private String collation;

    /**
     * Get the charset property: The charset of the database.
     *
     * @return the charset value.
     */
    public String charset() {
        return this.charset;
    }

    /**
     * Set the charset property: The charset of the database.
     *
     * @param charset the charset value to set.
     * @return the DatabaseProperties object itself.
     */
    public DatabaseProperties withCharset(String charset) {
        this.charset = charset;
        return this;
    }

    /**
     * Get the collation property: The collation of the database.
     *
     * @return the collation value.
     */
    public String collation() {
        return this.collation;
    }

    /**
     * Set the collation property: The collation of the database.
     *
     * @param collation the collation value to set.
     * @return the DatabaseProperties object itself.
     */
    public DatabaseProperties withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
