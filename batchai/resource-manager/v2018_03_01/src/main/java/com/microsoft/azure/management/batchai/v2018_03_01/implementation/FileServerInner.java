/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01.implementation;

import com.microsoft.azure.management.batchai.v2018_03_01.SshConfiguration;
import com.microsoft.azure.management.batchai.v2018_03_01.DataDisks;
import com.microsoft.azure.management.batchai.v2018_03_01.ResourceId;
import com.microsoft.azure.management.batchai.v2018_03_01.MountSettings;
import org.joda.time.DateTime;
import com.microsoft.azure.management.batchai.v2018_03_01.FileServerProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Contains information about the File Server.
 */
@JsonFlatten
@SkipParentValidation
public class FileServerInner extends Resource {
    /**
     * The size of the virtual machine of the File Server.
     * For information about available VM sizes for File Server from the
     * Virtual Machines Marketplace, see Sizes for Virtual Machines (Linux).
     */
    @JsonProperty(value = "properties.vmSize")
    private String vmSize;

    /**
     * SSH settings for the File Server.
     */
    @JsonProperty(value = "properties.sshConfiguration")
    private SshConfiguration sshConfiguration;

    /**
     * Settings for the data disk which would be created for the File Server.
     */
    @JsonProperty(value = "properties.dataDisks")
    private DataDisks dataDisks;

    /**
     * Specifies the identifier of the subnet.
     */
    @JsonProperty(value = "properties.subnet")
    private ResourceId subnet;

    /**
     * Details of the File Server.
     */
    @JsonProperty(value = "properties.mountSettings", access = JsonProperty.Access.WRITE_ONLY)
    private MountSettings mountSettings;

    /**
     * Time when the status was changed.
     */
    @JsonProperty(value = "properties.provisioningStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime provisioningStateTransitionTime;

    /**
     * Time when the FileServer was created.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * Specifies the provisioning state of the File Server.
     * Possible values: creating - The File Server is getting created. updating
     * - The File Server creation has been accepted and it is getting updated.
     * deleting - The user has requested that the File Server be deleted, and
     * it is in the process of being deleted. failed - The File Server creation
     * has failed with the specified errorCode. Details about the error code
     * are specified in the message field. succeeded - The File Server creation
     * has succeeded. Possible values include: 'creating', 'updating',
     * 'deleting', 'succeeded', 'failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private FileServerProvisioningState provisioningState;

    /**
     * Get the vmSize value.
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize value.
     *
     * @param vmSize the vmSize value to set
     * @return the FileServerInner object itself.
     */
    public FileServerInner withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the sshConfiguration value.
     *
     * @return the sshConfiguration value
     */
    public SshConfiguration sshConfiguration() {
        return this.sshConfiguration;
    }

    /**
     * Set the sshConfiguration value.
     *
     * @param sshConfiguration the sshConfiguration value to set
     * @return the FileServerInner object itself.
     */
    public FileServerInner withSshConfiguration(SshConfiguration sshConfiguration) {
        this.sshConfiguration = sshConfiguration;
        return this;
    }

    /**
     * Get the dataDisks value.
     *
     * @return the dataDisks value
     */
    public DataDisks dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks value.
     *
     * @param dataDisks the dataDisks value to set
     * @return the FileServerInner object itself.
     */
    public FileServerInner withDataDisks(DataDisks dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Get the subnet value.
     *
     * @return the subnet value
     */
    public ResourceId subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet value.
     *
     * @param subnet the subnet value to set
     * @return the FileServerInner object itself.
     */
    public FileServerInner withSubnet(ResourceId subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the mountSettings value.
     *
     * @return the mountSettings value
     */
    public MountSettings mountSettings() {
        return this.mountSettings;
    }

    /**
     * Get the provisioningStateTransitionTime value.
     *
     * @return the provisioningStateTransitionTime value
     */
    public DateTime provisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public FileServerProvisioningState provisioningState() {
        return this.provisioningState;
    }

}
