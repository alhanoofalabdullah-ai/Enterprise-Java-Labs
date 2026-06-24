# Main.java

```java
package src;

import src.controllers.FleetController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        VehicleService vehicleService = new VehicleService();
        DriverService driverService = new DriverService();
        TripService tripService = new TripService(vehicleService);
        MaintenanceService maintenanceService = new MaintenanceService();

        ReportService reportService =
                new ReportService(
                        vehicleService,
                        driverService,
                        tripService,
                        maintenanceService
                );

        FleetController controller =
                new FleetController(
                        vehicleService,
                        driverService,
                        tripService,
                        maintenanceService,
                        reportService
                );

        controller.registerVehicle("Toyota Hilux", "ABC-1001", 42000);
        controller.registerVehicle("Ford Transit", "ABC-1002", 61500);
        controller.registerVehicle("Mercedes Van", "ABC-1003", 30000);

        controller.registerDriver("Ahmed");
        controller.registerDriver("Sara");

        controller.createTrip(1, "Ahmed", "Riyadh Warehouse", "Jeddah Branch", 950);
        controller.createTrip(2, "Sara", "Riyadh Office", "Dammam Site", 420);

        controller.completeTrip(1);

        controller.recordMaintenance(3, "Oil change and tire inspection");

        controller.showVehicles();
        controller.showTrips();
        controller.showDashboard();
    }
}
