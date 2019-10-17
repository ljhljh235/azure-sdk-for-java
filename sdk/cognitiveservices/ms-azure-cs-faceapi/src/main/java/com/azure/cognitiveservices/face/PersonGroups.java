// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cognitiveservices.face;

import com.azure.cognitiveservices.face.models.PersonGroup;
import com.azure.cognitiveservices.face.models.RecognitionModel;
import com.azure.cognitiveservices.face.models.TrainingStatus;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.VoidResponse;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * PersonGroups.
 */
public interface PersonGroups {
    /**
     * Create a new person group with specified personGroupId, name, user-provided userData and recognitionModel.
     * &lt;br /&gt; A person group is the container of the uploaded person data, including face recognition features.
     * &lt;br /&gt; After creation, use [PersonGroup Person - Create](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039523c) to add persons into the group, and then call [PersonGroup - Train](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395249) to get this group ready for [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; No image will be stored. Only the person's extracted face features and userData will be stored on server until [PersonGroup Person - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039523d) or [PersonGroup - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395245) is called.
     * &lt;br/&gt;'recognitionModel' should be specified to associate with this person group. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing person group will use the recognition model that's already associated with the collection. Existing face features in a person group can't be updated to features extracted by another version of recognition model.
     * * 'recognition_01': The default recognition model for [PersonGroup - Create](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395244). All those person groups created before 2019 March are bonded with this recognition model.
     * * 'recognition_02': Recognition model released in 2019 March. 'recognition_02' is recommended since its overall accuracy is improved compared with 'recognition_01'.
     *
     * Person group quota:
     * * Free-tier subscription quota: 1,000 person groups. Each holds up to 1,000 persons.
     * * S0-tier subscription quota: 1,000,000 person groups. Each holds up to 10,000 persons.
     * * to handle larger scale face identification problem, please consider using [LargePersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/599acdee6ac60f11b48b5a9d).
     *
     * @param personGroupId Id referencing a particular person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> createWithRestResponseAsync(String personGroupId);

    /**
     * Create a new person group with specified personGroupId, name, user-provided userData and recognitionModel.
     * &lt;br /&gt; A person group is the container of the uploaded person data, including face recognition features.
     * &lt;br /&gt; After creation, use [PersonGroup Person - Create](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039523c) to add persons into the group, and then call [PersonGroup - Train](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395249) to get this group ready for [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; No image will be stored. Only the person's extracted face features and userData will be stored on server until [PersonGroup Person - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039523d) or [PersonGroup - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395245) is called.
     * &lt;br/&gt;'recognitionModel' should be specified to associate with this person group. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing person group will use the recognition model that's already associated with the collection. Existing face features in a person group can't be updated to features extracted by another version of recognition model.
     * * 'recognition_01': The default recognition model for [PersonGroup - Create](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395244). All those person groups created before 2019 March are bonded with this recognition model.
     * * 'recognition_02': Recognition model released in 2019 March. 'recognition_02' is recommended since its overall accuracy is improved compared with 'recognition_01'.
     *
     * Person group quota:
     * * Free-tier subscription quota: 1,000 person groups. Each holds up to 1,000 persons.
     * * S0-tier subscription quota: 1,000,000 person groups. Each holds up to 10,000 persons.
     * * to handle larger scale face identification problem, please consider using [LargePersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/599acdee6ac60f11b48b5a9d).
     *
     * @param personGroupId Id referencing a particular person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> createAsync(String personGroupId);

    /**
     * Create a new person group with specified personGroupId, name, user-provided userData and recognitionModel.
     * &lt;br /&gt; A person group is the container of the uploaded person data, including face recognition features.
     * &lt;br /&gt; After creation, use [PersonGroup Person - Create](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039523c) to add persons into the group, and then call [PersonGroup - Train](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395249) to get this group ready for [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; No image will be stored. Only the person's extracted face features and userData will be stored on server until [PersonGroup Person - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039523d) or [PersonGroup - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395245) is called.
     * &lt;br/&gt;'recognitionModel' should be specified to associate with this person group. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing person group will use the recognition model that's already associated with the collection. Existing face features in a person group can't be updated to features extracted by another version of recognition model.
     * * 'recognition_01': The default recognition model for [PersonGroup - Create](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395244). All those person groups created before 2019 March are bonded with this recognition model.
     * * 'recognition_02': Recognition model released in 2019 March. 'recognition_02' is recommended since its overall accuracy is improved compared with 'recognition_01'.
     *
     * Person group quota:
     * * Free-tier subscription quota: 1,000 person groups. Each holds up to 1,000 persons.
     * * S0-tier subscription quota: 1,000,000 person groups. Each holds up to 10,000 persons.
     * * to handle larger scale face identification problem, please consider using [LargePersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/599acdee6ac60f11b48b5a9d).
     *
     * @param personGroupId Id referencing a particular person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @param recognitionModel Possible values include: 'recognition_01', 'recognition_02'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> createWithRestResponseAsync(String personGroupId, String name, String userData, RecognitionModel recognitionModel);

    /**
     * Create a new person group with specified personGroupId, name, user-provided userData and recognitionModel.
     * &lt;br /&gt; A person group is the container of the uploaded person data, including face recognition features.
     * &lt;br /&gt; After creation, use [PersonGroup Person - Create](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039523c) to add persons into the group, and then call [PersonGroup - Train](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395249) to get this group ready for [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; No image will be stored. Only the person's extracted face features and userData will be stored on server until [PersonGroup Person - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039523d) or [PersonGroup - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395245) is called.
     * &lt;br/&gt;'recognitionModel' should be specified to associate with this person group. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing person group will use the recognition model that's already associated with the collection. Existing face features in a person group can't be updated to features extracted by another version of recognition model.
     * * 'recognition_01': The default recognition model for [PersonGroup - Create](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395244). All those person groups created before 2019 March are bonded with this recognition model.
     * * 'recognition_02': Recognition model released in 2019 March. 'recognition_02' is recommended since its overall accuracy is improved compared with 'recognition_01'.
     *
     * Person group quota:
     * * Free-tier subscription quota: 1,000 person groups. Each holds up to 1,000 persons.
     * * S0-tier subscription quota: 1,000,000 person groups. Each holds up to 10,000 persons.
     * * to handle larger scale face identification problem, please consider using [LargePersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/599acdee6ac60f11b48b5a9d).
     *
     * @param personGroupId Id referencing a particular person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @param recognitionModel Possible values include: 'recognition_01', 'recognition_02'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> createAsync(String personGroupId, String name, String userData, RecognitionModel recognitionModel);

    /**
     * Delete an existing person group. Persisted face features of all people in the person group will also be deleted.
     *
     * @param personGroupId Id referencing a particular person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> deleteWithRestResponseAsync(String personGroupId);

    /**
     * Delete an existing person group. Persisted face features of all people in the person group will also be deleted.
     *
     * @param personGroupId Id referencing a particular person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String personGroupId);

    /**
     * Retrieve person group name, userData and recognitionModel. To get person information under this personGroup, use [PersonGroup Person - List](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395241).
     *
     * @param personGroupId Id referencing a particular person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<PersonGroup>> getWithRestResponseAsync(String personGroupId);

    /**
     * Retrieve person group name, userData and recognitionModel. To get person information under this personGroup, use [PersonGroup Person - List](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395241).
     *
     * @param personGroupId Id referencing a particular person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PersonGroup> getAsync(String personGroupId);

    /**
     * Retrieve person group name, userData and recognitionModel. To get person information under this personGroup, use [PersonGroup Person - List](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395241).
     *
     * @param personGroupId Id referencing a particular person group.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<PersonGroup>> getWithRestResponseAsync(String personGroupId, Boolean returnRecognitionModel);

    /**
     * Retrieve person group name, userData and recognitionModel. To get person information under this personGroup, use [PersonGroup Person - List](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395241).
     *
     * @param personGroupId Id referencing a particular person group.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PersonGroup> getAsync(String personGroupId, Boolean returnRecognitionModel);

    /**
     * Update an existing person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param personGroupId Id referencing a particular person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> updateWithRestResponseAsync(String personGroupId);

    /**
     * Update an existing person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param personGroupId Id referencing a particular person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> updateAsync(String personGroupId);

    /**
     * Update an existing person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> updateWithRestResponseAsync(String personGroupId, String name, String userData);

    /**
     * Update an existing person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> updateAsync(String personGroupId, String name, String userData);

    /**
     * Retrieve the training status of a person group (completed or ongoing).
     *
     * @param personGroupId Id referencing a particular person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<TrainingStatus>> getTrainingStatusWithRestResponseAsync(String personGroupId);

    /**
     * Retrieve the training status of a person group (completed or ongoing).
     *
     * @param personGroupId Id referencing a particular person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<TrainingStatus> getTrainingStatusAsync(String personGroupId);

    /**
     * List person groups’ personGroupId, name, userData and recognitionModel.&lt;br /&gt;
     * * Person groups are stored in alphabetical order of personGroupId.
     * * "start" parameter (string, optional) is a user-provided personGroupId value that returned entries have larger ids by string comparison. "start" set to empty to indicate return from the first item.
     * * "top" parameter (int, optional) specifies the number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can specify "start" with the last returned entry’s Id of the current call.
     * &lt;br /&gt;
     * For example, total 5 person groups: "group1", ..., "group5".
     * &lt;br /&gt; "start=&amp;top=" will return all 5 groups.
     * &lt;br /&gt; "start=&amp;top=2" will return "group1", "group2".
     * &lt;br /&gt; "start=group2&amp;top=3" will return "group3", "group4", "group5".
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<List<PersonGroup>>> listWithRestResponseAsync();

    /**
     * List person groups’ personGroupId, name, userData and recognitionModel.&lt;br /&gt;
     * * Person groups are stored in alphabetical order of personGroupId.
     * * "start" parameter (string, optional) is a user-provided personGroupId value that returned entries have larger ids by string comparison. "start" set to empty to indicate return from the first item.
     * * "top" parameter (int, optional) specifies the number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can specify "start" with the last returned entry’s Id of the current call.
     * &lt;br /&gt;
     * For example, total 5 person groups: "group1", ..., "group5".
     * &lt;br /&gt; "start=&amp;top=" will return all 5 groups.
     * &lt;br /&gt; "start=&amp;top=2" will return "group1", "group2".
     * &lt;br /&gt; "start=group2&amp;top=3" will return "group3", "group4", "group5".
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<List<PersonGroup>> listAsync();

    /**
     * List person groups’ personGroupId, name, userData and recognitionModel.&lt;br /&gt;
     * * Person groups are stored in alphabetical order of personGroupId.
     * * "start" parameter (string, optional) is a user-provided personGroupId value that returned entries have larger ids by string comparison. "start" set to empty to indicate return from the first item.
     * * "top" parameter (int, optional) specifies the number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can specify "start" with the last returned entry’s Id of the current call.
     * &lt;br /&gt;
     * For example, total 5 person groups: "group1", ..., "group5".
     * &lt;br /&gt; "start=&amp;top=" will return all 5 groups.
     * &lt;br /&gt; "start=&amp;top=2" will return "group1", "group2".
     * &lt;br /&gt; "start=group2&amp;top=3" will return "group3", "group4", "group5".
     *
     * @param start List person groups from the least personGroupId greater than the "start".
     * @param top The number of person groups to list.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<List<PersonGroup>>> listWithRestResponseAsync(String start, Integer top, Boolean returnRecognitionModel);

    /**
     * List person groups’ personGroupId, name, userData and recognitionModel.&lt;br /&gt;
     * * Person groups are stored in alphabetical order of personGroupId.
     * * "start" parameter (string, optional) is a user-provided personGroupId value that returned entries have larger ids by string comparison. "start" set to empty to indicate return from the first item.
     * * "top" parameter (int, optional) specifies the number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can specify "start" with the last returned entry’s Id of the current call.
     * &lt;br /&gt;
     * For example, total 5 person groups: "group1", ..., "group5".
     * &lt;br /&gt; "start=&amp;top=" will return all 5 groups.
     * &lt;br /&gt; "start=&amp;top=2" will return "group1", "group2".
     * &lt;br /&gt; "start=group2&amp;top=3" will return "group3", "group4", "group5".
     *
     * @param start List person groups from the least personGroupId greater than the "start".
     * @param top The number of person groups to list.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<List<PersonGroup>> listAsync(String start, Integer top, Boolean returnRecognitionModel);

    /**
     * Queue a person group training task, the training task may not be started immediately.
     *
     * @param personGroupId Id referencing a particular person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> trainWithRestResponseAsync(String personGroupId);

    /**
     * Queue a person group training task, the training task may not be started immediately.
     *
     * @param personGroupId Id referencing a particular person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> trainAsync(String personGroupId);
}
