// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cognitiveservices.face.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/**
 * Request body for group request.
 */
@Fluent
public final class GroupRequest {
    /*
     * Array of candidate faceId created by Face - Detect. The maximum is 1000
     * faces
     */
    @JsonProperty(value = "faceIds", required = true)
    private List<UUID> faceIds;

    /**
     * Get the faceIds property: Array of candidate faceId created by Face -
     * Detect. The maximum is 1000 faces.
     *
     * @return the faceIds value.
     */
    public List<UUID> getFaceIds() {
        return this.faceIds;
    }

    /**
     * Set the faceIds property: Array of candidate faceId created by Face -
     * Detect. The maximum is 1000 faces.
     *
     * @param faceIds the faceIds value to set.
     * @return the GroupRequest object itself.
     */
    public GroupRequest setFaceIds(List<UUID> faceIds) {
        this.faceIds = faceIds;
        return this;
    }
}
