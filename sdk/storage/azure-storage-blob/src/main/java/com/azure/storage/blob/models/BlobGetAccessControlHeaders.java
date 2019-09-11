// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for GetAccessControl operation.
 */
@JacksonXmlRootElement(localName = "Blob-GetAccessControl-Headers")
@Fluent
public final class BlobGetAccessControlHeaders {
    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * An HTTP entity tag associated with the file or directory.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The data and time the file or directory was last modified. Write
     * operations on the file or directory update the last modified time.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The owner of the file or directory. Included in the response if
     * Hierarchical Namespace is enabled for the account.
     */
    @JsonProperty(value = "x-ms-owner")
    private String xMsOwner;

    /*
     * The owning group of the file or directory. Included in the response if
     * Hierarchical Namespace is enabled for the account.
     */
    @JsonProperty(value = "x-ms-group")
    private String xMsGroup;

    /*
     * The POSIX access permissions for the file owner, the file owning group,
     * and others. Included in the response if Hierarchical Namespace is
     * enabled for the account.
     */
    @JsonProperty(value = "x-ms-permissions")
    private String xMsPermissions;

    /*
     * The POSIX access control list for the file or directory.  Included in
     * the response only if the action is "getAccessControl" and Hierarchical
     * Namespace is enabled for the account.
     */
    @JsonProperty(value = "x-ms-acl")
    private String xMsAcl;

    /*
     * A server-generated UUID recorded in the analytics logs for
     * troubleshooting and correlation.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * The version of the REST protocol used to process the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * If a client request id header is sent in the request, this header will
     * be present in the response with the same value.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String clientRequestId;

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.dateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the BlobGetAccessControlHeaders object itself.
     */
    public BlobGetAccessControlHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the eTag property: An HTTP entity tag associated with the file or
     * directory.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: An HTTP entity tag associated with the file or
     * directory.
     *
     * @param eTag the eTag value to set.
     * @return the BlobGetAccessControlHeaders object itself.
     */
    public BlobGetAccessControlHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: The data and time the file or directory
     * was last modified. Write operations on the file or directory update the
     * last modified time.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the lastModified property: The data and time the file or directory
     * was last modified. Write operations on the file or directory update the
     * last modified time.
     *
     * @param lastModified the lastModified value to set.
     * @return the BlobGetAccessControlHeaders object itself.
     */
    public BlobGetAccessControlHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsOwner property: The owner of the file or directory. Included
     * in the response if Hierarchical Namespace is enabled for the account.
     *
     * @return the xMsOwner value.
     */
    public String getXMsOwner() {
        return this.xMsOwner;
    }

    /**
     * Set the xMsOwner property: The owner of the file or directory. Included
     * in the response if Hierarchical Namespace is enabled for the account.
     *
     * @param xMsOwner the xMsOwner value to set.
     * @return the BlobGetAccessControlHeaders object itself.
     */
    public BlobGetAccessControlHeaders setXMsOwner(String xMsOwner) {
        this.xMsOwner = xMsOwner;
        return this;
    }

    /**
     * Get the xMsGroup property: The owning group of the file or directory.
     * Included in the response if Hierarchical Namespace is enabled for the
     * account.
     *
     * @return the xMsGroup value.
     */
    public String getXMsGroup() {
        return this.xMsGroup;
    }

    /**
     * Set the xMsGroup property: The owning group of the file or directory.
     * Included in the response if Hierarchical Namespace is enabled for the
     * account.
     *
     * @param xMsGroup the xMsGroup value to set.
     * @return the BlobGetAccessControlHeaders object itself.
     */
    public BlobGetAccessControlHeaders setXMsGroup(String xMsGroup) {
        this.xMsGroup = xMsGroup;
        return this;
    }

    /**
     * Get the xMsPermissions property: The POSIX access permissions for the
     * file owner, the file owning group, and others. Included in the response
     * if Hierarchical Namespace is enabled for the account.
     *
     * @return the xMsPermissions value.
     */
    public String getXMsPermissions() {
        return this.xMsPermissions;
    }

    /**
     * Set the xMsPermissions property: The POSIX access permissions for the
     * file owner, the file owning group, and others. Included in the response
     * if Hierarchical Namespace is enabled for the account.
     *
     * @param xMsPermissions the xMsPermissions value to set.
     * @return the BlobGetAccessControlHeaders object itself.
     */
    public BlobGetAccessControlHeaders setXMsPermissions(String xMsPermissions) {
        this.xMsPermissions = xMsPermissions;
        return this;
    }

    /**
     * Get the xMsAcl property: The POSIX access control list for the file or
     * directory.  Included in the response only if the action is
     * "getAccessControl" and Hierarchical Namespace is enabled for the
     * account.
     *
     * @return the xMsAcl value.
     */
    public String getXMsAcl() {
        return this.xMsAcl;
    }

    /**
     * Set the xMsAcl property: The POSIX access control list for the file or
     * directory.  Included in the response only if the action is
     * "getAccessControl" and Hierarchical Namespace is enabled for the
     * account.
     *
     * @param xMsAcl the xMsAcl value to set.
     * @return the BlobGetAccessControlHeaders object itself.
     */
    public BlobGetAccessControlHeaders setXMsAcl(String xMsAcl) {
        this.xMsAcl = xMsAcl;
        return this;
    }

    /**
     * Get the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @param requestId the requestId value to set.
     * @return the BlobGetAccessControlHeaders object itself.
     */
    public BlobGetAccessControlHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: The version of the REST protocol used to
     * process the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the REST protocol used to
     * process the request.
     *
     * @param version the version value to set.
     * @return the BlobGetAccessControlHeaders object itself.
     */
    public BlobGetAccessControlHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the BlobGetAccessControlHeaders object itself.
     */
    public BlobGetAccessControlHeaders setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }
}
