// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GatewayRouteConfigProtocol. */
public final class GatewayRouteConfigProtocol extends ExpandableStringEnum<GatewayRouteConfigProtocol> {
    /** Static value HTTP for GatewayRouteConfigProtocol. */
    public static final GatewayRouteConfigProtocol HTTP = fromString("HTTP");

    /** Static value HTTPS for GatewayRouteConfigProtocol. */
    public static final GatewayRouteConfigProtocol HTTPS = fromString("HTTPS");

    /**
     * Creates or finds a GatewayRouteConfigProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GatewayRouteConfigProtocol.
     */
    @JsonCreator
    public static GatewayRouteConfigProtocol fromString(String name) {
        return fromString(name, GatewayRouteConfigProtocol.class);
    }

    /**
     * Gets known GatewayRouteConfigProtocol values.
     *
     * @return known GatewayRouteConfigProtocol values.
     */
    public static Collection<GatewayRouteConfigProtocol> values() {
        return values(GatewayRouteConfigProtocol.class);
    }
}