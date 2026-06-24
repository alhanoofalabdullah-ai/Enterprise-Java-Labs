package src.controllers;

import src.models.Trip;
import src.models.Vehicle;
import src.services.*;

public class FleetController {

    private VehicleService vehicleService;
    private DriverService driverService;
    private TripService tripService;
    private MaintenanceService maintenanceService;
    private ReportService reportService;

    public FleetController(
            VehicleService vehicleService,
            DriverService driverService,
            TripService tripService,
            MaintenanceService maintenanceService,
            ReportService reportService) {

        this.vehicleService = vehicleService;
        this.driverService = driverService;
        this.tripService = tripService;
        this.maintenanceService = maintenanceService;
        this.reportService = reportService;
    }

    public void registerVehicle(String model, String plateNumber, double mileage) {
        vehicleService.registerVehicle(model, plateNumber, mileage);
    }

    public void registerDriver(String name) {
        driverService.registerDriver(name);
    }

    public void createTrip(
            int vehicleId,
            String driver,
            String origin,
            String destination,
            double distance) {

        tripService.createTrip(
                vehicleId,
                driver,
                origin,
                destination,
                distance
        );
    }

    public void completeTrip(int tripId) {
        tripService.completeTrip(tripId);
    }

    public void recordMaintenance(int vehicleId, String description) {
        maintenanceService.recordMaintenance(vehicleId, description);

        Vehicle vehicle = vehicleService.findVehicle(vehicleId);

        if (vehicle != null) {
            vehicle.markMaintenance();
        }
    }

    public void showVehicles() {
        System.out.println("\n===== VEHICLES =====");

        for (Vehicle vehicle : vehicleService.getVehicles()) {
            System.out.println(vehicle);
        }
    }

    public void showTrips() {
        System.out.println("\n===== TRIPS =====");

        for (Trip trip : tripService.getTrips()) {
            System.out.println(trip);
        }
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
