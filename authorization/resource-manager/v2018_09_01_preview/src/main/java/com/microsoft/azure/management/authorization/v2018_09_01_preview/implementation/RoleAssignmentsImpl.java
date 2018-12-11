/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.authorization.v2018_09_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.RoleAssignments;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.RoleAssignment;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.RoleAssignmentCreateParameters;

class RoleAssignmentsImpl extends WrapperImpl<RoleAssignmentsInner> implements RoleAssignments {
    private final AuthorizationManager manager;

    RoleAssignmentsImpl(AuthorizationManager manager) {
        super(manager.inner().roleAssignments());
        this.manager = manager;
    }

    public AuthorizationManager manager() {
        return this.manager;
    }

    @Override
    public RoleAssignmentImpl define(String name) {
        return wrapModel(name);
    }

    private RoleAssignmentImpl wrapModel(RoleAssignmentInner inner) {
        return  new RoleAssignmentImpl(inner, manager());
    }

    private RoleAssignmentImpl wrapModel(String name) {
        return new RoleAssignmentImpl(name, this.manager());
    }

    @Override
    public Observable<RoleAssignment> listForResourceAsync(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName) {
        RoleAssignmentsInner client = this.inner();
        return client.listForResourceAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName)
        .flatMapIterable(new Func1<Page<RoleAssignmentInner>, Iterable<RoleAssignmentInner>>() {
            @Override
            public Iterable<RoleAssignmentInner> call(Page<RoleAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RoleAssignment> deleteAsync(String scope, String roleAssignmentName) {
        RoleAssignmentsInner client = this.inner();
        return client.deleteAsync(scope, roleAssignmentName)
        .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RoleAssignment> getAsync(String scope, String roleAssignmentName) {
        RoleAssignmentsInner client = this.inner();
        return client.getAsync(scope, roleAssignmentName)
        .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RoleAssignment> deleteByIdAsync(String roleId) {
        RoleAssignmentsInner client = this.inner();
        return client.deleteByIdAsync(roleId)
        .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RoleAssignment> createByIdAsync(String roleId, RoleAssignmentCreateParameters parameters) {
        RoleAssignmentsInner client = this.inner();
        return client.createByIdAsync(roleId, parameters)
        .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RoleAssignment> getByIdAsync(String roleId) {
        RoleAssignmentsInner client = this.inner();
        return client.getByIdAsync(roleId)
        .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RoleAssignment> listByResourceGroupAsync(final String resourceGroupName) {
        RoleAssignmentsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<RoleAssignmentInner>, Iterable<RoleAssignmentInner>>() {
            @Override
            public Iterable<RoleAssignmentInner> call(Page<RoleAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RoleAssignment> listAsync() {
        RoleAssignmentsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<RoleAssignmentInner>, Iterable<RoleAssignmentInner>>() {
            @Override
            public Iterable<RoleAssignmentInner> call(Page<RoleAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RoleAssignment> listForScopeAsync(final String scope) {
        RoleAssignmentsInner client = this.inner();
        return client.listForScopeAsync(scope)
        .flatMapIterable(new Func1<Page<RoleAssignmentInner>, Iterable<RoleAssignmentInner>>() {
            @Override
            public Iterable<RoleAssignmentInner> call(Page<RoleAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

}
