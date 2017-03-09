/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.appservice;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.resources.fluentcore.arm.models.GroupableResource;
import com.microsoft.azure.management.resources.fluentcore.model.Appliable;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.model.Refreshable;
import com.microsoft.azure.management.resources.fluentcore.model.Updatable;

/**
 * An immutable client-side representation of an Azure Web App.
 */
@Fluent(ContainerName = "/Microsoft.Azure.Management.AppService.Fluent")
public interface WebApp extends
        WebAppBase,
        Refreshable<WebApp>,
        Updatable<WebApp.Update> {
    /**
     * @return the entry point to deployment slot management API under the web app
     */
    DeploymentSlots deploymentSlots();

    /**************************************************************
     * Fluent interfaces to provision a Web App
     **************************************************************/

    /**
     * Container interface for all the definitions that need to be implemented.
     */
    interface Definition extends
            DefinitionStages.Blank,
            DefinitionStages.WithAppServicePlan,
            DefinitionStages.WithNewAppServicePlan,
            DefinitionStages.WithCreate {
    }

    /**
     * Grouping of all the web app definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the web app definition.
         */
        interface Blank extends GroupableResource.DefinitionStages.WithGroupAndRegion<WithAppServicePlan> {
        }

        /**
         * A web app definition allowing app service plan to be set.
         */
        interface WithAppServicePlan {
            /**
             * Creates a new app service plan to use.
             * @return the next stage of the web app definition
             * @param name the name of the app service plan
             * @param region the region of the app service plan
             */
            WithNewAppServicePlan withNewAppServicePlan(String name, Region region);
            /**
             * Creates a new app service plan to use.
             * @return the next stage of the web app definition
             * @param name the name of the app service plan
             * @param regionName the region of the app service plan
             */
            WithNewAppServicePlan withNewAppServicePlan(String name, String regionName);

            /**
             * Uses an existing app service plan for the web app.
             * @param appServicePlan the existing app service plan
             * @return the next stage of the web app definition
             */
            WithCreate withExistingAppServicePlan(AppServicePlan appServicePlan);
        }

        /**
         * As web app definition allowing more information of a new app service plan to be set.
         */
        interface WithNewAppServicePlan {
            /**
             * Creates a new free app service plan to use. No custom domains or SSL bindings are available in this plan.
             * @return the next stage of the web app definition
             */
            WithCreate withFreePricingTier();

            /**
             * Creates a new app service plan to use.
             * @param pricingTier the pricing tier to use
             * @return the next stage of the web app definition
             */
            WithCreate withPricingTier(AppServicePricingTier pricingTier);
        }

        /**
         * A site definition with sufficient inputs to create a new web app /
         * deployments slot in the cloud, but exposing additional optional
         * inputs to specify.
         */
        interface WithCreate extends
            Creatable<WebApp>,
            WebAppBase.DefinitionStages.WithCreate<WebApp> {
        }
    }

    /**
     * Grouping of all the web app update stages.
     */
    interface UpdateStages {
        /**
         * A web app update allowing app service plan to be set.
         */
        interface WithAppServicePlan {
            /**
             * Creates a new app service plan to use.
             * @return the next stage of the web app definition
             * @param name the name of the app service plan
             */
            WithNewAppServicePlan withNewAppServicePlan(String name);

            /**
             * Uses an existing app service plan for the web app.
             * @param appServicePlan the existing app service plan
             * @return the next stage of the web app update
             */
            Update withExistingAppServicePlan(AppServicePlan appServicePlan);
        }

        /**
         * As web app update allowing more information of a new app service plan to be set.
         */
        interface WithNewAppServicePlan {
            /**
             * Creates a new free app service plan to use. No custom domains or SSL bindings are available in this plan.
             * @return the next stage of the web app update
             */
            Update withFreePricingTier();

            /**
             * Creates a new app service plan to use.
             * @param pricingTier the pricing tier to use
             * @return the next stage of the web app update
             */
            Update withPricingTier(AppServicePricingTier pricingTier);
        }
    }

    /**
     * The template for a web app update operation, containing all the settings that can be modified.
     */
    interface Update extends
        Appliable<WebApp>,
        UpdateStages.WithAppServicePlan,
        WebAppBase.Update<WebApp> {
    }
}