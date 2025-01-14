// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * This represents the payload required to import a virtual machine from a different lab into the current one.
 */
@Fluent
public final class ImportLabVirtualMachineRequest implements JsonSerializable<ImportLabVirtualMachineRequest> {
    /*
     * The full resource ID of the virtual machine to be imported.
     */
    private String sourceVirtualMachineResourceId;

    /*
     * The name of the virtual machine in the destination lab
     */
    private String destinationVirtualMachineName;

    /**
     * Creates an instance of ImportLabVirtualMachineRequest class.
     */
    public ImportLabVirtualMachineRequest() {
    }

    /**
     * Get the sourceVirtualMachineResourceId property: The full resource ID of the virtual machine to be imported.
     * 
     * @return the sourceVirtualMachineResourceId value.
     */
    public String sourceVirtualMachineResourceId() {
        return this.sourceVirtualMachineResourceId;
    }

    /**
     * Set the sourceVirtualMachineResourceId property: The full resource ID of the virtual machine to be imported.
     * 
     * @param sourceVirtualMachineResourceId the sourceVirtualMachineResourceId value to set.
     * @return the ImportLabVirtualMachineRequest object itself.
     */
    public ImportLabVirtualMachineRequest withSourceVirtualMachineResourceId(String sourceVirtualMachineResourceId) {
        this.sourceVirtualMachineResourceId = sourceVirtualMachineResourceId;
        return this;
    }

    /**
     * Get the destinationVirtualMachineName property: The name of the virtual machine in the destination lab.
     * 
     * @return the destinationVirtualMachineName value.
     */
    public String destinationVirtualMachineName() {
        return this.destinationVirtualMachineName;
    }

    /**
     * Set the destinationVirtualMachineName property: The name of the virtual machine in the destination lab.
     * 
     * @param destinationVirtualMachineName the destinationVirtualMachineName value to set.
     * @return the ImportLabVirtualMachineRequest object itself.
     */
    public ImportLabVirtualMachineRequest withDestinationVirtualMachineName(String destinationVirtualMachineName) {
        this.destinationVirtualMachineName = destinationVirtualMachineName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sourceVirtualMachineResourceId", this.sourceVirtualMachineResourceId);
        jsonWriter.writeStringField("destinationVirtualMachineName", this.destinationVirtualMachineName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImportLabVirtualMachineRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImportLabVirtualMachineRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ImportLabVirtualMachineRequest.
     */
    public static ImportLabVirtualMachineRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImportLabVirtualMachineRequest deserializedImportLabVirtualMachineRequest
                = new ImportLabVirtualMachineRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceVirtualMachineResourceId".equals(fieldName)) {
                    deserializedImportLabVirtualMachineRequest.sourceVirtualMachineResourceId = reader.getString();
                } else if ("destinationVirtualMachineName".equals(fieldName)) {
                    deserializedImportLabVirtualMachineRequest.destinationVirtualMachineName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImportLabVirtualMachineRequest;
        });
    }
}
