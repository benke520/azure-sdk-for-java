// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

/**
 * Samples for Apis Get.
 */
public final class ApisGetSamples {
    /*
     * x-ms-original-file:
     * specification/apicenter/resource-manager/Microsoft.ApiCenter/stable/2024-03-01/examples/Apis_Get.json
     */
    /**
     * Sample code: Apis_Get.
     * 
     * @param manager Entry point to ApiCenterManager.
     */
    public static void apisGet(com.azure.resourcemanager.apicenter.ApiCenterManager manager) {
        manager.apis()
            .getWithResponse("contoso-resources", "contoso", "default", "echo-api", com.azure.core.util.Context.NONE);
    }
}
