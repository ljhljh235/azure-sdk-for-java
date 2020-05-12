// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.development.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/**
 * The AzureMLBatchExecutionActivity model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureMLBatchExecution")
@JsonFlatten
@Fluent
public class AzureMLBatchExecutionActivity extends ExecutionActivity {
    /*
     * Key,Value pairs to be passed to the Azure ML Batch Execution Service
     * endpoint. Keys must match the names of web service parameters defined in
     * the published Azure ML web service. Values will be passed in the
     * GlobalParameters property of the Azure ML batch execution request.
     */
    @JsonProperty(value = "typeProperties.globalParameters")
    private Map<String, Object> globalParameters;

    /*
     * Key,Value pairs, mapping the names of Azure ML endpoint's Web Service
     * Outputs to AzureMLWebServiceFile objects specifying the output Blob
     * locations. This information will be passed in the WebServiceOutputs
     * property of the Azure ML batch execution request.
     */
    @JsonProperty(value = "typeProperties.webServiceOutputs")
    private Map<String, AzureMLWebServiceFile> webServiceOutputs;

    /*
     * Key,Value pairs, mapping the names of Azure ML endpoint's Web Service
     * Inputs to AzureMLWebServiceFile objects specifying the input Blob
     * locations.. This information will be passed in the WebServiceInputs
     * property of the Azure ML batch execution request.
     */
    @JsonProperty(value = "typeProperties.webServiceInputs")
    private Map<String, AzureMLWebServiceFile> webServiceInputs;

    /**
     * Get the globalParameters property: Key,Value pairs to be passed to the
     * Azure ML Batch Execution Service endpoint. Keys must match the names of
     * web service parameters defined in the published Azure ML web service.
     * Values will be passed in the GlobalParameters property of the Azure ML
     * batch execution request.
     * 
     * @return the globalParameters value.
     */
    public Map<String, Object> getGlobalParameters() {
        return this.globalParameters;
    }

    /**
     * Set the globalParameters property: Key,Value pairs to be passed to the
     * Azure ML Batch Execution Service endpoint. Keys must match the names of
     * web service parameters defined in the published Azure ML web service.
     * Values will be passed in the GlobalParameters property of the Azure ML
     * batch execution request.
     * 
     * @param globalParameters the globalParameters value to set.
     * @return the AzureMLBatchExecutionActivity object itself.
     */
    public AzureMLBatchExecutionActivity setGlobalParameters(Map<String, Object> globalParameters) {
        this.globalParameters = globalParameters;
        return this;
    }

    /**
     * Get the webServiceOutputs property: Key,Value pairs, mapping the names
     * of Azure ML endpoint's Web Service Outputs to AzureMLWebServiceFile
     * objects specifying the output Blob locations. This information will be
     * passed in the WebServiceOutputs property of the Azure ML batch execution
     * request.
     * 
     * @return the webServiceOutputs value.
     */
    public Map<String, AzureMLWebServiceFile> getWebServiceOutputs() {
        return this.webServiceOutputs;
    }

    /**
     * Set the webServiceOutputs property: Key,Value pairs, mapping the names
     * of Azure ML endpoint's Web Service Outputs to AzureMLWebServiceFile
     * objects specifying the output Blob locations. This information will be
     * passed in the WebServiceOutputs property of the Azure ML batch execution
     * request.
     * 
     * @param webServiceOutputs the webServiceOutputs value to set.
     * @return the AzureMLBatchExecutionActivity object itself.
     */
    public AzureMLBatchExecutionActivity setWebServiceOutputs(Map<String, AzureMLWebServiceFile> webServiceOutputs) {
        this.webServiceOutputs = webServiceOutputs;
        return this;
    }

    /**
     * Get the webServiceInputs property: Key,Value pairs, mapping the names of
     * Azure ML endpoint's Web Service Inputs to AzureMLWebServiceFile objects
     * specifying the input Blob locations.. This information will be passed in
     * the WebServiceInputs property of the Azure ML batch execution request.
     * 
     * @return the webServiceInputs value.
     */
    public Map<String, AzureMLWebServiceFile> getWebServiceInputs() {
        return this.webServiceInputs;
    }

    /**
     * Set the webServiceInputs property: Key,Value pairs, mapping the names of
     * Azure ML endpoint's Web Service Inputs to AzureMLWebServiceFile objects
     * specifying the input Blob locations.. This information will be passed in
     * the WebServiceInputs property of the Azure ML batch execution request.
     * 
     * @param webServiceInputs the webServiceInputs value to set.
     * @return the AzureMLBatchExecutionActivity object itself.
     */
    public AzureMLBatchExecutionActivity setWebServiceInputs(Map<String, AzureMLWebServiceFile> webServiceInputs) {
        this.webServiceInputs = webServiceInputs;
        return this;
    }
}
