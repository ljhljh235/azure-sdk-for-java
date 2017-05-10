/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.graphrbac.implementation;

import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.graphrbac.Application;
import com.microsoft.azure.management.graphrbac.Applications;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.CreatableWrappersImpl;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;

/**
 * The implementation of Applications and its parent interfaces.
 */
@LangDefinition(ContainerName = "/Microsoft.Azure.Management.Fluent.Graph.RBAC")
class ApplicationsImpl
        extends CreatableWrappersImpl<
            Application,
            ApplicationImpl,
            ApplicationInner>
        implements
            Applications,
            HasManager<GraphRbacManager>,
            HasInner<ApplicationsInner> {
    private ApplicationsInner innerCollection;
    private GraphRbacManager manager;

    ApplicationsImpl(
            final ApplicationsInner client,
            final GraphRbacManager graphRbacManager) {
        this.innerCollection = client;
        this.manager = graphRbacManager;
    }

    @Override
    public PagedList<Application> list() {
        return wrapList(this.innerCollection.list());
    }

    @Override
    public Observable<Application> listAsync() {
        return wrapPageAsync(this.inner().listAsync());
    }

    @Override
    protected ApplicationImpl wrapModel(ApplicationInner applicationInner) {
        if (applicationInner == null) {
            return null;
        }
        return new ApplicationImpl(applicationInner, manager());
    }

    @Override
    public ApplicationImpl getById(String id) {
        return (ApplicationImpl) getByIdAsync(id).toBlocking().single();
    }

    @Override
    public Observable<Application> getByIdAsync(String id) {
        return innerCollection.getAsync(id)
                .map(new Func1<ApplicationInner, Application>() {
                    @Override
                    public Application call(ApplicationInner applicationInner) {
                        if (applicationInner == null) {
                            return null;
                        }
                        return new ApplicationImpl(applicationInner, manager());
                    }
                });
    }

    @Override
    public ServiceFuture<Application> getByIdAsync(String id, ServiceCallback<Application> callback) {
        return ServiceFuture.fromBody(getByIdAsync(id), callback);
    }

    @Override
    public Application getByName(String spn) {
        return getByNameAsync(spn).toBlocking().single();
    }

    @Override
    public Observable<Application> getByNameAsync(final String name) {
        return innerCollection.listWithServiceResponseAsync(String.format("appId eq '%s'", name))
                .flatMap(new Func1<ServiceResponse<Page<ApplicationInner>>, Observable<Page<ApplicationInner>>>() {
                    @Override
                    public Observable<Page<ApplicationInner>> call(ServiceResponse<Page<ApplicationInner>> result) {
                        if (result == null || result.body().items() == null || result.body().items().isEmpty()) {
                            return innerCollection.listAsync(String.format("displayName eq '%s'", name));
                        }
                        return Observable.just(result.body());
                    }
                }).map(new Func1<Page<ApplicationInner>, Application>() {
                    @Override
                    public Application call(Page<ApplicationInner> result) {
                        if (result == null || result.items() == null || result.items().isEmpty()) {
                            return null;
                        }
                        return new ApplicationImpl(result.items().get(0), manager());
                    }
                });
    }

    @Override
    public GraphRbacManager manager() {
        return this.manager;
    }

    @Override
    public ApplicationsInner inner() {
        return this.innerCollection;
    }

    @Override
    protected ApplicationImpl wrapModel(String name) {
        return new ApplicationImpl(new ApplicationInner().withDisplayName(name), manager());
    }

    @Override
    public Completable deleteByIdAsync(String id) {
        return inner().deleteAsync(id).toCompletable();
    }

    @Override
    public ApplicationImpl define(String name) {
        return wrapModel(name);
    }
}
