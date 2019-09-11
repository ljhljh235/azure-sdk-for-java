// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.azure.core.implementation.annotation.Fluent;
import com.azure.core.implementation.util.ImplUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Additional parameters for a set of operations, such as: Files_create,
 * Files_setHTTPHeaders.
 */
@JacksonXmlRootElement(localName = "file-HTTP-headers")
@Fluent
public final class FileHTTPHeaders {
    /*
     * Sets the MIME content type of the file. The default type is
     * 'application/octet-stream'.
     */
    @JsonProperty(value = "fileContentType")
    private String fileContentType;

    /*
     * Specifies which content encodings have been applied to the file.
     */
    @JsonProperty(value = "fileContentEncoding")
    private String fileContentEncoding;

    /*
     * Specifies the natural languages used by this resource.
     */
    @JsonProperty(value = "fileContentLanguage")
    private String fileContentLanguage;

    /*
     * Sets the file's cache control. The File service stores this value but
     * does not use or modify it.
     */
    @JsonProperty(value = "fileCacheControl")
    private String fileCacheControl;

    /*
     * Sets the file's MD5 hash.
     */
    @JsonProperty(value = "fileContentMD5")
    private byte[] fileContentMD5;

    /*
     * Sets the file's Content-Disposition header.
     */
    @JsonProperty(value = "fileContentDisposition")
    private String fileContentDisposition;

    /**
     * Get the fileContentType property: Sets the MIME content type of the
     * file. The default type is 'application/octet-stream'.
     *
     * @return the fileContentType value.
     */
    public String getFileContentType() {
        return this.fileContentType;
    }

    /**
     * Set the fileContentType property: Sets the MIME content type of the
     * file. The default type is 'application/octet-stream'.
     *
     * @param fileContentType the fileContentType value to set.
     * @return the FileHTTPHeaders object itself.
     */
    public FileHTTPHeaders setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
        return this;
    }

    /**
     * Get the fileContentEncoding property: Specifies which content encodings
     * have been applied to the file.
     *
     * @return the fileContentEncoding value.
     */
    public String getFileContentEncoding() {
        return this.fileContentEncoding;
    }

    /**
     * Set the fileContentEncoding property: Specifies which content encodings
     * have been applied to the file.
     *
     * @param fileContentEncoding the fileContentEncoding value to set.
     * @return the FileHTTPHeaders object itself.
     */
    public FileHTTPHeaders setFileContentEncoding(String fileContentEncoding) {
        this.fileContentEncoding = fileContentEncoding;
        return this;
    }

    /**
     * Get the fileContentLanguage property: Specifies the natural languages
     * used by this resource.
     *
     * @return the fileContentLanguage value.
     */
    public String getFileContentLanguage() {
        return this.fileContentLanguage;
    }

    /**
     * Set the fileContentLanguage property: Specifies the natural languages
     * used by this resource.
     *
     * @param fileContentLanguage the fileContentLanguage value to set.
     * @return the FileHTTPHeaders object itself.
     */
    public FileHTTPHeaders setFileContentLanguage(String fileContentLanguage) {
        this.fileContentLanguage = fileContentLanguage;
        return this;
    }

    /**
     * Get the fileCacheControl property: Sets the file's cache control. The
     * File service stores this value but does not use or modify it.
     *
     * @return the fileCacheControl value.
     */
    public String getFileCacheControl() {
        return this.fileCacheControl;
    }

    /**
     * Set the fileCacheControl property: Sets the file's cache control. The
     * File service stores this value but does not use or modify it.
     *
     * @param fileCacheControl the fileCacheControl value to set.
     * @return the FileHTTPHeaders object itself.
     */
    public FileHTTPHeaders setFileCacheControl(String fileCacheControl) {
        this.fileCacheControl = fileCacheControl;
        return this;
    }

    /**
     * Get the fileContentMD5 property: Sets the file's MD5 hash.
     *
     * @return the fileContentMD5 value.
     */
    public byte[] getFileContentMD5() {
        return ImplUtils.clone(this.fileContentMD5);
    }

    /**
     * Set the fileContentMD5 property: Sets the file's MD5 hash.
     *
     * @param fileContentMD5 the fileContentMD5 value to set.
     * @return the FileHTTPHeaders object itself.
     */
    public FileHTTPHeaders setFileContentMD5(byte[] fileContentMD5) {
        this.fileContentMD5 = ImplUtils.clone(fileContentMD5);
        return this;
    }

    /**
     * Get the fileContentDisposition property: Sets the file's
     * Content-Disposition header.
     *
     * @return the fileContentDisposition value.
     */
    public String getFileContentDisposition() {
        return this.fileContentDisposition;
    }

    /**
     * Set the fileContentDisposition property: Sets the file's
     * Content-Disposition header.
     *
     * @param fileContentDisposition the fileContentDisposition value to set.
     * @return the FileHTTPHeaders object itself.
     */
    public FileHTTPHeaders setFileContentDisposition(String fileContentDisposition) {
        this.fileContentDisposition = fileContentDisposition;
        return this;
    }
}
