// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Client-Certification Authentication. */
@Fluent
public final class IngressSettingsClientAuth {
    /*
     * Collection of certificate resource id.
     */
    @JsonProperty(value = "certificates")
    private List<String> certificates;

    /**
     * Get the certificates property: Collection of certificate resource id.
     *
     * @return the certificates value.
     */
    public List<String> certificates() {
        return this.certificates;
    }

    /**
     * Set the certificates property: Collection of certificate resource id.
     *
     * @param certificates the certificates value to set.
     * @return the IngressSettingsClientAuth object itself.
     */
    public IngressSettingsClientAuth withCertificates(List<String> certificates) {
        this.certificates = certificates;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}