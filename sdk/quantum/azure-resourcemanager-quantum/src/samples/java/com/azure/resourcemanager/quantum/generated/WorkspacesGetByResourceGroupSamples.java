// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

/**
 * Samples for Workspaces GetByResourceGroup.
 */
public final class WorkspacesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/quantum/resource-manager/Microsoft.Quantum/preview/2023-11-13-preview/examples/quantumWorkspacesGet
     * .json
     */
    /**
     * Sample code: QuantumWorkspacesGet.
     * 
     * @param manager Entry point to AzureQuantumManager.
     */
    public static void quantumWorkspacesGet(com.azure.resourcemanager.quantum.AzureQuantumManager manager) {
        manager.workspaces()
            .getByResourceGroupWithResponse("quantumResourcegroup", "quantumworkspace1",
                com.azure.core.util.Context.NONE);
    }
}
