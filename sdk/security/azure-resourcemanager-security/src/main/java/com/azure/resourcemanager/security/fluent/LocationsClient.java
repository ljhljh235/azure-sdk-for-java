// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.AscLocationInner;

/** An instance of this class provides access to all the operations defined in LocationsClient. */
public interface LocationsClient {
    /**
     * The location of the responsible ASC of the specific subscription (home region). For each subscription there is
     * only one responsible location. The location in the response should be used to read or write other resources in
     * ASC according to their ID.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of locations where ASC saves your data.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AscLocationInner> list();

    /**
     * The location of the responsible ASC of the specific subscription (home region). For each subscription there is
     * only one responsible location. The location in the response should be used to read or write other resources in
     * ASC according to their ID.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of locations where ASC saves your data.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AscLocationInner> list(Context context);

    /**
     * Details of a specific location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ASC location of the subscription is in the "name" field.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AscLocationInner get(String ascLocation);

    /**
     * Details of a specific location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ASC location of the subscription is in the "name" field.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AscLocationInner> getWithResponse(String ascLocation, Context context);
}
