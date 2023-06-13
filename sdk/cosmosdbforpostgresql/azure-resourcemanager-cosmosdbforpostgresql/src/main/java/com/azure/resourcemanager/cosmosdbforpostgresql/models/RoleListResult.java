// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.RoleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of roles. */
@Fluent
public final class RoleListResult {
    /*
     * The list of roles in a cluster.
     */
    @JsonProperty(value = "value")
    private List<RoleInner> value;

    /** Creates an instance of RoleListResult class. */
    public RoleListResult() {
    }

    /**
     * Get the value property: The list of roles in a cluster.
     *
     * @return the value value.
     */
    public List<RoleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of roles in a cluster.
     *
     * @param value the value value to set.
     * @return the RoleListResult object itself.
     */
    public RoleListResult withValue(List<RoleInner> value) {
        this.value = value;
        return this;
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