package src.controllers;

import src.models.Asset;
import src.services.*;

public class AssetController {

    private AssetService assetService;
    private AssignmentService assignmentService;
    private MaintenanceService maintenanceService;
    private ReportService reportService;

    public AssetController(
            AssetService assetService,
            AssignmentService assignmentService,
            MaintenanceService maintenanceService,
            ReportService reportService) {

        this.assetService = assetService;
        this.assignmentService = assignmentService;
        this.maintenanceService = maintenanceService;
        this.reportService = reportService;
    }

    public void registerAsset(String category, String name, String serialNumber) {
        assetService.registerAsset(category, name, serialNumber);
    }

    public void assignAsset(int assetId, String employeeName) {
        assignmentService.assignAsset(assetId, employeeName);
    }

    public void recordMaintenance(int assetId, String description) {
        Asset asset = assetService.findAsset(assetId);
        maintenanceService.recordMaintenance(asset);
    }

    public void showAssets() {
        System.out.println("\n===== ASSETS =====");

        for (Asset asset : assetService.getAssets()) {
            System.out.println(asset);
        }
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
