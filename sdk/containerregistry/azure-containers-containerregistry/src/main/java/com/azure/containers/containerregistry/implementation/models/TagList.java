// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of tag details. */
@Fluent
public final class TagList {
    /*
     * Image name
     */
    @JsonProperty(value = "imageName", required = true)
    private String repository;

    /*
     * List of tag attribute details
     */
    @JsonProperty(value = "tags", required = true)
    private List<TagAttributesBase> tagAttributeBases;

    /*
     * The link property.
     */
    @JsonProperty(value = "link")
    private String link;

    /**
     * Get the repository property: Image name.
     *
     * @return the repository value.
     */
    public String getRepository() {
        return this.repository;
    }

    /**
     * Set the repository property: Image name.
     *
     * @param repository the repository value to set.
     * @return the TagList object itself.
     */
    public TagList setRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get the tagAttributeBases property: List of tag attribute details.
     *
     * @return the tagAttributeBases value.
     */
    public List<TagAttributesBase> getTagAttributeBases() {
        return this.tagAttributeBases;
    }

    /**
     * Set the tagAttributeBases property: List of tag attribute details.
     *
     * @param tagAttributeBases the tagAttributeBases value to set.
     * @return the TagList object itself.
     */
    public TagList setTagAttributeBases(List<TagAttributesBase> tagAttributeBases) {
        this.tagAttributeBases = tagAttributeBases;
        return this;
    }

    /**
     * Get the link property: The link property.
     *
     * @return the link value.
     */
    public String getLink() {
        return this.link;
    }

    /**
     * Set the link property: The link property.
     *
     * @param link the link value to set.
     * @return the TagList object itself.
     */
    public TagList setLink(String link) {
        this.link = link;
        return this;
    }
}
