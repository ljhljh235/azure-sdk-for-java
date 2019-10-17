// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cognitiveservices.face.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Take operation.
 */
@Fluent
public final class SnapshotTakeHeaders {
    /*
     * Operation location with an operation id used to track the progress of
     * taking snapshot. The returned id is the operation id, rather than
     * snapshot id. Snapshot id can be obtained only when the operation status
     * becomes "succeeded" in OperationStatus - Get.
     */
    @JsonProperty(value = "Operation-Location")
    private String operationLocation;

    /**
     * Get the operationLocation property: Operation location with an operation
     * id used to track the progress of taking snapshot. The returned id is the
     * operation id, rather than snapshot id. Snapshot id can be obtained only
     * when the operation status becomes "succeeded" in OperationStatus - Get.
     *
     * @return the operationLocation value.
     */
    public String getOperationLocation() {
        return this.operationLocation;
    }

    /**
     * Set the operationLocation property: Operation location with an operation
     * id used to track the progress of taking snapshot. The returned id is the
     * operation id, rather than snapshot id. Snapshot id can be obtained only
     * when the operation status becomes "succeeded" in OperationStatus - Get.
     *
     * @param operationLocation the operationLocation value to set.
     * @return the SnapshotTakeHeaders object itself.
     */
    public SnapshotTakeHeaders setOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }
}
