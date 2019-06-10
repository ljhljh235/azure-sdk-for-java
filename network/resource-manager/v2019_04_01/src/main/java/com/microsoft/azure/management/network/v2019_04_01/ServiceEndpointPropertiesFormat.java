/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The service endpoint properties.
 */
public class ServiceEndpointPropertiesFormat {
    /**
     * The type of the endpoint service.
     */
    @JsonProperty(value = "service")
    private String service;

    /**
     * A list of locations.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /**
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the type of the endpoint service.
     *
     * @return the service value
     */
    public String service() {
        return this.service;
    }

    /**
     * Set the type of the endpoint service.
     *
     * @param service the service value to set
     * @return the ServiceEndpointPropertiesFormat object itself.
     */
    public ServiceEndpointPropertiesFormat withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get a list of locations.
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set a list of locations.
     *
     * @param locations the locations value to set
     * @return the ServiceEndpointPropertiesFormat object itself.
     */
    public ServiceEndpointPropertiesFormat withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the provisioning state of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the resource.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ServiceEndpointPropertiesFormat object itself.
     */
    public ServiceEndpointPropertiesFormat withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
