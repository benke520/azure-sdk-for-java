// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.OperationsClient;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.OperationInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.Operation;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.Operations;

public final class OperationsImpl implements Operations {
    private static final ClientLogger LOGGER = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient,
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Operation> list() {
        PagedIterable<OperationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new OperationImpl(inner1, this.manager()));
    }

    public PagedIterable<Operation> list(Context context) {
        PagedIterable<OperationInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new OperationImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager() {
        return this.serviceManager;
    }
}