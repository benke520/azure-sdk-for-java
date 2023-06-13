// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The intended executor of the operation. */
public final class OperationOrigin extends ExpandableStringEnum<OperationOrigin> {
    /** Static value NotSpecified for OperationOrigin. */
    public static final OperationOrigin NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value user for OperationOrigin. */
    public static final OperationOrigin USER = fromString("user");

    /** Static value system for OperationOrigin. */
    public static final OperationOrigin SYSTEM = fromString("system");

    /**
     * Creates a new instance of OperationOrigin value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OperationOrigin() {
    }

    /**
     * Creates or finds a OperationOrigin from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationOrigin.
     */
    @JsonCreator
    public static OperationOrigin fromString(String name) {
        return fromString(name, OperationOrigin.class);
    }

    /**
     * Gets known OperationOrigin values.
     *
     * @return known OperationOrigin values.
     */
    public static Collection<OperationOrigin> values() {
        return values(OperationOrigin.class);
    }
}