// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cognitiveservices.computervision.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of recognition text operation.
 */
@Fluent
public final class TextOperationResult {
    /*
     * Status of the text operation. Possible values include: 'NotStarted',
     * 'Running', 'Failed', 'Succeeded'
     */
    @JsonProperty(value = "status")
    private TextOperationStatusCodes status;

    /*
     * Text recognition result of the text operation.
     */
    @JsonProperty(value = "recognitionResult")
    private TextRecognitionResult recognitionResult;

    /**
     * Get the status property: Status of the text operation. Possible values
     * include: 'NotStarted', 'Running', 'Failed', 'Succeeded'.
     *
     * @return the status value.
     */
    public TextOperationStatusCodes getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of the text operation. Possible values
     * include: 'NotStarted', 'Running', 'Failed', 'Succeeded'.
     *
     * @param status the status value to set.
     * @return the TextOperationResult object itself.
     */
    public TextOperationResult setStatus(TextOperationStatusCodes status) {
        this.status = status;
        return this;
    }

    /**
     * Get the recognitionResult property: Text recognition result of the text
     * operation.
     *
     * @return the recognitionResult value.
     */
    public TextRecognitionResult getRecognitionResult() {
        return this.recognitionResult;
    }

    /**
     * Set the recognitionResult property: Text recognition result of the text
     * operation.
     *
     * @param recognitionResult the recognitionResult value to set.
     * @return the TextOperationResult object itself.
     */
    public TextOperationResult setRecognitionResult(TextRecognitionResult recognitionResult) {
        this.recognitionResult = recognitionResult;
        return this;
    }
}
