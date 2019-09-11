// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * An enumeration of containers.
 */
@JacksonXmlRootElement(localName = "EnumerationResults")
@Fluent
public final class ListContainersSegmentResponse {
    /*
     * The serviceEndpoint property.
     */
    @JacksonXmlProperty(localName = "ServiceEndpoint", isAttribute = true)
    private String serviceEndpoint;

    /*
     * The prefix property.
     */
    @JsonProperty(value = "Prefix", required = true)
    private String prefix;

    /*
     * The marker property.
     */
    @JsonProperty(value = "Marker")
    private String marker;

    /*
     * The maxResults property.
     */
    @JsonProperty(value = "MaxResults", required = true)
    private int maxResults;

    private static final class ContainersWrapper {
        @JacksonXmlProperty(localName = "Container")
        private final List<ContainerItem> items;

        @JsonCreator
        private ContainersWrapper(@JacksonXmlProperty(localName = "Container") List<ContainerItem> items) {
            this.items = items;
        }
    }

    /*
     * The containerItems property.
     */
    @JsonProperty(value = "Containers", required = true)
    private ContainersWrapper containerItems;

    /*
     * The nextMarker property.
     */
    @JsonProperty(value = "NextMarker", required = true)
    private String nextMarker;

    /**
     * Get the serviceEndpoint property: The serviceEndpoint property.
     *
     * @return the serviceEndpoint value.
     */
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * Set the serviceEndpoint property: The serviceEndpoint property.
     *
     * @param serviceEndpoint the serviceEndpoint value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    /**
     * Get the prefix property: The prefix property.
     *
     * @return the prefix value.
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix property.
     *
     * @param prefix the prefix value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the marker property: The marker property.
     *
     * @return the marker value.
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * Set the marker property: The marker property.
     *
     * @param marker the marker value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get the maxResults property: The maxResults property.
     *
     * @return the maxResults value.
     */
    public int getMaxResults() {
        return this.maxResults;
    }

    /**
     * Set the maxResults property: The maxResults property.
     *
     * @param maxResults the maxResults value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse setMaxResults(int maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the containerItems property: The containerItems property.
     *
     * @return the containerItems value.
     */
    public List<ContainerItem> getContainerItems() {
        if (this.containerItems == null) {
            this.containerItems = new ContainersWrapper(new ArrayList<ContainerItem>());
        }
        return this.containerItems.items;
    }

    /**
     * Set the containerItems property: The containerItems property.
     *
     * @param containerItems the containerItems value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse setContainerItems(List<ContainerItem> containerItems) {
        this.containerItems = new ContainersWrapper(containerItems);
        return this;
    }

    /**
     * Get the nextMarker property: The nextMarker property.
     *
     * @return the nextMarker value.
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * Set the nextMarker property: The nextMarker property.
     *
     * @param nextMarker the nextMarker value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}
