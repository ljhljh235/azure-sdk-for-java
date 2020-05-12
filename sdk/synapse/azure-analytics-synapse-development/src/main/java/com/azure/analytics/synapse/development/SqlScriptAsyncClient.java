// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development;

import com.azure.analytics.synapse.development.implementation.SqlScriptsImpl;
import com.azure.analytics.synapse.development.implementation.models.CloudErrorException;
import com.azure.analytics.synapse.development.implementation.models.SqlScriptResource;
import com.azure.analytics.synapse.development.implementation.models.SqlScriptsListResponse;
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
 * Initializes a new instance of the asynchronous DevelopmentClient type.
 */
@ServiceClient(builder = DevelopmentClientBuilder.class)
public final class SqlScriptAsyncClient {
    private SqlScriptsImpl serviceClient;

    /**
     * Initializes an instance of SqlScripts client.
     */
    SqlScriptAsyncClient(SqlScriptsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists sql scripts.
     * 
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql scripts resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SqlScriptResource>> getSqlScriptsByWorkspaceSinglePage() {
        return this.serviceClient.getSqlScriptsByWorkspaceSinglePageAsync();
    }

    /**
     * Lists sql scripts.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql scripts resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SqlScriptResource>> getSqlScriptsByWorkspaceSinglePage(Context context) {
        return this.serviceClient.getSqlScriptsByWorkspaceSinglePageAsync(context);
    }

    /**
     * Lists sql scripts.
     * 
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql scripts resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SqlScriptResource> getSqlScriptsByWorkspace() {
        return this.serviceClient.getSqlScriptsByWorkspaceAsync();
    }

    /**
     * Lists sql scripts.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql scripts resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SqlScriptResource> getSqlScriptsByWorkspace(Context context) {
        return this.serviceClient.getSqlScriptsByWorkspaceAsync(context);
    }

    /**
     * Creates or updates a Sql Script.
     * 
     * @param sqlScriptName The sql script name.
     * @param sqlScript Sql Script resource type.
     * @param ifMatch ETag of the SQL script entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Script resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SqlScriptResource>> createOrUpdateSqlScriptWithResponse(String sqlScriptName, SqlScriptResource sqlScript, String ifMatch) {
        return this.serviceClient.createOrUpdateSqlScriptWithResponseAsync(sqlScriptName, sqlScript, ifMatch);
    }

    /**
     * Creates or updates a Sql Script.
     * 
     * @param sqlScriptName The sql script name.
     * @param sqlScript Sql Script resource type.
     * @param ifMatch ETag of the SQL script entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Script resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SqlScriptResource>> createOrUpdateSqlScriptWithResponse(String sqlScriptName, SqlScriptResource sqlScript, String ifMatch, Context context) {
        return this.serviceClient.createOrUpdateSqlScriptWithResponseAsync(sqlScriptName, sqlScript, ifMatch, context);
    }

    /**
     * Creates or updates a Sql Script.
     * 
     * @param sqlScriptName The sql script name.
     * @param sqlScript Sql Script resource type.
     * @param ifMatch ETag of the SQL script entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Script resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlScriptResource> createOrUpdateSqlScript(String sqlScriptName, SqlScriptResource sqlScript, String ifMatch) {
        return this.serviceClient.createOrUpdateSqlScriptAsync(sqlScriptName, sqlScript, ifMatch);
    }

    /**
     * Creates or updates a Sql Script.
     * 
     * @param sqlScriptName The sql script name.
     * @param sqlScript Sql Script resource type.
     * @param ifMatch ETag of the SQL script entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Script resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlScriptResource> createOrUpdateSqlScript(String sqlScriptName, SqlScriptResource sqlScript, String ifMatch, Context context) {
        return this.serviceClient.createOrUpdateSqlScriptAsync(sqlScriptName, sqlScript, ifMatch, context);
    }

    /**
     * Creates or updates a Sql Script.
     * 
     * @param sqlScriptName The sql script name.
     * @param sqlScript Sql Script resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Script resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlScriptResource> createOrUpdateSqlScript(String sqlScriptName, SqlScriptResource sqlScript) {
        return this.serviceClient.createOrUpdateSqlScriptAsync(sqlScriptName, sqlScript);
    }

    /**
     * Gets a sql script.
     * 
     * @param sqlScriptName The sql script name.
     * @param ifNoneMatch ETag of the sql compute entity. Should only be specified for get. If the ETag matches the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sql script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SqlScriptResource>> getSqlScriptWithResponse(String sqlScriptName, String ifNoneMatch) {
        return this.serviceClient.getSqlScriptWithResponseAsync(sqlScriptName, ifNoneMatch);
    }

    /**
     * Gets a sql script.
     * 
     * @param sqlScriptName The sql script name.
     * @param ifNoneMatch ETag of the sql compute entity. Should only be specified for get. If the ETag matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sql script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SqlScriptResource>> getSqlScriptWithResponse(String sqlScriptName, String ifNoneMatch, Context context) {
        return this.serviceClient.getSqlScriptWithResponseAsync(sqlScriptName, ifNoneMatch, context);
    }

    /**
     * Gets a sql script.
     * 
     * @param sqlScriptName The sql script name.
     * @param ifNoneMatch ETag of the sql compute entity. Should only be specified for get. If the ETag matches the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sql script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlScriptResource> getSqlScript(String sqlScriptName, String ifNoneMatch) {
        return this.serviceClient.getSqlScriptAsync(sqlScriptName, ifNoneMatch);
    }

    /**
     * Gets a sql script.
     * 
     * @param sqlScriptName The sql script name.
     * @param ifNoneMatch ETag of the sql compute entity. Should only be specified for get. If the ETag matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sql script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlScriptResource> getSqlScript(String sqlScriptName, String ifNoneMatch, Context context) {
        return this.serviceClient.getSqlScriptAsync(sqlScriptName, ifNoneMatch, context);
    }

    /**
     * Gets a sql script.
     * 
     * @param sqlScriptName The sql script name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sql script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlScriptResource> getSqlScript(String sqlScriptName) {
        return this.serviceClient.getSqlScriptAsync(sqlScriptName);
    }

    /**
     * Deletes a Sql Script.
     * 
     * @param sqlScriptName The sql script name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteSqlScriptWithResponse(String sqlScriptName) {
        return this.serviceClient.deleteSqlScriptWithResponseAsync(sqlScriptName);
    }

    /**
     * Deletes a Sql Script.
     * 
     * @param sqlScriptName The sql script name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteSqlScriptWithResponse(String sqlScriptName, Context context) {
        return this.serviceClient.deleteSqlScriptWithResponseAsync(sqlScriptName, context);
    }

    /**
     * Deletes a Sql Script.
     * 
     * @param sqlScriptName The sql script name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteSqlScript(String sqlScriptName) {
        return this.serviceClient.deleteSqlScriptAsync(sqlScriptName);
    }

    /**
     * Deletes a Sql Script.
     * 
     * @param sqlScriptName The sql script name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteSqlScript(String sqlScriptName, Context context) {
        return this.serviceClient.deleteSqlScriptAsync(sqlScriptName, context);
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql scripts resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SqlScriptResource>> getSqlScriptsByWorkspaceNextSinglePage(String nextLink) {
        return this.serviceClient.getSqlScriptsByWorkspaceNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql scripts resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SqlScriptResource>> getSqlScriptsByWorkspaceNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.getSqlScriptsByWorkspaceNextSinglePageAsync(nextLink, context);
    }
}
