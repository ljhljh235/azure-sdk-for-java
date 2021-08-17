// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity source for a CosmosDB (MongoDB API) database. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CosmosDbMongoDbApiSource")
@Fluent
public final class CosmosDbMongoDbApiSource extends CopySource {
    /*
     * Specifies selection filter using query operators. To return all
     * documents in a collection, omit this parameter or pass an empty document
     * ({}). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "filter")
    private Object filter;

    /*
     * Cursor methods for Mongodb query.
     */
    @JsonProperty(value = "cursorMethods")
    private MongoDbCursorMethodsProperties cursorMethods;

    /*
     * Specifies the number of documents to return in each batch of the
     * response from MongoDB instance. In most cases, modifying the batch size
     * will not affect the user or the application. This property's main
     * purpose is to avoid hit the limitation of response size. Type: integer
     * (or Expression with resultType integer).
     */
    @JsonProperty(value = "batchSize")
    private Object batchSize;

    /*
     * Query timeout. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "queryTimeout")
    private Object queryTimeout;

    /*
     * Specifies the additional columns to be added to source data. Type: array
     * of objects(AdditionalColumns) (or Expression with resultType array of
     * objects).
     */
    @JsonProperty(value = "additionalColumns")
    private Object additionalColumns;

    /**
     * Get the filter property: Specifies selection filter using query operators. To return all documents in a
     * collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType
     * string).
     *
     * @return the filter value.
     */
    public Object getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: Specifies selection filter using query operators. To return all documents in a
     * collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType
     * string).
     *
     * @param filter the filter value to set.
     * @return the CosmosDbMongoDbApiSource object itself.
     */
    public CosmosDbMongoDbApiSource setFilter(Object filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the cursorMethods property: Cursor methods for Mongodb query.
     *
     * @return the cursorMethods value.
     */
    public MongoDbCursorMethodsProperties getCursorMethods() {
        return this.cursorMethods;
    }

    /**
     * Set the cursorMethods property: Cursor methods for Mongodb query.
     *
     * @param cursorMethods the cursorMethods value to set.
     * @return the CosmosDbMongoDbApiSource object itself.
     */
    public CosmosDbMongoDbApiSource setCursorMethods(MongoDbCursorMethodsProperties cursorMethods) {
        this.cursorMethods = cursorMethods;
        return this;
    }

    /**
     * Get the batchSize property: Specifies the number of documents to return in each batch of the response from
     * MongoDB instance. In most cases, modifying the batch size will not affect the user or the application. This
     * property's main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with
     * resultType integer).
     *
     * @return the batchSize value.
     */
    public Object getBatchSize() {
        return this.batchSize;
    }

    /**
     * Set the batchSize property: Specifies the number of documents to return in each batch of the response from
     * MongoDB instance. In most cases, modifying the batch size will not affect the user or the application. This
     * property's main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with
     * resultType integer).
     *
     * @param batchSize the batchSize value to set.
     * @return the CosmosDbMongoDbApiSource object itself.
     */
    public CosmosDbMongoDbApiSource setBatchSize(Object batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Get the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the queryTimeout value.
     */
    public Object getQueryTimeout() {
        return this.queryTimeout;
    }

    /**
     * Set the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param queryTimeout the queryTimeout value to set.
     * @return the CosmosDbMongoDbApiSource object itself.
     */
    public CosmosDbMongoDbApiSource setQueryTimeout(Object queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     *
     * @return the additionalColumns value.
     */
    public Object getAdditionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     *
     * @param additionalColumns the additionalColumns value to set.
     * @return the CosmosDbMongoDbApiSource object itself.
     */
    public CosmosDbMongoDbApiSource setAdditionalColumns(Object additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }
}
