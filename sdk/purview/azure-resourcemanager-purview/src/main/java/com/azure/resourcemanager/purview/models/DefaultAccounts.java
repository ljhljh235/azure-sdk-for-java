// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.purview.fluent.models.DefaultAccountPayloadInner;
import java.util.UUID;

/** Resource collection API of DefaultAccounts. */
public interface DefaultAccounts {
    /**
     * Get the default account for the scope.
     *
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default account for the scope.
     */
    DefaultAccountPayload get(UUID scopeTenantId, ScopeType scopeType);

    /**
     * Get the default account for the scope.
     *
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @param scope The Id of the scope object, for example if the scope is "Subscription" then it is the ID of that
     *     subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default account for the scope.
     */
    Response<DefaultAccountPayload> getWithResponse(
        UUID scopeTenantId, ScopeType scopeType, String scope, Context context);

    /**
     * Sets the default account for the scope.
     *
     * @param defaultAccountPayload The payload containing the default account information and the scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload to get and set the default account in the given scope.
     */
    DefaultAccountPayload set(DefaultAccountPayloadInner defaultAccountPayload);

    /**
     * Sets the default account for the scope.
     *
     * @param defaultAccountPayload The payload containing the default account information and the scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload to get and set the default account in the given scope.
     */
    Response<DefaultAccountPayload> setWithResponse(DefaultAccountPayloadInner defaultAccountPayload, Context context);

    /**
     * Removes the default account from the scope.
     *
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void remove(UUID scopeTenantId, ScopeType scopeType);

    /**
     * Removes the default account from the scope.
     *
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @param scope The Id of the scope object, for example if the scope is "Subscription" then it is the ID of that
     *     subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> removeWithResponse(UUID scopeTenantId, ScopeType scopeType, String scope, Context context);
}
