// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.fluent.models.ModelCapacityListResultValueItemInner;

/**
 * An instance of this class provides access to all the operations defined in LocationBasedModelCapacitiesClient.
 */
public interface LocationBasedModelCapacitiesClient {
    /**
     * List Location Based ModelCapacities.
     * 
     * @param location Resource location.
     * @param modelFormat The format of the Model.
     * @param modelName The name of the Model.
     * @param modelVersion The version of the Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ModelCapacityListResultValueItemInner> list(String location, String modelFormat, String modelName,
        String modelVersion);

    /**
     * List Location Based ModelCapacities.
     * 
     * @param location Resource location.
     * @param modelFormat The format of the Model.
     * @param modelName The name of the Model.
     * @param modelVersion The version of the Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ModelCapacityListResultValueItemInner> list(String location, String modelFormat, String modelName,
        String modelVersion, Context context);
}
