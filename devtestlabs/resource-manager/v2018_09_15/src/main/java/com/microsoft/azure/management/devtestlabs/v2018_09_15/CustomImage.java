/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.CustomImageInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.DevTestLabsManager;
import java.util.Map;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing CustomImage.
 */
public interface CustomImage extends HasInner<CustomImageInner>, Indexable, Refreshable<CustomImage>, Updatable<CustomImage.Update>, HasManager<DevTestLabsManager> {
    /**
     * @return the author value.
     */
    String author();

    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the customImagePlan value.
     */
    CustomImagePropertiesFromPlan customImagePlan();

    /**
     * @return the dataDiskStorageInfo value.
     */
    List<DataDiskStorageTypeInfo> dataDiskStorageInfo();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isPlanAuthorized value.
     */
    Boolean isPlanAuthorized();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the managedImageId value.
     */
    String managedImageId();

    /**
     * @return the managedSnapshotId value.
     */
    String managedSnapshotId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * @return the vhd value.
     */
    CustomImagePropertiesCustom vhd();

    /**
     * @return the vm value.
     */
    CustomImagePropertiesFromVm vm();

    /**
     * The entirety of the CustomImage definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLab, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of CustomImage definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a CustomImage definition.
         */
        interface Blank extends WithLab {
        }

        /**
         * The stage of the customimage definition allowing to specify Lab.
         */
        interface WithLab {
           /**
            * Specifies resourceGroupName, labName.
            * @param resourceGroupName The name of the resource group
            * @param labName The name of the lab
            * @return the next definition stage
            */
            WithCreate withExistingLab(String resourceGroupName, String labName);
        }

        /**
         * The stage of the customimage definition allowing to specify Author.
         */
        interface WithAuthor {
            /**
             * Specifies author.
             * @param author The author of the custom image
             * @return the next definition stage
             */
            WithCreate withAuthor(String author);
        }

        /**
         * The stage of the customimage definition allowing to specify CustomImagePlan.
         */
        interface WithCustomImagePlan {
            /**
             * Specifies customImagePlan.
             * @param customImagePlan Storage information about the plan related to this custom image
             * @return the next definition stage
             */
            WithCreate withCustomImagePlan(CustomImagePropertiesFromPlan customImagePlan);
        }

        /**
         * The stage of the customimage definition allowing to specify DataDiskStorageInfo.
         */
        interface WithDataDiskStorageInfo {
            /**
             * Specifies dataDiskStorageInfo.
             * @param dataDiskStorageInfo Storage information about the data disks present in the custom image
             * @return the next definition stage
             */
            WithCreate withDataDiskStorageInfo(List<DataDiskStorageTypeInfo> dataDiskStorageInfo);
        }

        /**
         * The stage of the customimage definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of the custom image
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the customimage definition allowing to specify IsPlanAuthorized.
         */
        interface WithIsPlanAuthorized {
            /**
             * Specifies isPlanAuthorized.
             * @param isPlanAuthorized Whether or not the custom images underlying offer/plan has been enabled for programmatic deployment
             * @return the next definition stage
             */
            WithCreate withIsPlanAuthorized(Boolean isPlanAuthorized);
        }

        /**
         * The stage of the customimage definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the customimage definition allowing to specify ManagedImageId.
         */
        interface WithManagedImageId {
            /**
             * Specifies managedImageId.
             * @param managedImageId The Managed Image Id backing the custom image
             * @return the next definition stage
             */
            WithCreate withManagedImageId(String managedImageId);
        }

        /**
         * The stage of the customimage definition allowing to specify ManagedSnapshotId.
         */
        interface WithManagedSnapshotId {
            /**
             * Specifies managedSnapshotId.
             * @param managedSnapshotId The Managed Snapshot Id backing the custom image
             * @return the next definition stage
             */
            WithCreate withManagedSnapshotId(String managedSnapshotId);
        }

        /**
         * The stage of the customimage definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the customimage definition allowing to specify Vhd.
         */
        interface WithVhd {
            /**
             * Specifies vhd.
             * @param vhd The VHD from which the image is to be created
             * @return the next definition stage
             */
            WithCreate withVhd(CustomImagePropertiesCustom vhd);
        }

        /**
         * The stage of the customimage definition allowing to specify Vm.
         */
        interface WithVm {
            /**
             * Specifies vm.
             * @param vm The virtual machine from which the image is to be created
             * @return the next definition stage
             */
            WithCreate withVm(CustomImagePropertiesFromVm vm);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<CustomImage>, DefinitionStages.WithAuthor, DefinitionStages.WithCustomImagePlan, DefinitionStages.WithDataDiskStorageInfo, DefinitionStages.WithDescription, DefinitionStages.WithIsPlanAuthorized, DefinitionStages.WithLocation, DefinitionStages.WithManagedImageId, DefinitionStages.WithManagedSnapshotId, DefinitionStages.WithTags, DefinitionStages.WithVhd, DefinitionStages.WithVm {
        }
    }
    /**
     * The template for a CustomImage update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<CustomImage>, UpdateStages.WithAuthor, UpdateStages.WithCustomImagePlan, UpdateStages.WithDataDiskStorageInfo, UpdateStages.WithDescription, UpdateStages.WithIsPlanAuthorized, UpdateStages.WithManagedImageId, UpdateStages.WithManagedSnapshotId, UpdateStages.WithTags, UpdateStages.WithVhd, UpdateStages.WithVm {
    }

    /**
     * Grouping of CustomImage update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the customimage update allowing to specify Author.
         */
        interface WithAuthor {
            /**
             * Specifies author.
             * @param author The author of the custom image
             * @return the next update stage
             */
            Update withAuthor(String author);
        }

        /**
         * The stage of the customimage update allowing to specify CustomImagePlan.
         */
        interface WithCustomImagePlan {
            /**
             * Specifies customImagePlan.
             * @param customImagePlan Storage information about the plan related to this custom image
             * @return the next update stage
             */
            Update withCustomImagePlan(CustomImagePropertiesFromPlanFragment customImagePlan);
        }

        /**
         * The stage of the customimage update allowing to specify DataDiskStorageInfo.
         */
        interface WithDataDiskStorageInfo {
            /**
             * Specifies dataDiskStorageInfo.
             * @param dataDiskStorageInfo Storage information about the data disks present in the custom image
             * @return the next update stage
             */
            Update withDataDiskStorageInfoFragment(List<DataDiskStorageTypeInfoFragment> dataDiskStorageInfo);
        }

        /**
         * The stage of the customimage update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of the custom image
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the customimage update allowing to specify IsPlanAuthorized.
         */
        interface WithIsPlanAuthorized {
            /**
             * Specifies isPlanAuthorized.
             * @param isPlanAuthorized Whether or not the custom images underlying offer/plan has been enabled for programmatic deployment
             * @return the next update stage
             */
            Update withIsPlanAuthorized(Boolean isPlanAuthorized);
        }

        /**
         * The stage of the customimage update allowing to specify ManagedImageId.
         */
        interface WithManagedImageId {
            /**
             * Specifies managedImageId.
             * @param managedImageId The Managed Image Id backing the custom image
             * @return the next update stage
             */
            Update withManagedImageId(String managedImageId);
        }

        /**
         * The stage of the customimage update allowing to specify ManagedSnapshotId.
         */
        interface WithManagedSnapshotId {
            /**
             * Specifies managedSnapshotId.
             * @param managedSnapshotId The Managed Snapshot Id backing the custom image
             * @return the next update stage
             */
            Update withManagedSnapshotId(String managedSnapshotId);
        }

        /**
         * The stage of the customimage update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the customimage update allowing to specify Vhd.
         */
        interface WithVhd {
            /**
             * Specifies vhd.
             * @param vhd The VHD from which the image is to be created
             * @return the next update stage
             */
            Update withVhd(CustomImagePropertiesCustomFragment vhd);
        }

        /**
         * The stage of the customimage update allowing to specify Vm.
         */
        interface WithVm {
            /**
             * Specifies vm.
             * @param vm The virtual machine from which the image is to be created
             * @return the next update stage
             */
            Update withVm(CustomImagePropertiesFromVmFragment vm);
        }

    }
}
