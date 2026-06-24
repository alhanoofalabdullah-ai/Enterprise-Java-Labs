package src.services;

import src.models.Trip;
import src.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TripService {

    private VehicleService vehicleService;
    private List<Trip> trips = new ArrayList<>();
    private int nextId = 1;

    public TripService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public void createTrip(
            int vehicleId,
            String driverName,
            String origin,
            String destination,
            double distance) {

        Vehicle vehicle = vehicleService.findVehicle(vehicleId);

        if (vehicle != null && vehicle.getStatus().equals("AVAILABLE")) {
            vehicle.assignToTrip();

            trips.add(
                    new Trip(
                            nextId++,
                            vehicleId,
                            driverName,
                            origin,
                            destination,
                            distance
                    )
            );
        }
    }

    public Trip findTrip(int id) {
        for (Trip trip : trips) {
            if (trip.getId() == id) {
                return trip;
            }
        }

        return null;
    }

    public void completeTrip(int tripId) {
        Trip trip = findTrip(tripId);

        if (trip != null) {
            trip.complete();

            Vehicle vehicle = vehicleService.findVehicle(trip.getVehicleId());

            if (vehicle != null) {
                vehicle.addMileage(trip.getDistance());
                vehicle.markAvailable();
            }
        }
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public int totalTrips() {
        return trips.size();
    }

    public int completedTrips() {
        int count = 0;

        for (Trip trip : trips) {
            if (trip.getStatus().equals("COMPLETED")) {
                count++;
            }
        }

        return count;
    }
}
