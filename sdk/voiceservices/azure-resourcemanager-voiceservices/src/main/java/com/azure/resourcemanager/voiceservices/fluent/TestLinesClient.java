// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.voiceservices.fluent.models.TestLineInner;
import com.azure.resourcemanager.voiceservices.models.TestLineUpdate;

/**
 * An instance of this class provides access to all the operations defined in TestLinesClient.
 */
public interface TestLinesClient {
    /**
     * List TestLine resources by CommunicationsGateway.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a TestLine list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TestLineInner> listByCommunicationsGateway(String resourceGroupName,
        String communicationsGatewayName);

    /**
     * List TestLine resources by CommunicationsGateway.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a TestLine list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TestLineInner> listByCommunicationsGateway(String resourceGroupName, String communicationsGatewayName,
        Context context);

    /**
     * Get a TestLine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TestLine along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TestLineInner> getWithResponse(String resourceGroupName, String communicationsGatewayName,
        String testLineName, Context context);

    /**
     * Get a TestLine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TestLine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TestLineInner get(String resourceGroupName, String communicationsGatewayName, String testLineName);

    /**
     * Create a TestLine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a TestLine resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TestLineInner>, TestLineInner> beginCreateOrUpdate(String resourceGroupName,
        String communicationsGatewayName, String testLineName, TestLineInner resource);

    /**
     * Create a TestLine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a TestLine resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TestLineInner>, TestLineInner> beginCreateOrUpdate(String resourceGroupName,
        String communicationsGatewayName, String testLineName, TestLineInner resource, Context context);

    /**
     * Create a TestLine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TestLine resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TestLineInner createOrUpdate(String resourceGroupName, String communicationsGatewayName, String testLineName,
        TestLineInner resource);

    /**
     * Create a TestLine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TestLine resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TestLineInner createOrUpdate(String resourceGroupName, String communicationsGatewayName, String testLineName,
        TestLineInner resource, Context context);

    /**
     * Delete a TestLine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String communicationsGatewayName,
        String testLineName);

    /**
     * Delete a TestLine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String communicationsGatewayName,
        String testLineName, Context context);

    /**
     * Delete a TestLine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String communicationsGatewayName, String testLineName);

    /**
     * Delete a TestLine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String communicationsGatewayName, String testLineName, Context context);

    /**
     * Update a TestLine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TestLine resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TestLineInner> updateWithResponse(String resourceGroupName, String communicationsGatewayName,
        String testLineName, TestLineUpdate properties, Context context);

    /**
     * Update a TestLine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TestLine resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TestLineInner update(String resourceGroupName, String communicationsGatewayName, String testLineName,
        TestLineUpdate properties);
}
