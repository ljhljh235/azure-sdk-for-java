// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties used to create a user on an Azure Batch node. */
@Fluent
public final class UserAccount {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserAccount.class);

    /*
     * The name of the user account.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The password for the user account.
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /*
     * The elevation level of the user. nonAdmin - The auto user is a standard
     * user without elevated access. admin - The auto user is a user with
     * elevated access and operates with full Administrator permissions. The
     * default value is nonAdmin.
     */
    @JsonProperty(value = "elevationLevel")
    private ElevationLevel elevationLevel;

    /*
     * Properties used to create a user account on a Linux node. This property
     * is ignored if specified on a Windows pool. If not specified, the user is
     * created with the default options.
     */
    @JsonProperty(value = "linuxUserConfiguration")
    private LinuxUserConfiguration linuxUserConfiguration;

    /*
     * Properties used to create a user account on a Windows node. This
     * property can only be specified if the user is on a Windows pool. If not
     * specified and on a Windows pool, the user is created with the default
     * options.
     */
    @JsonProperty(value = "windowsUserConfiguration")
    private WindowsUserConfiguration windowsUserConfiguration;

    /**
     * Get the name property: The name of the user account.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the user account.
     *
     * @param name the name value to set.
     * @return the UserAccount object itself.
     */
    public UserAccount withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the password property: The password for the user account.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password for the user account.
     *
     * @param password the password value to set.
     * @return the UserAccount object itself.
     */
    public UserAccount withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the elevationLevel property: The elevation level of the user. nonAdmin - The auto user is a standard user
     * without elevated access. admin - The auto user is a user with elevated access and operates with full
     * Administrator permissions. The default value is nonAdmin.
     *
     * @return the elevationLevel value.
     */
    public ElevationLevel elevationLevel() {
        return this.elevationLevel;
    }

    /**
     * Set the elevationLevel property: The elevation level of the user. nonAdmin - The auto user is a standard user
     * without elevated access. admin - The auto user is a user with elevated access and operates with full
     * Administrator permissions. The default value is nonAdmin.
     *
     * @param elevationLevel the elevationLevel value to set.
     * @return the UserAccount object itself.
     */
    public UserAccount withElevationLevel(ElevationLevel elevationLevel) {
        this.elevationLevel = elevationLevel;
        return this;
    }

    /**
     * Get the linuxUserConfiguration property: Properties used to create a user account on a Linux node. This property
     * is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
     *
     * @return the linuxUserConfiguration value.
     */
    public LinuxUserConfiguration linuxUserConfiguration() {
        return this.linuxUserConfiguration;
    }

    /**
     * Set the linuxUserConfiguration property: Properties used to create a user account on a Linux node. This property
     * is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
     *
     * @param linuxUserConfiguration the linuxUserConfiguration value to set.
     * @return the UserAccount object itself.
     */
    public UserAccount withLinuxUserConfiguration(LinuxUserConfiguration linuxUserConfiguration) {
        this.linuxUserConfiguration = linuxUserConfiguration;
        return this;
    }

    /**
     * Get the windowsUserConfiguration property: Properties used to create a user account on a Windows node. This
     * property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user
     * is created with the default options.
     *
     * @return the windowsUserConfiguration value.
     */
    public WindowsUserConfiguration windowsUserConfiguration() {
        return this.windowsUserConfiguration;
    }

    /**
     * Set the windowsUserConfiguration property: Properties used to create a user account on a Windows node. This
     * property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user
     * is created with the default options.
     *
     * @param windowsUserConfiguration the windowsUserConfiguration value to set.
     * @return the UserAccount object itself.
     */
    public UserAccount withWindowsUserConfiguration(WindowsUserConfiguration windowsUserConfiguration) {
        this.windowsUserConfiguration = windowsUserConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model UserAccount"));
        }
        if (password() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property password in model UserAccount"));
        }
        if (linuxUserConfiguration() != null) {
            linuxUserConfiguration().validate();
        }
        if (windowsUserConfiguration() != null) {
            windowsUserConfiguration().validate();
        }
    }
}
