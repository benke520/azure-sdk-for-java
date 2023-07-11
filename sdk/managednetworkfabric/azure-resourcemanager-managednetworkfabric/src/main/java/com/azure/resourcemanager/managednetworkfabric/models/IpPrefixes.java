// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IpPrefixes. */
public interface IpPrefixes {
    /**
     * Gets an IP Prefix.
     *
     * <p>Implements IP Prefix GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipPrefixName Name of the IP Prefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IPPrefix resource definition along with {@link Response}.
     */
    Response<IpPrefix> getByResourceGroupWithResponse(String resourceGroupName, String ipPrefixName, Context context);

    /**
     * Gets an IP Prefix.
     *
     * <p>Implements IP Prefix GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipPrefixName Name of the IP Prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IPPrefix resource definition.
     */
    IpPrefix getByResourceGroup(String resourceGroupName, String ipPrefixName);

    /**
     * Deletes the IP Prefix.
     *
     * <p>Implements IP Prefix DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipPrefixName Name of the IP Prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String ipPrefixName);

    /**
     * Deletes the IP Prefix.
     *
     * <p>Implements IP Prefix DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ipPrefixName Name of the IP Prefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String ipPrefixName, Context context);

    /**
     * List IpPrefixes by resource group.
     *
     * <p>Implements IpPrefixes list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IpPrefixes as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IpPrefix> listByResourceGroup(String resourceGroupName);

    /**
     * List IpPrefixes by resource group.
     *
     * <p>Implements IpPrefixes list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IpPrefixes as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IpPrefix> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List IpPrefixes by subscription.
     *
     * <p>Implements IpPrefixes list by subscription GET method.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IpPrefixes as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IpPrefix> list();

    /**
     * List IpPrefixes by subscription.
     *
     * <p>Implements IpPrefixes list by subscription GET method.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IpPrefixes as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IpPrefix> list(Context context);

    /**
     * Gets an IP Prefix.
     *
     * <p>Implements IP Prefix GET method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IPPrefix resource definition along with {@link Response}.
     */
    IpPrefix getById(String id);

    /**
     * Gets an IP Prefix.
     *
     * <p>Implements IP Prefix GET method.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IPPrefix resource definition along with {@link Response}.
     */
    Response<IpPrefix> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the IP Prefix.
     *
     * <p>Implements IP Prefix DELETE method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the IP Prefix.
     *
     * <p>Implements IP Prefix DELETE method.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new IpPrefix resource.
     *
     * @param name resource name.
     * @return the first stage of the new IpPrefix definition.
     */
    IpPrefix.DefinitionStages.Blank define(String name);
}