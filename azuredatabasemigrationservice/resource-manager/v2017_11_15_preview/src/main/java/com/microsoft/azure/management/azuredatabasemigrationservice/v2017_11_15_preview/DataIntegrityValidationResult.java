/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Results for checksum based Data Integrity validation results.
 */
public class DataIntegrityValidationResult {
    /**
     * List of failed table names of source and target pair.
     */
    @JsonProperty(value = "failedObjects")
    private Map<String, String> failedObjects;

    /**
     * List of errors that happened while performing data integrity validation.
     */
    @JsonProperty(value = "validationErrors")
    private ValidationError validationErrors;

    /**
     * Get list of failed table names of source and target pair.
     *
     * @return the failedObjects value
     */
    public Map<String, String> failedObjects() {
        return this.failedObjects;
    }

    /**
     * Set list of failed table names of source and target pair.
     *
     * @param failedObjects the failedObjects value to set
     * @return the DataIntegrityValidationResult object itself.
     */
    public DataIntegrityValidationResult withFailedObjects(Map<String, String> failedObjects) {
        this.failedObjects = failedObjects;
        return this;
    }

    /**
     * Get list of errors that happened while performing data integrity validation.
     *
     * @return the validationErrors value
     */
    public ValidationError validationErrors() {
        return this.validationErrors;
    }

    /**
     * Set list of errors that happened while performing data integrity validation.
     *
     * @param validationErrors the validationErrors value to set
     * @return the DataIntegrityValidationResult object itself.
     */
    public DataIntegrityValidationResult withValidationErrors(ValidationError validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

}
