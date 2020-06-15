// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.faceapi.implementation;

import com.azure.ai.faceapi.models.APIErrorException;
import com.azure.ai.faceapi.models.LargePersonGroup;
import com.azure.ai.faceapi.models.MetaDataContract;
import com.azure.ai.faceapi.models.NameAndUserDataContract;
import com.azure.ai.faceapi.models.RecognitionModel;
import com.azure.ai.faceapi.models.TrainingStatus;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LargePersonGroups. */
public final class LargePersonGroupsImpl {
    /** The proxy service used to perform REST calls. */
    private final LargePersonGroupsService service;

    /** The service client containing this operation class. */
    private final FaceClientImpl client;

    /**
     * Initializes an instance of LargePersonGroupsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LargePersonGroupsImpl(FaceClientImpl client) {
        this.service = RestProxy.create(LargePersonGroupsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for FaceClientLargePersonGroups to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{Endpoint}/face/v1.0")
    @ServiceInterface(name = "FaceClientLargePerso")
    private interface LargePersonGroupsService {
        @Put("/largepersongroups/{largePersonGroupId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<Response<Void>> create(
                @HostParam("Endpoint") String endpoint,
                @PathParam("largePersonGroupId") String largePersonGroupId,
                @BodyParam("application/json") MetaDataContract body);

        @Delete("/largepersongroups/{largePersonGroupId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<Response<Void>> delete(
                @HostParam("Endpoint") String endpoint, @PathParam("largePersonGroupId") String largePersonGroupId);

        @Get("/largepersongroups/{largePersonGroupId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<Response<LargePersonGroup>> get(
                @HostParam("Endpoint") String endpoint,
                @PathParam("largePersonGroupId") String largePersonGroupId,
                @QueryParam("returnRecognitionModel") Boolean returnRecognitionModel);

        @Patch("/largepersongroups/{largePersonGroupId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<Response<Void>> update(
                @HostParam("Endpoint") String endpoint,
                @PathParam("largePersonGroupId") String largePersonGroupId,
                @BodyParam("application/json") NameAndUserDataContract body);

        @Get("/largepersongroups/{largePersonGroupId}/training")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<Response<TrainingStatus>> getTrainingStatus(
                @HostParam("Endpoint") String endpoint, @PathParam("largePersonGroupId") String largePersonGroupId);

        @Get("/largepersongroups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<Response<List<LargePersonGroup>>> list(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("start") String start,
                @QueryParam("top") Integer top,
                @QueryParam("returnRecognitionModel") Boolean returnRecognitionModel);

        @Post("/largepersongroups/{largePersonGroupId}/train")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<Response<Void>> train(
                @HostParam("Endpoint") String endpoint, @PathParam("largePersonGroupId") String largePersonGroupId);
    }

    /**
     * Create a new large person group with user-specified largePersonGroupId, name, an optional userData and
     * recognitionModel. &lt;br /&gt; A large person group is the container of the uploaded person data, including face
     * recognition feature, and up to 1,000,000 people. &lt;br /&gt; After creation, use [LargePersonGroup Person -
     * Create](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/create) to add person
     * into the group, and call [LargePersonGroup -
     * Train](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/train) to get this group ready
     * for [Face - Identify](https://docs.microsoft.com/rest/api/cognitiveservices/face/face/identify). &lt;br /&gt; No
     * image will be stored. Only the person's extracted face features and userData will be stored on server until
     * [LargePersonGroup Person -
     * Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/delete) or
     * [LargePersonGroup - Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/delete)
     * is called. &lt;br/&gt;'recognitionModel' should be specified to associate with this large person group. The
     * default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify
     * the model you need in this parameter. New faces that are added to an existing large person group will use the
     * recognition model that's already associated with the collection. Existing face features in a large person group
     * can't be updated to features extracted by another version of recognition model. * 'recognition_01': The default
     * recognition model for [LargePersonGroup -
     * Create](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/create). All those large
     * person groups created before 2019 March are bonded with this recognition model. * 'recognition_02': Recognition
     * model released in 2019 March. 'recognition_02' is recommended since its overall accuracy is improved compared
     * with 'recognition_01'.
     *
     * <p>Large person group quota: * Free-tier subscription quota: 1,000 large person groups. * S0-tier subscription
     * quota: 1,000,000 large person groups.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @param recognitionModel Name of recognition model. Recognition model is used when the face features are extracted
     *     and associated with detected faceIds, (Large)FaceList or (Large)PersonGroup. A recognition model name can be
     *     provided when performing Face - Detect or (Large)FaceList - Create or (Large)PersonGroup - Create. The
     *     default value is 'recognition_01', if latest model needed, please explicitly specify the model you need.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> createWithResponseAsync(
            String largePersonGroupId, String name, String userData, RecognitionModel recognitionModel) {
        MetaDataContract body = new MetaDataContract();
        body.setName(name);
        body.setUserData(userData);
        body.setRecognitionModel(recognitionModel);
        return service.create(this.client.getEndpoint(), largePersonGroupId, body);
    }

    /**
     * Create a new large person group with user-specified largePersonGroupId, name, an optional userData and
     * recognitionModel. &lt;br /&gt; A large person group is the container of the uploaded person data, including face
     * recognition feature, and up to 1,000,000 people. &lt;br /&gt; After creation, use [LargePersonGroup Person -
     * Create](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/create) to add person
     * into the group, and call [LargePersonGroup -
     * Train](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/train) to get this group ready
     * for [Face - Identify](https://docs.microsoft.com/rest/api/cognitiveservices/face/face/identify). &lt;br /&gt; No
     * image will be stored. Only the person's extracted face features and userData will be stored on server until
     * [LargePersonGroup Person -
     * Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/delete) or
     * [LargePersonGroup - Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/delete)
     * is called. &lt;br/&gt;'recognitionModel' should be specified to associate with this large person group. The
     * default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify
     * the model you need in this parameter. New faces that are added to an existing large person group will use the
     * recognition model that's already associated with the collection. Existing face features in a large person group
     * can't be updated to features extracted by another version of recognition model. * 'recognition_01': The default
     * recognition model for [LargePersonGroup -
     * Create](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/create). All those large
     * person groups created before 2019 March are bonded with this recognition model. * 'recognition_02': Recognition
     * model released in 2019 March. 'recognition_02' is recommended since its overall accuracy is improved compared
     * with 'recognition_01'.
     *
     * <p>Large person group quota: * Free-tier subscription quota: 1,000 large person groups. * S0-tier subscription
     * quota: 1,000,000 large person groups.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @param recognitionModel Name of recognition model. Recognition model is used when the face features are extracted
     *     and associated with detected faceIds, (Large)FaceList or (Large)PersonGroup. A recognition model name can be
     *     provided when performing Face - Detect or (Large)FaceList - Create or (Large)PersonGroup - Create. The
     *     default value is 'recognition_01', if latest model needed, please explicitly specify the model you need.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> createAsync(
            String largePersonGroupId, String name, String userData, RecognitionModel recognitionModel) {
        return createWithResponseAsync(largePersonGroupId, name, userData, recognitionModel)
                .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Create a new large person group with user-specified largePersonGroupId, name, an optional userData and
     * recognitionModel. &lt;br /&gt; A large person group is the container of the uploaded person data, including face
     * recognition feature, and up to 1,000,000 people. &lt;br /&gt; After creation, use [LargePersonGroup Person -
     * Create](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/create) to add person
     * into the group, and call [LargePersonGroup -
     * Train](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/train) to get this group ready
     * for [Face - Identify](https://docs.microsoft.com/rest/api/cognitiveservices/face/face/identify). &lt;br /&gt; No
     * image will be stored. Only the person's extracted face features and userData will be stored on server until
     * [LargePersonGroup Person -
     * Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/delete) or
     * [LargePersonGroup - Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/delete)
     * is called. &lt;br/&gt;'recognitionModel' should be specified to associate with this large person group. The
     * default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify
     * the model you need in this parameter. New faces that are added to an existing large person group will use the
     * recognition model that's already associated with the collection. Existing face features in a large person group
     * can't be updated to features extracted by another version of recognition model. * 'recognition_01': The default
     * recognition model for [LargePersonGroup -
     * Create](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/create). All those large
     * person groups created before 2019 March are bonded with this recognition model. * 'recognition_02': Recognition
     * model released in 2019 March. 'recognition_02' is recommended since its overall accuracy is improved compared
     * with 'recognition_01'.
     *
     * <p>Large person group quota: * Free-tier subscription quota: 1,000 large person groups. * S0-tier subscription
     * quota: 1,000,000 large person groups.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @param recognitionModel Name of recognition model. Recognition model is used when the face features are extracted
     *     and associated with detected faceIds, (Large)FaceList or (Large)PersonGroup. A recognition model name can be
     *     provided when performing Face - Detect or (Large)FaceList - Create or (Large)PersonGroup - Create. The
     *     default value is 'recognition_01', if latest model needed, please explicitly specify the model you need.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void create(String largePersonGroupId, String name, String userData, RecognitionModel recognitionModel) {
        createAsync(largePersonGroupId, name, userData, recognitionModel).block();
    }

    /**
     * Delete an existing large person group. Persisted face features of all people in the large person group will also
     * be deleted.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String largePersonGroupId) {
        return service.delete(this.client.getEndpoint(), largePersonGroupId);
    }

    /**
     * Delete an existing large person group. Persisted face features of all people in the large person group will also
     * be deleted.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String largePersonGroupId) {
        return deleteWithResponseAsync(largePersonGroupId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete an existing large person group. Persisted face features of all people in the large person group will also
     * be deleted.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String largePersonGroupId) {
        deleteAsync(largePersonGroupId).block();
    }

    /**
     * Retrieve the information of a large person group, including its name, userData and recognitionModel. This API
     * returns large person group information only, use [LargePersonGroup Person -
     * List](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/list) instead to retrieve
     * person information under the large person group.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in
     *     response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return large person group object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LargePersonGroup>> getWithResponseAsync(
            String largePersonGroupId, Boolean returnRecognitionModel) {
        return service.get(this.client.getEndpoint(), largePersonGroupId, returnRecognitionModel);
    }

    /**
     * Retrieve the information of a large person group, including its name, userData and recognitionModel. This API
     * returns large person group information only, use [LargePersonGroup Person -
     * List](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/list) instead to retrieve
     * person information under the large person group.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in
     *     response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return large person group object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LargePersonGroup> getAsync(String largePersonGroupId, Boolean returnRecognitionModel) {
        return getWithResponseAsync(largePersonGroupId, returnRecognitionModel)
                .flatMap(
                        (Response<LargePersonGroup> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Retrieve the information of a large person group, including its name, userData and recognitionModel. This API
     * returns large person group information only, use [LargePersonGroup Person -
     * List](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/list) instead to retrieve
     * person information under the large person group.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in
     *     response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return large person group object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LargePersonGroup get(String largePersonGroupId, Boolean returnRecognitionModel) {
        return getAsync(largePersonGroupId, returnRecognitionModel).block();
    }

    /**
     * Update an existing large person group's display name and userData. The properties which does not appear in
     * request body will not be updated.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateWithResponseAsync(String largePersonGroupId, String name, String userData) {
        NameAndUserDataContract body = new NameAndUserDataContract();
        body.setName(name);
        body.setUserData(userData);
        return service.update(this.client.getEndpoint(), largePersonGroupId, body);
    }

    /**
     * Update an existing large person group's display name and userData. The properties which does not appear in
     * request body will not be updated.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> updateAsync(String largePersonGroupId, String name, String userData) {
        return updateWithResponseAsync(largePersonGroupId, name, userData)
                .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Update an existing large person group's display name and userData. The properties which does not appear in
     * request body will not be updated.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void update(String largePersonGroupId, String name, String userData) {
        updateAsync(largePersonGroupId, name, userData).block();
    }

    /**
     * Retrieve the training status of a large person group (completed or ongoing).
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return training status object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TrainingStatus>> getTrainingStatusWithResponseAsync(String largePersonGroupId) {
        return service.getTrainingStatus(this.client.getEndpoint(), largePersonGroupId);
    }

    /**
     * Retrieve the training status of a large person group (completed or ongoing).
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return training status object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TrainingStatus> getTrainingStatusAsync(String largePersonGroupId) {
        return getTrainingStatusWithResponseAsync(largePersonGroupId)
                .flatMap(
                        (Response<TrainingStatus> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Retrieve the training status of a large person group (completed or ongoing).
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return training status object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TrainingStatus getTrainingStatus(String largePersonGroupId) {
        return getTrainingStatusAsync(largePersonGroupId).block();
    }

    /**
     * List all existing large person groups’ largePersonGroupId, name, userData and recognitionModel.&lt;br /&gt; *
     * Large person groups are stored in alphabetical order of largePersonGroupId. * "start" parameter (string,
     * optional) is a user-provided largePersonGroupId value that returned entries have larger ids by string comparison.
     * "start" set to empty to indicate return from the first item. * "top" parameter (int, optional) specifies the
     * number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can
     * specify "start" with the last returned entry’s Id of the current call. &lt;br /&gt; For example, total 5 large
     * person groups: "group1", ..., "group5". &lt;br /&gt; "start=&amp;top=" will return all 5 groups. &lt;br /&gt;
     * "start=&amp;top=2" will return "group1", "group2". &lt;br /&gt; "start=group2&amp;top=3" will return "group3",
     * "group4", "group5".
     *
     * @param start List large person groups from the least largePersonGroupId greater than the "start".
     * @param top The number of large person groups to list.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in
     *     response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of large person groups.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<LargePersonGroup>>> listWithResponseAsync(
            String start, Integer top, Boolean returnRecognitionModel) {
        return service.list(this.client.getEndpoint(), start, top, returnRecognitionModel);
    }

    /**
     * List all existing large person groups’ largePersonGroupId, name, userData and recognitionModel.&lt;br /&gt; *
     * Large person groups are stored in alphabetical order of largePersonGroupId. * "start" parameter (string,
     * optional) is a user-provided largePersonGroupId value that returned entries have larger ids by string comparison.
     * "start" set to empty to indicate return from the first item. * "top" parameter (int, optional) specifies the
     * number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can
     * specify "start" with the last returned entry’s Id of the current call. &lt;br /&gt; For example, total 5 large
     * person groups: "group1", ..., "group5". &lt;br /&gt; "start=&amp;top=" will return all 5 groups. &lt;br /&gt;
     * "start=&amp;top=2" will return "group1", "group2". &lt;br /&gt; "start=group2&amp;top=3" will return "group3",
     * "group4", "group5".
     *
     * @param start List large person groups from the least largePersonGroupId greater than the "start".
     * @param top The number of large person groups to list.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in
     *     response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of large person groups.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<LargePersonGroup>> listAsync(String start, Integer top, Boolean returnRecognitionModel) {
        return listWithResponseAsync(start, top, returnRecognitionModel)
                .flatMap(
                        (Response<List<LargePersonGroup>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * List all existing large person groups’ largePersonGroupId, name, userData and recognitionModel.&lt;br /&gt; *
     * Large person groups are stored in alphabetical order of largePersonGroupId. * "start" parameter (string,
     * optional) is a user-provided largePersonGroupId value that returned entries have larger ids by string comparison.
     * "start" set to empty to indicate return from the first item. * "top" parameter (int, optional) specifies the
     * number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can
     * specify "start" with the last returned entry’s Id of the current call. &lt;br /&gt; For example, total 5 large
     * person groups: "group1", ..., "group5". &lt;br /&gt; "start=&amp;top=" will return all 5 groups. &lt;br /&gt;
     * "start=&amp;top=2" will return "group1", "group2". &lt;br /&gt; "start=group2&amp;top=3" will return "group3",
     * "group4", "group5".
     *
     * @param start List large person groups from the least largePersonGroupId greater than the "start".
     * @param top The number of large person groups to list.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in
     *     response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of large person groups.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<LargePersonGroup> list(String start, Integer top, Boolean returnRecognitionModel) {
        return listAsync(start, top, returnRecognitionModel).block();
    }

    /**
     * Queue a large person group training task, the training task may not be started immediately.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> trainWithResponseAsync(String largePersonGroupId) {
        return service.train(this.client.getEndpoint(), largePersonGroupId);
    }

    /**
     * Queue a large person group training task, the training task may not be started immediately.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> trainAsync(String largePersonGroupId) {
        return trainWithResponseAsync(largePersonGroupId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Queue a large person group training task, the training task may not be started immediately.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void train(String largePersonGroupId) {
        trainAsync(largePersonGroupId).block();
    }
}
