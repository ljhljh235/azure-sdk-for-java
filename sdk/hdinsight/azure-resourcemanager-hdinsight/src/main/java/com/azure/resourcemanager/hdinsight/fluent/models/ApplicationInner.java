// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.models.ApplicationProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The HDInsight cluster application. */
@Fluent
public final class ApplicationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationInner.class);

    /*
     * The ETag for the application
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The tags for the application.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The properties of the application.
     */
    @JsonProperty(value = "properties")
    private ApplicationProperties properties;

    /**
     * Get the etag property: The ETag for the application.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The ETag for the application.
     *
     * @param etag the etag value to set.
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the tags property: The tags for the application.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags for the application.
     *
     * @param tags the tags value to set.
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The properties of the application.
     *
     * @return the properties value.
     */
    public ApplicationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the application.
     *
     * @param properties the properties value to set.
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withProperties(ApplicationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
