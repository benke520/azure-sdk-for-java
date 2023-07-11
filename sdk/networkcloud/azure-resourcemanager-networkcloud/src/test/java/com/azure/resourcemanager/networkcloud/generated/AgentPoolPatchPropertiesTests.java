// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.AgentPoolPatchProperties;
import com.azure.resourcemanager.networkcloud.models.AgentPoolUpgradeSettings;
import org.junit.jupiter.api.Assertions;

public final class AgentPoolPatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentPoolPatchProperties model =
            BinaryData
                .fromString("{\"count\":5928896004596070285,\"upgradeSettings\":{\"maxSurge\":\"g\"}}")
                .toObject(AgentPoolPatchProperties.class);
        Assertions.assertEquals(5928896004596070285L, model.count());
        Assertions.assertEquals("g", model.upgradeSettings().maxSurge());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentPoolPatchProperties model =
            new AgentPoolPatchProperties()
                .withCount(5928896004596070285L)
                .withUpgradeSettings(new AgentPoolUpgradeSettings().withMaxSurge("g"));
        model = BinaryData.fromObject(model).toObject(AgentPoolPatchProperties.class);
        Assertions.assertEquals(5928896004596070285L, model.count());
        Assertions.assertEquals("g", model.upgradeSettings().maxSurge());
    }
}