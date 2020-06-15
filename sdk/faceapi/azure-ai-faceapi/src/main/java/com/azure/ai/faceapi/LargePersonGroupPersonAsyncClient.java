// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.faceapi;

import com.azure.ai.faceapi.implementation.LargePersonGroupPersonsImpl;
import com.azure.ai.faceapi.models.APIErrorException;
import com.azure.ai.faceapi.models.DetectionModel;
import com.azure.ai.faceapi.models.PersistedFace;
import com.azure.ai.faceapi.models.Person;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous FaceClient type. */
@ServiceClient(builder = FaceClientBuilder.class)
public final class LargePersonGroupPersonAsyncClient {
    private LargePersonGroupPersonsImpl serviceClient;

    /** Initializes an instance of LargePersonGroupPersons client. */
    LargePersonGroupPersonAsyncClient(LargePersonGroupPersonsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create a new person in a specified large person group.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return person object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Person>> createWithResponse(String largePersonGroupId, String name, String userData) {
        return this.serviceClient.createWithResponseAsync(largePersonGroupId, name, userData);
    }

    /**
     * Create a new person in a specified large person group.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return person object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Person> create(String largePersonGroupId, String name, String userData) {
        return this.serviceClient.createAsync(largePersonGroupId, name, userData);
    }

    /**
     * List all persons in a large person group, and retrieve person information (including personId, name, userData and
     * persistedFaceIds of registered faces of the person).
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param start Starting person id to return (used to list a range of persons).
     * @param top Number of persons to return starting with the person id indicated by the 'start' parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of Persons.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<Person>>> listWithResponse(String largePersonGroupId, String start, Integer top) {
        return this.serviceClient.listWithResponseAsync(largePersonGroupId, start, top);
    }

    /**
     * List all persons in a large person group, and retrieve person information (including personId, name, userData and
     * persistedFaceIds of registered faces of the person).
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param start Starting person id to return (used to list a range of persons).
     * @param top Number of persons to return starting with the person id indicated by the 'start' parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of Persons.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<Person>> list(String largePersonGroupId, String start, Integer top) {
        return this.serviceClient.listAsync(largePersonGroupId, start, top);
    }

    /**
     * Delete an existing person from a large person group. The persistedFaceId, userData, person name and face feature
     * in the person entry will all be deleted.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(String largePersonGroupId, UUID personId) {
        return this.serviceClient.deleteWithResponseAsync(largePersonGroupId, personId);
    }

    /**
     * Delete an existing person from a large person group. The persistedFaceId, userData, person name and face feature
     * in the person entry will all be deleted.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String largePersonGroupId, UUID personId) {
        return this.serviceClient.deleteAsync(largePersonGroupId, personId);
    }

    /**
     * Retrieve a person's name and userData, and the persisted faceIds representing the registered person face feature.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return person object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Person>> getWithResponse(String largePersonGroupId, UUID personId) {
        return this.serviceClient.getWithResponseAsync(largePersonGroupId, personId);
    }

    /**
     * Retrieve a person's name and userData, and the persisted faceIds representing the registered person face feature.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return person object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Person> get(String largePersonGroupId, UUID personId) {
        return this.serviceClient.getAsync(largePersonGroupId, personId);
    }

    /**
     * Update name or userData of a person.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateWithResponse(
            String largePersonGroupId, UUID personId, String name, String userData) {
        return this.serviceClient.updateWithResponseAsync(largePersonGroupId, personId, name, userData);
    }

    /**
     * Update name or userData of a person.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> update(String largePersonGroupId, UUID personId, String name, String userData) {
        return this.serviceClient.updateAsync(largePersonGroupId, personId, name, userData);
    }

    /**
     * Delete a face from a person in a large person group by specified largePersonGroupId, personId and
     * persistedFaceId. &lt;br /&gt; Adding/deleting faces to/from a same person will be processed sequentially.
     * Adding/deleting faces to/from different persons are processed in parallel.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteFaceWithResponse(String largePersonGroupId, UUID personId, UUID persistedFaceId) {
        return this.serviceClient.deleteFaceWithResponseAsync(largePersonGroupId, personId, persistedFaceId);
    }

    /**
     * Delete a face from a person in a large person group by specified largePersonGroupId, personId and
     * persistedFaceId. &lt;br /&gt; Adding/deleting faces to/from a same person will be processed sequentially.
     * Adding/deleting faces to/from different persons are processed in parallel.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteFace(String largePersonGroupId, UUID personId, UUID persistedFaceId) {
        return this.serviceClient.deleteFaceAsync(largePersonGroupId, personId, persistedFaceId);
    }

    /**
     * Retrieve information about a persisted face (specified by persistedFaceId, personId and its belonging
     * largePersonGroupId).
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return personFace object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PersistedFace>> getFaceWithResponse(
            String largePersonGroupId, UUID personId, UUID persistedFaceId) {
        return this.serviceClient.getFaceWithResponseAsync(largePersonGroupId, personId, persistedFaceId);
    }

    /**
     * Retrieve information about a persisted face (specified by persistedFaceId, personId and its belonging
     * largePersonGroupId).
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return personFace object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PersistedFace> getFace(String largePersonGroupId, UUID personId, UUID persistedFaceId) {
        return this.serviceClient.getFaceAsync(largePersonGroupId, personId, persistedFaceId);
    }

    /**
     * Update a person persisted face's userData field.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @param userData User-provided data attached to the face. The size limit is 1KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateFaceWithResponse(
            String largePersonGroupId, UUID personId, UUID persistedFaceId, String userData) {
        return this.serviceClient.updateFaceWithResponseAsync(largePersonGroupId, personId, persistedFaceId, userData);
    }

    /**
     * Update a person persisted face's userData field.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @param userData User-provided data attached to the face. The size limit is 1KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> updateFace(String largePersonGroupId, UUID personId, UUID persistedFaceId, String userData) {
        return this.serviceClient.updateFaceAsync(largePersonGroupId, personId, persistedFaceId, userData);
    }

    /**
     * Add a face to a person into a large person group for face identification or verification. To deal with an image
     * contains multiple faces, input face can be specified as an image with a targetFace rectangle. It returns a
     * persistedFaceId representing the added face. No image will be stored. Only the extracted face feature will be
     * stored on server until [LargePersonGroup PersonFace -
     * Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/deleteface),
     * [LargePersonGroup Person -
     * Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/delete) or
     * [LargePersonGroup - Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/delete)
     * is called. &lt;br /&gt; Note persistedFaceId is different from faceId generated by [Face -
     * Detect](https://docs.microsoft.com/rest/api/cognitiveservices/face/face/detectwithurl). * Higher face image
     * quality means better recognition precision. Please consider high-quality faces: frontal, clear, and face size is
     * 200x200 pixels (100 pixels between eyes) or bigger. * Each person entry can hold up to 248 faces. * JPEG, PNG,
     * GIF (the first frame), and BMP format are supported. The allowed image file size is from 1KB to 6MB. *
     * "targetFace" rectangle should contain one face. Zero or multiple faces will be regarded as an error. If the
     * provided "targetFace" rectangle is not returned from [Face -
     * Detect](https://docs.microsoft.com/rest/api/cognitiveservices/face/face/detectwithurl), there’s no guarantee to
     * detect and add the face successfully. * Out of detectable face size (36x36 - 4096x4096 pixels), large head-pose,
     * or large occlusions will cause failures. * Adding/deleting faces to/from a same person will be processed
     * sequentially. Adding/deleting faces to/from different persons are processed in parallel. * The minimum detectable
     * face size is 36x36 pixels in an image no larger than 1920x1080 pixels. Images with dimensions higher than
     * 1920x1080 pixels will need a proportionally larger minimum face size. * Different 'detectionModel' values can be
     * provided. To use and compare different detection models, please refer to [How to specify a detection
     * model](https://docs.microsoft.com/azure/cognitive-services/face/face-api-how-to-topics/specify-detection-model) |
     * Model | Recommended use-case(s) | | ---------- | -------- | | 'detection_01': | The default detection model for
     * [LargePersonGroup Person - Add
     * Face](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/addfacefromurl).
     * Recommend for near frontal face detection. For scenarios with exceptionally large angle (head-pose) faces,
     * occluded faces or wrong image orientation, the faces in such cases may not be detected. | | 'detection_02': |
     * Detection model released in 2019 May with improved accuracy especially on small, side and blurry faces. |.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @param url Publicly reachable URL of an image.
     * @param userData User-specified data about the face for any purpose. The maximum length is 1KB.
     * @param targetFace Array of TargetFaceItemsItem.
     * @param detectionModel Name of detection model. Detection model is used to detect faces in the submitted image. A
     *     detection model name can be provided when performing Face - Detect or (Large)FaceList - Add Face or
     *     (Large)PersonGroup - Add Face. The default value is 'detection_01', if another model is needed, please
     *     explicitly specify it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return personFace object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PersistedFace>> addFaceFromUrlWithResponse(
            String largePersonGroupId,
            UUID personId,
            String url,
            String userData,
            List<Integer> targetFace,
            DetectionModel detectionModel) {
        return this.serviceClient.addFaceFromUrlWithResponseAsync(
                largePersonGroupId, personId, url, userData, targetFace, detectionModel);
    }

    /**
     * Add a face to a person into a large person group for face identification or verification. To deal with an image
     * contains multiple faces, input face can be specified as an image with a targetFace rectangle. It returns a
     * persistedFaceId representing the added face. No image will be stored. Only the extracted face feature will be
     * stored on server until [LargePersonGroup PersonFace -
     * Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/deleteface),
     * [LargePersonGroup Person -
     * Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/delete) or
     * [LargePersonGroup - Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/delete)
     * is called. &lt;br /&gt; Note persistedFaceId is different from faceId generated by [Face -
     * Detect](https://docs.microsoft.com/rest/api/cognitiveservices/face/face/detectwithurl). * Higher face image
     * quality means better recognition precision. Please consider high-quality faces: frontal, clear, and face size is
     * 200x200 pixels (100 pixels between eyes) or bigger. * Each person entry can hold up to 248 faces. * JPEG, PNG,
     * GIF (the first frame), and BMP format are supported. The allowed image file size is from 1KB to 6MB. *
     * "targetFace" rectangle should contain one face. Zero or multiple faces will be regarded as an error. If the
     * provided "targetFace" rectangle is not returned from [Face -
     * Detect](https://docs.microsoft.com/rest/api/cognitiveservices/face/face/detectwithurl), there’s no guarantee to
     * detect and add the face successfully. * Out of detectable face size (36x36 - 4096x4096 pixels), large head-pose,
     * or large occlusions will cause failures. * Adding/deleting faces to/from a same person will be processed
     * sequentially. Adding/deleting faces to/from different persons are processed in parallel. * The minimum detectable
     * face size is 36x36 pixels in an image no larger than 1920x1080 pixels. Images with dimensions higher than
     * 1920x1080 pixels will need a proportionally larger minimum face size. * Different 'detectionModel' values can be
     * provided. To use and compare different detection models, please refer to [How to specify a detection
     * model](https://docs.microsoft.com/azure/cognitive-services/face/face-api-how-to-topics/specify-detection-model) |
     * Model | Recommended use-case(s) | | ---------- | -------- | | 'detection_01': | The default detection model for
     * [LargePersonGroup Person - Add
     * Face](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/addfacefromurl).
     * Recommend for near frontal face detection. For scenarios with exceptionally large angle (head-pose) faces,
     * occluded faces or wrong image orientation, the faces in such cases may not be detected. | | 'detection_02': |
     * Detection model released in 2019 May with improved accuracy especially on small, side and blurry faces. |.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @param url Publicly reachable URL of an image.
     * @param userData User-specified data about the face for any purpose. The maximum length is 1KB.
     * @param targetFace Array of TargetFaceItemsItem.
     * @param detectionModel Name of detection model. Detection model is used to detect faces in the submitted image. A
     *     detection model name can be provided when performing Face - Detect or (Large)FaceList - Add Face or
     *     (Large)PersonGroup - Add Face. The default value is 'detection_01', if another model is needed, please
     *     explicitly specify it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return personFace object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PersistedFace> addFaceFromUrl(
            String largePersonGroupId,
            UUID personId,
            String url,
            String userData,
            List<Integer> targetFace,
            DetectionModel detectionModel) {
        return this.serviceClient.addFaceFromUrlAsync(
                largePersonGroupId, personId, url, userData, targetFace, detectionModel);
    }

    /**
     * Add a face to a person into a large person group for face identification or verification. To deal with an image
     * contains multiple faces, input face can be specified as an image with a targetFace rectangle. It returns a
     * persistedFaceId representing the added face. No image will be stored. Only the extracted face feature will be
     * stored on server until [LargePersonGroup PersonFace -
     * Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/deleteface),
     * [LargePersonGroup Person -
     * Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/delete) or
     * [LargePersonGroup - Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/delete)
     * is called. &lt;br /&gt; Note persistedFaceId is different from faceId generated by [Face -
     * Detect](https://docs.microsoft.com/rest/api/cognitiveservices/face/face/detectwithurl). * Higher face image
     * quality means better recognition precision. Please consider high-quality faces: frontal, clear, and face size is
     * 200x200 pixels (100 pixels between eyes) or bigger. * Each person entry can hold up to 248 faces. * JPEG, PNG,
     * GIF (the first frame), and BMP format are supported. The allowed image file size is from 1KB to 6MB. *
     * "targetFace" rectangle should contain one face. Zero or multiple faces will be regarded as an error. If the
     * provided "targetFace" rectangle is not returned from [Face -
     * Detect](https://docs.microsoft.com/rest/api/cognitiveservices/face/face/detectwithurl), there’s no guarantee to
     * detect and add the face successfully. * Out of detectable face size (36x36 - 4096x4096 pixels), large head-pose,
     * or large occlusions will cause failures. * Adding/deleting faces to/from a same person will be processed
     * sequentially. Adding/deleting faces to/from different persons are processed in parallel. * The minimum detectable
     * face size is 36x36 pixels in an image no larger than 1920x1080 pixels. Images with dimensions higher than
     * 1920x1080 pixels will need a proportionally larger minimum face size. * Different 'detectionModel' values can be
     * provided. To use and compare different detection models, please refer to [How to specify a detection
     * model](https://docs.microsoft.com/azure/cognitive-services/face/face-api-how-to-topics/specify-detection-model) |
     * Model | Recommended use-case(s) | | ---------- | -------- | | 'detection_01': | The default detection model for
     * [LargePersonGroup Person - Add
     * Face](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/addfacefromurl).
     * Recommend for near frontal face detection. For scenarios with exceptionally large angle (head-pose) faces,
     * occluded faces or wrong image orientation, the faces in such cases may not be detected. | | 'detection_02': |
     * Detection model released in 2019 May with improved accuracy especially on small, side and blurry faces. |.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @param image An image stream.
     * @param contentLength null
     * @param userData User-specified data about the face for any purpose. The maximum length is 1KB.
     * @param targetFace Array of TargetFaceItemsItem.
     * @param detectionModel Name of detection model. Detection model is used to detect faces in the submitted image. A
     *     detection model name can be provided when performing Face - Detect or (Large)FaceList - Add Face or
     *     (Large)PersonGroup - Add Face. The default value is 'detection_01', if another model is needed, please
     *     explicitly specify it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return personFace object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PersistedFace>> addFaceFromStreamWithResponse(
            String largePersonGroupId,
            UUID personId,
            Flux<ByteBuffer> image,
            long contentLength,
            String userData,
            List<Integer> targetFace,
            DetectionModel detectionModel) {
        return this.serviceClient.addFaceFromStreamWithResponseAsync(
                largePersonGroupId, personId, image, contentLength, userData, targetFace, detectionModel);
    }

    /**
     * Add a face to a person into a large person group for face identification or verification. To deal with an image
     * contains multiple faces, input face can be specified as an image with a targetFace rectangle. It returns a
     * persistedFaceId representing the added face. No image will be stored. Only the extracted face feature will be
     * stored on server until [LargePersonGroup PersonFace -
     * Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/deleteface),
     * [LargePersonGroup Person -
     * Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/delete) or
     * [LargePersonGroup - Delete](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroup/delete)
     * is called. &lt;br /&gt; Note persistedFaceId is different from faceId generated by [Face -
     * Detect](https://docs.microsoft.com/rest/api/cognitiveservices/face/face/detectwithurl). * Higher face image
     * quality means better recognition precision. Please consider high-quality faces: frontal, clear, and face size is
     * 200x200 pixels (100 pixels between eyes) or bigger. * Each person entry can hold up to 248 faces. * JPEG, PNG,
     * GIF (the first frame), and BMP format are supported. The allowed image file size is from 1KB to 6MB. *
     * "targetFace" rectangle should contain one face. Zero or multiple faces will be regarded as an error. If the
     * provided "targetFace" rectangle is not returned from [Face -
     * Detect](https://docs.microsoft.com/rest/api/cognitiveservices/face/face/detectwithurl), there’s no guarantee to
     * detect and add the face successfully. * Out of detectable face size (36x36 - 4096x4096 pixels), large head-pose,
     * or large occlusions will cause failures. * Adding/deleting faces to/from a same person will be processed
     * sequentially. Adding/deleting faces to/from different persons are processed in parallel. * The minimum detectable
     * face size is 36x36 pixels in an image no larger than 1920x1080 pixels. Images with dimensions higher than
     * 1920x1080 pixels will need a proportionally larger minimum face size. * Different 'detectionModel' values can be
     * provided. To use and compare different detection models, please refer to [How to specify a detection
     * model](https://docs.microsoft.com/azure/cognitive-services/face/face-api-how-to-topics/specify-detection-model) |
     * Model | Recommended use-case(s) | | ---------- | -------- | | 'detection_01': | The default detection model for
     * [LargePersonGroup Person - Add
     * Face](https://docs.microsoft.com/rest/api/cognitiveservices/face/largepersongroupperson/addfacefromurl).
     * Recommend for near frontal face detection. For scenarios with exceptionally large angle (head-pose) faces,
     * occluded faces or wrong image orientation, the faces in such cases may not be detected. | | 'detection_02': |
     * Detection model released in 2019 May with improved accuracy especially on small, side and blurry faces. |.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param personId Id referencing a particular person.
     * @param image An image stream.
     * @param contentLength null
     * @param userData User-specified data about the face for any purpose. The maximum length is 1KB.
     * @param targetFace Array of TargetFaceItemsItem.
     * @param detectionModel Name of detection model. Detection model is used to detect faces in the submitted image. A
     *     detection model name can be provided when performing Face - Detect or (Large)FaceList - Add Face or
     *     (Large)PersonGroup - Add Face. The default value is 'detection_01', if another model is needed, please
     *     explicitly specify it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return personFace object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PersistedFace> addFaceFromStream(
            String largePersonGroupId,
            UUID personId,
            Flux<ByteBuffer> image,
            long contentLength,
            String userData,
            List<Integer> targetFace,
            DetectionModel detectionModel) {
        return this.serviceClient.addFaceFromStreamAsync(
                largePersonGroupId, personId, image, contentLength, userData, targetFace, detectionModel);
    }
}
