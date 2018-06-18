/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.implementation.TopicsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Topics.
 */
public interface Topics extends SupportsCreating<Topic.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Topic>, SupportsListingByResourceGroup<Topic>, SupportsListing<Topic>, HasInner<TopicsInner> {
    /**
     * List keys for a topic.
     * List the two keys used to publish to a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicName Name of the topic
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TopicSharedAccessKeys> listSharedAccessKeysAsync(String resourceGroupName, String topicName);

    /**
     * Regenerate key for a topic.
     * Regenerate a shared access key for a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicName Name of the topic
     * @param keyName Key name to regenerate key1 or key2
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TopicSharedAccessKeys> regenerateKeyAsync(String resourceGroupName, String topicName, String keyName);

    /**
     * List topic event types.
     * List event types for a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param providerNamespace Namespace of the provider of the topic
     * @param resourceTypeName Name of the topic type
     * @param resourceName Name of the topic
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventType> listEventTypesAsync(String resourceGroupName, String providerNamespace, String resourceTypeName, String resourceName);

}
