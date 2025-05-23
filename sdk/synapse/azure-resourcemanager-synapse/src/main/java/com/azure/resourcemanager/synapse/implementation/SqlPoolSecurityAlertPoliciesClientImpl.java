// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.synapse.fluent.SqlPoolSecurityAlertPoliciesClient;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolSecurityAlertPolicyInner;
import com.azure.resourcemanager.synapse.models.ListSqlPoolSecurityAlertPolicies;
import com.azure.resourcemanager.synapse.models.SecurityAlertPolicyName;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SqlPoolSecurityAlertPoliciesClient.
 */
public final class SqlPoolSecurityAlertPoliciesClientImpl implements SqlPoolSecurityAlertPoliciesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SqlPoolSecurityAlertPoliciesService service;

    /**
     * The service client containing this operation class.
     */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolSecurityAlertPoliciesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SqlPoolSecurityAlertPoliciesClientImpl(SynapseManagementClientImpl client) {
        this.service = RestProxy.create(SqlPoolSecurityAlertPoliciesService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientSqlPoolSecurityAlertPolicies to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    public interface SqlPoolSecurityAlertPoliciesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/securityAlertPolicies")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ListSqlPoolSecurityAlertPolicies>> list(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SqlPoolSecurityAlertPolicyInner>> get(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName,
            @PathParam("securityAlertPolicyName") SecurityAlertPolicyName securityAlertPolicyName,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SqlPoolSecurityAlertPolicyInner>> createOrUpdate(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName,
            @PathParam("securityAlertPolicyName") SecurityAlertPolicyName securityAlertPolicyName,
            @BodyParam("application/json") SqlPoolSecurityAlertPolicyInner parameters,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ListSqlPoolSecurityAlertPolicies>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * List Sql pool's security alert policies
     * 
     * Get a list of Sql pool's security alert policies.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool's security alert policies along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SqlPoolSecurityAlertPolicyInner>> listSinglePageAsync(String resourceGroupName,
        String workspaceName, String sqlPoolName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, workspaceName, sqlPoolName, accept, context))
            .<PagedResponse<SqlPoolSecurityAlertPolicyInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List Sql pool's security alert policies
     * 
     * Get a list of Sql pool's security alert policies.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool's security alert policies along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SqlPoolSecurityAlertPolicyInner>> listSinglePageAsync(String resourceGroupName,
        String workspaceName, String sqlPoolName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
                resourceGroupName, workspaceName, sqlPoolName, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * List Sql pool's security alert policies
     * 
     * Get a list of Sql pool's security alert policies.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool's security alert policies as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SqlPoolSecurityAlertPolicyInner> listAsync(String resourceGroupName, String workspaceName,
        String sqlPoolName) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List Sql pool's security alert policies
     * 
     * Get a list of Sql pool's security alert policies.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool's security alert policies as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SqlPoolSecurityAlertPolicyInner> listAsync(String resourceGroupName, String workspaceName,
        String sqlPoolName, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List Sql pool's security alert policies
     * 
     * Get a list of Sql pool's security alert policies.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool's security alert policies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SqlPoolSecurityAlertPolicyInner> list(String resourceGroupName, String workspaceName,
        String sqlPoolName) {
        return new PagedIterable<>(listAsync(resourceGroupName, workspaceName, sqlPoolName));
    }

    /**
     * List Sql pool's security alert policies
     * 
     * Get a list of Sql pool's security alert policies.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool's security alert policies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SqlPoolSecurityAlertPolicyInner> list(String resourceGroupName, String workspaceName,
        String sqlPoolName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, workspaceName, sqlPoolName, context));
    }

    /**
     * Get a Sql pool's security alert policy
     * 
     * Get a Sql pool's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool's security alert policy along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SqlPoolSecurityAlertPolicyInner>> getWithResponseAsync(String resourceGroupName,
        String workspaceName, String sqlPoolName, SecurityAlertPolicyName securityAlertPolicyName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (securityAlertPolicyName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter securityAlertPolicyName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName,
                accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a Sql pool's security alert policy
     * 
     * Get a Sql pool's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool's security alert policy along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SqlPoolSecurityAlertPolicyInner>> getWithResponseAsync(String resourceGroupName,
        String workspaceName, String sqlPoolName, SecurityAlertPolicyName securityAlertPolicyName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (securityAlertPolicyName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter securityAlertPolicyName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName, accept, context);
    }

    /**
     * Get a Sql pool's security alert policy
     * 
     * Get a Sql pool's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool's security alert policy on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SqlPoolSecurityAlertPolicyInner> getAsync(String resourceGroupName, String workspaceName,
        String sqlPoolName, SecurityAlertPolicyName securityAlertPolicyName) {
        return getWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a Sql pool's security alert policy
     * 
     * Get a Sql pool's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool's security alert policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SqlPoolSecurityAlertPolicyInner> getWithResponse(String resourceGroupName, String workspaceName,
        String sqlPoolName, SecurityAlertPolicyName securityAlertPolicyName, Context context) {
        return getWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName, context)
            .block();
    }

    /**
     * Get a Sql pool's security alert policy
     * 
     * Get a Sql pool's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool's security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SqlPoolSecurityAlertPolicyInner get(String resourceGroupName, String workspaceName, String sqlPoolName,
        SecurityAlertPolicyName securityAlertPolicyName) {
        return getWithResponse(resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName, Context.NONE)
            .getValue();
    }

    /**
     * Create or update a Sql pool's security alert policy
     * 
     * Create or update a Sql pool's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The Sql pool security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool security alert policy along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SqlPoolSecurityAlertPolicyInner>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String workspaceName, String sqlPoolName, SecurityAlertPolicyName securityAlertPolicyName,
        SqlPoolSecurityAlertPolicyInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (securityAlertPolicyName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter securityAlertPolicyName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.createOrUpdate(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName,
                parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create or update a Sql pool's security alert policy
     * 
     * Create or update a Sql pool's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The Sql pool security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool security alert policy along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SqlPoolSecurityAlertPolicyInner>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String workspaceName, String sqlPoolName, SecurityAlertPolicyName securityAlertPolicyName,
        SqlPoolSecurityAlertPolicyInner parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (securityAlertPolicyName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter securityAlertPolicyName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.createOrUpdate(this.client.getEndpoint(), this.client.getApiVersion(),
            this.client.getSubscriptionId(), resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName,
            parameters, accept, context);
    }

    /**
     * Create or update a Sql pool's security alert policy
     * 
     * Create or update a Sql pool's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The Sql pool security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool security alert policy on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SqlPoolSecurityAlertPolicyInner> createOrUpdateAsync(String resourceGroupName, String workspaceName,
        String sqlPoolName, SecurityAlertPolicyName securityAlertPolicyName,
        SqlPoolSecurityAlertPolicyInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName,
            parameters).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create or update a Sql pool's security alert policy
     * 
     * Create or update a Sql pool's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The Sql pool security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool security alert policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SqlPoolSecurityAlertPolicyInner> createOrUpdateWithResponse(String resourceGroupName,
        String workspaceName, String sqlPoolName, SecurityAlertPolicyName securityAlertPolicyName,
        SqlPoolSecurityAlertPolicyInner parameters, Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName,
            parameters, context).block();
    }

    /**
     * Create or update a Sql pool's security alert policy
     * 
     * Create or update a Sql pool's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The Sql pool security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SqlPoolSecurityAlertPolicyInner createOrUpdate(String resourceGroupName, String workspaceName,
        String sqlPoolName, SecurityAlertPolicyName securityAlertPolicyName,
        SqlPoolSecurityAlertPolicyInner parameters) {
        return createOrUpdateWithResponse(resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName,
            parameters, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SQL pool security alert policies along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SqlPoolSecurityAlertPolicyInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<SqlPoolSecurityAlertPolicyInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SQL pool security alert policies along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SqlPoolSecurityAlertPolicyInner>> listNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
