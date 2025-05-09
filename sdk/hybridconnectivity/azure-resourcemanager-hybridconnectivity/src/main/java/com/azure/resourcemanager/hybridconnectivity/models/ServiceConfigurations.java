// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hybridconnectivity.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ServiceConfigurations.
 */
public interface ServiceConfigurations {
    /**
     * Gets the details about the service to the resource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param endpointName The endpoint name.
     * @param serviceConfigurationName The service name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the service to the resource along with {@link Response}.
     */
    Response<ServiceConfigurationResource> getWithResponse(String resourceUri, String endpointName,
        String serviceConfigurationName, Context context);

    /**
     * Gets the details about the service to the resource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param endpointName The endpoint name.
     * @param serviceConfigurationName The service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the service to the resource.
     */
    ServiceConfigurationResource get(String resourceUri, String endpointName, String serviceConfigurationName);

    /**
     * Deletes the service details to the target resource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param endpointName The endpoint name.
     * @param serviceConfigurationName The service name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceUri, String endpointName, String serviceConfigurationName,
        Context context);

    /**
     * Deletes the service details to the target resource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param endpointName The endpoint name.
     * @param serviceConfigurationName The service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceUri, String endpointName, String serviceConfigurationName);

    /**
     * Lists of all the services associated with endpoint resource.
     * 
     * API to enumerate registered services in service configurations under a Endpoint Resource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param endpointName The endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of serviceConfigurations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServiceConfigurationResource> listByEndpointResource(String resourceUri, String endpointName);

    /**
     * Lists of all the services associated with endpoint resource.
     * 
     * API to enumerate registered services in service configurations under a Endpoint Resource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param endpointName The endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of serviceConfigurations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServiceConfigurationResource> listByEndpointResource(String resourceUri, String endpointName,
        Context context);

    /**
     * Gets the details about the service to the resource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the service to the resource along with {@link Response}.
     */
    ServiceConfigurationResource getById(String id);

    /**
     * Gets the details about the service to the resource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the service to the resource along with {@link Response}.
     */
    Response<ServiceConfigurationResource> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the service details to the target resource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the service details to the target resource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ServiceConfigurationResource resource.
     * 
     * @param name resource name.
     * @return the first stage of the new ServiceConfigurationResource definition.
     */
    ServiceConfigurationResource.DefinitionStages.Blank define(String name);
}
