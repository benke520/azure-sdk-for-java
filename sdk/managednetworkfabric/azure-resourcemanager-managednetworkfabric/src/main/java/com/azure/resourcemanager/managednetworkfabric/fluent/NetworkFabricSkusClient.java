// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkFabricSkuInner;

/** An instance of this class provides access to all the operations defined in NetworkFabricSkusClient. */
public interface NetworkFabricSkusClient {
    /**
     * Gets a Network Fabric Sku.
     *
     * <p>Implements Network Fabric Sku GET method.
     *
     * @param networkFabricSkuName Name of the Network Fabric Sku.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NetworkFabricSku resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkFabricSkuInner> getWithResponse(String networkFabricSkuName, Context context);

    /**
     * Gets a Network Fabric Sku.
     *
     * <p>Implements Network Fabric Sku GET method.
     *
     * @param networkFabricSkuName Name of the Network Fabric Sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NetworkFabricSku resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkFabricSkuInner get(String networkFabricSkuName);

    /**
     * List NetworkFabricSkus by subscription.
     *
     * <p>Implements NetworkFabricSkus list by subscription GET method.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkFabricSkus as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkFabricSkuInner> list();

    /**
     * List NetworkFabricSkus by subscription.
     *
     * <p>Implements NetworkFabricSkus list by subscription GET method.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkFabricSkus as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkFabricSkuInner> list(Context context);
}