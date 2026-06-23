package src;

import src.controllers.ProcurementController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        VendorService vendorService =
                new VendorService();

        ProcurementService procurementService =
                new ProcurementService();

        PurchaseOrderService purchaseOrderService =
                new PurchaseOrderService();

        ContractService contractService =
                new ContractService();

        ReportService reportService =
                new ReportService(
                        vendorService,
                        procurementService,
                        purchaseOrderService,
                        contractService);

        ProcurementController controller =
                new ProcurementController(
                        vendorService,
                        procurementService,
                        purchaseOrderService,
                        contractService,
                        reportService);

        controller.registerVendor("Oracle");

        controller.createPurchaseRequest(
                "Enterprise PMIS Licenses");

        controller.createPurchaseOrder(
                "PO-1001");

        controller.createContract(
                "Oracle Support Agreement");

        controller.showDashboard();
    }
}
