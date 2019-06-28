// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * An enumeration of blobs.
 */
@JacksonXmlRootElement(localName = "EnumerationResults")
public final class ListBlobsFlatSegmentResponse {
    /*
     * The serviceEndpoint property.
     */
    @JacksonXmlProperty(localName = "ServiceEndpoint", isAttribute = true)
    private String serviceEndpoint;

    /*
     * The containerName property.
     */
    @JacksonXmlProperty(localName = "ContainerName", isAttribute = true)
    private String containerName;

    /*
     * The prefix property.
     */
    @JsonProperty(value = "Prefix")
    private String prefix;

    /*
     * The marker property.
     */
    @JsonProperty(value = "Marker")
    private String marker;

    /*
     * The maxResults property.
     */
    @JsonProperty(value = "MaxResults")
    private Integer maxResults;

    /*
     * The delimiter property.
     */
    @JsonProperty(value = "Delimiter")
    private String delimiter;

    /*
     * The segment property.
     */
    @JsonProperty(value = "Blobs", required = true)
    private BlobFlatListSegment segment;

    /*
     * The nextMarker property.
     */
    @JsonProperty(value = "NextMarker")
    private String nextMarker;

    /**
     * Get the serviceEndpoint property: The serviceEndpoint property.
     *
     * @return the serviceEndpoint value.
     */
    public String serviceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * Set the serviceEndpoint property: The serviceEndpoint property.
     *
     * @param serviceEndpoint the serviceEndpoint value to set.
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse serviceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    /**
     * Get the containerName property: The containerName property.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The containerName property.
     *
     * @param containerName the containerName value to set.
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse containerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the prefix property: The prefix property.
     *
     * @return the prefix value.
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix property.
     *
     * @param prefix the prefix value to set.
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse prefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the marker property: The marker property.
     *
     * @return the marker value.
     */
    public String marker() {
        return this.marker;
    }

    /**
     * Set the marker property: The marker property.
     *
     * @param marker the marker value to set.
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse marker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get the maxResults property: The maxResults property.
     *
     * @return the maxResults value.
     */
    public Integer maxResults() {
        return this.maxResults;
    }

    /**
     * Set the maxResults property: The maxResults property.
     *
     * @param maxResults the maxResults value to set.
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse maxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the delimiter property: The delimiter property.
     *
     * @return the delimiter value.
     */
    public String delimiter() {
        return this.delimiter;
    }

    /**
     * Set the delimiter property: The delimiter property.
     *
     * @param delimiter the delimiter value to set.
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse delimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * Get the segment property: The segment property.
     *
     * @return the segment value.
     */
    public BlobFlatListSegment segment() {
        return this.segment;
    }

    /**
     * Set the segment property: The segment property.
     *
     * @param segment the segment value to set.
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse segment(BlobFlatListSegment segment) {
        this.segment = segment;
        return this;
    }

    /**
     * Get the nextMarker property: The nextMarker property.
     *
     * @return the nextMarker value.
     */
    public String nextMarker() {
        return this.nextMarker;
    }

    /**
     * Set the nextMarker property: The nextMarker property.
     *
     * @param nextMarker the nextMarker value to set.
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse nextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}
