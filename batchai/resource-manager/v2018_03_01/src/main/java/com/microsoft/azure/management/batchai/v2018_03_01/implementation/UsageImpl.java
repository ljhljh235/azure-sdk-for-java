/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01.implementation;

import com.microsoft.azure.management.batchai.v2018_03_01.Usage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.batchai.v2018_03_01.UsageName;

class UsageImpl extends WrapperImpl<UsageInner> implements Usage {
    private final BatchAIManager manager;

    UsageImpl(UsageInner inner,  BatchAIManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BatchAIManager manager() {
        return this.manager;
    }



    @Override
    public int currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public long limit() {
        return this.inner().limit();
    }

    @Override
    public UsageName name() {
        return this.inner().name();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
