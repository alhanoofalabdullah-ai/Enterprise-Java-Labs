package src.services;

public class ReportService {

    private VendorService vendorService;
    private ContractService contractService;
    private RenewalService renewalService;

    public ReportService(
            VendorService vendorService,
            ContractService contractService,
            RenewalService renewalService) {

        this.vendorService = vendorService;
        this.contractService = contractService;
        this.renewalService = renewalService;
    }

    public void showDashboard() {

        System.out.println("\n===== CONTRACT DASHBOARD =====");
        System.out.println("Vendors: " + vendorService.totalVendors());
        System.out.println("Contracts: " + contractService.totalContracts());
        System.out.println("Active Contracts: " + contractService.activeContracts());
        System.out.println("Renewals: " + renewalService.totalRenewals());
        System.out.println("Total Contract Value: " + contractService.totalContractValue());
    }
}
