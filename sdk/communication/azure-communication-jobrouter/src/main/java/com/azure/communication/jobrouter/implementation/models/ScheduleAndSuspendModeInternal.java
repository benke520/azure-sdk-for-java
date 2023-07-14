// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The ScheduleAndSuspendModeInternal model. */
@Fluent
public final class ScheduleAndSuspendModeInternal {
    /*
     * The scheduleAt property.
     */
    @JsonProperty(value = "scheduleAt")
    private OffsetDateTime scheduleAt;

    /** Creates an instance of ScheduleAndSuspendModeInternal class. */
    public ScheduleAndSuspendModeInternal() {}

    /**
     * Get the scheduleAt property: The scheduleAt property.
     *
     * @return the scheduleAt value.
     */
    public OffsetDateTime getScheduleAt() {
        return this.scheduleAt;
    }

    /**
     * Set the scheduleAt property: The scheduleAt property.
     *
     * @param scheduleAt the scheduleAt value to set.
     * @return the ScheduleAndSuspendModeInternal object itself.
     */
    public ScheduleAndSuspendModeInternal setScheduleAt(OffsetDateTime scheduleAt) {
        this.scheduleAt = scheduleAt;
        return this;
    }
}