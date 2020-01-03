/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.MaintenanceConfigurations;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.MaintenanceConfiguration;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class MaintenanceConfigurationsImpl extends GroupableResourcesCoreImpl<MaintenanceConfiguration, MaintenanceConfigurationImpl, MaintenanceConfigurationInner, MaintenanceConfigurationsInner, MaintenanceManager>  implements MaintenanceConfigurations {
    protected MaintenanceConfigurationsImpl(MaintenanceManager manager) {
        super(manager.inner().maintenanceConfigurations(), manager);
    }

    @Override
    protected Observable<MaintenanceConfigurationInner> getInnerAsync(String resourceGroupName, String name) {
        MaintenanceConfigurationsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        MaintenanceConfigurationsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<MaintenanceConfiguration> list() {
        MaintenanceConfigurationsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<MaintenanceConfiguration> listAsync() {
        MaintenanceConfigurationsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<MaintenanceConfigurationInner>, Observable<MaintenanceConfigurationInner>>() {
            @Override
            public Observable<MaintenanceConfigurationInner> call(Page<MaintenanceConfigurationInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<MaintenanceConfigurationInner, MaintenanceConfiguration>() {
            @Override
            public MaintenanceConfiguration call(MaintenanceConfigurationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public MaintenanceConfigurationImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected MaintenanceConfigurationImpl wrapModel(MaintenanceConfigurationInner inner) {
        return  new MaintenanceConfigurationImpl(inner.name(), inner, manager());
    }

    @Override
    protected MaintenanceConfigurationImpl wrapModel(String name) {
        return new MaintenanceConfigurationImpl(name, new MaintenanceConfigurationInner(), this.manager());
    }

}
