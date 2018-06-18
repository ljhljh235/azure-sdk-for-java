/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.batchai.v2018_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.batchai.v2018_03_01.Usages;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.batchai.v2018_03_01.Usage;

class UsagesImpl extends WrapperImpl<UsagesInner> implements Usages {
    private final BatchAIManager manager;

    UsagesImpl(BatchAIManager manager) {
        super(manager.inner().usages());
        this.manager = manager;
    }

    public BatchAIManager manager() {
        return this.manager;
    }

    private UsageImpl wrapModel(UsageInner inner) {
        return  new UsageImpl(inner, manager());
    }

    private Observable<Page<UsageInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        UsagesInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<UsageInner>, Observable<Page<UsageInner>>>() {
            @Override
            public Observable<Page<UsageInner>> call(Page<UsageInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<Usage> listAsync(final String location) {
        UsagesInner client = this.inner();
        return client.listAsync(location)
        .flatMap(new Func1<Page<UsageInner>, Observable<Page<UsageInner>>>() {
            @Override
            public Observable<Page<UsageInner>> call(Page<UsageInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<UsageInner>, Iterable<UsageInner>>() {
            @Override
            public Iterable<UsageInner> call(Page<UsageInner> page) {
                return page.items();
            }
       })
        .map(new Func1<UsageInner, Usage>() {
            @Override
            public Usage call(UsageInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
