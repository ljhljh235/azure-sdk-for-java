/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_10_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.signalr.v2018_10_01.SignalRResource;
import rx.Observable;
import com.microsoft.azure.management.signalr.v2018_10_01.SignalRUpdateParameters;
import com.microsoft.azure.management.signalr.v2018_10_01.SignalRCreateParameters;
import com.microsoft.azure.management.signalr.v2018_10_01.SignalRCorsSettings;
import java.util.List;
import com.microsoft.azure.management.signalr.v2018_10_01.SignalRFeature;
import com.microsoft.azure.management.signalr.v2018_10_01.ProvisioningState;
import com.microsoft.azure.management.signalr.v2018_10_01.ResourceSku;
import com.microsoft.azure.management.signalr.v2018_10_01.SignalRCreateOrUpdateProperties;
import rx.functions.Func1;

class SignalRResourceImpl extends GroupableResourceCoreImpl<SignalRResource, SignalRResourceInner, SignalRResourceImpl, SignalRManager> implements SignalRResource, SignalRResource.Definition, SignalRResource.Update {
    private SignalRCreateParameters createParameter;
    private SignalRUpdateParameters updateParameter;
    SignalRResourceImpl(String name, SignalRResourceInner inner, SignalRManager manager) {
        super(name, inner, manager);
        this.createParameter = new SignalRCreateParameters();
        this.updateParameter = new SignalRUpdateParameters();
    }

    @Override
    public Observable<SignalRResource> createResourceAsync() {
        SignalRsInner client = this.manager().inner().signalRs();
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().getTags());
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.createParameter)
            .map(new Func1<SignalRResourceInner, SignalRResourceInner>() {
               @Override
               public SignalRResourceInner call(SignalRResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SignalRResource> updateResourceAsync() {
        SignalRsInner client = this.manager().inner().signalRs();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<SignalRResourceInner, SignalRResourceInner>() {
               @Override
               public SignalRResourceInner call(SignalRResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SignalRResourceInner> getInnerAsync() {
        SignalRsInner client = this.manager().inner().signalRs();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new SignalRCreateParameters();
        this.updateParameter = new SignalRUpdateParameters();
    }

    @Override
    public SignalRCorsSettings cors() {
        return this.inner().cors();
    }

    @Override
    public String externalIP() {
        return this.inner().externalIP();
    }

    @Override
    public List<SignalRFeature> features() {
        return this.inner().features();
    }

    @Override
    public String hostName() {
        return this.inner().hostName();
    }

    @Override
    public String hostNamePrefix() {
        return this.inner().hostNamePrefix();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Integer publicPort() {
        return this.inner().publicPort();
    }

    @Override
    public Integer serverPort() {
        return this.inner().serverPort();
    }

    @Override
    public ResourceSku sku() {
        return this.inner().sku();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

    @Override
    public SignalRResourceImpl withProperties(SignalRCreateOrUpdateProperties properties) {
        if (isInCreateMode()) {
            this.createParameter.withProperties(properties);
        } else {
            this.updateParameter.withProperties(properties);
        }
        return this;
    }

    @Override
    public SignalRResourceImpl withSku(ResourceSku sku) {
        if (isInCreateMode()) {
            this.createParameter.withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

}
