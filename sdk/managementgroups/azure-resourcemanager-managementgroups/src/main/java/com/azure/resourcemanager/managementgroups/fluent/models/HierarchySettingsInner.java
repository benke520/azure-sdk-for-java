// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings defined at the Management Group scope. */
@Fluent
public final class HierarchySettingsInner extends ProxyResource {
    /*
     * The generic properties of hierarchy settings.
     */
    @JsonProperty(value = "properties")
    private HierarchySettingsProperties innerProperties;

    /** Creates an instance of HierarchySettingsInner class. */
    public HierarchySettingsInner() {
    }

    /**
     * Get the innerProperties property: The generic properties of hierarchy settings.
     *
     * @return the innerProperties value.
     */
    private HierarchySettingsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tenantId property: The AAD Tenant ID associated with the hierarchy settings. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The AAD Tenant ID associated with the hierarchy settings. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @param tenantId the tenantId value to set.
     * @return the HierarchySettingsInner object itself.
     */
    public HierarchySettingsInner withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HierarchySettingsProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the requireAuthorizationForGroupCreation property: Indicates whether RBAC access is required upon group
     * creation under the root Management Group. If set to true, user will require
     * Microsoft.Management/managementGroups/write action on the root Management Group scope in order to create new
     * Groups directly under the root. This will prevent new users from creating new Management Groups, unless they are
     * given access.
     *
     * @return the requireAuthorizationForGroupCreation value.
     */
    public Boolean requireAuthorizationForGroupCreation() {
        return this.innerProperties() == null ? null : this.innerProperties().requireAuthorizationForGroupCreation();
    }

    /**
     * Set the requireAuthorizationForGroupCreation property: Indicates whether RBAC access is required upon group
     * creation under the root Management Group. If set to true, user will require
     * Microsoft.Management/managementGroups/write action on the root Management Group scope in order to create new
     * Groups directly under the root. This will prevent new users from creating new Management Groups, unless they are
     * given access.
     *
     * @param requireAuthorizationForGroupCreation the requireAuthorizationForGroupCreation value to set.
     * @return the HierarchySettingsInner object itself.
     */
    public HierarchySettingsInner withRequireAuthorizationForGroupCreation(
        Boolean requireAuthorizationForGroupCreation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HierarchySettingsProperties();
        }
        this.innerProperties().withRequireAuthorizationForGroupCreation(requireAuthorizationForGroupCreation);
        return this;
    }

    /**
     * Get the defaultManagementGroup property: Settings that sets the default Management Group under which new
     * subscriptions get added in this tenant. For example,
     * /providers/Microsoft.Management/managementGroups/defaultGroup.
     *
     * @return the defaultManagementGroup value.
     */
    public String defaultManagementGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultManagementGroup();
    }

    /**
     * Set the defaultManagementGroup property: Settings that sets the default Management Group under which new
     * subscriptions get added in this tenant. For example,
     * /providers/Microsoft.Management/managementGroups/defaultGroup.
     *
     * @param defaultManagementGroup the defaultManagementGroup value to set.
     * @return the HierarchySettingsInner object itself.
     */
    public HierarchySettingsInner withDefaultManagementGroup(String defaultManagementGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HierarchySettingsProperties();
        }
        this.innerProperties().withDefaultManagementGroup(defaultManagementGroup);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}