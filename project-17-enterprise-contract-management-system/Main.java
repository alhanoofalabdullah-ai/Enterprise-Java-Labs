# Main.java

```java
package src;

import src.controllers.ContractController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        VendorService vendorService = new VendorService();
        ContractService contractService = new ContractService();
        RenewalService renewalService = new RenewalService();

        ReportService reportService =
                new ReportService(
                        vendorService,
                        contractService,
                        renewalService
                );

        ContractController controller =
                new ContractController(
                        vendorService,
                        contractService,
                        renewalService,
                        reportService
                );

        controller.addVendor("Oracle");
        controller.addVendor("Cisco");

        controller.createContract("Oracle Cloud Agreement", "Oracle", 1200000);
        controller.createContract("Cisco Network Support", "Cisco", 850000);
        controller.createContract("PMIS Support Contract", "Oracle", 500000);

        controller.renewContract(1, "Renewed for 12 months");

        controller.showContracts();
        controller.showDashboard();
    }
}
