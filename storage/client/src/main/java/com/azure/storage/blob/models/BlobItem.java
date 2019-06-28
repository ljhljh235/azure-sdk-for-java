// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Map;

/**
 * An Azure Storage blob.
 */
@JacksonXmlRootElement(localName = "Blob")
public final class BlobItem {
    /*
     * The name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The deleted property.
     */
    @JsonProperty(value = "Deleted", required = true)
    private boolean deleted;

    /*
     * The snapshot property.
     */
    @JsonProperty(value = "Snapshot", required = true)
    private String snapshot;

    /*
     * The properties property.
     */
    @JsonProperty(value = "Properties", required = true)
    private BlobProperties properties;

    /*
     * The metadata property.
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    private boolean isPrefix = false;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the deleted property: The deleted property.
     *
     * @return the deleted value.
     */
    public boolean deleted() {
        return this.deleted;
    }

    /**
     * Set the deleted property: The deleted property.
     *
     * @param deleted the deleted value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem deleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get the snapshot property: The snapshot property.
     *
     * @return the snapshot value.
     */
    public String snapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The snapshot property.
     *
     * @param snapshot the snapshot value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem snapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public BlobProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem properties(BlobProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * @return if the blob item is a prefix instead of an actual blob.
     */
    public boolean isPrefix() {
        return isPrefix;
    }

    /**
     * Sets if the blob item is a prefix instead of an actual blob
     * @param isPrefix if the item is a prefix
     * @return the BlobItem object itself
     */
    public BlobItem isPrefix(boolean isPrefix) {
        this.isPrefix = isPrefix;
        return this;
    }
}
