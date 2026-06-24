package src.services;

import src.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleService {

    private List<Vehicle> vehicles = new ArrayList<>();
    private int nextId = 1;

    public void registerVehicle(String model, String plateNumber, double mileage) {
        vehicles.add(new Vehicle(nextId++, model, plateNumber, mileage));
    }

    public Vehicle findVehicle(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                return vehicle;
            }
        }

        return null;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public int totalVehicles() {
        return vehicles.size();
    }

    public int countByStatus(String status) {
        int count = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getStatus().equals(status)) {
                count++;
            }
        }

        return count;
    }
}
