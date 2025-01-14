// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;
import com.azure.resourcemanager.sql.fluent.models.SyncFullSchemaPropertiesInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of an Azure SQL Server Sync Group. */
@Fluent
public interface SqlSyncFullSchemaProperty extends HasInnerModel<SyncFullSchemaPropertiesInner> {

    /**
     * Gets the list of tables in the database full schema.
     *
     * @return the list of tables in the database full schema.
     */
    List<SyncFullSchemaTable> tables();

    /**
     * Gets last update time of the database schema.
     *
     * @return last update time of the database schema.
     */
    OffsetDateTime lastUpdateTime();
}
