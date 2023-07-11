// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRestoreWithRehydrationRequest;
import com.azure.resourcemanager.dataprotection.models.RecoveryOption;
import com.azure.resourcemanager.dataprotection.models.RehydrationPriority;
import com.azure.resourcemanager.dataprotection.models.RestoreTargetInfoBase;
import com.azure.resourcemanager.dataprotection.models.SourceDataStoreType;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupRestoreWithRehydrationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupRestoreWithRehydrationRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureBackupRestoreWithRehydrationRequest\",\"rehydrationPriority\":\"High\",\"rehydrationRetentionDuration\":\"vdlhewpusdsttwv\",\"recoveryPointId\":\"gvbbejdcng\",\"restoreTargetInfo\":{\"objectType\":\"RestoreTargetInfoBase\",\"recoveryOption\":\"FailIfExists\",\"restoreLocation\":\"oakufgm\"},\"sourceDataStoreType\":\"ArchiveStore\",\"sourceResourceId\":\"wr\"}")
                .toObject(AzureBackupRestoreWithRehydrationRequest.class);
        Assertions.assertEquals(RecoveryOption.FAIL_IF_EXISTS, model.restoreTargetInfo().recoveryOption());
        Assertions.assertEquals("oakufgm", model.restoreTargetInfo().restoreLocation());
        Assertions.assertEquals(SourceDataStoreType.ARCHIVE_STORE, model.sourceDataStoreType());
        Assertions.assertEquals("wr", model.sourceResourceId());
        Assertions.assertEquals("gvbbejdcng", model.recoveryPointId());
        Assertions.assertEquals(RehydrationPriority.HIGH, model.rehydrationPriority());
        Assertions.assertEquals("vdlhewpusdsttwv", model.rehydrationRetentionDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupRestoreWithRehydrationRequest model =
            new AzureBackupRestoreWithRehydrationRequest()
                .withRestoreTargetInfo(
                    new RestoreTargetInfoBase()
                        .withRecoveryOption(RecoveryOption.FAIL_IF_EXISTS)
                        .withRestoreLocation("oakufgm"))
                .withSourceDataStoreType(SourceDataStoreType.ARCHIVE_STORE)
                .withSourceResourceId("wr")
                .withRecoveryPointId("gvbbejdcng")
                .withRehydrationPriority(RehydrationPriority.HIGH)
                .withRehydrationRetentionDuration("vdlhewpusdsttwv");
        model = BinaryData.fromObject(model).toObject(AzureBackupRestoreWithRehydrationRequest.class);
        Assertions.assertEquals(RecoveryOption.FAIL_IF_EXISTS, model.restoreTargetInfo().recoveryOption());
        Assertions.assertEquals("oakufgm", model.restoreTargetInfo().restoreLocation());
        Assertions.assertEquals(SourceDataStoreType.ARCHIVE_STORE, model.sourceDataStoreType());
        Assertions.assertEquals("wr", model.sourceResourceId());
        Assertions.assertEquals("gvbbejdcng", model.recoveryPointId());
        Assertions.assertEquals(RehydrationPriority.HIGH, model.rehydrationPriority());
        Assertions.assertEquals("vdlhewpusdsttwv", model.rehydrationRetentionDuration());
    }
}