/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mysql.v2017_12_01.implementation.VirtualNetworkRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mysql.v2017_12_01.implementation.MySQLManager;

/**
 * Type representing VirtualNetworkRule.
 */
public interface VirtualNetworkRule extends HasInner<VirtualNetworkRuleInner>, Indexable, Refreshable<VirtualNetworkRule>, Updatable<VirtualNetworkRule.Update>, HasManager<MySQLManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ignoreMissingVnetServiceEndpoint value.
     */
    Boolean ignoreMissingVnetServiceEndpoint();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the state value.
     */
    VirtualNetworkRuleState state();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the virtualNetworkSubnetId value.
     */
    String virtualNetworkSubnetId();

    /**
     * The entirety of the VirtualNetworkRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithVirtualNetworkSubnetId, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualNetworkRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualNetworkRule definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the virtualnetworkrule definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            */
            WithVirtualNetworkSubnetId withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the virtualnetworkrule definition allowing to specify VirtualNetworkSubnetId.
         */
        interface WithVirtualNetworkSubnetId {
           /**
            * Specifies virtualNetworkSubnetId.
            */
            WithCreate withVirtualNetworkSubnetId(String virtualNetworkSubnetId);
        }

        /**
         * The stage of the virtualnetworkrule definition allowing to specify IgnoreMissingVnetServiceEndpoint.
         */
        interface WithIgnoreMissingVnetServiceEndpoint {
            /**
             * Specifies ignoreMissingVnetServiceEndpoint.
             */
            WithCreate withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualNetworkRule>, DefinitionStages.WithIgnoreMissingVnetServiceEndpoint {
        }
    }
    /**
     * The template for a VirtualNetworkRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualNetworkRule>, UpdateStages.WithIgnoreMissingVnetServiceEndpoint {
    }

    /**
     * Grouping of VirtualNetworkRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualnetworkrule update allowing to specify IgnoreMissingVnetServiceEndpoint.
         */
        interface WithIgnoreMissingVnetServiceEndpoint {
            /**
             * Specifies ignoreMissingVnetServiceEndpoint.
             */
            Update withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint);
        }

    }
}
