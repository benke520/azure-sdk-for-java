// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.models.ResourceProviderOperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class ResourceProviderOperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceProviderOperationDisplay model = BinaryData
            .fromString(
                "{\"provider\":\"gqzcjr\",\"resource\":\"djzlmwlx\",\"operation\":\"ug\",\"description\":\"zovawjvz\"}")
            .toObject(ResourceProviderOperationDisplay.class);
        Assertions.assertEquals("gqzcjr", model.provider());
        Assertions.assertEquals("djzlmwlx", model.resource());
        Assertions.assertEquals("ug", model.operation());
        Assertions.assertEquals("zovawjvz", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceProviderOperationDisplay model = new ResourceProviderOperationDisplay().withProvider("gqzcjr")
            .withResource("djzlmwlx")
            .withOperation("ug")
            .withDescription("zovawjvz");
        model = BinaryData.fromObject(model).toObject(ResourceProviderOperationDisplay.class);
        Assertions.assertEquals("gqzcjr", model.provider());
        Assertions.assertEquals("djzlmwlx", model.resource());
        Assertions.assertEquals("ug", model.operation());
        Assertions.assertEquals("zovawjvz", model.description());
    }
}
