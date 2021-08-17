// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** SparkConfiguration Artifact information. */
@Fluent
public final class SparkConfiguration {
    /*
     * Description about the SparkConfiguration.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * SparkConfiguration configs.
     */
    @JsonProperty(value = "configs", required = true)
    private Map<String, String> configs;

    /*
     * Annotations for SparkConfiguration.
     */
    @JsonProperty(value = "annotations")
    private List<String> annotations;

    /*
     * additional Notes.
     */
    @JsonProperty(value = "notes")
    private String notes;

    /*
     * The identity that created the resource.
     */
    @JsonProperty(value = "createdBy")
    private String createdBy;

    /*
     * The timestamp of resource creation.
     */
    @JsonProperty(value = "created")
    private OffsetDateTime created;

    /**
     * Get the description property: Description about the SparkConfiguration.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Description about the SparkConfiguration.
     *
     * @param description the description value to set.
     * @return the SparkConfiguration object itself.
     */
    public SparkConfiguration setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the configs property: SparkConfiguration configs.
     *
     * @return the configs value.
     */
    public Map<String, String> getConfigs() {
        return this.configs;
    }

    /**
     * Set the configs property: SparkConfiguration configs.
     *
     * @param configs the configs value to set.
     * @return the SparkConfiguration object itself.
     */
    public SparkConfiguration setConfigs(Map<String, String> configs) {
        this.configs = configs;
        return this;
    }

    /**
     * Get the annotations property: Annotations for SparkConfiguration.
     *
     * @return the annotations value.
     */
    public List<String> getAnnotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: Annotations for SparkConfiguration.
     *
     * @param annotations the annotations value to set.
     * @return the SparkConfiguration object itself.
     */
    public SparkConfiguration setAnnotations(List<String> annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Get the notes property: additional Notes.
     *
     * @return the notes value.
     */
    public String getNotes() {
        return this.notes;
    }

    /**
     * Set the notes property: additional Notes.
     *
     * @param notes the notes value to set.
     * @return the SparkConfiguration object itself.
     */
    public SparkConfiguration setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Get the createdBy property: The identity that created the resource.
     *
     * @return the createdBy value.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: The identity that created the resource.
     *
     * @param createdBy the createdBy value to set.
     * @return the SparkConfiguration object itself.
     */
    public SparkConfiguration setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the created property: The timestamp of resource creation.
     *
     * @return the created value.
     */
    public OffsetDateTime getCreated() {
        return this.created;
    }

    /**
     * Set the created property: The timestamp of resource creation.
     *
     * @param created the created value to set.
     * @return the SparkConfiguration object itself.
     */
    public SparkConfiguration setCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }
}
