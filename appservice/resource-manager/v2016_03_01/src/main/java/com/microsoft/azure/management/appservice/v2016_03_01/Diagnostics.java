/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import rx.Observable;
import com.microsoft.azure.management.appservice.v2016_03_01.implementation.DiagnosticsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2016_03_01.DetectorResponse;
import com.microsoft.azure.management.appservice.v2016_03_01.DiagnosticAnalysis;

/**
 * Type representing Diagnostics.
 */
public interface Diagnostics extends HasInner<DiagnosticsInner> {
    /**
     * Get Diagnostics Categories.
     * Get Diagnostics Categories.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param slot Slot Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticCategory> listSiteDiagnosticCategoriesSlotAsync(final String resourceGroupName, final String siteName, final String slot);

    /**
     * Get Diagnostics Category.
     * Get Diagnostics Category.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param diagnosticCategory Diagnostic Category
     * @param slot Slot Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticCategory> getSiteDiagnosticCategorySlotAsync(String resourceGroupName, String siteName, String diagnosticCategory, String slot);

    /**
     * Get Diagnostics Category.
     * Get Diagnostics Category.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param diagnosticCategory Diagnostic Category
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticCategory> getSiteDiagnosticCategoryAsync(String resourceGroupName, String siteName, String diagnosticCategory);

    /**
     * Get Diagnostics Categories.
     * Get Diagnostics Categories.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticCategory> listSiteDiagnosticCategoriesAsync(final String resourceGroupName, final String siteName);

    /**
     * Get Hosting Environment Detector Response.
     * Get Hosting Environment Detector Response.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name App Service Environment Name
     * @param detectorName Detector Resource Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DetectorResponse> getHostingEnvironmentDetectorResponseAsync(String resourceGroupName, String name, String detectorName);

    /**
     * List Hosting Environment Detector Responses.
     * List Hosting Environment Detector Responses.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DetectorResponse> listHostingEnvironmentDetectorResponsesAsync(final String resourceGroupName, final String name);

    /**
     * List Site Detector Responses.
     * List Site Detector Responses.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DetectorResponse> listSiteDetectorResponsesAsync(final String resourceGroupName, final String siteName);

    /**
     * Get site detector response.
     * Get site detector response.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param detectorName Detector Resource Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DetectorResponse> getSiteDetectorResponseAsync(String resourceGroupName, String siteName, String detectorName);

    /**
     * Get Detectors.
     * Get Detectors.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param diagnosticCategory Diagnostic Category
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DetectorDefinition> listSiteDetectorsAsync(final String resourceGroupName, final String siteName, final String diagnosticCategory);

    /**
     * Get Detector.
     * Get Detector.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param diagnosticCategory Diagnostic Category
     * @param detectorName Detector Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DetectorDefinition> getSiteDetectorAsync(final String resourceGroupName, final String siteName, final String diagnosticCategory, final String detectorName);

    /**
     * Execute Detector.
     * Execute Detector.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param detectorName Detector Resource Name
     * @param diagnosticCategory Category Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticDetectorResponse> executeSiteDetectorAsync(String resourceGroupName, String siteName, String detectorName, String diagnosticCategory);

    /**
     * List Site Detector Responses.
     * List Site Detector Responses.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param slot Slot Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DetectorResponse> listSiteDetectorResponsesSlotAsync(final String resourceGroupName, final String siteName, final String slot);

    /**
     * Get site detector response.
     * Get site detector response.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param detectorName Detector Resource Name
     * @param slot Slot Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DetectorResponse> getSiteDetectorResponseSlotAsync(String resourceGroupName, String siteName, String detectorName, String slot);

    /**
     * Get Detectors.
     * Get Detectors.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param diagnosticCategory Diagnostic Category
     * @param slot Slot Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DetectorDefinition> listSiteDetectorsSlotAsync(final String resourceGroupName, final String siteName, final String diagnosticCategory, final String slot);

    /**
     * Get Detector.
     * Get Detector.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param diagnosticCategory Diagnostic Category
     * @param detectorName Detector Name
     * @param slot Slot Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DetectorDefinition> getSiteDetectorSlotAsync(final String resourceGroupName, final String siteName, final String diagnosticCategory, final String detectorName, final String slot);

    /**
     * Execute Detector.
     * Execute Detector.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param detectorName Detector Resource Name
     * @param diagnosticCategory Category Name
     * @param slot Slot Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticDetectorResponse> executeSiteDetectorSlotAsync(String resourceGroupName, String siteName, String detectorName, String diagnosticCategory, String slot);

    /**
     * Get Site Analysis.
     * Get Site Analysis.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param diagnosticCategory Diagnostic Category
     * @param analysisName Analysis Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticAnalysis> getSiteAnalysisAsync(String resourceGroupName, String siteName, String diagnosticCategory, String analysisName);

    /**
     * Get Site Analyses.
     * Get Site Analyses.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param diagnosticCategory Diagnostic Category
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticAnalysis> listSiteAnalysesAsync(final String resourceGroupName, final String siteName, final String diagnosticCategory);

    /**
     * Execute Analysis.
     * Execute Analysis.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param diagnosticCategory Category Name
     * @param analysisName Analysis Resource Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticAnalysis> executeSiteAnalysisAsync(String resourceGroupName, String siteName, String diagnosticCategory, String analysisName);

    /**
     * Get Site Analyses.
     * Get Site Analyses.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param diagnosticCategory Diagnostic Category
     * @param slot Slot Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AnalysisDefinition> listSiteAnalysesSlotAsync(final String resourceGroupName, final String siteName, final String diagnosticCategory, final String slot);

    /**
     * Get Site Analysis.
     * Get Site Analysis.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param diagnosticCategory Diagnostic Category
     * @param analysisName Analysis Name
     * @param slot Slot - optional
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticAnalysis> getSiteAnalysisSlotAsync(String resourceGroupName, String siteName, String diagnosticCategory, String analysisName, String slot);

    /**
     * Execute Analysis.
     * Execute Analysis.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site Name
     * @param diagnosticCategory Category Name
     * @param analysisName Analysis Resource Name
     * @param slot Slot Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticAnalysis> executeSiteAnalysisSlotAsync(String resourceGroupName, String siteName, String diagnosticCategory, String analysisName, String slot);

}
