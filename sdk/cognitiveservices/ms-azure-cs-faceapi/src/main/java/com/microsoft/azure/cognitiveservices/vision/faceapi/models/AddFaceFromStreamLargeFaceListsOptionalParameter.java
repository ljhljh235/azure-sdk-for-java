/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import java.util.List;

/**
 * The AddFaceFromStreamLargeFaceListsOptionalParameter model.
 */
public class AddFaceFromStreamLargeFaceListsOptionalParameter {
    /**
     * User-specified data about the face for any purpose. The maximum length
     * is 1KB.
     */
    private String userData;

    /**
     * A face rectangle to specify the target face to be added to a person in
     * the format of "targetFace=left,top,width,height". E.g.
     * "targetFace=10,10,100,100". If there is more than one face in the image,
     * targetFace is required to specify which face to add. No targetFace means
     * there is only one face detected in the entire image.
     */
    private List<Integer> targetFace;

    /**
     * Name of detection model. Detection model is used to detect faces in the
     * submitted image. A detection model name can be provided when performing
     * Face - Detect or (Large)FaceList - Add Face or (Large)PersonGroup - Add
     * Face. The default value is 'detection_01', if another model is needed,
     * please explicitly specify it. Possible values include: 'detection_01',
     * 'detection_02'.
     */
    private DetectionModel detectionModel;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the userData value.
     *
     * @return the userData value
     */
    public String userData() {
        return this.userData;
    }

    /**
     * Set the userData value.
     *
     * @param userData the userData value to set
     * @return the AddFaceFromStreamLargeFaceListsOptionalParameter object itself.
     */
    public AddFaceFromStreamLargeFaceListsOptionalParameter withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Get the targetFace value.
     *
     * @return the targetFace value
     */
    public List<Integer> targetFace() {
        return this.targetFace;
    }

    /**
     * Set the targetFace value.
     *
     * @param targetFace the targetFace value to set
     * @return the AddFaceFromStreamLargeFaceListsOptionalParameter object itself.
     */
    public AddFaceFromStreamLargeFaceListsOptionalParameter withTargetFace(List<Integer> targetFace) {
        this.targetFace = targetFace;
        return this;
    }

    /**
     * Get the detectionModel value.
     *
     * @return the detectionModel value
     */
    public DetectionModel detectionModel() {
        return this.detectionModel;
    }

    /**
     * Set the detectionModel value.
     *
     * @param detectionModel the detectionModel value to set
     * @return the AddFaceFromStreamLargeFaceListsOptionalParameter object itself.
     */
    public AddFaceFromStreamLargeFaceListsOptionalParameter withDetectionModel(DetectionModel detectionModel) {
        this.detectionModel = detectionModel;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the AddFaceFromStreamLargeFaceListsOptionalParameter object itself.
     */
    public AddFaceFromStreamLargeFaceListsOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
