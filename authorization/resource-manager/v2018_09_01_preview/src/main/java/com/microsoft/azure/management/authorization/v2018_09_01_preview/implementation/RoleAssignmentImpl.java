/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2018_09_01_preview.implementation;

import com.microsoft.azure.management.authorization.v2018_09_01_preview.RoleAssignment;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.RoleAssignmentCreateParameters;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.PrincipalType;
import rx.functions.Func1;

class RoleAssignmentImpl extends CreatableUpdatableImpl<RoleAssignment, RoleAssignmentInner, RoleAssignmentImpl> implements RoleAssignment, RoleAssignment.Definition, RoleAssignment.Update {
    private final AuthorizationManager manager;
    private String scope;
    private String roleAssignmentName;
    private RoleAssignmentCreateParameters createOrUpdateParameter;

    RoleAssignmentImpl(String name, AuthorizationManager manager) {
        super(name, new RoleAssignmentInner());
        this.manager = manager;
        // Set resource name
        this.roleAssignmentName = name;
        //
        this.createOrUpdateParameter = new RoleAssignmentCreateParameters();
    }

    RoleAssignmentImpl(RoleAssignmentInner inner, AuthorizationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.roleAssignmentName = inner.name();
        // set resource ancestor and positional variables
        this.roleAssignmentName = IdParsingUtils.getValueFromIdByName(inner.id(), "roleAssignments");
        this.scope = IdParsingUtils.getValueFromIdByPosition(inner.id(), 0);
        //
        this.createOrUpdateParameter = new RoleAssignmentCreateParameters();
    }

    @Override
    public AuthorizationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RoleAssignment> createResourceAsync() {
        RoleAssignmentsInner client = this.manager().inner().roleAssignments();
        return client.createAsync(this.scope, this.roleAssignmentName, this.createOrUpdateParameter)
            .map(new Func1<RoleAssignmentInner, RoleAssignmentInner>() {
               @Override
               public RoleAssignmentInner call(RoleAssignmentInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<RoleAssignment> updateResourceAsync() {
        RoleAssignmentsInner client = this.manager().inner().roleAssignments();
        return client.createAsync(this.scope, this.roleAssignmentName, this.createOrUpdateParameter)
            .map(new Func1<RoleAssignmentInner, RoleAssignmentInner>() {
               @Override
               public RoleAssignmentInner call(RoleAssignmentInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RoleAssignmentInner> getInnerAsync() {
        RoleAssignmentsInner client = this.manager().inner().roleAssignments();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new RoleAssignmentCreateParameters();
    }

    @Override
    public Boolean canDelegate() {
        return this.inner().canDelegate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String principalId() {
        return this.inner().principalId();
    }

    @Override
    public String roleDefinitionId() {
        return this.inner().roleDefinitionId();
    }

    @Override
    public String scope() {
        return this.inner().scope();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public RoleAssignmentImpl withExistingProvider() {
        return this;
    }

    @Override
    public RoleAssignmentImpl withScope(String scope) {
        this.scope = scope;
        return this;
    }

    @Override
    public RoleAssignmentImpl withPrincipalId(String principalId) {
        this.createOrUpdateParameter.withPrincipalId(principalId);
        return this;
    }

    @Override
    public RoleAssignmentImpl withRoleDefinitionId(String roleDefinitionId) {
        this.createOrUpdateParameter.withRoleDefinitionId(roleDefinitionId);
        return this;
    }

    @Override
    public RoleAssignmentImpl withCanDelegate(Boolean canDelegate) {
        this.createOrUpdateParameter.withCanDelegate(canDelegate);
        return this;
    }

    @Override
    public RoleAssignmentImpl withPrincipalType(PrincipalType principalType) {
        this.createOrUpdateParameter.withPrincipalType(principalType);
        return this;
    }

}
