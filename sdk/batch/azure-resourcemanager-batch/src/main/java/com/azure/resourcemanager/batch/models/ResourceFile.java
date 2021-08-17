// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A single file or multiple files to be downloaded to a compute node. */
@Fluent
public final class ResourceFile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceFile.class);

    /*
     * The storage container name in the auto storage account. The
     * autoStorageContainerName, storageContainerUrl and httpUrl properties are
     * mutually exclusive and one of them must be specified.
     */
    @JsonProperty(value = "autoStorageContainerName")
    private String autoStorageContainerName;

    /*
     * The URL of the blob container within Azure Blob Storage. The
     * autoStorageContainerName, storageContainerUrl and httpUrl properties are
     * mutually exclusive and one of them must be specified. This URL must be
     * readable and listable from compute nodes. There are three ways to get
     * such a URL for a container in Azure storage: include a Shared Access
     * Signature (SAS) granting read and list permissions on the container, use
     * a managed identity with read and list permissions, or set the ACL for
     * the container to allow public access.
     */
    @JsonProperty(value = "storageContainerUrl")
    private String storageContainerUrl;

    /*
     * The URL of the file to download. The autoStorageContainerName,
     * storageContainerUrl and httpUrl properties are mutually exclusive and
     * one of them must be specified. If the URL points to Azure Blob Storage,
     * it must be readable from compute nodes. There are three ways to get such
     * a URL for a blob in Azure storage: include a Shared Access Signature
     * (SAS) granting read permissions on the blob, use a managed identity with
     * read permission, or set the ACL for the blob or its container to allow
     * public access.
     */
    @JsonProperty(value = "httpUrl")
    private String httpUrl;

    /*
     * The blob prefix to use when downloading blobs from an Azure Storage
     * container. Only the blobs whose names begin with the specified prefix
     * will be downloaded. The property is valid only when
     * autoStorageContainerName or storageContainerUrl is used. This prefix can
     * be a partial filename or a subdirectory. If a prefix is not specified,
     * all the files in the container will be downloaded.
     */
    @JsonProperty(value = "blobPrefix")
    private String blobPrefix;

    /*
     * The location on the compute node to which to download the file, relative
     * to the task's working directory. If the httpUrl property is specified,
     * the filePath is required and describes the path which the file will be
     * downloaded to, including the filename. Otherwise, if the
     * autoStorageContainerName or storageContainerUrl property is specified,
     * filePath is optional and is the directory to download the files to. In
     * the case where filePath is used as a directory, any directory structure
     * already associated with the input data will be retained in full and
     * appended to the specified filePath directory. The specified relative
     * path cannot break out of the task's working directory (for example by
     * using '..').
     */
    @JsonProperty(value = "filePath")
    private String filePath;

    /*
     * The file permission mode attribute in octal format. This property
     * applies only to files being downloaded to Linux compute nodes. It will
     * be ignored if it is specified for a resourceFile which will be
     * downloaded to a Windows node. If this property is not specified for a
     * Linux node, then a default value of 0770 is applied to the file.
     */
    @JsonProperty(value = "fileMode")
    private String fileMode;

    /*
     * The reference to a user assigned identity associated with the Batch pool
     * which a compute node will use.
     */
    @JsonProperty(value = "identityReference")
    private ComputeNodeIdentityReference identityReference;

    /**
     * Get the autoStorageContainerName property: The storage container name in the auto storage account. The
     * autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must
     * be specified.
     *
     * @return the autoStorageContainerName value.
     */
    public String autoStorageContainerName() {
        return this.autoStorageContainerName;
    }

    /**
     * Set the autoStorageContainerName property: The storage container name in the auto storage account. The
     * autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must
     * be specified.
     *
     * @param autoStorageContainerName the autoStorageContainerName value to set.
     * @return the ResourceFile object itself.
     */
    public ResourceFile withAutoStorageContainerName(String autoStorageContainerName) {
        this.autoStorageContainerName = autoStorageContainerName;
        return this;
    }

    /**
     * Get the storageContainerUrl property: The URL of the blob container within Azure Blob Storage. The
     * autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must
     * be specified. This URL must be readable and listable from compute nodes. There are three ways to get such a URL
     * for a container in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on
     * the container, use a managed identity with read and list permissions, or set the ACL for the container to allow
     * public access.
     *
     * @return the storageContainerUrl value.
     */
    public String storageContainerUrl() {
        return this.storageContainerUrl;
    }

    /**
     * Set the storageContainerUrl property: The URL of the blob container within Azure Blob Storage. The
     * autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must
     * be specified. This URL must be readable and listable from compute nodes. There are three ways to get such a URL
     * for a container in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on
     * the container, use a managed identity with read and list permissions, or set the ACL for the container to allow
     * public access.
     *
     * @param storageContainerUrl the storageContainerUrl value to set.
     * @return the ResourceFile object itself.
     */
    public ResourceFile withStorageContainerUrl(String storageContainerUrl) {
        this.storageContainerUrl = storageContainerUrl;
        return this;
    }

    /**
     * Get the httpUrl property: The URL of the file to download. The autoStorageContainerName, storageContainerUrl and
     * httpUrl properties are mutually exclusive and one of them must be specified. If the URL points to Azure Blob
     * Storage, it must be readable from compute nodes. There are three ways to get such a URL for a blob in Azure
     * storage: include a Shared Access Signature (SAS) granting read permissions on the blob, use a managed identity
     * with read permission, or set the ACL for the blob or its container to allow public access.
     *
     * @return the httpUrl value.
     */
    public String httpUrl() {
        return this.httpUrl;
    }

    /**
     * Set the httpUrl property: The URL of the file to download. The autoStorageContainerName, storageContainerUrl and
     * httpUrl properties are mutually exclusive and one of them must be specified. If the URL points to Azure Blob
     * Storage, it must be readable from compute nodes. There are three ways to get such a URL for a blob in Azure
     * storage: include a Shared Access Signature (SAS) granting read permissions on the blob, use a managed identity
     * with read permission, or set the ACL for the blob or its container to allow public access.
     *
     * @param httpUrl the httpUrl value to set.
     * @return the ResourceFile object itself.
     */
    public ResourceFile withHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
        return this;
    }

    /**
     * Get the blobPrefix property: The blob prefix to use when downloading blobs from an Azure Storage container. Only
     * the blobs whose names begin with the specified prefix will be downloaded. The property is valid only when
     * autoStorageContainerName or storageContainerUrl is used. This prefix can be a partial filename or a subdirectory.
     * If a prefix is not specified, all the files in the container will be downloaded.
     *
     * @return the blobPrefix value.
     */
    public String blobPrefix() {
        return this.blobPrefix;
    }

    /**
     * Set the blobPrefix property: The blob prefix to use when downloading blobs from an Azure Storage container. Only
     * the blobs whose names begin with the specified prefix will be downloaded. The property is valid only when
     * autoStorageContainerName or storageContainerUrl is used. This prefix can be a partial filename or a subdirectory.
     * If a prefix is not specified, all the files in the container will be downloaded.
     *
     * @param blobPrefix the blobPrefix value to set.
     * @return the ResourceFile object itself.
     */
    public ResourceFile withBlobPrefix(String blobPrefix) {
        this.blobPrefix = blobPrefix;
        return this;
    }

    /**
     * Get the filePath property: The location on the compute node to which to download the file, relative to the task's
     * working directory. If the httpUrl property is specified, the filePath is required and describes the path which
     * the file will be downloaded to, including the filename. Otherwise, if the autoStorageContainerName or
     * storageContainerUrl property is specified, filePath is optional and is the directory to download the files to. In
     * the case where filePath is used as a directory, any directory structure already associated with the input data
     * will be retained in full and appended to the specified filePath directory. The specified relative path cannot
     * break out of the task's working directory (for example by using '..').
     *
     * @return the filePath value.
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set the filePath property: The location on the compute node to which to download the file, relative to the task's
     * working directory. If the httpUrl property is specified, the filePath is required and describes the path which
     * the file will be downloaded to, including the filename. Otherwise, if the autoStorageContainerName or
     * storageContainerUrl property is specified, filePath is optional and is the directory to download the files to. In
     * the case where filePath is used as a directory, any directory structure already associated with the input data
     * will be retained in full and appended to the specified filePath directory. The specified relative path cannot
     * break out of the task's working directory (for example by using '..').
     *
     * @param filePath the filePath value to set.
     * @return the ResourceFile object itself.
     */
    public ResourceFile withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get the fileMode property: The file permission mode attribute in octal format. This property applies only to
     * files being downloaded to Linux compute nodes. It will be ignored if it is specified for a resourceFile which
     * will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of
     * 0770 is applied to the file.
     *
     * @return the fileMode value.
     */
    public String fileMode() {
        return this.fileMode;
    }

    /**
     * Set the fileMode property: The file permission mode attribute in octal format. This property applies only to
     * files being downloaded to Linux compute nodes. It will be ignored if it is specified for a resourceFile which
     * will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of
     * 0770 is applied to the file.
     *
     * @param fileMode the fileMode value to set.
     * @return the ResourceFile object itself.
     */
    public ResourceFile withFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }

    /**
     * Get the identityReference property: The reference to a user assigned identity associated with the Batch pool
     * which a compute node will use.
     *
     * @return the identityReference value.
     */
    public ComputeNodeIdentityReference identityReference() {
        return this.identityReference;
    }

    /**
     * Set the identityReference property: The reference to a user assigned identity associated with the Batch pool
     * which a compute node will use.
     *
     * @param identityReference the identityReference value to set.
     * @return the ResourceFile object itself.
     */
    public ResourceFile withIdentityReference(ComputeNodeIdentityReference identityReference) {
        this.identityReference = identityReference;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identityReference() != null) {
            identityReference().validate();
        }
    }
}
