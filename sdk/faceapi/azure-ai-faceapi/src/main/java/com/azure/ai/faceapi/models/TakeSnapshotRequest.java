// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.faceapi.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** The TakeSnapshotRequest model. */
@Fluent
public final class TakeSnapshotRequest {
    /*
     * User specified type for the source object to take snapshot from.
     * Currently FaceList, PersonGroup, LargeFaceList and LargePersonGroup are
     * supported.
     */
    @JsonProperty(value = "type", required = true)
    private SnapshotObjectType type;

    /*
     * User specified source object id to take snapshot from.
     */
    @JsonProperty(value = "objectId", required = true)
    private String objectId;

    /*
     * User specified array of target Face subscription ids for the snapshot.
     * For each snapshot, only subscriptions included in the applyScope of
     * Snapshot - Take can apply it.
     */
    @JsonProperty(value = "applyScope", required = true)
    private List<UUID> applyScope;

    /*
     * User specified data about the snapshot for any purpose. Length should
     * not exceed 16KB.
     */
    @JsonProperty(value = "userData")
    private String userData;

    /**
     * Get the type property: User specified type for the source object to take snapshot from. Currently FaceList,
     * PersonGroup, LargeFaceList and LargePersonGroup are supported.
     *
     * @return the type value.
     */
    public SnapshotObjectType getType() {
        return this.type;
    }

    /**
     * Set the type property: User specified type for the source object to take snapshot from. Currently FaceList,
     * PersonGroup, LargeFaceList and LargePersonGroup are supported.
     *
     * @param type the type value to set.
     * @return the TakeSnapshotRequest object itself.
     */
    public TakeSnapshotRequest setType(SnapshotObjectType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the objectId property: User specified source object id to take snapshot from.
     *
     * @return the objectId value.
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: User specified source object id to take snapshot from.
     *
     * @param objectId the objectId value to set.
     * @return the TakeSnapshotRequest object itself.
     */
    public TakeSnapshotRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the applyScope property: User specified array of target Face subscription ids for the snapshot. For each
     * snapshot, only subscriptions included in the applyScope of Snapshot - Take can apply it.
     *
     * @return the applyScope value.
     */
    public List<UUID> getApplyScope() {
        return this.applyScope;
    }

    /**
     * Set the applyScope property: User specified array of target Face subscription ids for the snapshot. For each
     * snapshot, only subscriptions included in the applyScope of Snapshot - Take can apply it.
     *
     * @param applyScope the applyScope value to set.
     * @return the TakeSnapshotRequest object itself.
     */
    public TakeSnapshotRequest setApplyScope(List<UUID> applyScope) {
        this.applyScope = applyScope;
        return this;
    }

    /**
     * Get the userData property: User specified data about the snapshot for any purpose. Length should not exceed 16KB.
     *
     * @return the userData value.
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * Set the userData property: User specified data about the snapshot for any purpose. Length should not exceed 16KB.
     *
     * @param userData the userData value to set.
     * @return the TakeSnapshotRequest object itself.
     */
    public TakeSnapshotRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
}
