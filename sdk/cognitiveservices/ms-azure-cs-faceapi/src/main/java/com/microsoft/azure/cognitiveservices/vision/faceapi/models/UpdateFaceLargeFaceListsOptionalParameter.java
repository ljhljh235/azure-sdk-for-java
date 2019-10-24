/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;


/**
 * The UpdateFaceLargeFaceListsOptionalParameter model.
 */
public class UpdateFaceLargeFaceListsOptionalParameter {
    /**
     * User-provided data attached to the face. The size limit is 1KB.
     */
    private String userData;

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
     * @return the UpdateFaceLargeFaceListsOptionalParameter object itself.
     */
    public UpdateFaceLargeFaceListsOptionalParameter withUserData(String userData) {
        this.userData = userData;
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
     * @return the UpdateFaceLargeFaceListsOptionalParameter object itself.
     */
    public UpdateFaceLargeFaceListsOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
