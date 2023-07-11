// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.Layer3OptionAProperties;
import org.junit.jupiter.api.Assertions;

public final class Layer3OptionAPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Layer3OptionAProperties model =
            BinaryData
                .fromString(
                    "{\"mtu\":911357247,\"vlanId\":1795251983,\"fabricASN\":1597087074,\"peerASN\":396051915,\"bfdConfiguration\":{\"administrativeState\":\"Enabled\",\"interval\":1155079568,\"multiplier\":576283685},\"primaryIpv4Prefix\":\"durgkakmokz\",\"primaryIpv6Prefix\":\"jk\",\"secondaryIpv4Prefix\":\"fhmouwq\",\"secondaryIpv6Prefix\":\"zrfze\"}")
                .toObject(Layer3OptionAProperties.class);
        Assertions.assertEquals("durgkakmokz", model.primaryIpv4Prefix());
        Assertions.assertEquals("jk", model.primaryIpv6Prefix());
        Assertions.assertEquals("fhmouwq", model.secondaryIpv4Prefix());
        Assertions.assertEquals("zrfze", model.secondaryIpv6Prefix());
        Assertions.assertEquals(911357247, model.mtu());
        Assertions.assertEquals(1795251983, model.vlanId());
        Assertions.assertEquals(396051915, model.peerAsn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Layer3OptionAProperties model =
            new Layer3OptionAProperties()
                .withPrimaryIpv4Prefix("durgkakmokz")
                .withPrimaryIpv6Prefix("jk")
                .withSecondaryIpv4Prefix("fhmouwq")
                .withSecondaryIpv6Prefix("zrfze")
                .withMtu(911357247)
                .withVlanId(1795251983)
                .withPeerAsn(396051915)
                .withBfdConfiguration(new BfdConfiguration());
        model = BinaryData.fromObject(model).toObject(Layer3OptionAProperties.class);
        Assertions.assertEquals("durgkakmokz", model.primaryIpv4Prefix());
        Assertions.assertEquals("jk", model.primaryIpv6Prefix());
        Assertions.assertEquals("fhmouwq", model.secondaryIpv4Prefix());
        Assertions.assertEquals("zrfze", model.secondaryIpv6Prefix());
        Assertions.assertEquals(911357247, model.mtu());
        Assertions.assertEquals(1795251983, model.vlanId());
        Assertions.assertEquals(396051915, model.peerAsn());
    }
}