// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.LibrariesImpl;
import com.azure.analytics.synapse.artifacts.models.AzureEntityResource;
import com.azure.analytics.synapse.artifacts.models.CloudErrorAutoGeneratedException;
import com.azure.analytics.synapse.artifacts.models.LibraryResource;
import com.azure.analytics.synapse.artifacts.models.LibraryResourceInfo;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class LibraryClient {
    private final LibrariesImpl serviceClient;

    /**
     * Initializes an instance of Libraries client.
     *
     * @param serviceClient the service client implementation.
     */
    LibraryClient(LibrariesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists Library.
     *
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Library resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LibraryResource> list() {
        return this.serviceClient.list();
    }

    /**
     * Lists Library.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Library resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LibraryResource> list(Context context) {
        return this.serviceClient.list(context);
    }

    /**
     * Flush Library.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LibraryResourceInfo flush(String libraryName) {
        return this.serviceClient.flush(libraryName);
    }

    /**
     * Flush Library.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LibraryResourceInfo> flushWithResponse(String libraryName, Context context) {
        return this.serviceClient.flushWithResponse(libraryName, context);
    }

    /**
     * Get Operation result for Library.
     *
     * @param operationId operation id for which status is requested.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation result for Library.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AzureEntityResource getOperationResult(String operationId) {
        return this.serviceClient.getOperationResult(operationId);
    }

    /**
     * Get Operation result for Library.
     *
     * @param operationId operation id for which status is requested.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation result for Library.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AzureEntityResource> getOperationResultWithResponse(String operationId, Context context) {
        return this.serviceClient.getOperationResultWithResponse(operationId, context);
    }

    /**
     * Delete Library.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LibraryResourceInfo delete(String libraryName) {
        return this.serviceClient.delete(libraryName);
    }

    /**
     * Delete Library.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LibraryResourceInfo> deleteWithResponse(String libraryName, Context context) {
        return this.serviceClient.deleteWithResponse(libraryName, context);
    }

    /**
     * Get Library.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return library.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LibraryResource get(String libraryName) {
        return this.serviceClient.get(libraryName);
    }

    /**
     * Get Library.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return library.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LibraryResource> getWithResponse(String libraryName, Context context) {
        return this.serviceClient.getWithResponse(libraryName, context);
    }

    /**
     * Creates a library with the library name.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LibraryResourceInfo create(String libraryName) {
        return this.serviceClient.create(libraryName);
    }

    /**
     * Creates a library with the library name.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LibraryResourceInfo> createWithResponse(String libraryName, Context context) {
        return this.serviceClient.createWithResponse(libraryName, context);
    }

    /**
     * Append the content to the library resource created using the create operation. The maximum content size is 4MiB.
     * Content larger than 4MiB must be appended in 4MiB chunks.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @param content Library file chunk.
     * @param contentLength The contentLength parameter.
     * @param xMsBlobConditionAppendpos Set this header to a byte offset at which the block is expected to be appended.
     *     The request succeeds only if the current offset matches this value. Otherwise, the request fails with the
     *     AppendPositionConditionNotMet error (HTTP status code 412 – Precondition Failed).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void append(
            String libraryName, Flux<ByteBuffer> content, long contentLength, Long xMsBlobConditionAppendpos) {
        this.serviceClient.append(libraryName, content, contentLength, xMsBlobConditionAppendpos);
    }

    /**
     * Append the content to the library resource created using the create operation. The maximum content size is 4MiB.
     * Content larger than 4MiB must be appended in 4MiB chunks.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @param content Library file chunk.
     * @param contentLength The contentLength parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void append(String libraryName, Flux<ByteBuffer> content, long contentLength) {
        this.serviceClient.append(libraryName, content, contentLength);
    }

    /**
     * Append the content to the library resource created using the create operation. The maximum content size is 4MiB.
     * Content larger than 4MiB must be appended in 4MiB chunks.
     *
     * @param libraryName file name to upload. Minimum length of the filename should be 1 excluding the extension
     *     length.
     * @param content Library file chunk.
     * @param contentLength The contentLength parameter.
     * @param xMsBlobConditionAppendpos Set this header to a byte offset at which the block is expected to be appended.
     *     The request succeeds only if the current offset matches this value. Otherwise, the request fails with the
     *     AppendPositionConditionNotMet error (HTTP status code 412 – Precondition Failed).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> appendWithResponse(
            String libraryName,
            Flux<ByteBuffer> content,
            long contentLength,
            Long xMsBlobConditionAppendpos,
            Context context) {
        return this.serviceClient.appendWithResponse(
                libraryName, content, contentLength, xMsBlobConditionAppendpos, context);
    }
}
