/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.graphrbac;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.graphrbac.implementation.GraphRbacManager;
import com.microsoft.azure.management.graphrbac.implementation.ServicePrincipalsInner;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByNameAsync;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;

/**
 * Entry point to service principal management API.
 */
@Fluent(ContainerName = "/Microsoft.Azure.Management.Fluent.Graph.RBAC")
@Beta
public interface ServicePrincipals extends
        SupportsListing<ServicePrincipal>,
        SupportsGettingById<ServicePrincipal>,
        SupportsGettingByNameAsync<ServicePrincipal>,
        HasManager<GraphRbacManager>,
        HasInner<ServicePrincipalsInner> {
}
