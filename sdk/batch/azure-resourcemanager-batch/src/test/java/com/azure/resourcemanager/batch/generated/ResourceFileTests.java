// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.ComputeNodeIdentityReference;
import com.azure.resourcemanager.batch.models.ResourceFile;
import org.junit.jupiter.api.Assertions;

public final class ResourceFileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceFile model = BinaryData.fromString(
            "{\"autoStorageContainerName\":\"mncwsobqwcsdb\",\"storageContainerUrl\":\"dcfhucqdpf\",\"httpUrl\":\"glsbjjc\",\"blobPrefix\":\"vxb\",\"filePath\":\"vudutncor\",\"fileMode\":\"lxqtvcofudfl\",\"identityReference\":{\"resourceId\":\"jub\"}}")
            .toObject(ResourceFile.class);
        Assertions.assertEquals("mncwsobqwcsdb", model.autoStorageContainerName());
        Assertions.assertEquals("dcfhucqdpf", model.storageContainerUrl());
        Assertions.assertEquals("glsbjjc", model.httpUrl());
        Assertions.assertEquals("vxb", model.blobPrefix());
        Assertions.assertEquals("vudutncor", model.filePath());
        Assertions.assertEquals("lxqtvcofudfl", model.fileMode());
        Assertions.assertEquals("jub", model.identityReference().resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceFile model = new ResourceFile().withAutoStorageContainerName("mncwsobqwcsdb")
            .withStorageContainerUrl("dcfhucqdpf")
            .withHttpUrl("glsbjjc")
            .withBlobPrefix("vxb")
            .withFilePath("vudutncor")
            .withFileMode("lxqtvcofudfl")
            .withIdentityReference(new ComputeNodeIdentityReference().withResourceId("jub"));
        model = BinaryData.fromObject(model).toObject(ResourceFile.class);
        Assertions.assertEquals("mncwsobqwcsdb", model.autoStorageContainerName());
        Assertions.assertEquals("dcfhucqdpf", model.storageContainerUrl());
        Assertions.assertEquals("glsbjjc", model.httpUrl());
        Assertions.assertEquals("vxb", model.blobPrefix());
        Assertions.assertEquals("vudutncor", model.filePath());
        Assertions.assertEquals("lxqtvcofudfl", model.fileMode());
        Assertions.assertEquals("jub", model.identityReference().resourceId());
    }
}
