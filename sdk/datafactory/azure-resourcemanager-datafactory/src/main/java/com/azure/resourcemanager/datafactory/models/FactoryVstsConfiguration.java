// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Factory's VSTS repo information.
 */
@Fluent
public final class FactoryVstsConfiguration extends FactoryRepoConfiguration {
    /*
     * Type of repo configuration.
     */
    private String type = "FactoryVSTSConfiguration";

    /*
     * VSTS project name.
     */
    private String projectName;

    /*
     * VSTS tenant id.
     */
    private String tenantId;

    /**
     * Creates an instance of FactoryVstsConfiguration class.
     */
    public FactoryVstsConfiguration() {
    }

    /**
     * Get the type property: Type of repo configuration.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the projectName property: VSTS project name.
     * 
     * @return the projectName value.
     */
    public String projectName() {
        return this.projectName;
    }

    /**
     * Set the projectName property: VSTS project name.
     * 
     * @param projectName the projectName value to set.
     * @return the FactoryVstsConfiguration object itself.
     */
    public FactoryVstsConfiguration withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get the tenantId property: VSTS tenant id.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: VSTS tenant id.
     * 
     * @param tenantId the tenantId value to set.
     * @return the FactoryVstsConfiguration object itself.
     */
    public FactoryVstsConfiguration withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FactoryVstsConfiguration withAccountName(String accountName) {
        super.withAccountName(accountName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FactoryVstsConfiguration withRepositoryName(String repositoryName) {
        super.withRepositoryName(repositoryName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FactoryVstsConfiguration withCollaborationBranch(String collaborationBranch) {
        super.withCollaborationBranch(collaborationBranch);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FactoryVstsConfiguration withRootFolder(String rootFolder) {
        super.withRootFolder(rootFolder);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FactoryVstsConfiguration withLastCommitId(String lastCommitId) {
        super.withLastCommitId(lastCommitId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FactoryVstsConfiguration withDisablePublish(Boolean disablePublish) {
        super.withDisablePublish(disablePublish);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (projectName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property projectName in model FactoryVstsConfiguration"));
        }
        if (accountName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property accountName in model FactoryVstsConfiguration"));
        }
        if (repositoryName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property repositoryName in model FactoryVstsConfiguration"));
        }
        if (collaborationBranch() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property collaborationBranch in model FactoryVstsConfiguration"));
        }
        if (rootFolder() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property rootFolder in model FactoryVstsConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FactoryVstsConfiguration.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("accountName", accountName());
        jsonWriter.writeStringField("repositoryName", repositoryName());
        jsonWriter.writeStringField("collaborationBranch", collaborationBranch());
        jsonWriter.writeStringField("rootFolder", rootFolder());
        jsonWriter.writeStringField("lastCommitId", lastCommitId());
        jsonWriter.writeBooleanField("disablePublish", disablePublish());
        jsonWriter.writeStringField("projectName", this.projectName);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("tenantId", this.tenantId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FactoryVstsConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FactoryVstsConfiguration if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FactoryVstsConfiguration.
     */
    public static FactoryVstsConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FactoryVstsConfiguration deserializedFactoryVstsConfiguration = new FactoryVstsConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("accountName".equals(fieldName)) {
                    deserializedFactoryVstsConfiguration.withAccountName(reader.getString());
                } else if ("repositoryName".equals(fieldName)) {
                    deserializedFactoryVstsConfiguration.withRepositoryName(reader.getString());
                } else if ("collaborationBranch".equals(fieldName)) {
                    deserializedFactoryVstsConfiguration.withCollaborationBranch(reader.getString());
                } else if ("rootFolder".equals(fieldName)) {
                    deserializedFactoryVstsConfiguration.withRootFolder(reader.getString());
                } else if ("lastCommitId".equals(fieldName)) {
                    deserializedFactoryVstsConfiguration.withLastCommitId(reader.getString());
                } else if ("disablePublish".equals(fieldName)) {
                    deserializedFactoryVstsConfiguration.withDisablePublish(reader.getNullable(JsonReader::getBoolean));
                } else if ("projectName".equals(fieldName)) {
                    deserializedFactoryVstsConfiguration.projectName = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedFactoryVstsConfiguration.type = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedFactoryVstsConfiguration.tenantId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFactoryVstsConfiguration;
        });
    }
}
