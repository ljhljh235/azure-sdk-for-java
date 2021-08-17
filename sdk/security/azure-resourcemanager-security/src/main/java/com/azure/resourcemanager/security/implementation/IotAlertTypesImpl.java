// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.IotAlertTypesClient;
import com.azure.resourcemanager.security.fluent.models.IotAlertTypeInner;
import com.azure.resourcemanager.security.fluent.models.IotAlertTypeListInner;
import com.azure.resourcemanager.security.models.IotAlertType;
import com.azure.resourcemanager.security.models.IotAlertTypeList;
import com.azure.resourcemanager.security.models.IotAlertTypes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IotAlertTypesImpl implements IotAlertTypes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotAlertTypesImpl.class);

    private final IotAlertTypesClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public IotAlertTypesImpl(
        IotAlertTypesClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public IotAlertTypeList list() {
        IotAlertTypeListInner inner = this.serviceClient().list();
        if (inner != null) {
            return new IotAlertTypeListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IotAlertTypeList> listWithResponse(Context context) {
        Response<IotAlertTypeListInner> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IotAlertTypeListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IotAlertType get(String iotAlertTypeName) {
        IotAlertTypeInner inner = this.serviceClient().get(iotAlertTypeName);
        if (inner != null) {
            return new IotAlertTypeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IotAlertType> getWithResponse(String iotAlertTypeName, Context context) {
        Response<IotAlertTypeInner> inner = this.serviceClient().getWithResponse(iotAlertTypeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IotAlertTypeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private IotAlertTypesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
