package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetIPConfigurationInner;
import com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner;
import com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetNetworkConfigurationInner;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class VirtualMachineOperationsTests extends ComputeManagementTestBase {
    private static final String RG_NAME = "beta2vm395group";
    private static final String LOCATION = "eastus";
    private static final String VMNAME = "javavm";

    @BeforeClass
    public static void setup() throws Exception {
        createClients();
    }

    @AfterClass
    public static void cleanup() throws Exception {
        //resourceManager.resourceGroups().delete(RG_NAME);
    }

    @Test
    public void canCreateVMScaleSet() throws Exception {
        Sku sku = new Sku()
                .withCapacity(1L)
                .withName("Standard_D1_V2")
                .withTier("Standard");
        UpgradePolicy upgradePolicy = new UpgradePolicy()
                .withMode(UpgradeMode.MANUAL);
        VirtualMachineScaleSetOSProfile osProfile = new VirtualMachineScaleSetOSProfile()
                .withAdminUsername("ubuntu")
                .withAdminPassword("samplePa$$w0rd")
                .withComputerNamePrefix("javatest-dev-2016")
                .withLinuxConfiguration(new LinuxConfiguration()
                    .withDisablePasswordAuthentication(false)
                    .withSsh(new SshConfiguration()
                        .withPublicKeys(new ArrayList<SshPublicKey>())));
        osProfile.linuxConfiguration().ssh().publicKeys().add(new SshPublicKey().withPath("/home/ubuntu/.ssh/authorized_keys")
                .withKeyData("ssh-rsa AAAAB3NzaC1yc2EAAAABIwAAAQEA31fdOy3TeIdelDXoVdtFtidZqWlJmMxCKeCepXUhUgtpm7lvxh8htMyQWE7l2xWXk2777oQr59Kr0Cj+q2KsbYLWEiJY4SPrVJyT8/qOkSixaawrcCrpt5ALRwNVNr4d4e1SlvazVQN9yfKyzz9xbvT+xByLBA1sXnaIkbV0iX/rFY7Lb3EELi65tkTEQ7vBpkujPXsBivhoEfEvJexuGb9u0bnMdaVL+TnGRWiue3kW3ZNwILnbkOLBS5blDrNrrhBkbAnewpCSyBog20N3SBjcaU2qKgFzFAKu9zVWTvpNwAYc7SJDh4hRyr5z7vzT0cDXlDV4XoPy/wadlVIQYw== jianghlu@JIANGHLU"));
        VirtualMachineScaleSetStorageProfile storageProfile = new VirtualMachineScaleSetStorageProfile()
                .withOsDisk(new VirtualMachineScaleSetOSDisk()
                        .withCaching(CachingTypes.READ_WRITE)
                        .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                        .withOsType(OperatingSystemTypes.LINUX)
                        .withImage(new VirtualHardDisk().withUri("https://stgbeta2vm395e73724278.blob.core.windows.net/vhds/beta2vm395-os-disk-20b154f9-6faf-465c-8c29-4733c9591f33.vhd"))
                        .withName("java-osdisk-2016"));
        VirtualMachineScaleSetNetworkProfile networkProfile = new VirtualMachineScaleSetNetworkProfile()
                .withNetworkInterfaceConfigurations(new ArrayList<VirtualMachineScaleSetNetworkConfigurationInner>());
        networkProfile.networkInterfaceConfigurations().add((VirtualMachineScaleSetNetworkConfigurationInner) new VirtualMachineScaleSetNetworkConfigurationInner()
                .withName("vnet451264da5c")
                .withPrimary(true)
                .withIpConfigurations(new ArrayList<VirtualMachineScaleSetIPConfigurationInner>())
                .withId("/subscriptions/2c224e7e-3ef5-431d-a57b-e71f4662e3a6/resourceGroups/beta2vm395group/providers/Microsoft.Network/virtualNetworks/javatest-vnet-395"));
        networkProfile.networkInterfaceConfigurations().get(0).ipConfigurations().add(new VirtualMachineScaleSetIPConfigurationInner()
                .withName("javatest-ipconfig-2016")
                .withSubnet(new ApiEntityReference().withId("/subscriptions/2c224e7e-3ef5-431d-a57b-e71f4662e3a6/resourceGroups/beta2vm395group/providers/Microsoft.Network/virtualNetworks/javatest-vnet-395/subnets/subnet1")));
        VirtualMachineScaleSetVMProfile vmProfile = new VirtualMachineScaleSetVMProfile()
                .withOsProfile(osProfile)
                .withNetworkProfile(networkProfile)
                .withStorageProfile(storageProfile);

        VirtualMachineScaleSetInner scaleSetInner = (VirtualMachineScaleSetInner) new VirtualMachineScaleSetInner()
                .withOverProvision(false)
                .withSku(sku)
                .withUpgradePolicy(upgradePolicy)
                .withVirtualMachineProfile(vmProfile)
                .withLocation(LOCATION);
        clientImpl.virtualMachineScaleSets().createOrUpdate(RG_NAME, "javatest-vmss-397", scaleSetInner);
    }

    @Test
    public void canCreateVirtualMachine() throws Exception {
        // Create
        VirtualMachine vm = computeManager.virtualMachines()
                .define(VMNAME)
                .withRegion(LOCATION)
                .withNewResourceGroup(RG_NAME)
                .withNewPrimaryNetwork("10.0.0.0/28")
                .withPrimaryPrivateIpAddressDynamic()
                .withoutPrimaryPublicIpAddress()
                .withPopularWindowsImage(KnownWindowsVirtualMachineImage.WINDOWS_SERVER_2012_DATACENTER)
                .withAdminUserName("Foo12")
                .withPassword("BaR@12")
                .withSize(VirtualMachineSizeTypes.STANDARD_D3)
                .withOsDiskCaching(CachingTypes.READ_WRITE)
                .withOsDiskName("javatest")
                .create();

        VirtualMachine foundedVM = null;
        List<VirtualMachine> vms = computeManager.virtualMachines().listByGroup(RG_NAME);
        for (VirtualMachine vm1 : vms) {
            if (vm1.name().equals(VMNAME)) {
                foundedVM = vm1;
                break;
            }
        }
        Assert.assertNotNull(foundedVM);
        Assert.assertEquals(LOCATION, foundedVM.regionName());
        // Get
        foundedVM = computeManager.virtualMachines().getByGroup(RG_NAME, VMNAME);
        Assert.assertNotNull(foundedVM);
        Assert.assertEquals(LOCATION, foundedVM.regionName());

        // Fetch instance view
        PowerState powerState = foundedVM.powerState();
        Assert.assertTrue(powerState == PowerState.RUNNING);
        VirtualMachineInstanceView instanceView = foundedVM.instanceView();
        Assert.assertNotNull(instanceView);
        Assert.assertNotNull(instanceView.statuses().size() > 0);

        // Delete VM
        computeManager.virtualMachines().delete(foundedVM.id());
    }
}
