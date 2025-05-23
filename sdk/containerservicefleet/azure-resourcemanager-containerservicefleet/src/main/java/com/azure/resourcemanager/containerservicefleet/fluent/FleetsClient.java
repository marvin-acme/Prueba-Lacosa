// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerservicefleet.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetCredentialResultsInner;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetInner;
import com.azure.resourcemanager.containerservicefleet.models.FleetPatch;

/**
 * An instance of this class provides access to all the operations defined in FleetsClient.
 */
public interface FleetsClient {
    /**
     * Gets a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fleet along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FleetInner> getByResourceGroupWithResponse(String resourceGroupName, String fleetName, Context context);

    /**
     * Gets a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fleet.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetInner getByResourceGroup(String resourceGroupName, String fleetName);

    /**
     * Creates or updates a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Fleet resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FleetInner>, FleetInner> beginCreate(String resourceGroupName, String fleetName,
        FleetInner resource);

    /**
     * Creates or updates a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param resource Resource create parameters.
     * @param ifMatch The request should only proceed if an entity matches this string.
     * @param ifNoneMatch The request should only proceed if no entity matches this string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Fleet resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FleetInner>, FleetInner> beginCreate(String resourceGroupName, String fleetName,
        FleetInner resource, String ifMatch, String ifNoneMatch, Context context);

    /**
     * Creates or updates a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Fleet resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetInner create(String resourceGroupName, String fleetName, FleetInner resource);

    /**
     * Creates or updates a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param resource Resource create parameters.
     * @param ifMatch The request should only proceed if an entity matches this string.
     * @param ifNoneMatch The request should only proceed if no entity matches this string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Fleet resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetInner create(String resourceGroupName, String fleetName, FleetInner resource, String ifMatch,
        String ifNoneMatch, Context context);

    /**
     * Update a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Fleet resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FleetInner>, FleetInner> beginUpdateAsync(String resourceGroupName, String fleetName,
        FleetPatch properties);

    /**
     * Update a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param properties The resource properties to be updated.
     * @param ifMatch The request should only proceed if an entity matches this string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Fleet resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FleetInner>, FleetInner> beginUpdateAsync(String resourceGroupName, String fleetName,
        FleetPatch properties, String ifMatch, Context context);

    /**
     * Update a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Fleet resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetInner updateAsync(String resourceGroupName, String fleetName, FleetPatch properties);

    /**
     * Update a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param properties The resource properties to be updated.
     * @param ifMatch The request should only proceed if an entity matches this string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Fleet resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetInner updateAsync(String resourceGroupName, String fleetName, FleetPatch properties, String ifMatch,
        Context context);

    /**
     * Delete a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String fleetName);

    /**
     * Delete a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param ifMatch The request should only proceed if an entity matches this string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String fleetName, String ifMatch,
        Context context);

    /**
     * Delete a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String fleetName);

    /**
     * Delete a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param ifMatch The request should only proceed if an entity matches this string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String fleetName, String ifMatch, Context context);

    /**
     * Lists fleets in the specified subscription and resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Fleet list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FleetInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists fleets in the specified subscription and resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Fleet list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FleetInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists fleets in the specified subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Fleet list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FleetInner> list();

    /**
     * Lists fleets in the specified subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Fleet list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FleetInner> list(Context context);

    /**
     * Lists the user credentials of a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Credential results response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FleetCredentialResultsInner> listCredentialsWithResponse(String resourceGroupName, String fleetName,
        Context context);

    /**
     * Lists the user credentials of a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Credential results response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetCredentialResultsInner listCredentials(String resourceGroupName, String fleetName);
}
