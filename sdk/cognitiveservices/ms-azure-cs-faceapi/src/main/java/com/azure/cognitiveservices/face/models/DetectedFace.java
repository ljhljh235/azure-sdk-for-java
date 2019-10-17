// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cognitiveservices.face.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * Detected Face object.
 */
@Fluent
public final class DetectedFace {
    /*
     * The faceId property.
     */
    @JsonProperty(value = "faceId")
    private UUID faceId;

    /*
     * Possible values include: 'recognition_01', 'recognition_02'
     */
    @JsonProperty(value = "recognitionModel")
    private RecognitionModel recognitionModel;

    /*
     * The faceRectangle property.
     */
    @JsonProperty(value = "faceRectangle", required = true)
    private FaceRectangle faceRectangle;

    /*
     * The faceLandmarks property.
     */
    @JsonProperty(value = "faceLandmarks")
    private FaceLandmarks faceLandmarks;

    /*
     * The faceAttributes property.
     */
    @JsonProperty(value = "faceAttributes")
    private FaceAttributes faceAttributes;

    /**
     * Get the faceId property: The faceId property.
     *
     * @return the faceId value.
     */
    public UUID getFaceId() {
        return this.faceId;
    }

    /**
     * Set the faceId property: The faceId property.
     *
     * @param faceId the faceId value to set.
     * @return the DetectedFace object itself.
     */
    public DetectedFace setFaceId(UUID faceId) {
        this.faceId = faceId;
        return this;
    }

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
     * @return the DetectedFace object itself.
     */
    public DetectedFace setRecognitionModel(RecognitionModel recognitionModel) {
        this.recognitionModel = recognitionModel;
        return this;
    }

    /**
     * Get the faceRectangle property: The faceRectangle property.
     *
     * @return the faceRectangle value.
     */
    public FaceRectangle getFaceRectangle() {
        return this.faceRectangle;
    }

    /**
     * Set the faceRectangle property: The faceRectangle property.
     *
     * @param faceRectangle the faceRectangle value to set.
     * @return the DetectedFace object itself.
     */
    public DetectedFace setFaceRectangle(FaceRectangle faceRectangle) {
        this.faceRectangle = faceRectangle;
        return this;
    }

    /**
     * Get the faceLandmarks property: The faceLandmarks property.
     *
     * @return the faceLandmarks value.
     */
    public FaceLandmarks getFaceLandmarks() {
        return this.faceLandmarks;
    }

    /**
     * Set the faceLandmarks property: The faceLandmarks property.
     *
     * @param faceLandmarks the faceLandmarks value to set.
     * @return the DetectedFace object itself.
     */
    public DetectedFace setFaceLandmarks(FaceLandmarks faceLandmarks) {
        this.faceLandmarks = faceLandmarks;
        return this;
    }

    /**
     * Get the faceAttributes property: The faceAttributes property.
     *
     * @return the faceAttributes value.
     */
    public FaceAttributes getFaceAttributes() {
        return this.faceAttributes;
    }

    /**
     * Set the faceAttributes property: The faceAttributes property.
     *
     * @param faceAttributes the faceAttributes value to set.
     * @return the DetectedFace object itself.
     */
    public DetectedFace setFaceAttributes(FaceAttributes faceAttributes) {
        this.faceAttributes = faceAttributes;
        return this;
    }
}
