/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;


/**
 * The ListPersonGroupsOptionalParameter model.
 */
public class ListPersonGroupsOptionalParameter {
    /**
     * List person groups from the least personGroupId greater than the
     * "start".
     */
    private String start;

    /**
     * The number of person groups to list.
     */
    private Integer top;

    /**
     * A value indicating whether the operation should return
     * 'recognitionModel' in response.
     */
    private Boolean returnRecognitionModel;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the start value.
     *
     * @return the start value
     */
    public String start() {
        return this.start;
    }

    /**
     * Set the start value.
     *
     * @param start the start value to set
     * @return the ListPersonGroupsOptionalParameter object itself.
     */
    public ListPersonGroupsOptionalParameter withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Get the top value.
     *
     * @return the top value
     */
    public Integer top() {
        return this.top;
    }

    /**
     * Set the top value.
     *
     * @param top the top value to set
     * @return the ListPersonGroupsOptionalParameter object itself.
     */
    public ListPersonGroupsOptionalParameter withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * Get the returnRecognitionModel value.
     *
     * @return the returnRecognitionModel value
     */
    public Boolean returnRecognitionModel() {
        return this.returnRecognitionModel;
    }

    /**
     * Set the returnRecognitionModel value.
     *
     * @param returnRecognitionModel the returnRecognitionModel value to set
     * @return the ListPersonGroupsOptionalParameter object itself.
     */
    public ListPersonGroupsOptionalParameter withReturnRecognitionModel(Boolean returnRecognitionModel) {
        this.returnRecognitionModel = returnRecognitionModel;
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
     * @return the ListPersonGroupsOptionalParameter object itself.
     */
    public ListPersonGroupsOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
