// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cassandra dataset properties. */
@Fluent
public final class CassandraTableDatasetTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CassandraTableDatasetTypeProperties.class);

    /*
     * The table name of the Cassandra database. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "tableName")
    private Object tableName;

    /*
     * The keyspace of the Cassandra database. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "keyspace")
    private Object keyspace;

    /**
     * Get the tableName property: The table name of the Cassandra database. Type: string (or Expression with resultType
     * string).
     *
     * @return the tableName value.
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The table name of the Cassandra database. Type: string (or Expression with resultType
     * string).
     *
     * @param tableName the tableName value to set.
     * @return the CassandraTableDatasetTypeProperties object itself.
     */
    public CassandraTableDatasetTypeProperties withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the keyspace property: The keyspace of the Cassandra database. Type: string (or Expression with resultType
     * string).
     *
     * @return the keyspace value.
     */
    public Object keyspace() {
        return this.keyspace;
    }

    /**
     * Set the keyspace property: The keyspace of the Cassandra database. Type: string (or Expression with resultType
     * string).
     *
     * @param keyspace the keyspace value to set.
     * @return the CassandraTableDatasetTypeProperties object itself.
     */
    public CassandraTableDatasetTypeProperties withKeyspace(Object keyspace) {
        this.keyspace = keyspace;
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
