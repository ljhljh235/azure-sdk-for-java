// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for GoogleBigQueryAuthenticationType.
 */
public final class GoogleBigQueryAuthenticationType extends ExpandableStringEnum<GoogleBigQueryAuthenticationType> {
    /**
     * Static value ServiceAuthentication for GoogleBigQueryAuthenticationType.
     */
    public static final GoogleBigQueryAuthenticationType SERVICE_AUTHENTICATION = fromString("ServiceAuthentication");

    /**
     * Static value UserAuthentication for GoogleBigQueryAuthenticationType.
     */
    public static final GoogleBigQueryAuthenticationType USER_AUTHENTICATION = fromString("UserAuthentication");

    /**
     * Creates or finds a GoogleBigQueryAuthenticationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding GoogleBigQueryAuthenticationType.
     */
    @JsonCreator
    public static GoogleBigQueryAuthenticationType fromString(String name) {
        return fromString(name, GoogleBigQueryAuthenticationType.class);
    }

    /**
     * @return known GoogleBigQueryAuthenticationType values.
     */
    public static Collection<GoogleBigQueryAuthenticationType> values() {
        return values(GoogleBigQueryAuthenticationType.class);
    }
}
