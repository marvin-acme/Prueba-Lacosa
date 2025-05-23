// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of SqlPoolReplicationLinks.
 */
public interface SqlPoolReplicationLinks {
    /**
     * Get SQL pool replication links
     * 
     * Lists a Sql pool's replication links.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a List Sql pool replication link request as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ReplicationLink> list(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Get SQL pool replication links
     * 
     * Lists a Sql pool's replication links.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a List Sql pool replication link request as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ReplicationLink> list(String resourceGroupName, String workspaceName, String sqlPoolName,
        Context context);

    /**
     * Get SQL pool replication link by name
     * 
     * Get SQL pool replication link by name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param linkId The ID of the replication link.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL pool replication link by name along with {@link Response}.
     */
    Response<ReplicationLink> getByNameWithResponse(String resourceGroupName, String workspaceName, String sqlPoolName,
        String linkId, Context context);

    /**
     * Get SQL pool replication link by name
     * 
     * Get SQL pool replication link by name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param linkId The ID of the replication link.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL pool replication link by name.
     */
    ReplicationLink getByName(String resourceGroupName, String workspaceName, String sqlPoolName, String linkId);
}
