/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Results for query analysis comparison between the source and target.
 */
public class QueryAnalysisValidationResult {
    /**
     * List of queries executed and it's execution results in source and
     * target.
     */
    @JsonProperty(value = "queryResults")
    private QueryExecutionResult queryResults;

    /**
     * Errors that are part of the execution.
     */
    @JsonProperty(value = "validationErrors")
    private ValidationError validationErrors;

    /**
     * Get list of queries executed and it's execution results in source and target.
     *
     * @return the queryResults value
     */
    public QueryExecutionResult queryResults() {
        return this.queryResults;
    }

    /**
     * Set list of queries executed and it's execution results in source and target.
     *
     * @param queryResults the queryResults value to set
     * @return the QueryAnalysisValidationResult object itself.
     */
    public QueryAnalysisValidationResult withQueryResults(QueryExecutionResult queryResults) {
        this.queryResults = queryResults;
        return this;
    }

    /**
     * Get errors that are part of the execution.
     *
     * @return the validationErrors value
     */
    public ValidationError validationErrors() {
        return this.validationErrors;
    }

    /**
     * Set errors that are part of the execution.
     *
     * @param validationErrors the validationErrors value to set
     * @return the QueryAnalysisValidationResult object itself.
     */
    public QueryAnalysisValidationResult withValidationErrors(ValidationError validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

}
