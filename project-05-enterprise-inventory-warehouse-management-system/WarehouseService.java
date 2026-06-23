package src.services;

import src.models.Warehouse;
import java.util.*;

public class WarehouseService {

    private List<Warehouse> warehouses =
            new ArrayList<>();

    private int nextId = 1;

    public void addWarehouse(
            String name,
            String location) {

        warehouses.add(
                new Warehouse(
                        nextId++,
                        name,
                        location));
    }

    public int totalWarehouses() {
        return warehouses.size();
    }
}
