// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotPolicyInner;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotPolicyVolumeListInner;
import com.azure.resourcemanager.netapp.models.SnapshotPolicyPatch;

/** An instance of this class provides access to all the operations defined in SnapshotPoliciesClient. */
public interface SnapshotPoliciesClient {
    /**
     * List snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Snapshot Policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SnapshotPolicyInner> list(String resourceGroupName, String accountName);

    /**
     * List snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Snapshot Policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SnapshotPolicyInner> list(String resourceGroupName, String accountName, Context context);

    /**
     * Get a snapshot Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a snapshot Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SnapshotPolicyInner get(String resourceGroupName, String accountName, String snapshotPolicyName);

    /**
     * Get a snapshot Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a snapshot Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SnapshotPolicyInner> getWithResponse(
        String resourceGroupName, String accountName, String snapshotPolicyName, Context context);

    /**
     * Create a snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @param body Snapshot policy object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot policy information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SnapshotPolicyInner create(
        String resourceGroupName, String accountName, String snapshotPolicyName, SnapshotPolicyInner body);

    /**
     * Create a snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @param body Snapshot policy object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot policy information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SnapshotPolicyInner> createWithResponse(
        String resourceGroupName,
        String accountName,
        String snapshotPolicyName,
        SnapshotPolicyInner body,
        Context context);

    /**
     * Patch a snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @param body Snapshot policy object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot policy information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SnapshotPolicyInner>, SnapshotPolicyInner> beginUpdate(
        String resourceGroupName, String accountName, String snapshotPolicyName, SnapshotPolicyPatch body);

    /**
     * Patch a snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @param body Snapshot policy object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot policy information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SnapshotPolicyInner>, SnapshotPolicyInner> beginUpdate(
        String resourceGroupName,
        String accountName,
        String snapshotPolicyName,
        SnapshotPolicyPatch body,
        Context context);

    /**
     * Patch a snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @param body Snapshot policy object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot policy information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SnapshotPolicyInner update(
        String resourceGroupName, String accountName, String snapshotPolicyName, SnapshotPolicyPatch body);

    /**
     * Patch a snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @param body Snapshot policy object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot policy information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SnapshotPolicyInner update(
        String resourceGroupName,
        String accountName,
        String snapshotPolicyName,
        SnapshotPolicyPatch body,
        Context context);

    /**
     * Delete snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String snapshotPolicyName);

    /**
     * Delete snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String snapshotPolicyName, Context context);

    /**
     * Delete snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String snapshotPolicyName);

    /**
     * Delete snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String snapshotPolicyName, Context context);

    /**
     * Get volumes associated with snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return volumes associated with snapshot policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SnapshotPolicyVolumeListInner listVolumes(String resourceGroupName, String accountName, String snapshotPolicyName);

    /**
     * Get volumes associated with snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param snapshotPolicyName The name of the snapshot policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return volumes associated with snapshot policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SnapshotPolicyVolumeListInner> listVolumesWithResponse(
        String resourceGroupName, String accountName, String snapshotPolicyName, Context context);
}
