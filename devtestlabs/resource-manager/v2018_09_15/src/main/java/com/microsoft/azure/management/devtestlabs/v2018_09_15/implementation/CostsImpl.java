/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Costs;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.LabCost;

class CostsImpl extends WrapperImpl<CostsInner> implements Costs {
    private final DevTestLabsManager manager;

    CostsImpl(DevTestLabsManager manager) {
        super(manager.inner().costs());
        this.manager = manager;
    }

    public DevTestLabsManager manager() {
        return this.manager;
    }

    @Override
    public LabCostImpl define(String name) {
        return wrapModel(name);
    }

    private LabCostImpl wrapModel(LabCostInner inner) {
        return  new LabCostImpl(inner, manager());
    }

    private LabCostImpl wrapModel(String name) {
        return new LabCostImpl(name, this.manager());
    }

    @Override
    public Observable<LabCost> getAsync(String resourceGroupName, String labName, String name) {
        CostsInner client = this.inner();
        return client.getAsync(resourceGroupName, labName, name)
        .flatMap(new Func1<LabCostInner, Observable<LabCost>>() {
            @Override
            public Observable<LabCost> call(LabCostInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((LabCost)wrapModel(inner));
                }
            }
       });
    }

}
