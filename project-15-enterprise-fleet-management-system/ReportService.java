package src.services;

public class ReportService {

    private VehicleService vehicleService;
    private DriverService driverService;
    private TripService tripService;
    private MaintenanceService maintenanceService;

    public ReportService(
            VehicleService vehicleService,
            DriverService driverService,
            TripService tripService,
            MaintenanceService maintenanceService) {

        this.vehicleService = vehicleService;
        this.driverService = driverService;
        this.tripService = tripService;
        this.maintenanceService = maintenanceService;
    }

    public void showDashboard() {

        System.out.println("\n===== FLEET DASHBOARD =====");
        System.out.println("Vehicles: " + vehicleService.totalVehicles());
        System.out.println("Drivers: " + driverService.totalDrivers());
        System.out.println("Trips: " + tripService.totalTrips());
        System.out.println("Completed Trips: " + tripService.completedTrips());
        System.out.println("Available Vehicles: " + vehicleService.countByStatus("AVAILABLE"));
        System.out.println("Vehicles On Trip: " + vehicleService.countByStatus("ON_TRIP"));
        System.out.println("Maintenance Records: " + maintenanceService.totalMaintenanceRecords());
    }
}
