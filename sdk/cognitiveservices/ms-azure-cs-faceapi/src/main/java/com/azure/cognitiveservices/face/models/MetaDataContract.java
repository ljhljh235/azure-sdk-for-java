// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cognitiveservices.face.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A combination of user defined name and user specified data and recognition
 * model name for largePersonGroup/personGroup, and largeFaceList/faceList.
 */
@Fluent
public class MetaDataContract extends NameAndUserDataContract {
    /*
     * Possible values include: 'recognition_01', 'recognition_02'
     */
    @JsonProperty(value = "recognitionModel")
    private RecognitionModel recognitionModel;

    /**
     * Get the recognitionModel property: Possible values include:
     * 'recognition_01', 'recognition_02'.
     *
     * @return the recognitionModel value.
     */
    public RecognitionModel getRecognitionModel() {
        return this.recognitionModel;
    }

    /**
     * Set the recognitionModel property: Possible values include:
     * 'recognition_01', 'recognition_02'.
     *
     * @param recognitionModel the recognitionModel value to set.
     * @return the MetaDataContract object itself.
     */
    public MetaDataContract setRecognitionModel(RecognitionModel recognitionModel) {
        this.recognitionModel = recognitionModel;
        return this;
    }
}
