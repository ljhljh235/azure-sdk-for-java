// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NotebookCellOutputItem model.
 */
@Fluent
public final class NotebookCellOutputItem {
    /*
     * For output_type=stream, determines the name of stream (stdout / stderr).
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Execution sequence number.
     */
    @JsonProperty(value = "execution_count")
    private Integer executionCount;

    /*
     * Execution, display, or stream outputs.
     */
    @JsonProperty(value = "output_type", required = true)
    private CellOutputType outputType;

    /*
     * For output_type=stream, the stream's text output, represented as a
     * string or an array of strings.
     */
    @JsonProperty(value = "text")
    private Object text;

    /*
     * Output data. Use MIME type as key, and content as value.
     */
    @JsonProperty(value = "data")
    private Object data;

    /*
     * Metadata for the output item.
     */
    @JsonProperty(value = "metadata")
    private Object metadata;

    /**
     * Get the name property: For output_type=stream, determines the name of
     * stream (stdout / stderr).
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: For output_type=stream, determines the name of
     * stream (stdout / stderr).
     * 
     * @param name the name value to set.
     * @return the NotebookCellOutputItem object itself.
     */
    public NotebookCellOutputItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the executionCount property: Execution sequence number.
     * 
     * @return the executionCount value.
     */
    public Integer getExecutionCount() {
        return this.executionCount;
    }

    /**
     * Set the executionCount property: Execution sequence number.
     * 
     * @param executionCount the executionCount value to set.
     * @return the NotebookCellOutputItem object itself.
     */
    public NotebookCellOutputItem setExecutionCount(Integer executionCount) {
        this.executionCount = executionCount;
        return this;
    }

    /**
     * Get the outputType property: Execution, display, or stream outputs.
     * 
     * @return the outputType value.
     */
    public CellOutputType getOutputType() {
        return this.outputType;
    }

    /**
     * Set the outputType property: Execution, display, or stream outputs.
     * 
     * @param outputType the outputType value to set.
     * @return the NotebookCellOutputItem object itself.
     */
    public NotebookCellOutputItem setOutputType(CellOutputType outputType) {
        this.outputType = outputType;
        return this;
    }

    /**
     * Get the text property: For output_type=stream, the stream's text output,
     * represented as a string or an array of strings.
     * 
     * @return the text value.
     */
    public Object getText() {
        return this.text;
    }

    /**
     * Set the text property: For output_type=stream, the stream's text output,
     * represented as a string or an array of strings.
     * 
     * @param text the text value to set.
     * @return the NotebookCellOutputItem object itself.
     */
    public NotebookCellOutputItem setText(Object text) {
        this.text = text;
        return this;
    }

    /**
     * Get the data property: Output data. Use MIME type as key, and content as
     * value.
     * 
     * @return the data value.
     */
    public Object getData() {
        return this.data;
    }

    /**
     * Set the data property: Output data. Use MIME type as key, and content as
     * value.
     * 
     * @param data the data value to set.
     * @return the NotebookCellOutputItem object itself.
     */
    public NotebookCellOutputItem setData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * Get the metadata property: Metadata for the output item.
     * 
     * @return the metadata value.
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Metadata for the output item.
     * 
     * @param metadata the metadata value to set.
     * @return the NotebookCellOutputItem object itself.
     */
    public NotebookCellOutputItem setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
}
