// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.BackupPolicyInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of BackupPolicy. */
public interface BackupPolicy {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the namePropertiesName property: Name of backup policy.
     *
     * @return the namePropertiesName value.
     */
    String namePropertiesName();

    /**
     * Gets the backupPolicyId property: Backup Policy Resource ID.
     *
     * @return the backupPolicyId value.
     */
    String backupPolicyId();

    /**
     * Gets the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the dailyBackupsToKeep property: Daily backups count to keep.
     *
     * @return the dailyBackupsToKeep value.
     */
    Integer dailyBackupsToKeep();

    /**
     * Gets the weeklyBackupsToKeep property: Weekly backups count to keep.
     *
     * @return the weeklyBackupsToKeep value.
     */
    Integer weeklyBackupsToKeep();

    /**
     * Gets the monthlyBackupsToKeep property: Monthly backups count to keep.
     *
     * @return the monthlyBackupsToKeep value.
     */
    Integer monthlyBackupsToKeep();

    /**
     * Gets the volumesAssigned property: Volumes using current backup policy.
     *
     * @return the volumesAssigned value.
     */
    Integer volumesAssigned();

    /**
     * Gets the enabled property: The property to decide policy is enabled or not.
     *
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the volumeBackups property: A list of volumes assigned to this policy.
     *
     * @return the volumeBackups value.
     */
    List<VolumeBackups> volumeBackups();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.netapp.fluent.models.BackupPolicyInner object.
     *
     * @return the inner object.
     */
    BackupPolicyInner innerModel();

    /** The entirety of the BackupPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The BackupPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the BackupPolicy definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the BackupPolicy definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the BackupPolicy definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param accountName The name of the NetApp account.
             * @return the next definition stage.
             */
            WithCreate withExistingNetAppAccount(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the BackupPolicy definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithDailyBackupsToKeep,
                DefinitionStages.WithWeeklyBackupsToKeep,
                DefinitionStages.WithMonthlyBackupsToKeep,
                DefinitionStages.WithEnabled {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BackupPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BackupPolicy create(Context context);
        }
        /** The stage of the BackupPolicy definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the BackupPolicy definition allowing to specify dailyBackupsToKeep. */
        interface WithDailyBackupsToKeep {
            /**
             * Specifies the dailyBackupsToKeep property: Daily backups count to keep.
             *
             * @param dailyBackupsToKeep Daily backups count to keep.
             * @return the next definition stage.
             */
            WithCreate withDailyBackupsToKeep(Integer dailyBackupsToKeep);
        }
        /** The stage of the BackupPolicy definition allowing to specify weeklyBackupsToKeep. */
        interface WithWeeklyBackupsToKeep {
            /**
             * Specifies the weeklyBackupsToKeep property: Weekly backups count to keep.
             *
             * @param weeklyBackupsToKeep Weekly backups count to keep.
             * @return the next definition stage.
             */
            WithCreate withWeeklyBackupsToKeep(Integer weeklyBackupsToKeep);
        }
        /** The stage of the BackupPolicy definition allowing to specify monthlyBackupsToKeep. */
        interface WithMonthlyBackupsToKeep {
            /**
             * Specifies the monthlyBackupsToKeep property: Monthly backups count to keep.
             *
             * @param monthlyBackupsToKeep Monthly backups count to keep.
             * @return the next definition stage.
             */
            WithCreate withMonthlyBackupsToKeep(Integer monthlyBackupsToKeep);
        }
        /** The stage of the BackupPolicy definition allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: The property to decide policy is enabled or not.
             *
             * @param enabled The property to decide policy is enabled or not.
             * @return the next definition stage.
             */
            WithCreate withEnabled(Boolean enabled);
        }
    }
    /**
     * Begins update for the BackupPolicy resource.
     *
     * @return the stage of resource update.
     */
    BackupPolicy.Update update();

    /** The template for BackupPolicy update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithDailyBackupsToKeep,
            UpdateStages.WithWeeklyBackupsToKeep,
            UpdateStages.WithMonthlyBackupsToKeep,
            UpdateStages.WithEnabled {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BackupPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BackupPolicy apply(Context context);
    }
    /** The BackupPolicy update stages. */
    interface UpdateStages {
        /** The stage of the BackupPolicy update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the BackupPolicy update allowing to specify dailyBackupsToKeep. */
        interface WithDailyBackupsToKeep {
            /**
             * Specifies the dailyBackupsToKeep property: Daily backups count to keep.
             *
             * @param dailyBackupsToKeep Daily backups count to keep.
             * @return the next definition stage.
             */
            Update withDailyBackupsToKeep(Integer dailyBackupsToKeep);
        }
        /** The stage of the BackupPolicy update allowing to specify weeklyBackupsToKeep. */
        interface WithWeeklyBackupsToKeep {
            /**
             * Specifies the weeklyBackupsToKeep property: Weekly backups count to keep.
             *
             * @param weeklyBackupsToKeep Weekly backups count to keep.
             * @return the next definition stage.
             */
            Update withWeeklyBackupsToKeep(Integer weeklyBackupsToKeep);
        }
        /** The stage of the BackupPolicy update allowing to specify monthlyBackupsToKeep. */
        interface WithMonthlyBackupsToKeep {
            /**
             * Specifies the monthlyBackupsToKeep property: Monthly backups count to keep.
             *
             * @param monthlyBackupsToKeep Monthly backups count to keep.
             * @return the next definition stage.
             */
            Update withMonthlyBackupsToKeep(Integer monthlyBackupsToKeep);
        }
        /** The stage of the BackupPolicy update allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: The property to decide policy is enabled or not.
             *
             * @param enabled The property to decide policy is enabled or not.
             * @return the next definition stage.
             */
            Update withEnabled(Boolean enabled);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BackupPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BackupPolicy refresh(Context context);
}
