/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;


/**
 * The CreateLargePersonGroupsOptionalParameter model.
 */
public class CreateLargePersonGroupsOptionalParameter {
    /**
     * User defined name, maximum length is 128.
     */
    private String name;

    /**
     * User specified data. Length should not exceed 16KB.
     */
    private String userData;

    /**
     * Possible values include: 'recognition_01', 'recognition_02'.
     */
    private RecognitionModel recognitionModel;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the CreateLargePersonGroupsOptionalParameter object itself.
     */
    public CreateLargePersonGroupsOptionalParameter withName(String name) {
        this.name = name;
        return this;
    }

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
     * @return the CreateLargePersonGroupsOptionalParameter object itself.
     */
    public CreateLargePersonGroupsOptionalParameter withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Get the recognitionModel value.
     *
     * @return the recognitionModel value
     */
    public RecognitionModel recognitionModel() {
        return this.recognitionModel;
    }

    /**
     * Set the recognitionModel value.
     *
     * @param recognitionModel the recognitionModel value to set
     * @return the CreateLargePersonGroupsOptionalParameter object itself.
     */
    public CreateLargePersonGroupsOptionalParameter withRecognitionModel(RecognitionModel recognitionModel) {
        this.recognitionModel = recognitionModel;
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
     * @return the CreateLargePersonGroupsOptionalParameter object itself.
     */
    public CreateLargePersonGroupsOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
