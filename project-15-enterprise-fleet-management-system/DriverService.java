package src.services;

import src.models.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverService {

    private List<Driver> drivers = new ArrayList<>();
    private int nextId = 1;

    public void registerDriver(String name) {
        drivers.add(new Driver(nextId++, name));
    }

    public int totalDrivers() {
        return drivers.size();
    }
}
