// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Git integration settings. */
@Fluent
public final class WorkspaceRepositoryConfiguration {
    /*
     * Type of workspace repositoryID configuration. Example
     * WorkspaceVSTSConfiguration, WorkspaceGitHubConfiguration
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * GitHub Enterprise host name. For example: https://github.mydomain.com
     */
    @JsonProperty(value = "hostName")
    private String hostName;

    /*
     * Account name
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /*
     * VSTS project name
     */
    @JsonProperty(value = "projectName")
    private String projectName;

    /*
     * Repository name
     */
    @JsonProperty(value = "repositoryName")
    private String repositoryName;

    /*
     * Collaboration branch
     */
    @JsonProperty(value = "collaborationBranch")
    private String collaborationBranch;

    /*
     * Root folder to use in the repository
     */
    @JsonProperty(value = "rootFolder")
    private String rootFolder;

    /*
     * The last commit ID
     */
    @JsonProperty(value = "lastCommitId")
    private String lastCommitId;

    /*
     * The VSTS tenant ID
     */
    @JsonProperty(value = "tenantId")
    private UUID tenantId;

    /*
     * GitHub bring your own app client id
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * GitHub bring your own app client secret information.
     */
    @JsonProperty(value = "clientSecret")
    private GitHubClientSecret clientSecret;

    /**
     * Get the type property: Type of workspace repositoryID configuration. Example WorkspaceVSTSConfiguration,
     * WorkspaceGitHubConfiguration.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of workspace repositoryID configuration. Example WorkspaceVSTSConfiguration,
     * WorkspaceGitHubConfiguration.
     *
     * @param type the type value to set.
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the hostName property: GitHub Enterprise host name. For example: https://github.mydomain.com.
     *
     * @return the hostName value.
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * Set the hostName property: GitHub Enterprise host name. For example: https://github.mydomain.com.
     *
     * @param hostName the hostName value to set.
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get the accountName property: Account name.
     *
     * @return the accountName value.
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: Account name.
     *
     * @param accountName the accountName value to set.
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the projectName property: VSTS project name.
     *
     * @return the projectName value.
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * Set the projectName property: VSTS project name.
     *
     * @param projectName the projectName value to set.
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get the repositoryName property: Repository name.
     *
     * @return the repositoryName value.
     */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * Set the repositoryName property: Repository name.
     *
     * @param repositoryName the repositoryName value to set.
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * Get the collaborationBranch property: Collaboration branch.
     *
     * @return the collaborationBranch value.
     */
    public String getCollaborationBranch() {
        return this.collaborationBranch;
    }

    /**
     * Set the collaborationBranch property: Collaboration branch.
     *
     * @param collaborationBranch the collaborationBranch value to set.
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration setCollaborationBranch(String collaborationBranch) {
        this.collaborationBranch = collaborationBranch;
        return this;
    }

    /**
     * Get the rootFolder property: Root folder to use in the repository.
     *
     * @return the rootFolder value.
     */
    public String getRootFolder() {
        return this.rootFolder;
    }

    /**
     * Set the rootFolder property: Root folder to use in the repository.
     *
     * @param rootFolder the rootFolder value to set.
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration setRootFolder(String rootFolder) {
        this.rootFolder = rootFolder;
        return this;
    }

    /**
     * Get the lastCommitId property: The last commit ID.
     *
     * @return the lastCommitId value.
     */
    public String getLastCommitId() {
        return this.lastCommitId;
    }

    /**
     * Set the lastCommitId property: The last commit ID.
     *
     * @param lastCommitId the lastCommitId value to set.
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration setLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
        return this;
    }

    /**
     * Get the tenantId property: The VSTS tenant ID.
     *
     * @return the tenantId value.
     */
    public UUID getTenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The VSTS tenant ID.
     *
     * @param tenantId the tenantId value to set.
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration setTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the clientId property: GitHub bring your own app client id.
     *
     * @return the clientId value.
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: GitHub bring your own app client id.
     *
     * @param clientId the clientId value to set.
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: GitHub bring your own app client secret information.
     *
     * @return the clientSecret value.
     */
    public GitHubClientSecret getClientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: GitHub bring your own app client secret information.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the WorkspaceRepositoryConfiguration object itself.
     */
    public WorkspaceRepositoryConfiguration setClientSecret(GitHubClientSecret clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
}
