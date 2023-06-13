// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ServerProperties;
import org.junit.jupiter.api.Assertions;

public final class ServerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerProperties model =
            BinaryData
                .fromString(
                    "{\"serverEdition\":\"yevc\",\"storageQuotaInMb\":308422624,\"vCores\":284710625,\"enableHa\":true,\"enablePublicIpAccess\":false,\"isReadOnly\":false,\"administratorLogin\":\"jzrnf\"}")
                .toObject(ServerProperties.class);
        Assertions.assertEquals("yevc", model.serverEdition());
        Assertions.assertEquals(308422624, model.storageQuotaInMb());
        Assertions.assertEquals(284710625, model.vCores());
        Assertions.assertEquals(true, model.enableHa());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerProperties model =
            new ServerProperties()
                .withServerEdition("yevc")
                .withStorageQuotaInMb(308422624)
                .withVCores(284710625)
                .withEnableHa(true);
        model = BinaryData.fromObject(model).toObject(ServerProperties.class);
        Assertions.assertEquals("yevc", model.serverEdition());
        Assertions.assertEquals(308422624, model.storageQuotaInMb());
        Assertions.assertEquals(284710625, model.vCores());
        Assertions.assertEquals(true, model.enableHa());
    }
}