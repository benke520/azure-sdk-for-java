// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Access Control List condition model. */
@Fluent
public final class AccessControlListConditionProperties extends AnnotationResource {
    /*
     * sequenceNumber of the Access Control List.
     */
    @JsonProperty(value = "sequenceNumber", required = true)
    private int sequenceNumber;

    /*
     * action. Example: allow | deny.
     */
    @JsonProperty(value = "action", required = true)
    private ConditionActionType action;

    /*
     * destinationAddress. Example: any | 1.1.1.0/24 | 1.1.10.10
     */
    @JsonProperty(value = "destinationAddress", required = true)
    private String destinationAddress;

    /*
     * destinationPort. Example: any | 1253
     */
    @JsonProperty(value = "destinationPort", required = true)
    private String destinationPort;

    /*
     * sourceAddress. Example: any | 1.1.1.0/24 | 1.1.10.10
     */
    @JsonProperty(value = "sourceAddress", required = true)
    private String sourceAddress;

    /*
     * sourcePort. Example: any | 1253
     */
    @JsonProperty(value = "sourcePort", required = true)
    private String sourcePort;

    /*
     * TCP/IP protocol as defined in the list of IP protocol numbers. Example: 255 (any) | 0 | 1.
     */
    @JsonProperty(value = "protocol", required = true)
    private int protocol;

    /** Creates an instance of AccessControlListConditionProperties class. */
    public AccessControlListConditionProperties() {
    }

    /**
     * Get the sequenceNumber property: sequenceNumber of the Access Control List.
     *
     * @return the sequenceNumber value.
     */
    public int sequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * Set the sequenceNumber property: sequenceNumber of the Access Control List.
     *
     * @param sequenceNumber the sequenceNumber value to set.
     * @return the AccessControlListConditionProperties object itself.
     */
    public AccessControlListConditionProperties withSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * Get the action property: action. Example: allow | deny.
     *
     * @return the action value.
     */
    public ConditionActionType action() {
        return this.action;
    }

    /**
     * Set the action property: action. Example: allow | deny.
     *
     * @param action the action value to set.
     * @return the AccessControlListConditionProperties object itself.
     */
    public AccessControlListConditionProperties withAction(ConditionActionType action) {
        this.action = action;
        return this;
    }

    /**
     * Get the destinationAddress property: destinationAddress. Example: any | 1.1.1.0/24 | 1.1.10.10.
     *
     * @return the destinationAddress value.
     */
    public String destinationAddress() {
        return this.destinationAddress;
    }

    /**
     * Set the destinationAddress property: destinationAddress. Example: any | 1.1.1.0/24 | 1.1.10.10.
     *
     * @param destinationAddress the destinationAddress value to set.
     * @return the AccessControlListConditionProperties object itself.
     */
    public AccessControlListConditionProperties withDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
        return this;
    }

    /**
     * Get the destinationPort property: destinationPort. Example: any | 1253.
     *
     * @return the destinationPort value.
     */
    public String destinationPort() {
        return this.destinationPort;
    }

    /**
     * Set the destinationPort property: destinationPort. Example: any | 1253.
     *
     * @param destinationPort the destinationPort value to set.
     * @return the AccessControlListConditionProperties object itself.
     */
    public AccessControlListConditionProperties withDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    /**
     * Get the sourceAddress property: sourceAddress. Example: any | 1.1.1.0/24 | 1.1.10.10.
     *
     * @return the sourceAddress value.
     */
    public String sourceAddress() {
        return this.sourceAddress;
    }

    /**
     * Set the sourceAddress property: sourceAddress. Example: any | 1.1.1.0/24 | 1.1.10.10.
     *
     * @param sourceAddress the sourceAddress value to set.
     * @return the AccessControlListConditionProperties object itself.
     */
    public AccessControlListConditionProperties withSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }

    /**
     * Get the sourcePort property: sourcePort. Example: any | 1253.
     *
     * @return the sourcePort value.
     */
    public String sourcePort() {
        return this.sourcePort;
    }

    /**
     * Set the sourcePort property: sourcePort. Example: any | 1253.
     *
     * @param sourcePort the sourcePort value to set.
     * @return the AccessControlListConditionProperties object itself.
     */
    public AccessControlListConditionProperties withSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    /**
     * Get the protocol property: TCP/IP protocol as defined in the list of IP protocol numbers. Example: 255 (any) | 0
     * | 1.
     *
     * @return the protocol value.
     */
    public int protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: TCP/IP protocol as defined in the list of IP protocol numbers. Example: 255 (any) | 0
     * | 1.
     *
     * @param protocol the protocol value to set.
     * @return the AccessControlListConditionProperties object itself.
     */
    public AccessControlListConditionProperties withProtocol(int protocol) {
        this.protocol = protocol;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AccessControlListConditionProperties withAnnotation(String annotation) {
        super.withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (action() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property action in model AccessControlListConditionProperties"));
        }
        if (destinationAddress() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property destinationAddress in model AccessControlListConditionProperties"));
        }
        if (destinationPort() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property destinationPort in model AccessControlListConditionProperties"));
        }
        if (sourceAddress() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceAddress in model AccessControlListConditionProperties"));
        }
        if (sourcePort() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourcePort in model AccessControlListConditionProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AccessControlListConditionProperties.class);
}