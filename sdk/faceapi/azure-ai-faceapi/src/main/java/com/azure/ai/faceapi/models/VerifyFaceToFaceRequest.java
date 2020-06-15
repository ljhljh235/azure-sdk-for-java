// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.faceapi.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The VerifyFaceToFaceRequest model. */
@Fluent
public final class VerifyFaceToFaceRequest {
    /*
     * FaceId of the first face, comes from Face - Detect
     */
    @JsonProperty(value = "faceId1", required = true)
    private UUID faceId1;

    /*
     * FaceId of the second face, comes from Face - Detect
     */
    @JsonProperty(value = "faceId2", required = true)
    private UUID faceId2;

    /**
     * Get the faceId1 property: FaceId of the first face, comes from Face - Detect.
     *
     * @return the faceId1 value.
     */
    public UUID getFaceId1() {
        return this.faceId1;
    }

    /**
     * Set the faceId1 property: FaceId of the first face, comes from Face - Detect.
     *
     * @param faceId1 the faceId1 value to set.
     * @return the VerifyFaceToFaceRequest object itself.
     */
    public VerifyFaceToFaceRequest setFaceId1(UUID faceId1) {
        this.faceId1 = faceId1;
        return this;
    }

    /**
     * Get the faceId2 property: FaceId of the second face, comes from Face - Detect.
     *
     * @return the faceId2 value.
     */
    public UUID getFaceId2() {
        return this.faceId2;
    }

    /**
     * Set the faceId2 property: FaceId of the second face, comes from Face - Detect.
     *
     * @param faceId2 the faceId2 value to set.
     * @return the VerifyFaceToFaceRequest object itself.
     */
    public VerifyFaceToFaceRequest setFaceId2(UUID faceId2) {
        this.faceId2 = faceId2;
        return this;
    }
}
