# Main.java

```java
package src;

import src.controllers.AssetController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        AssetService assetService = new AssetService();
        AssignmentService assignmentService = new AssignmentService(assetService);
        MaintenanceService maintenanceService = new MaintenanceService();

        ReportService reportService =
                new ReportService(
                        assetService,
                        assignmentService,
                        maintenanceService
                );

        AssetController controller =
                new AssetController(
                        assetService,
                        assignmentService,
                        maintenanceService,
                        reportService
                );

        controller.registerAsset("Laptop", "Dell Latitude 7440", "SN-1001");
        controller.registerAsset("Router", "Cisco ISR 4321", "SN-1002");
        controller.registerAsset("Monitor", "HP 27 Inch", "SN-1003");

        controller.assignAsset(1, "Alhanoof");
        controller.recordMaintenance(2, "Firmware upgrade completed");

        controller.showAssets();
        controller.showDashboard();
    }
}
