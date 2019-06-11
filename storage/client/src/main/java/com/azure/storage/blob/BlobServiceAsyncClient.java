// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.ResponseBase;
import com.azure.core.implementation.http.UrlBuilder;
import com.azure.core.util.Context;
import com.azure.storage.blob.implementation.AzureBlobStorageBuilder;
import com.azure.storage.blob.implementation.AzureBlobStorageImpl;
import com.azure.storage.blob.models.ContainerItem;
import com.azure.storage.blob.models.ServiceGetAccountInfoHeaders;
import com.azure.storage.blob.models.ServiceGetPropertiesHeaders;
import com.azure.storage.blob.models.ServiceGetStatisticsHeaders;
import com.azure.storage.blob.models.ServiceGetUserDelegationKeyHeaders;
import com.azure.storage.blob.models.ServiceSetPropertiesHeaders;
import com.azure.storage.blob.models.ServicesListContainersSegmentResponse;
import com.azure.storage.blob.models.StorageServiceProperties;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;

/**
 * Client to a blob service. It may be obtained through a {@link BlobServiceClientBuilder}.
 * This class does not hold any state about a particular storage account but is
 * instead a convenient way of sending off appropriate requests to the resource on the service.
 * It may also be used to construct URLs to blobs and containers.
 * Please see <a href=https://docs.microsoft.com/en-us/azure/storage/blobs/storage-blobs-introduction>here</a> for more
 * information on containers.
 *
 * Note this client is an async client that returns reactive responses from Spring Reactor Core
 * project (https://projectreactor.io/). Calling the methods in this client will <strong>NOT</strong>
 * start the actual network operation, until {@code .subscribe()} is called on the reactive response.
 * You can simply convert one of these responses to a {@link java.util.concurrent.CompletableFuture}
 * object through {@link Mono#toFuture()}.
 */
public final class BlobServiceAsyncClient {

    BlobServiceAsyncRawClient blobServiceAsyncRawClient;

    /**
     * Package-private constructor for use by {@link BlobServiceClientBuilder}.
     * @param azureBlobStorage the API client for blob storage API
     */
    BlobServiceAsyncClient(AzureBlobStorageImpl azureBlobStorage) {
        this.blobServiceAsyncRawClient = new BlobServiceAsyncRawClient(azureBlobStorage);
    }

    /**
     * Static method for getting a new builder for this class.
     *
     * @return
     *      A new {@link BlobServiceClientBuilder} instance.
     */
    public static BlobServiceClientBuilder builder() {
        return new BlobServiceClientBuilder();
    }

    /**
     * Creates a {@link ContainerAsyncClient} object pointing to the specified container. This method does not create a
     * container. It simply constructs the URL to the container and offers access to methods relevant to containers.
     *
     * @param containerName
     *     The name of the container to point to.
     * @return
     *     A {@link ContainerAsyncClient} object pointing to the specified container
     */
    public ContainerAsyncClient createContainerAsyncClient(String containerName) {
        AzureBlobStorageImpl azureBlobStorage = blobServiceAsyncRawClient.azureBlobStorage;
        UrlBuilder urlBuilder = UrlBuilder.parse(azureBlobStorage.url());
        urlBuilder.withPath(urlBuilder.path() + "/" + containerName);
        return new ContainerAsyncClient(new AzureBlobStorageBuilder()
            .url(urlBuilder.toString())
            .pipeline(azureBlobStorage.httpPipeline())
            .build());
    }

    /**
     * Returns a Mono segment of containers starting from the specified Marker.
     * Use an empty marker to start enumeration from the beginning. Container names are returned in lexicographic order.
     * After getting a segment, process it, and then call ListContainers again (passing the the previously-returned
     * Marker) to get the next segment. For more information, see
     * the <a href="https://docs.microsoft.com/rest/api/storageservices/list-containers2">Azure Docs</a>.
     *
     * @param marker
     *         Identifies the portion of the list to be returned with the next list operation.
     *         This value is returned in the response of a previous list operation as the
     *         ListContainersSegmentResponse.body().nextMarker(). Set to null to list the first segment.
     * @param options
     *         A {@link ListContainersOptions} which specifies what data should be returned by the service.
     *
     * @return
     *      A reactive response emitting the list of containers.
     */
    public Flux<ContainerItem> listContainersSegment(String marker, ListContainersOptions options) {
        return this.listContainersSegment(marker, options, null);
    }

    /**
     * Returns a Mono segment of containers starting from the specified Marker.
     * Use an empty marker to start enumeration from the beginning. Container names are returned in lexicographic order.
     * After getting a segment, process it, and then call ListContainers again (passing the the previously-returned
     * Marker) to get the next segment. For more information, see
     * the <a href="https://docs.microsoft.com/rest/api/storageservices/list-containers2">Azure Docs</a>.
     *
     * @param marker
     *         Identifies the portion of the list to be returned with the next list operation.
     *         This value is returned in the response of a previous list operation as the
     *         ListContainersSegmentResponse.body().nextMarker(). Set to null to list the first segment.
     * @param options
     *         A {@link ListContainersOptions} which specifies what data should be returned by the service.
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     *
     * @return
     *      A reactive response emitting the list of containers.
     */
    public Flux<ContainerItem> listContainersSegment(String marker,
            ListContainersOptions options, Context context) {
        return blobServiceAsyncRawClient
            .listContainersSegment(null, options, context)
            .flatMapMany(response -> listContainersSegmentHelper(response.value().marker(), options, context, response));
    }

    private Flux<ContainerItem> listContainersSegmentHelper(String marker, ListContainersOptions options, Context context,
                                                    ServicesListContainersSegmentResponse response){
        Flux<ContainerItem> result = Flux.fromIterable(response.value().containerItems());
        if (response.value().nextMarker() != null) {
            // Recursively add the continuation items to the observable.
            result = result.concatWith(blobServiceAsyncRawClient.listContainersSegment(marker, options,
                context)
                .flatMapMany((r) ->
                    listContainersSegmentHelper(response.value().nextMarker(), options, context, r)));
        }

        return result;
    }

    /**
     * Gets the properties of a storage account’s Blob service. For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/get-blob-service-properties">Azure Docs</a>.
     *
     * @return
     *      A reactive response containing the blob service properties.
     */
    public Mono<ServiceGetPropertiesHeaders> getProperties() {
        return this.getProperties(null);
    }

    /**
     * Gets the properties of a storage account’s Blob service. For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/get-blob-service-properties">Azure Docs</a>.
     *
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     *
     * @return
     *      A reactive response containing the blob service properties.
     */
    public Mono<ServiceGetPropertiesHeaders> getProperties(Context context) {
        return blobServiceAsyncRawClient
            .getProperties(context)
            .map(ResponseBase::deserializedHeaders);
    }

    /**
     * Sets properties for a storage account's Blob service endpoint. For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/set-blob-service-properties">Azure Docs</a>.
     * Note that setting the default service version has no effect when using this client because this client explicitly
     * sets the version header on each request, overriding the default.
     *
     * @param properties
     *         Configures the service.
     *
     * @return
     *      A reactive response containing the blob service properties.
     */
    public Mono<ServiceSetPropertiesHeaders> setProperties(StorageServiceProperties properties) {
        return this.setProperties(properties, null);
    }

    /**
     * Sets properties for a storage account's Blob service endpoint. For more information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/set-blob-service-properties">Azure Docs</a>.
     * Note that setting the default service version has no effect when using this client because this client explicitly
     * sets the version header on each request, overriding the default.
     *
     * @param properties
     *         Configures the service.
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     *
     * @return
     *      A reactive response containing the blob service properties.
     */
    public Mono<ServiceSetPropertiesHeaders> setProperties(StorageServiceProperties properties, Context context) {
        return blobServiceAsyncRawClient
            .setProperties(properties, context)
            .map(ResponseBase::deserializedHeaders);
    }

    /**
     * Gets a user delegation key for use with this account's blob storage.
     * Note: This method call is only valid when using {@link TokenCredentials} in this object's {@link HttpPipeline}.
     *
     * @param start
     *         Start time for the key's validity. Null indicates immediate start.
     * @param expiry
     *         Expiration of the key's validity.
     *
     * @return
     *      A reactive response containing the user delegation key.
     */
    public Mono<ServiceGetUserDelegationKeyHeaders> getUserDelegationKey(OffsetDateTime start, OffsetDateTime expiry) {
        return this.getUserDelegationKey(start, expiry, null);
    }

    /**
     * Gets a user delegation key for use with this account's blob storage.
     * Note: This method call is only valid when using {@link TokenCredentials} in this object's {@link HttpPipeline}.
     *
     * @param start
     *         Start time for the key's validity. Null indicates immediate start.
     * @param expiry
     *         Expiration of the key's validity.
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     *
     * @return
     *      A reactive response containing the user delegation key.
     */
    public Mono<ServiceGetUserDelegationKeyHeaders> getUserDelegationKey(OffsetDateTime start, OffsetDateTime expiry,
            Context context) {
        return blobServiceAsyncRawClient
            .getUserDelegationKey(start, expiry, context)
            .map(ResponseBase::deserializedHeaders);
    }

    /**
     * Retrieves statistics related to replication for the Blob service. It is only available on the secondary
     * location endpoint when read-access geo-redundant replication is enabled for the storage account. For more
     * information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/get-blob-service-stats">Azure Docs</a>.
     *
     * @return
     *      A reactive response containing the blob service statistics.
     */
    public Mono<ServiceGetStatisticsHeaders> getStatistics() {
        return this.getStatistics(null);
    }

    /**
     * Retrieves statistics related to replication for the Blob service. It is only available on the secondary
     * location endpoint when read-access geo-redundant replication is enabled for the storage account. For more
     * information, see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/get-blob-service-stats">Azure Docs</a>.
     *
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     *
     * @return
     *      A reactive response containing the blob service statistics.
     */
    public Mono<ServiceGetStatisticsHeaders> getStatistics(Context context) {
        return blobServiceAsyncRawClient
            .getStatistics(context)
            .map(ResponseBase::deserializedHeaders);
    }

    /**
     * Returns the sku name and account kind for the account. For more information, please see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/get-account-information">Azure Docs</a>.
     *
     * @return
     *      A reactive response containing the blob service account info.
     */
    public Mono<ServiceGetAccountInfoHeaders> getAccountInfo() {
        return this.getAccountInfo(null);
    }

    /**
     * Returns the sku name and account kind for the account. For more information, please see the
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/get-account-information">Azure Docs</a>.
     *
     * @param context
     *         {@code Context} offers a means of passing arbitrary data (key/value pairs) to an
     *         {@link HttpPipeline}'s policy objects. Most applications do not need to pass
     *         arbitrary data to the pipeline and can pass {@code Context.NONE} or {@code null}. Each context object is
     *         immutable. The {@code withContext} with data method creates a new {@code Context} object that refers to
     *         its parent, forming a linked list.
     *
     * @return
     *      A reactive response containing the blob service account info.
     */
    public Mono<ServiceGetAccountInfoHeaders> getAccountInfo(Context context) {
        return blobServiceAsyncRawClient
            .getAccountInfo(context)
            .map(ResponseBase::deserializedHeaders);
    }
}
