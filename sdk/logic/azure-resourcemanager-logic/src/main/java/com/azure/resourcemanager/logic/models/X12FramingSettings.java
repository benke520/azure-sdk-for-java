// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The X12 agreement framing settings.
 */
@Fluent
public final class X12FramingSettings implements JsonSerializable<X12FramingSettings> {
    /*
     * The data element separator.
     */
    private int dataElementSeparator;

    /*
     * The component separator.
     */
    private int componentSeparator;

    /*
     * The value indicating whether to replace separators in payload.
     */
    private boolean replaceSeparatorsInPayload;

    /*
     * The replacement character.
     */
    private int replaceCharacter;

    /*
     * The segment terminator.
     */
    private int segmentTerminator;

    /*
     * The X12 character set.
     */
    private X12CharacterSet characterSet;

    /*
     * The segment terminator suffix.
     */
    private SegmentTerminatorSuffix segmentTerminatorSuffix;

    /**
     * Creates an instance of X12FramingSettings class.
     */
    public X12FramingSettings() {
    }

    /**
     * Get the dataElementSeparator property: The data element separator.
     * 
     * @return the dataElementSeparator value.
     */
    public int dataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * Set the dataElementSeparator property: The data element separator.
     * 
     * @param dataElementSeparator the dataElementSeparator value to set.
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withDataElementSeparator(int dataElementSeparator) {
        this.dataElementSeparator = dataElementSeparator;
        return this;
    }

    /**
     * Get the componentSeparator property: The component separator.
     * 
     * @return the componentSeparator value.
     */
    public int componentSeparator() {
        return this.componentSeparator;
    }

    /**
     * Set the componentSeparator property: The component separator.
     * 
     * @param componentSeparator the componentSeparator value to set.
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withComponentSeparator(int componentSeparator) {
        this.componentSeparator = componentSeparator;
        return this;
    }

    /**
     * Get the replaceSeparatorsInPayload property: The value indicating whether to replace separators in payload.
     * 
     * @return the replaceSeparatorsInPayload value.
     */
    public boolean replaceSeparatorsInPayload() {
        return this.replaceSeparatorsInPayload;
    }

    /**
     * Set the replaceSeparatorsInPayload property: The value indicating whether to replace separators in payload.
     * 
     * @param replaceSeparatorsInPayload the replaceSeparatorsInPayload value to set.
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withReplaceSeparatorsInPayload(boolean replaceSeparatorsInPayload) {
        this.replaceSeparatorsInPayload = replaceSeparatorsInPayload;
        return this;
    }

    /**
     * Get the replaceCharacter property: The replacement character.
     * 
     * @return the replaceCharacter value.
     */
    public int replaceCharacter() {
        return this.replaceCharacter;
    }

    /**
     * Set the replaceCharacter property: The replacement character.
     * 
     * @param replaceCharacter the replaceCharacter value to set.
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withReplaceCharacter(int replaceCharacter) {
        this.replaceCharacter = replaceCharacter;
        return this;
    }

    /**
     * Get the segmentTerminator property: The segment terminator.
     * 
     * @return the segmentTerminator value.
     */
    public int segmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * Set the segmentTerminator property: The segment terminator.
     * 
     * @param segmentTerminator the segmentTerminator value to set.
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withSegmentTerminator(int segmentTerminator) {
        this.segmentTerminator = segmentTerminator;
        return this;
    }

    /**
     * Get the characterSet property: The X12 character set.
     * 
     * @return the characterSet value.
     */
    public X12CharacterSet characterSet() {
        return this.characterSet;
    }

    /**
     * Set the characterSet property: The X12 character set.
     * 
     * @param characterSet the characterSet value to set.
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withCharacterSet(X12CharacterSet characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    /**
     * Get the segmentTerminatorSuffix property: The segment terminator suffix.
     * 
     * @return the segmentTerminatorSuffix value.
     */
    public SegmentTerminatorSuffix segmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * Set the segmentTerminatorSuffix property: The segment terminator suffix.
     * 
     * @param segmentTerminatorSuffix the segmentTerminatorSuffix value to set.
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withSegmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
        this.segmentTerminatorSuffix = segmentTerminatorSuffix;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (characterSet() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property characterSet in model X12FramingSettings"));
        }
        if (segmentTerminatorSuffix() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property segmentTerminatorSuffix in model X12FramingSettings"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(X12FramingSettings.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("dataElementSeparator", this.dataElementSeparator);
        jsonWriter.writeIntField("componentSeparator", this.componentSeparator);
        jsonWriter.writeBooleanField("replaceSeparatorsInPayload", this.replaceSeparatorsInPayload);
        jsonWriter.writeIntField("replaceCharacter", this.replaceCharacter);
        jsonWriter.writeIntField("segmentTerminator", this.segmentTerminator);
        jsonWriter.writeStringField("characterSet", this.characterSet == null ? null : this.characterSet.toString());
        jsonWriter.writeStringField("segmentTerminatorSuffix",
            this.segmentTerminatorSuffix == null ? null : this.segmentTerminatorSuffix.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of X12FramingSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of X12FramingSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the X12FramingSettings.
     */
    public static X12FramingSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            X12FramingSettings deserializedX12FramingSettings = new X12FramingSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataElementSeparator".equals(fieldName)) {
                    deserializedX12FramingSettings.dataElementSeparator = reader.getInt();
                } else if ("componentSeparator".equals(fieldName)) {
                    deserializedX12FramingSettings.componentSeparator = reader.getInt();
                } else if ("replaceSeparatorsInPayload".equals(fieldName)) {
                    deserializedX12FramingSettings.replaceSeparatorsInPayload = reader.getBoolean();
                } else if ("replaceCharacter".equals(fieldName)) {
                    deserializedX12FramingSettings.replaceCharacter = reader.getInt();
                } else if ("segmentTerminator".equals(fieldName)) {
                    deserializedX12FramingSettings.segmentTerminator = reader.getInt();
                } else if ("characterSet".equals(fieldName)) {
                    deserializedX12FramingSettings.characterSet = X12CharacterSet.fromString(reader.getString());
                } else if ("segmentTerminatorSuffix".equals(fieldName)) {
                    deserializedX12FramingSettings.segmentTerminatorSuffix
                        = SegmentTerminatorSuffix.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedX12FramingSettings;
        });
    }
}
