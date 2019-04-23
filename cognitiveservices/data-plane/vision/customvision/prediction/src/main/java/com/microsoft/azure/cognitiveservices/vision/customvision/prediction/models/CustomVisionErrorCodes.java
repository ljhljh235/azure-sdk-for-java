/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.prediction.models;

import com.azure.common.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for CustomVisionErrorCodes.
 */
public final class CustomVisionErrorCodes extends ExpandableStringEnum<CustomVisionErrorCodes> {
    /**
     * Static value NoError for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes NO_ERROR = fromString("NoError");

    /**
     * Static value BadRequest for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST = fromString("BadRequest");

    /**
     * Static value BadRequestExceededBatchSize for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_EXCEEDED_BATCH_SIZE = fromString("BadRequestExceededBatchSize");

    /**
     * Static value BadRequestNotSupported for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_NOT_SUPPORTED = fromString("BadRequestNotSupported");

    /**
     * Static value BadRequestInvalidIds for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_INVALID_IDS = fromString("BadRequestInvalidIds");

    /**
     * Static value BadRequestProjectName for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PROJECT_NAME = fromString("BadRequestProjectName");

    /**
     * Static value BadRequestProjectNameNotUnique for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PROJECT_NAME_NOT_UNIQUE = fromString("BadRequestProjectNameNotUnique");

    /**
     * Static value BadRequestProjectDescription for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PROJECT_DESCRIPTION = fromString("BadRequestProjectDescription");

    /**
     * Static value BadRequestProjectUnknownDomain for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PROJECT_UNKNOWN_DOMAIN = fromString("BadRequestProjectUnknownDomain");

    /**
     * Static value BadRequestProjectUnknownClassification for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PROJECT_UNKNOWN_CLASSIFICATION = fromString("BadRequestProjectUnknownClassification");

    /**
     * Static value BadRequestProjectUnsupportedDomainTypeChange for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PROJECT_UNSUPPORTED_DOMAIN_TYPE_CHANGE = fromString("BadRequestProjectUnsupportedDomainTypeChange");

    /**
     * Static value BadRequestProjectUnsupportedExportPlatform for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PROJECT_UNSUPPORTED_EXPORT_PLATFORM = fromString("BadRequestProjectUnsupportedExportPlatform");

    /**
     * Static value BadRequestIterationName for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_ITERATION_NAME = fromString("BadRequestIterationName");

    /**
     * Static value BadRequestIterationNameNotUnique for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_ITERATION_NAME_NOT_UNIQUE = fromString("BadRequestIterationNameNotUnique");

    /**
     * Static value BadRequestIterationDescription for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_ITERATION_DESCRIPTION = fromString("BadRequestIterationDescription");

    /**
     * Static value BadRequestIterationIsNotTrained for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_ITERATION_IS_NOT_TRAINED = fromString("BadRequestIterationIsNotTrained");

    /**
     * Static value BadRequestWorkspaceCannotBeModified for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_WORKSPACE_CANNOT_BE_MODIFIED = fromString("BadRequestWorkspaceCannotBeModified");

    /**
     * Static value BadRequestWorkspaceNotDeletable for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_WORKSPACE_NOT_DELETABLE = fromString("BadRequestWorkspaceNotDeletable");

    /**
     * Static value BadRequestTagName for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_TAG_NAME = fromString("BadRequestTagName");

    /**
     * Static value BadRequestTagNameNotUnique for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_TAG_NAME_NOT_UNIQUE = fromString("BadRequestTagNameNotUnique");

    /**
     * Static value BadRequestTagDescription for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_TAG_DESCRIPTION = fromString("BadRequestTagDescription");

    /**
     * Static value BadRequestTagType for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_TAG_TYPE = fromString("BadRequestTagType");

    /**
     * Static value BadRequestMultipleNegativeTag for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_MULTIPLE_NEGATIVE_TAG = fromString("BadRequestMultipleNegativeTag");

    /**
     * Static value BadRequestImageTags for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_IMAGE_TAGS = fromString("BadRequestImageTags");

    /**
     * Static value BadRequestImageRegions for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_IMAGE_REGIONS = fromString("BadRequestImageRegions");

    /**
     * Static value BadRequestNegativeAndRegularTagOnSameImage for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_NEGATIVE_AND_REGULAR_TAG_ON_SAME_IMAGE = fromString("BadRequestNegativeAndRegularTagOnSameImage");

    /**
     * Static value BadRequestRequiredParamIsNull for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_REQUIRED_PARAM_IS_NULL = fromString("BadRequestRequiredParamIsNull");

    /**
     * Static value BadRequestIterationIsPublished for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_ITERATION_IS_PUBLISHED = fromString("BadRequestIterationIsPublished");

    /**
     * Static value BadRequestInvalidPublishName for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_INVALID_PUBLISH_NAME = fromString("BadRequestInvalidPublishName");

    /**
     * Static value BadRequestInvalidPublishTarget for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_INVALID_PUBLISH_TARGET = fromString("BadRequestInvalidPublishTarget");

    /**
     * Static value BadRequestUnpublishFailed for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_UNPUBLISH_FAILED = fromString("BadRequestUnpublishFailed");

    /**
     * Static value BadRequestSubscriptionApi for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_SUBSCRIPTION_API = fromString("BadRequestSubscriptionApi");

    /**
     * Static value BadRequestExceedProjectLimit for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_EXCEED_PROJECT_LIMIT = fromString("BadRequestExceedProjectLimit");

    /**
     * Static value BadRequestExceedIterationPerProjectLimit for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_EXCEED_ITERATION_PER_PROJECT_LIMIT = fromString("BadRequestExceedIterationPerProjectLimit");

    /**
     * Static value BadRequestExceedTagPerProjectLimit for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_EXCEED_TAG_PER_PROJECT_LIMIT = fromString("BadRequestExceedTagPerProjectLimit");

    /**
     * Static value BadRequestExceedTagPerImageLimit for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_EXCEED_TAG_PER_IMAGE_LIMIT = fromString("BadRequestExceedTagPerImageLimit");

    /**
     * Static value BadRequestExceededQuota for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_EXCEEDED_QUOTA = fromString("BadRequestExceededQuota");

    /**
     * Static value BadRequestCannotMigrateProjectWithName for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_CANNOT_MIGRATE_PROJECT_WITH_NAME = fromString("BadRequestCannotMigrateProjectWithName");

    /**
     * Static value BadRequestNotLimitedTrial for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_NOT_LIMITED_TRIAL = fromString("BadRequestNotLimitedTrial");

    /**
     * Static value BadRequestImageBatch for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_IMAGE_BATCH = fromString("BadRequestImageBatch");

    /**
     * Static value BadRequestImageStream for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_IMAGE_STREAM = fromString("BadRequestImageStream");

    /**
     * Static value BadRequestImageUrl for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_IMAGE_URL = fromString("BadRequestImageUrl");

    /**
     * Static value BadRequestImageFormat for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_IMAGE_FORMAT = fromString("BadRequestImageFormat");

    /**
     * Static value BadRequestImageSizeBytes for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_IMAGE_SIZE_BYTES = fromString("BadRequestImageSizeBytes");

    /**
     * Static value BadRequestImageExceededCount for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_IMAGE_EXCEEDED_COUNT = fromString("BadRequestImageExceededCount");

    /**
     * Static value BadRequestTrainingNotNeeded for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_TRAINING_NOT_NEEDED = fromString("BadRequestTrainingNotNeeded");

    /**
     * Static value BadRequestTrainingNotNeededButTrainingPipelineUpdated for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_TRAINING_NOT_NEEDED_BUT_TRAINING_PIPELINE_UPDATED = fromString("BadRequestTrainingNotNeededButTrainingPipelineUpdated");

    /**
     * Static value BadRequestTrainingValidationFailed for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_TRAINING_VALIDATION_FAILED = fromString("BadRequestTrainingValidationFailed");

    /**
     * Static value BadRequestClassificationTrainingValidationFailed for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_CLASSIFICATION_TRAINING_VALIDATION_FAILED = fromString("BadRequestClassificationTrainingValidationFailed");

    /**
     * Static value BadRequestMultiClassClassificationTrainingValidationFailed for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_MULTI_CLASS_CLASSIFICATION_TRAINING_VALIDATION_FAILED = fromString("BadRequestMultiClassClassificationTrainingValidationFailed");

    /**
     * Static value BadRequestMultiLabelClassificationTrainingValidationFailed for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_MULTI_LABEL_CLASSIFICATION_TRAINING_VALIDATION_FAILED = fromString("BadRequestMultiLabelClassificationTrainingValidationFailed");

    /**
     * Static value BadRequestDetectionTrainingValidationFailed for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_DETECTION_TRAINING_VALIDATION_FAILED = fromString("BadRequestDetectionTrainingValidationFailed");

    /**
     * Static value BadRequestTrainingAlreadyInProgress for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_TRAINING_ALREADY_IN_PROGRESS = fromString("BadRequestTrainingAlreadyInProgress");

    /**
     * Static value BadRequestDetectionTrainingNotAllowNegativeTag for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_DETECTION_TRAINING_NOT_ALLOW_NEGATIVE_TAG = fromString("BadRequestDetectionTrainingNotAllowNegativeTag");

    /**
     * Static value BadRequestInvalidEmailAddress for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_INVALID_EMAIL_ADDRESS = fromString("BadRequestInvalidEmailAddress");

    /**
     * Static value BadRequestDomainNotSupportedForAdvancedTraining for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_DOMAIN_NOT_SUPPORTED_FOR_ADVANCED_TRAINING = fromString("BadRequestDomainNotSupportedForAdvancedTraining");

    /**
     * Static value BadRequestExportPlatformNotSupportedForAdvancedTraining for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_EXPORT_PLATFORM_NOT_SUPPORTED_FOR_ADVANCED_TRAINING = fromString("BadRequestExportPlatformNotSupportedForAdvancedTraining");

    /**
     * Static value BadRequestReservedBudgetInHoursNotEnoughForAdvancedTraining for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_RESERVED_BUDGET_IN_HOURS_NOT_ENOUGH_FOR_ADVANCED_TRAINING = fromString("BadRequestReservedBudgetInHoursNotEnoughForAdvancedTraining");

    /**
     * Static value BadRequestExportValidationFailed for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_EXPORT_VALIDATION_FAILED = fromString("BadRequestExportValidationFailed");

    /**
     * Static value BadRequestExportAlreadyInProgress for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_EXPORT_ALREADY_IN_PROGRESS = fromString("BadRequestExportAlreadyInProgress");

    /**
     * Static value BadRequestPredictionIdsMissing for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PREDICTION_IDS_MISSING = fromString("BadRequestPredictionIdsMissing");

    /**
     * Static value BadRequestPredictionIdsExceededCount for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PREDICTION_IDS_EXCEEDED_COUNT = fromString("BadRequestPredictionIdsExceededCount");

    /**
     * Static value BadRequestPredictionTagsExceededCount for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PREDICTION_TAGS_EXCEEDED_COUNT = fromString("BadRequestPredictionTagsExceededCount");

    /**
     * Static value BadRequestPredictionResultsExceededCount for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PREDICTION_RESULTS_EXCEEDED_COUNT = fromString("BadRequestPredictionResultsExceededCount");

    /**
     * Static value BadRequestPredictionInvalidApplicationName for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PREDICTION_INVALID_APPLICATION_NAME = fromString("BadRequestPredictionInvalidApplicationName");

    /**
     * Static value BadRequestPredictionInvalidQueryParameters for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_PREDICTION_INVALID_QUERY_PARAMETERS = fromString("BadRequestPredictionInvalidQueryParameters");

    /**
     * Static value BadRequestInvalid for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes BAD_REQUEST_INVALID = fromString("BadRequestInvalid");

    /**
     * Static value UnsupportedMediaType for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes UNSUPPORTED_MEDIA_TYPE = fromString("UnsupportedMediaType");

    /**
     * Static value Forbidden for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes FORBIDDEN = fromString("Forbidden");

    /**
     * Static value ForbiddenUser for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes FORBIDDEN_USER = fromString("ForbiddenUser");

    /**
     * Static value ForbiddenUserResource for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes FORBIDDEN_USER_RESOURCE = fromString("ForbiddenUserResource");

    /**
     * Static value ForbiddenUserSignupDisabled for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes FORBIDDEN_USER_SIGNUP_DISABLED = fromString("ForbiddenUserSignupDisabled");

    /**
     * Static value ForbiddenUserSignupAllowanceExceeded for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes FORBIDDEN_USER_SIGNUP_ALLOWANCE_EXCEEDED = fromString("ForbiddenUserSignupAllowanceExceeded");

    /**
     * Static value ForbiddenUserDoesNotExist for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes FORBIDDEN_USER_DOES_NOT_EXIST = fromString("ForbiddenUserDoesNotExist");

    /**
     * Static value ForbiddenUserDisabled for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes FORBIDDEN_USER_DISABLED = fromString("ForbiddenUserDisabled");

    /**
     * Static value ForbiddenUserInsufficientCapability for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes FORBIDDEN_USER_INSUFFICIENT_CAPABILITY = fromString("ForbiddenUserInsufficientCapability");

    /**
     * Static value ForbiddenDRModeEnabled for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes FORBIDDEN_DRMODE_ENABLED = fromString("ForbiddenDRModeEnabled");

    /**
     * Static value ForbiddenInvalid for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes FORBIDDEN_INVALID = fromString("ForbiddenInvalid");

    /**
     * Static value NotFound for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes NOT_FOUND = fromString("NotFound");

    /**
     * Static value NotFoundProject for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes NOT_FOUND_PROJECT = fromString("NotFoundProject");

    /**
     * Static value NotFoundProjectDefaultIteration for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes NOT_FOUND_PROJECT_DEFAULT_ITERATION = fromString("NotFoundProjectDefaultIteration");

    /**
     * Static value NotFoundIteration for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes NOT_FOUND_ITERATION = fromString("NotFoundIteration");

    /**
     * Static value NotFoundIterationPerformance for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes NOT_FOUND_ITERATION_PERFORMANCE = fromString("NotFoundIterationPerformance");

    /**
     * Static value NotFoundTag for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes NOT_FOUND_TAG = fromString("NotFoundTag");

    /**
     * Static value NotFoundImage for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes NOT_FOUND_IMAGE = fromString("NotFoundImage");

    /**
     * Static value NotFoundDomain for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes NOT_FOUND_DOMAIN = fromString("NotFoundDomain");

    /**
     * Static value NotFoundApimSubscription for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes NOT_FOUND_APIM_SUBSCRIPTION = fromString("NotFoundApimSubscription");

    /**
     * Static value NotFoundInvalid for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes NOT_FOUND_INVALID = fromString("NotFoundInvalid");

    /**
     * Static value Conflict for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes CONFLICT = fromString("Conflict");

    /**
     * Static value ConflictInvalid for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes CONFLICT_INVALID = fromString("ConflictInvalid");

    /**
     * Static value ErrorUnknown for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_UNKNOWN = fromString("ErrorUnknown");

    /**
     * Static value ErrorProjectInvalidWorkspace for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_PROJECT_INVALID_WORKSPACE = fromString("ErrorProjectInvalidWorkspace");

    /**
     * Static value ErrorProjectInvalidPipelineConfiguration for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_PROJECT_INVALID_PIPELINE_CONFIGURATION = fromString("ErrorProjectInvalidPipelineConfiguration");

    /**
     * Static value ErrorProjectInvalidDomain for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_PROJECT_INVALID_DOMAIN = fromString("ErrorProjectInvalidDomain");

    /**
     * Static value ErrorProjectTrainingRequestFailed for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_PROJECT_TRAINING_REQUEST_FAILED = fromString("ErrorProjectTrainingRequestFailed");

    /**
     * Static value ErrorProjectExportRequestFailed for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_PROJECT_EXPORT_REQUEST_FAILED = fromString("ErrorProjectExportRequestFailed");

    /**
     * Static value ErrorFeaturizationServiceUnavailable for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_FEATURIZATION_SERVICE_UNAVAILABLE = fromString("ErrorFeaturizationServiceUnavailable");

    /**
     * Static value ErrorFeaturizationQueueTimeout for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_FEATURIZATION_QUEUE_TIMEOUT = fromString("ErrorFeaturizationQueueTimeout");

    /**
     * Static value ErrorFeaturizationInvalidFeaturizer for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_FEATURIZATION_INVALID_FEATURIZER = fromString("ErrorFeaturizationInvalidFeaturizer");

    /**
     * Static value ErrorFeaturizationAugmentationUnavailable for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_FEATURIZATION_AUGMENTATION_UNAVAILABLE = fromString("ErrorFeaturizationAugmentationUnavailable");

    /**
     * Static value ErrorFeaturizationUnrecognizedJob for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_FEATURIZATION_UNRECOGNIZED_JOB = fromString("ErrorFeaturizationUnrecognizedJob");

    /**
     * Static value ErrorFeaturizationAugmentationError for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_FEATURIZATION_AUGMENTATION_ERROR = fromString("ErrorFeaturizationAugmentationError");

    /**
     * Static value ErrorExporterInvalidPlatform for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_EXPORTER_INVALID_PLATFORM = fromString("ErrorExporterInvalidPlatform");

    /**
     * Static value ErrorExporterInvalidFeaturizer for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_EXPORTER_INVALID_FEATURIZER = fromString("ErrorExporterInvalidFeaturizer");

    /**
     * Static value ErrorExporterInvalidClassifier for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_EXPORTER_INVALID_CLASSIFIER = fromString("ErrorExporterInvalidClassifier");

    /**
     * Static value ErrorPredictionServiceUnavailable for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_PREDICTION_SERVICE_UNAVAILABLE = fromString("ErrorPredictionServiceUnavailable");

    /**
     * Static value ErrorPredictionModelNotFound for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_PREDICTION_MODEL_NOT_FOUND = fromString("ErrorPredictionModelNotFound");

    /**
     * Static value ErrorPredictionModelNotCached for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_PREDICTION_MODEL_NOT_CACHED = fromString("ErrorPredictionModelNotCached");

    /**
     * Static value ErrorPrediction for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_PREDICTION = fromString("ErrorPrediction");

    /**
     * Static value ErrorPredictionStorage for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_PREDICTION_STORAGE = fromString("ErrorPredictionStorage");

    /**
     * Static value ErrorRegionProposal for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_REGION_PROPOSAL = fromString("ErrorRegionProposal");

    /**
     * Static value ErrorInvalid for CustomVisionErrorCodes.
     */
    public static final CustomVisionErrorCodes ERROR_INVALID = fromString("ErrorInvalid");

    /**
     * Creates or finds a CustomVisionErrorCodes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CustomVisionErrorCodes.
     */
    @JsonCreator
    public static CustomVisionErrorCodes fromString(String name) {
        return fromString(name, CustomVisionErrorCodes.class);
    }

    /**
     * @return known CustomVisionErrorCodes values.
     */
    public static Collection<CustomVisionErrorCodes> values() {
        return values(CustomVisionErrorCodes.class);
    }
}
