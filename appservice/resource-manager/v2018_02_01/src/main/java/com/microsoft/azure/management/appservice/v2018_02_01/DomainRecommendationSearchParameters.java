/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain recommendation search parameters.
 */
public class DomainRecommendationSearchParameters {
    /**
     * Keywords to be used for generating domain recommendations.
     */
    @JsonProperty(value = "keywords")
    private String keywords;

    /**
     * Maximum number of recommendations.
     */
    @JsonProperty(value = "maxDomainRecommendations")
    private Integer maxDomainRecommendations;

    /**
     * Get the keywords value.
     *
     * @return the keywords value
     */
    public String keywords() {
        return this.keywords;
    }

    /**
     * Set the keywords value.
     *
     * @param keywords the keywords value to set
     * @return the DomainRecommendationSearchParameters object itself.
     */
    public DomainRecommendationSearchParameters withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * Get the maxDomainRecommendations value.
     *
     * @return the maxDomainRecommendations value
     */
    public Integer maxDomainRecommendations() {
        return this.maxDomainRecommendations;
    }

    /**
     * Set the maxDomainRecommendations value.
     *
     * @param maxDomainRecommendations the maxDomainRecommendations value to set
     * @return the DomainRecommendationSearchParameters object itself.
     */
    public DomainRecommendationSearchParameters withMaxDomainRecommendations(Integer maxDomainRecommendations) {
        this.maxDomainRecommendations = maxDomainRecommendations;
        return this;
    }

}
