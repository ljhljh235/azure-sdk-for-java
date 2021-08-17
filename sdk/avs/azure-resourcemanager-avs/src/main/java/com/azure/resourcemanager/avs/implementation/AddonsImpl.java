// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.fluent.AddonsClient;
import com.azure.resourcemanager.avs.fluent.models.AddonInner;
import com.azure.resourcemanager.avs.models.Addon;
import com.azure.resourcemanager.avs.models.Addons;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AddonsImpl implements Addons {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AddonsImpl.class);

    private final AddonsClient innerClient;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    public AddonsImpl(AddonsClient innerClient, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Addon> list(String resourceGroupName, String privateCloudName) {
        PagedIterable<AddonInner> inner = this.serviceClient().list(resourceGroupName, privateCloudName);
        return Utils.mapPage(inner, inner1 -> new AddonImpl(inner1, this.manager()));
    }

    public PagedIterable<Addon> list(String resourceGroupName, String privateCloudName, Context context) {
        PagedIterable<AddonInner> inner = this.serviceClient().list(resourceGroupName, privateCloudName, context);
        return Utils.mapPage(inner, inner1 -> new AddonImpl(inner1, this.manager()));
    }

    public Addon get(String resourceGroupName, String privateCloudName, String addonName) {
        AddonInner inner = this.serviceClient().get(resourceGroupName, privateCloudName, addonName);
        if (inner != null) {
            return new AddonImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Addon> getWithResponse(
        String resourceGroupName, String privateCloudName, String addonName, Context context) {
        Response<AddonInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, privateCloudName, addonName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AddonImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String privateCloudName, String addonName) {
        this.serviceClient().delete(resourceGroupName, privateCloudName, addonName);
    }

    public void delete(String resourceGroupName, String privateCloudName, String addonName, Context context) {
        this.serviceClient().delete(resourceGroupName, privateCloudName, addonName, context);
    }

    public Addon getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String addonName = Utils.getValueFromIdByName(id, "addons");
        if (addonName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'addons'.", id)));
        }
        return this.getWithResponse(resourceGroupName, privateCloudName, addonName, Context.NONE).getValue();
    }

    public Response<Addon> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String addonName = Utils.getValueFromIdByName(id, "addons");
        if (addonName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'addons'.", id)));
        }
        return this.getWithResponse(resourceGroupName, privateCloudName, addonName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String addonName = Utils.getValueFromIdByName(id, "addons");
        if (addonName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'addons'.", id)));
        }
        this.delete(resourceGroupName, privateCloudName, addonName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String addonName = Utils.getValueFromIdByName(id, "addons");
        if (addonName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'addons'.", id)));
        }
        this.delete(resourceGroupName, privateCloudName, addonName, context);
    }

    private AddonsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }

    public AddonImpl define(String name) {
        return new AddonImpl(name, this.manager());
    }
}
