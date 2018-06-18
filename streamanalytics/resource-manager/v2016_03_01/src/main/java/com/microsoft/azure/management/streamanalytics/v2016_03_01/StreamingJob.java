/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation.StreamAnalyticsManager;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation.FunctionInner;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation.InputInner;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation.OutputInner;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation.TransformationInner;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation.StreamingJobInner;

/**
 * Type representing StreamingJob.
 */
public interface StreamingJob extends HasInner<StreamingJobInner>, Resource, GroupableResourceCore<StreamAnalyticsManager, StreamingJobInner>, HasResourceGroup, Refreshable<StreamingJob>, Updatable<StreamingJob.Update>, HasManager<StreamAnalyticsManager> {
    /**
     * @return the compatibilityLevel value.
     */
    CompatibilityLevel compatibilityLevel();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the dataLocale value.
     */
    String dataLocale();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the eventsLateArrivalMaxDelayInSeconds value.
     */
    Integer eventsLateArrivalMaxDelayInSeconds();

    /**
     * @return the eventsOutOfOrderMaxDelayInSeconds value.
     */
    Integer eventsOutOfOrderMaxDelayInSeconds();

    /**
     * @return the eventsOutOfOrderPolicy value.
     */
    EventsOutOfOrderPolicy eventsOutOfOrderPolicy();

    /**
     * @return the functions value.
     */
    List<Function> functions();

    /**
     * @return the inputs value.
     */
    List<Input> inputs();

    /**
     * @return the jobId value.
     */
    String jobId();

    /**
     * @return the jobState value.
     */
    String jobState();

    /**
     * @return the lastOutputEventTime value.
     */
    DateTime lastOutputEventTime();

    /**
     * @return the outputErrorPolicy value.
     */
    OutputErrorPolicy outputErrorPolicy();

    /**
     * @return the outputs value.
     */
    List<Output> outputs();

    /**
     * @return the outputStartMode value.
     */
    OutputStartMode outputStartMode();

    /**
     * @return the outputStartTime value.
     */
    DateTime outputStartTime();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the transformation value.
     */
    Transformation transformation();

    /**
     * The entirety of the StreamingJob definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StreamingJob definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StreamingJob definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the StreamingJob definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the streamingjob update allowing to specify CompatibilityLevel.
         */
        interface WithCompatibilityLevel {
            /**
             * Specifies compatibilityLevel.
             */
            WithCreate withCompatibilityLevel(CompatibilityLevel compatibilityLevel);
        }

        /**
         * The stage of the streamingjob update allowing to specify DataLocale.
         */
        interface WithDataLocale {
            /**
             * Specifies dataLocale.
             */
            WithCreate withDataLocale(String dataLocale);
        }

        /**
         * The stage of the streamingjob update allowing to specify EventsLateArrivalMaxDelayInSeconds.
         */
        interface WithEventsLateArrivalMaxDelayInSeconds {
            /**
             * Specifies eventsLateArrivalMaxDelayInSeconds.
             */
            WithCreate withEventsLateArrivalMaxDelayInSeconds(Integer eventsLateArrivalMaxDelayInSeconds);
        }

        /**
         * The stage of the streamingjob update allowing to specify EventsOutOfOrderMaxDelayInSeconds.
         */
        interface WithEventsOutOfOrderMaxDelayInSeconds {
            /**
             * Specifies eventsOutOfOrderMaxDelayInSeconds.
             */
            WithCreate withEventsOutOfOrderMaxDelayInSeconds(Integer eventsOutOfOrderMaxDelayInSeconds);
        }

        /**
         * The stage of the streamingjob update allowing to specify EventsOutOfOrderPolicy.
         */
        interface WithEventsOutOfOrderPolicy {
            /**
             * Specifies eventsOutOfOrderPolicy.
             */
            WithCreate withEventsOutOfOrderPolicy(EventsOutOfOrderPolicy eventsOutOfOrderPolicy);
        }

        /**
         * The stage of the streamingjob update allowing to specify Functions.
         */
        interface WithFunctions {
            /**
             * Specifies functions.
             */
            WithCreate withFunctions(List<FunctionInner> functions);
        }

        /**
         * The stage of the streamingjob update allowing to specify Inputs.
         */
        interface WithInputs {
            /**
             * Specifies inputs.
             */
            WithCreate withInputs(List<InputInner> inputs);
        }

        /**
         * The stage of the streamingjob update allowing to specify OutputErrorPolicy.
         */
        interface WithOutputErrorPolicy {
            /**
             * Specifies outputErrorPolicy.
             */
            WithCreate withOutputErrorPolicy(OutputErrorPolicy outputErrorPolicy);
        }

        /**
         * The stage of the streamingjob update allowing to specify Outputs.
         */
        interface WithOutputs {
            /**
             * Specifies outputs.
             */
            WithCreate withOutputs(List<OutputInner> outputs);
        }

        /**
         * The stage of the streamingjob update allowing to specify OutputStartMode.
         */
        interface WithOutputStartMode {
            /**
             * Specifies outputStartMode.
             */
            WithCreate withOutputStartMode(OutputStartMode outputStartMode);
        }

        /**
         * The stage of the streamingjob update allowing to specify OutputStartTime.
         */
        interface WithOutputStartTime {
            /**
             * Specifies outputStartTime.
             */
            WithCreate withOutputStartTime(DateTime outputStartTime);
        }

        /**
         * The stage of the streamingjob update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the streamingjob update allowing to specify Transformation.
         */
        interface WithTransformation {
            /**
             * Specifies transformation.
             */
            WithCreate withTransformation(TransformationInner transformation);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StreamingJob>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithCompatibilityLevel, DefinitionStages.WithDataLocale, DefinitionStages.WithEventsLateArrivalMaxDelayInSeconds, DefinitionStages.WithEventsOutOfOrderMaxDelayInSeconds, DefinitionStages.WithEventsOutOfOrderPolicy, DefinitionStages.WithFunctions, DefinitionStages.WithInputs, DefinitionStages.WithOutputErrorPolicy, DefinitionStages.WithOutputs, DefinitionStages.WithOutputStartMode, DefinitionStages.WithOutputStartTime, DefinitionStages.WithSku, DefinitionStages.WithTransformation {
        }
    }
    /**
     * The template for a StreamingJob update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StreamingJob>, Resource.UpdateWithTags<Update>, UpdateStages.WithCompatibilityLevel, UpdateStages.WithDataLocale, UpdateStages.WithEventsLateArrivalMaxDelayInSeconds, UpdateStages.WithEventsOutOfOrderMaxDelayInSeconds, UpdateStages.WithEventsOutOfOrderPolicy, UpdateStages.WithFunctions, UpdateStages.WithInputs, UpdateStages.WithOutputErrorPolicy, UpdateStages.WithOutputs, UpdateStages.WithOutputStartMode, UpdateStages.WithOutputStartTime, UpdateStages.WithSku, UpdateStages.WithTransformation {
    }

    /**
     * Grouping of StreamingJob update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the streamingjob {0} allowing to specify CompatibilityLevel.
         */
        interface WithCompatibilityLevel {
            /**
             * Specifies compatibilityLevel.
             */
            Update withCompatibilityLevel(CompatibilityLevel compatibilityLevel);
        }

        /**
         * The stage of the streamingjob {0} allowing to specify DataLocale.
         */
        interface WithDataLocale {
            /**
             * Specifies dataLocale.
             */
            Update withDataLocale(String dataLocale);
        }

        /**
         * The stage of the streamingjob {0} allowing to specify EventsLateArrivalMaxDelayInSeconds.
         */
        interface WithEventsLateArrivalMaxDelayInSeconds {
            /**
             * Specifies eventsLateArrivalMaxDelayInSeconds.
             */
            Update withEventsLateArrivalMaxDelayInSeconds(Integer eventsLateArrivalMaxDelayInSeconds);
        }

        /**
         * The stage of the streamingjob {0} allowing to specify EventsOutOfOrderMaxDelayInSeconds.
         */
        interface WithEventsOutOfOrderMaxDelayInSeconds {
            /**
             * Specifies eventsOutOfOrderMaxDelayInSeconds.
             */
            Update withEventsOutOfOrderMaxDelayInSeconds(Integer eventsOutOfOrderMaxDelayInSeconds);
        }

        /**
         * The stage of the streamingjob {0} allowing to specify EventsOutOfOrderPolicy.
         */
        interface WithEventsOutOfOrderPolicy {
            /**
             * Specifies eventsOutOfOrderPolicy.
             */
            Update withEventsOutOfOrderPolicy(EventsOutOfOrderPolicy eventsOutOfOrderPolicy);
        }

        /**
         * The stage of the streamingjob {0} allowing to specify Functions.
         */
        interface WithFunctions {
            /**
             * Specifies functions.
             */
            Update withFunctions(List<FunctionInner> functions);
        }

        /**
         * The stage of the streamingjob {0} allowing to specify Inputs.
         */
        interface WithInputs {
            /**
             * Specifies inputs.
             */
            Update withInputs(List<InputInner> inputs);
        }

        /**
         * The stage of the streamingjob {0} allowing to specify OutputErrorPolicy.
         */
        interface WithOutputErrorPolicy {
            /**
             * Specifies outputErrorPolicy.
             */
            Update withOutputErrorPolicy(OutputErrorPolicy outputErrorPolicy);
        }

        /**
         * The stage of the streamingjob {0} allowing to specify Outputs.
         */
        interface WithOutputs {
            /**
             * Specifies outputs.
             */
            Update withOutputs(List<OutputInner> outputs);
        }

        /**
         * The stage of the streamingjob {0} allowing to specify OutputStartMode.
         */
        interface WithOutputStartMode {
            /**
             * Specifies outputStartMode.
             */
            Update withOutputStartMode(OutputStartMode outputStartMode);
        }

        /**
         * The stage of the streamingjob {0} allowing to specify OutputStartTime.
         */
        interface WithOutputStartTime {
            /**
             * Specifies outputStartTime.
             */
            Update withOutputStartTime(DateTime outputStartTime);
        }

        /**
         * The stage of the streamingjob {0} allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the streamingjob {0} allowing to specify Transformation.
         */
        interface WithTransformation {
            /**
             * Specifies transformation.
             */
            Update withTransformation(TransformationInner transformation);
        }

    }
}
