/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.SchemaType;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2016_06_01.ContentLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The integration account schema.
 */
@JsonFlatten
@SkipParentValidation
public class IntegrationAccountSchemaInner extends Resource {
    /**
     * The schema type. Possible values include: 'NotSpecified', 'Xml'.
     */
    @JsonProperty(value = "properties.schemaType", required = true)
    private SchemaType schemaType;

    /**
     * The target namespace of the schema.
     */
    @JsonProperty(value = "properties.targetNamespace")
    private String targetNamespace;

    /**
     * The document name.
     */
    @JsonProperty(value = "properties.documentName")
    private String documentName;

    /**
     * The file name.
     */
    @JsonProperty(value = "properties.fileName")
    private String fileName;

    /**
     * The created time.
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdTime;

    /**
     * The changed time.
     */
    @JsonProperty(value = "properties.changedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime changedTime;

    /**
     * The metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Object metadata;

    /**
     * The content.
     */
    @JsonProperty(value = "properties.content")
    private String content;

    /**
     * The content type.
     */
    @JsonProperty(value = "properties.contentType")
    private String contentType;

    /**
     * The content link.
     */
    @JsonProperty(value = "properties.contentLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink contentLink;

    /**
     * Get the schemaType value.
     *
     * @return the schemaType value
     */
    public SchemaType schemaType() {
        return this.schemaType;
    }

    /**
     * Set the schemaType value.
     *
     * @param schemaType the schemaType value to set
     * @return the IntegrationAccountSchemaInner object itself.
     */
    public IntegrationAccountSchemaInner withSchemaType(SchemaType schemaType) {
        this.schemaType = schemaType;
        return this;
    }

    /**
     * Get the targetNamespace value.
     *
     * @return the targetNamespace value
     */
    public String targetNamespace() {
        return this.targetNamespace;
    }

    /**
     * Set the targetNamespace value.
     *
     * @param targetNamespace the targetNamespace value to set
     * @return the IntegrationAccountSchemaInner object itself.
     */
    public IntegrationAccountSchemaInner withTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }

    /**
     * Get the documentName value.
     *
     * @return the documentName value
     */
    public String documentName() {
        return this.documentName;
    }

    /**
     * Set the documentName value.
     *
     * @param documentName the documentName value to set
     * @return the IntegrationAccountSchemaInner object itself.
     */
    public IntegrationAccountSchemaInner withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * Get the fileName value.
     *
     * @return the fileName value
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName value.
     *
     * @param fileName the fileName value to set
     * @return the IntegrationAccountSchemaInner object itself.
     */
    public IntegrationAccountSchemaInner withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the createdTime value.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the changedTime value.
     *
     * @return the changedTime value
     */
    public DateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the IntegrationAccountSchemaInner object itself.
     */
    public IntegrationAccountSchemaInner withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the content value.
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content value.
     *
     * @param content the content value to set
     * @return the IntegrationAccountSchemaInner object itself.
     */
    public IntegrationAccountSchemaInner withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set
     * @return the IntegrationAccountSchemaInner object itself.
     */
    public IntegrationAccountSchemaInner withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentLink value.
     *
     * @return the contentLink value
     */
    public ContentLink contentLink() {
        return this.contentLink;
    }

}
