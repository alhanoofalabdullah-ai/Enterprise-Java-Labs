package src.services;

public class ReportService {

    private VendorService vendorService;
    private ProcurementService procurementService;
    private PurchaseOrderService purchaseOrderService;
    private ContractService contractService;

    public ReportService(
            VendorService vendorService,
            ProcurementService procurementService,
            PurchaseOrderService purchaseOrderService,
            ContractService contractService) {

        this.vendorService = vendorService;
        this.procurementService = procurementService;
        this.purchaseOrderService = purchaseOrderService;
        this.contractService = contractService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== PROCUREMENT DASHBOARD =====");

        System.out.println(
                "Vendors: "
                        + vendorService.totalVendors());

        System.out.println(
                "Purchase Requests: "
                        + procurementService.totalRequests());

        System.out.println(
                "Purchase Orders: "
                        + purchaseOrderService.totalPurchaseOrders());

        System.out.println(
                "Contracts: "
                        + contractService.totalContracts());
    }
}
