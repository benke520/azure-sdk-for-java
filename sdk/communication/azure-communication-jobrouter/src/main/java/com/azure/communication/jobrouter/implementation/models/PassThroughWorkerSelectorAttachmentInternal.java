// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Attaches a worker selector where the value is passed through from the job label with the same key. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("pass-through")
@Fluent
public final class PassThroughWorkerSelectorAttachmentInternal extends WorkerSelectorAttachmentInternal {
    /*
     * The label key to query against
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /*
     * Describes how the value of the label is compared to the value pass through
     */
    @JsonProperty(value = "labelOperator", required = true)
    private LabelOperatorInternal labelOperator;

    /*
     * Describes how long the attached label selector is valid in seconds.
     */
    @JsonProperty(value = "expiresAfterSeconds")
    private Double expiresAfterSeconds;

    /** Creates an instance of PassThroughWorkerSelectorAttachmentInternal class. */
    public PassThroughWorkerSelectorAttachmentInternal() {}

    /**
     * Get the key property: The label key to query against.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The label key to query against.
     *
     * @param key the key value to set.
     * @return the PassThroughWorkerSelectorAttachmentInternal object itself.
     */
    public PassThroughWorkerSelectorAttachmentInternal setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the labelOperator property: Describes how the value of the label is compared to the value pass through.
     *
     * @return the labelOperator value.
     */
    public LabelOperatorInternal getLabelOperator() {
        return this.labelOperator;
    }

    /**
     * Set the labelOperator property: Describes how the value of the label is compared to the value pass through.
     *
     * @param labelOperator the labelOperator value to set.
     * @return the PassThroughWorkerSelectorAttachmentInternal object itself.
     */
    public PassThroughWorkerSelectorAttachmentInternal setLabelOperator(LabelOperatorInternal labelOperator) {
        this.labelOperator = labelOperator;
        return this;
    }

    /**
     * Get the expiresAfterSeconds property: Describes how long the attached label selector is valid in seconds.
     *
     * @return the expiresAfterSeconds value.
     */
    public Double getExpiresAfterSeconds() {
        return this.expiresAfterSeconds;
    }

    /**
     * Set the expiresAfterSeconds property: Describes how long the attached label selector is valid in seconds.
     *
     * @param expiresAfterSeconds the expiresAfterSeconds value to set.
     * @return the PassThroughWorkerSelectorAttachmentInternal object itself.
     */
    public PassThroughWorkerSelectorAttachmentInternal setExpiresAfterSeconds(Double expiresAfterSeconds) {
        this.expiresAfterSeconds = expiresAfterSeconds;
        return this;
    }
}