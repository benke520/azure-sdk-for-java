// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of IPv4 and IPv6 route configurations. */
@Fluent
public final class AggregateRouteConfiguration {
    /*
     * List of IPv4 Route prefixes.
     */
    @JsonProperty(value = "ipv4Routes")
    private List<AggregateRoute> ipv4Routes;

    /*
     * List of IPv6 Routes prefixes.
     */
    @JsonProperty(value = "ipv6Routes")
    private List<AggregateRoute> ipv6Routes;

    /** Creates an instance of AggregateRouteConfiguration class. */
    public AggregateRouteConfiguration() {
    }

    /**
     * Get the ipv4Routes property: List of IPv4 Route prefixes.
     *
     * @return the ipv4Routes value.
     */
    public List<AggregateRoute> ipv4Routes() {
        return this.ipv4Routes;
    }

    /**
     * Set the ipv4Routes property: List of IPv4 Route prefixes.
     *
     * @param ipv4Routes the ipv4Routes value to set.
     * @return the AggregateRouteConfiguration object itself.
     */
    public AggregateRouteConfiguration withIpv4Routes(List<AggregateRoute> ipv4Routes) {
        this.ipv4Routes = ipv4Routes;
        return this;
    }

    /**
     * Get the ipv6Routes property: List of IPv6 Routes prefixes.
     *
     * @return the ipv6Routes value.
     */
    public List<AggregateRoute> ipv6Routes() {
        return this.ipv6Routes;
    }

    /**
     * Set the ipv6Routes property: List of IPv6 Routes prefixes.
     *
     * @param ipv6Routes the ipv6Routes value to set.
     * @return the AggregateRouteConfiguration object itself.
     */
    public AggregateRouteConfiguration withIpv6Routes(List<AggregateRoute> ipv6Routes) {
        this.ipv6Routes = ipv6Routes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipv4Routes() != null) {
            ipv4Routes().forEach(e -> e.validate());
        }
        if (ipv6Routes() != null) {
            ipv6Routes().forEach(e -> e.validate());
        }
    }
}