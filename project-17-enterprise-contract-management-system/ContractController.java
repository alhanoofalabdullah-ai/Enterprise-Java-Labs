package src.controllers;

import src.models.Contract;
import src.services.*;

public class ContractController {

    private VendorService vendorService;
    private ContractService contractService;
    private RenewalService renewalService;
    private ReportService reportService;

    public ContractController(
            VendorService vendorService,
            ContractService contractService,
            RenewalService renewalService,
            ReportService reportService) {

        this.vendorService = vendorService;
        this.contractService = contractService;
        this.renewalService = renewalService;
        this.reportService = reportService;
    }

    public void addVendor(String name) {
        vendorService.addVendor(name);
    }

    public void createContract(String name, String vendor, double value) {
        contractService.createContract(name, vendor, value);
    }

    public void renewContract(int contractId, String notes) {
        Contract contract = contractService.findContract(contractId);
        renewalService.renewContract(contract, notes);
    }

    public void showContracts() {
        System.out.println("\n===== CONTRACTS =====");

        for (Contract contract : contractService.getContracts()) {
            System.out.println(contract);
        }
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
