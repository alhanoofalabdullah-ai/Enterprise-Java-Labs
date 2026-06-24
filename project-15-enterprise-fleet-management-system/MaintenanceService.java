package src.services;

import src.models.MaintenanceRecord;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceService {

    private List<MaintenanceRecord> records = new ArrayList<>();

    public void recordMaintenance(int vehicleId, String description) {
        records.add(new MaintenanceRecord(vehicleId, description));
    }

    public int totalMaintenanceRecords() {
        return records.size();
    }
}
