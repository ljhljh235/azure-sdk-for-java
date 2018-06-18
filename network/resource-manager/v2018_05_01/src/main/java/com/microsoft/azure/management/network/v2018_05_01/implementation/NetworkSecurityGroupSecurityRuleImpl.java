/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import com.microsoft.azure.management.network.v2018_05_01.NetworkSecurityGroupSecurityRule;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_05_01.SecurityRuleProtocol;
import java.util.List;
import com.microsoft.azure.management.network.v2018_05_01.SecurityRuleAccess;
import com.microsoft.azure.management.network.v2018_05_01.SecurityRuleDirection;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2018_05_01.ApplicationSecurityGroup;

class NetworkSecurityGroupSecurityRuleImpl extends CreatableUpdatableImpl<NetworkSecurityGroupSecurityRule, SecurityRuleInner, NetworkSecurityGroupSecurityRuleImpl> implements NetworkSecurityGroupSecurityRule, NetworkSecurityGroupSecurityRule.Definition, NetworkSecurityGroupSecurityRule.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String networkSecurityGroupName;
    private String securityRuleName;

    NetworkSecurityGroupSecurityRuleImpl(String name, NetworkManager manager) {
        super(name, new SecurityRuleInner());
        this.manager = manager;
        // Set resource name
        this.securityRuleName = name;
        //
    }

    NetworkSecurityGroupSecurityRuleImpl(SecurityRuleInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.securityRuleName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.networkSecurityGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "networkSecurityGroups");
        this.securityRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "securityRules");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<NetworkSecurityGroupSecurityRule> createResourceAsync() {
        SecurityRulesInner client = this.manager().inner().securityRules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.networkSecurityGroupName, this.securityRuleName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NetworkSecurityGroupSecurityRule> updateResourceAsync() {
        SecurityRulesInner client = this.manager().inner().securityRules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.networkSecurityGroupName, this.securityRuleName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SecurityRuleInner> getInnerAsync() {
        SecurityRulesInner client = this.manager().inner().securityRules();
        return client.getAsync(this.resourceGroupName, this.networkSecurityGroupName, this.securityRuleName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public SecurityRuleAccess access() {
        return this.inner().access();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String destinationAddressPrefix() {
        return this.inner().destinationAddressPrefix();
    }

    @Override
    public List<String> destinationAddressPrefixes() {
        return this.inner().destinationAddressPrefixes();
    }

    @Override
    public List<ApplicationSecurityGroup> destinationApplicationSecurityGroups() {
        List<ApplicationSecurityGroup> lst = new ArrayList<ApplicationSecurityGroup>();
        if (this.inner().destinationApplicationSecurityGroups() != null) {
            for (ApplicationSecurityGroupInner inner : this.inner().destinationApplicationSecurityGroups()) {
                lst.add( new ApplicationSecurityGroupImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String destinationPortRange() {
        return this.inner().destinationPortRange();
    }

    @Override
    public List<String> destinationPortRanges() {
        return this.inner().destinationPortRanges();
    }

    @Override
    public SecurityRuleDirection direction() {
        return this.inner().direction();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer priority() {
        return this.inner().priority();
    }

    @Override
    public SecurityRuleProtocol protocol() {
        return this.inner().protocol();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String sourceAddressPrefix() {
        return this.inner().sourceAddressPrefix();
    }

    @Override
    public List<String> sourceAddressPrefixes() {
        return this.inner().sourceAddressPrefixes();
    }

    @Override
    public List<ApplicationSecurityGroup> sourceApplicationSecurityGroups() {
        List<ApplicationSecurityGroup> lst = new ArrayList<ApplicationSecurityGroup>();
        if (this.inner().sourceApplicationSecurityGroups() != null) {
            for (ApplicationSecurityGroupInner inner : this.inner().sourceApplicationSecurityGroups()) {
                lst.add( new ApplicationSecurityGroupImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String sourcePortRange() {
        return this.inner().sourcePortRange();
    }

    @Override
    public List<String> sourcePortRanges() {
        return this.inner().sourcePortRanges();
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withExistingNetworkSecurityGroup(String resourceGroupName, String networkSecurityGroupName) {
        this.resourceGroupName = resourceGroupName;
        this.networkSecurityGroupName = networkSecurityGroupName;
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withAccess(SecurityRuleAccess access) {
        this.inner().withAccess(access);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withDirection(SecurityRuleDirection direction) {
        this.inner().withDirection(direction);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withProtocol(SecurityRuleProtocol protocol) {
        this.inner().withProtocol(protocol);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withDestinationAddressPrefix(String destinationAddressPrefix) {
        this.inner().withDestinationAddressPrefix(destinationAddressPrefix);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withDestinationAddressPrefixes(List<String> destinationAddressPrefixes) {
        this.inner().withDestinationAddressPrefixes(destinationAddressPrefixes);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withDestinationApplicationSecurityGroups(List<ApplicationSecurityGroupInner> destinationApplicationSecurityGroups) {
        this.inner().withDestinationApplicationSecurityGroups(destinationApplicationSecurityGroups);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withDestinationPortRange(String destinationPortRange) {
        this.inner().withDestinationPortRange(destinationPortRange);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withDestinationPortRanges(List<String> destinationPortRanges) {
        this.inner().withDestinationPortRanges(destinationPortRanges);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withPriority(Integer priority) {
        this.inner().withPriority(priority);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withProvisioningState(String provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withSourceAddressPrefix(String sourceAddressPrefix) {
        this.inner().withSourceAddressPrefix(sourceAddressPrefix);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withSourceAddressPrefixes(List<String> sourceAddressPrefixes) {
        this.inner().withSourceAddressPrefixes(sourceAddressPrefixes);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withSourceApplicationSecurityGroups(List<ApplicationSecurityGroupInner> sourceApplicationSecurityGroups) {
        this.inner().withSourceApplicationSecurityGroups(sourceApplicationSecurityGroups);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withSourcePortRange(String sourcePortRange) {
        this.inner().withSourcePortRange(sourcePortRange);
        return this;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl withSourcePortRanges(List<String> sourcePortRanges) {
        this.inner().withSourcePortRanges(sourcePortRanges);
        return this;
    }

}
