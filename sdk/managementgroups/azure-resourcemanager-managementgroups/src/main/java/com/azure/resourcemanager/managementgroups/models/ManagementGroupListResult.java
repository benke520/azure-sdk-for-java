// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managementgroups.fluent.models.ManagementGroupInfoInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the result of the request to list management groups. */
@Fluent
public final class ManagementGroupListResult {
    /*
     * The list of management groups.
     */
    @JsonProperty(value = "value")
    private List<ManagementGroupInfoInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "@nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of ManagementGroupListResult class. */
    public ManagementGroupListResult() {
    }

    /**
     * Get the value property: The list of management groups.
     *
     * @return the value value.
     */
    public List<ManagementGroupInfoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of management groups.
     *
     * @param value the value value to set.
     * @return the ManagementGroupListResult object itself.
     */
    public ManagementGroupListResult withValue(List<ManagementGroupInfoInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
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
}