// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of PolicyFragments.
 */
public interface PolicyFragments {
    /**
     * Gets all policy fragments.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     * |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter, orderBy | ge,
     * le, eq, ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq,
     * ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| value | filter | ge, le, eq, ne, gt, lt |
     * substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param orderby OData order by query option.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all policy fragments along with {@link Response}.
     */
    Response<PolicyFragmentCollection> listByServiceWithResponse(String resourceGroupName, String serviceName,
        String filter, String orderby, Integer top, Integer skip, Context context);

    /**
     * Gets all policy fragments.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all policy fragments.
     */
    PolicyFragmentCollection listByService(String resourceGroupName, String serviceName);

    /**
     * Gets the entity state (Etag) version of a policy fragment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param id A resource identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of a policy fragment.
     */
    PolicyFragmentsGetEntityTagResponse getEntityTagWithResponse(String resourceGroupName, String serviceName,
        String id, Context context);

    /**
     * Gets the entity state (Etag) version of a policy fragment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param id A resource identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getEntityTag(String resourceGroupName, String serviceName, String id);

    /**
     * Gets a policy fragment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param id A resource identifier.
     * @param format Policy fragment content format.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy fragment.
     */
    Response<PolicyFragmentContract> getWithResponse(String resourceGroupName, String serviceName, String id,
        PolicyFragmentContentFormat format, Context context);

    /**
     * Gets a policy fragment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param id A resource identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy fragment.
     */
    PolicyFragmentContract get(String resourceGroupName, String serviceName, String id);

    /**
     * Deletes a policy fragment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param id A resource identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     * request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String id, String ifMatch,
        Context context);

    /**
     * Deletes a policy fragment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param id A resource identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     * request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String id, String ifMatch);

    /**
     * Lists policy resources that reference the policy fragment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param id A resource identifier.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of resources along with {@link Response}.
     */
    Response<ResourceCollection> listReferencesWithResponse(String resourceGroupName, String serviceName, String id,
        Integer top, Integer skip, Context context);

    /**
     * Lists policy resources that reference the policy fragment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param id A resource identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of resources.
     */
    ResourceCollection listReferences(String resourceGroupName, String serviceName, String id);

    /**
     * Gets a policy fragment.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy fragment.
     */
    PolicyFragmentContract getById(String id);

    /**
     * Gets a policy fragment.
     * 
     * @param id the resource ID.
     * @param format Policy fragment content format.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy fragment.
     */
    Response<PolicyFragmentContract> getByIdWithResponse(String id, PolicyFragmentContentFormat format,
        Context context);

    /**
     * Deletes a policy fragment.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a policy fragment.
     * 
     * @param id the resource ID.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     * request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context);

    /**
     * Begins definition for a new PolicyFragmentContract resource.
     * 
     * @param name resource name.
     * @return the first stage of the new PolicyFragmentContract definition.
     */
    PolicyFragmentContract.DefinitionStages.Blank define(String name);
}
