// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.iothub.fluent.models.IotHubQuotaMetricInfoInner;
import java.io.IOException;
import java.util.List;

/**
 * The JSON-serialized array of IotHubQuotaMetricInfo objects with a next link.
 */
@Fluent
public final class IotHubQuotaMetricInfoListResult implements JsonSerializable<IotHubQuotaMetricInfoListResult> {
    /*
     * The array of quota metrics objects.
     */
    private List<IotHubQuotaMetricInfoInner> value;

    /*
     * The next link.
     */
    private String nextLink;

    /**
     * Creates an instance of IotHubQuotaMetricInfoListResult class.
     */
    public IotHubQuotaMetricInfoListResult() {
    }

    /**
     * Get the value property: The array of quota metrics objects.
     * 
     * @return the value value.
     */
    public List<IotHubQuotaMetricInfoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The array of quota metrics objects.
     * 
     * @param value the value value to set.
     * @return the IotHubQuotaMetricInfoListResult object itself.
     */
    public IotHubQuotaMetricInfoListResult withValue(List<IotHubQuotaMetricInfoInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The next link.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IotHubQuotaMetricInfoListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IotHubQuotaMetricInfoListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IotHubQuotaMetricInfoListResult.
     */
    public static IotHubQuotaMetricInfoListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IotHubQuotaMetricInfoListResult deserializedIotHubQuotaMetricInfoListResult
                = new IotHubQuotaMetricInfoListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<IotHubQuotaMetricInfoInner> value
                        = reader.readArray(reader1 -> IotHubQuotaMetricInfoInner.fromJson(reader1));
                    deserializedIotHubQuotaMetricInfoListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedIotHubQuotaMetricInfoListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIotHubQuotaMetricInfoListResult;
        });
    }
}
