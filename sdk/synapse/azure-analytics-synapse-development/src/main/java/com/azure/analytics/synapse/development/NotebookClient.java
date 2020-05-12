// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development;

import com.azure.analytics.synapse.development.implementation.NotebooksImpl;
import com.azure.analytics.synapse.development.implementation.models.CloudErrorException;
import com.azure.analytics.synapse.development.implementation.models.NotebookListResponse;
import com.azure.analytics.synapse.development.implementation.models.NotebookResource;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the synchronous DevelopmentClient type.
 */
@ServiceClient(builder = DevelopmentClientBuilder.class)
public final class NotebookClient {
    private NotebooksImpl serviceClient;

    /**
     * Initializes an instance of Notebooks client.
     */
    NotebookClient(NotebooksImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists Notebooks.
     * 
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Notebook resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NotebookResource> getNotebooksByWorkspace() {
        return this.serviceClient.getNotebooksByWorkspace();
    }

    /**
     * Lists Notebooks.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Notebook resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NotebookResource> getNotebooksByWorkspace(Context context) {
        return this.serviceClient.getNotebooksByWorkspace(context);
    }

    /**
     * Lists a summary of Notebooks.
     * 
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Notebook resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NotebookResource> getNotebookSummaryByWorkSpace() {
        return this.serviceClient.getNotebookSummaryByWorkSpace();
    }

    /**
     * Lists a summary of Notebooks.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Notebook resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NotebookResource> getNotebookSummaryByWorkSpace(Context context) {
        return this.serviceClient.getNotebookSummaryByWorkSpace(context);
    }

    /**
     * Creates or updates a Note Book.
     * 
     * @param notebookName The note book name.
     * @param notebook Notebook resource type.
     * @param ifMatch ETag of the Note book entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return notebook resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NotebookResource createOrUpdateNotebook(String notebookName, NotebookResource notebook, String ifMatch) {
        return this.serviceClient.createOrUpdateNotebook(notebookName, notebook, ifMatch);
    }

    /**
     * Creates or updates a Note Book.
     * 
     * @param notebookName The note book name.
     * @param notebook Notebook resource type.
     * @param ifMatch ETag of the Note book entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return notebook resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NotebookResource createOrUpdateNotebook(String notebookName, NotebookResource notebook, String ifMatch, Context context) {
        return this.serviceClient.createOrUpdateNotebook(notebookName, notebook, ifMatch, context);
    }

    /**
     * Creates or updates a Note Book.
     * 
     * @param notebookName The note book name.
     * @param notebook Notebook resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return notebook resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NotebookResource createOrUpdateNotebook(String notebookName, NotebookResource notebook) {
        return this.serviceClient.createOrUpdateNotebook(notebookName, notebook);
    }

    /**
     * Gets a Note Book.
     * 
     * @param notebookName The note book name.
     * @param ifNoneMatch ETag of the Notebook entity. Should only be specified for get. If the ETag matches the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Note Book.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NotebookResource getNotebook(String notebookName, String ifNoneMatch) {
        return this.serviceClient.getNotebook(notebookName, ifNoneMatch);
    }

    /**
     * Gets a Note Book.
     * 
     * @param notebookName The note book name.
     * @param ifNoneMatch ETag of the Notebook entity. Should only be specified for get. If the ETag matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Note Book.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NotebookResource getNotebook(String notebookName, String ifNoneMatch, Context context) {
        return this.serviceClient.getNotebook(notebookName, ifNoneMatch, context);
    }

    /**
     * Gets a Note Book.
     * 
     * @param notebookName The note book name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Note Book.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NotebookResource getNotebook(String notebookName) {
        return this.serviceClient.getNotebook(notebookName);
    }

    /**
     * Deletes a Note book.
     * 
     * @param notebookName The note book name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteNotebook(String notebookName) {
        this.serviceClient.deleteNotebook(notebookName);
    }

    /**
     * Deletes a Note book.
     * 
     * @param notebookName The note book name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteNotebook(String notebookName, Context context) {
        this.serviceClient.deleteNotebook(notebookName, context);
    }
}
