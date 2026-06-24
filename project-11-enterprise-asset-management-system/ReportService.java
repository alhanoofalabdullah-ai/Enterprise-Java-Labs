package src.services;

public class ReportService {

    private AssetService assetService;
    private AssignmentService assignmentService;
    private MaintenanceService maintenanceService;

    public ReportService(
            AssetService assetService,
            AssignmentService assignmentService,
            MaintenanceService maintenanceService) {

        this.assetService = assetService;
        this.assignmentService = assignmentService;
        this.maintenanceService = maintenanceService;
    }

    public void showDashboard() {

        System.out.println("\n===== ASSET DASHBOARD =====");
        System.out.println("Total Assets: " + assetService.totalAssets());
        System.out.println("Assigned Assets: " + assetService.countByStatus("ASSIGNED"));
        System.out.println("Available Assets: " + assetService.countByStatus("AVAILABLE"));
        System.out.println("Maintenance Assets: " + assetService.countByStatus("MAINTENANCE"));
        System.out.println("Active Assignments: " + assignmentService.totalAssignments());
        System.out.println("Maintenance Records: " + maintenanceService.totalMaintenanceRecords());
    }
}
