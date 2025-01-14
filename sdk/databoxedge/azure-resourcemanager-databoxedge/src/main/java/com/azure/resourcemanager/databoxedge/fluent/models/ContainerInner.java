// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.models.AzureContainerDataFormat;
import com.azure.resourcemanager.databoxedge.models.ContainerStatus;
import com.azure.resourcemanager.databoxedge.models.RefreshDetails;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Represents a container on the Data Box Edge/Gateway device.
 */
@Fluent
public final class ContainerInner extends ArmBaseModel {
    /*
     * The container properties.
     */
    private ContainerProperties innerProperties = new ContainerProperties();

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ContainerInner class.
     */
    public ContainerInner() {
    }

    /**
     * Get the innerProperties property: The container properties.
     * 
     * @return the innerProperties value.
     */
    private ContainerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the containerStatus property: Current status of the container.
     * 
     * @return the containerStatus value.
     */
    public ContainerStatus containerStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().containerStatus();
    }

    /**
     * Get the dataFormat property: DataFormat for Container.
     * 
     * @return the dataFormat value.
     */
    public AzureContainerDataFormat dataFormat() {
        return this.innerProperties() == null ? null : this.innerProperties().dataFormat();
    }

    /**
     * Set the dataFormat property: DataFormat for Container.
     * 
     * @param dataFormat the dataFormat value to set.
     * @return the ContainerInner object itself.
     */
    public ContainerInner withDataFormat(AzureContainerDataFormat dataFormat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withDataFormat(dataFormat);
        return this;
    }

    /**
     * Get the refreshDetails property: Details of the refresh job on this container.
     * 
     * @return the refreshDetails value.
     */
    public RefreshDetails refreshDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().refreshDetails();
    }

    /**
     * Get the createdDateTime property: The UTC time when container got created.
     * 
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDateTime();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property innerProperties in model ContainerInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContainerInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContainerInner.
     */
    public static ContainerInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerInner deserializedContainerInner = new ContainerInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedContainerInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedContainerInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedContainerInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedContainerInner.innerProperties = ContainerProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerInner;
        });
    }
}
