// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Maintenance window properties of a server. */
@Fluent
public final class MaintenanceWindow {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MaintenanceWindow.class);

    /*
     * indicates whether custom window is enabled or disabled
     */
    @JsonProperty(value = "customWindow")
    private String customWindow;

    /*
     * start hour for maintenance window
     */
    @JsonProperty(value = "startHour")
    private Integer startHour;

    /*
     * start minute for maintenance window
     */
    @JsonProperty(value = "startMinute")
    private Integer startMinute;

    /*
     * day of week for maintenance window
     */
    @JsonProperty(value = "dayOfWeek")
    private Integer dayOfWeek;

    /**
     * Get the customWindow property: indicates whether custom window is enabled or disabled.
     *
     * @return the customWindow value.
     */
    public String customWindow() {
        return this.customWindow;
    }

    /**
     * Set the customWindow property: indicates whether custom window is enabled or disabled.
     *
     * @param customWindow the customWindow value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withCustomWindow(String customWindow) {
        this.customWindow = customWindow;
        return this;
    }

    /**
     * Get the startHour property: start hour for maintenance window.
     *
     * @return the startHour value.
     */
    public Integer startHour() {
        return this.startHour;
    }

    /**
     * Set the startHour property: start hour for maintenance window.
     *
     * @param startHour the startHour value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withStartHour(Integer startHour) {
        this.startHour = startHour;
        return this;
    }

    /**
     * Get the startMinute property: start minute for maintenance window.
     *
     * @return the startMinute value.
     */
    public Integer startMinute() {
        return this.startMinute;
    }

    /**
     * Set the startMinute property: start minute for maintenance window.
     *
     * @param startMinute the startMinute value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withStartMinute(Integer startMinute) {
        this.startMinute = startMinute;
        return this;
    }

    /**
     * Get the dayOfWeek property: day of week for maintenance window.
     *
     * @return the dayOfWeek value.
     */
    public Integer dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Set the dayOfWeek property: day of week for maintenance window.
     *
     * @param dayOfWeek the dayOfWeek value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
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
