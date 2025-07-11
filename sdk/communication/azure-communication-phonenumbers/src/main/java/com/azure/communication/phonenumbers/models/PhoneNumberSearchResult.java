// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.phonenumbers.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The result of a phone number search operation.
 */
@Immutable
public final class PhoneNumberSearchResult implements JsonSerializable<PhoneNumberSearchResult> {

    /*
     * The search id.
     */
    private String searchId;

    /*
     * The phone numbers that are available. Can be fewer than the desired search quantity.
     */
    private List<String> phoneNumbers;

    /*
     * The phone number's type, e.g. geographic, or tollFree.
     */
    private PhoneNumberType phoneNumberType;

    /*
     * Phone number's assignment type.
     */
    private PhoneNumberAssignmentType assignmentType;

    /*
     * Capabilities of a phone number.
     */
    private PhoneNumberCapabilities capabilities;

    /*
     * The incurred cost for a single phone number.
     */
    private PhoneNumberCost cost;

    /*
     * The date that this search result expires and phone numbers are no longer on hold. A search result expires in less than 15min, e.g. 2020-11-19T16:31:49.048Z.
     */
    private OffsetDateTime searchExpiresBy;

    /*
     * Indicates if do not resell agreement is required. If true, the phone numbers cannot be acquired unless the customer provides explicit agreement to not resell them.
     */
    private Boolean isAgreementToNotResellRequired;

    /*
     * The error code of the search.
     */
    private Integer errorCode;

    /*
     * Mapping Error Messages to Codes
     */
    private PhoneNumberSearchResultError error;

    /**
     * Creates an instance of PhoneNumberSearchResult class.
     */
    public PhoneNumberSearchResult() {
    }

    /**
     * Get the searchId property: The search id.
     *
     * @return the searchId value.
     */
    public String getSearchId() {
        return this.searchId;
    }

    /**
     * Get the phoneNumbers property: The phone numbers that are available. Can be fewer than the desired search
     * quantity.
     *
     * @return the phoneNumbers value.
     */
    public List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * Get the phoneNumberType property: The phone number's type, e.g. geographic, or tollFree.
     *
     * @return the phoneNumberType value.
     */
    public PhoneNumberType getPhoneNumberType() {
        return this.phoneNumberType;
    }

    /**
     * Get the assignmentType property: Phone number's assignment type.
     *
     * @return the assignmentType value.
     */
    public PhoneNumberAssignmentType getAssignmentType() {
        return this.assignmentType;
    }

    /**
     * Get the capabilities property: Capabilities of a phone number.
     *
     * @return the capabilities value.
     */
    public PhoneNumberCapabilities getCapabilities() {
        return this.capabilities;
    }

    /**
     * Get the cost property: The incurred cost for a single phone number.
     *
     * @return the cost value.
     */
    public PhoneNumberCost getCost() {
        return this.cost;
    }

    /**
     * Get the searchExpiresBy property: The date that this search result expires and phone numbers are no longer on
     * hold. A search result expires in less than 15min, e.g. 2020-11-19T16:31:49.048Z.
     *
     * @return the searchExpiresBy value.
     */
    public OffsetDateTime getSearchExpiresBy() {
        return this.searchExpiresBy;
    }

    /**
     * Get the isAgreementToNotResellRequired property: Indicates if do not resell agreement is required. If true, the
     * phone numbers cannot be acquired unless the customer provides explicit agreement to not resell them.
     *
     * @return the isAgreementToNotResellRequired value.
     */
    public Boolean isAgreementToNotResellRequired() {
        return this.isAgreementToNotResellRequired;
    }

    /**
     * Get the errorCode property: The error code of the search.
     *
     * @return the errorCode value.
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * Get the error property: Mapping Error Messages to Codes.
     *
     * @return the error value.
     */
    public PhoneNumberSearchResultError getError() {
        return this.error;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PhoneNumberSearchResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PhoneNumberSearchResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PhoneNumberSearchResult.
     */
    public static PhoneNumberSearchResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PhoneNumberSearchResult deserializedPhoneNumberSearchResult = new PhoneNumberSearchResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("searchId".equals(fieldName)) {
                    deserializedPhoneNumberSearchResult.searchId = reader.getString();
                } else if ("phoneNumbers".equals(fieldName)) {
                    List<String> phoneNumbers = reader.readArray(reader1 -> reader1.getString());
                    deserializedPhoneNumberSearchResult.phoneNumbers = phoneNumbers;
                } else if ("phoneNumberType".equals(fieldName)) {
                    deserializedPhoneNumberSearchResult.phoneNumberType
                        = PhoneNumberType.fromString(reader.getString());
                } else if ("assignmentType".equals(fieldName)) {
                    deserializedPhoneNumberSearchResult.assignmentType
                        = PhoneNumberAssignmentType.fromString(reader.getString());
                } else if ("capabilities".equals(fieldName)) {
                    deserializedPhoneNumberSearchResult.capabilities = PhoneNumberCapabilities.fromJson(reader);
                } else if ("cost".equals(fieldName)) {
                    deserializedPhoneNumberSearchResult.cost = PhoneNumberCost.fromJson(reader);
                } else if ("searchExpiresBy".equals(fieldName)) {
                    deserializedPhoneNumberSearchResult.searchExpiresBy
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("isAgreementToNotResellRequired".equals(fieldName)) {
                    deserializedPhoneNumberSearchResult.isAgreementToNotResellRequired
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("errorCode".equals(fieldName)) {
                    deserializedPhoneNumberSearchResult.errorCode = reader.getNullable(JsonReader::getInt);
                } else if ("error".equals(fieldName)) {
                    deserializedPhoneNumberSearchResult.error
                        = PhoneNumberSearchResultError.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedPhoneNumberSearchResult;
        });
    }
}
