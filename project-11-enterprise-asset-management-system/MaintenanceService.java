package src.services;

import src.models.Asset;

public class MaintenanceService {

    private int maintenanceRecords = 0;

    public void recordMaintenance(Asset asset) {
        if (asset != null) {
            asset.maintenance();
            maintenanceRecords++;
        }
    }

    public int totalMaintenanceRecords() {
        return maintenanceRecords;
    }
}
