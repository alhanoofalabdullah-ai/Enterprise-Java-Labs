package src.services;

public class ReportService {

    private VisitorService visitorService;
    private VisitService visitService;
    private AccessControlService accessService;

    public ReportService(
            VisitorService visitorService,
            VisitService visitService,
            AccessControlService accessService) {

        this.visitorService = visitorService;
        this.visitService = visitService;
        this.accessService = accessService;
    }

    public void showDashboard() {

        System.out.println("\n===== VISITOR DASHBOARD =====");

        System.out.println(
                "Registered Visitors: "
                        + visitorService.totalVisitors());

        System.out.println(
                "Total Visits: "
                        + visitService.totalVisits());

        System.out.println(
                "Pending Visits: "
                        + visitService.countByStatus("PENDING"));

        System.out.println(
                "Approved Visits: "
                        + visitService.countByStatus("APPROVED"));

        System.out.println(
                "Active Visitors: "
                        + visitService.countByStatus("CHECKED_IN"));

        System.out.println(
                "Completed Visits: "
                        + visitService.countByStatus("COMPLETED"));

        System.out.println(
                "Access Passes Issued: "
                        + accessService.totalPasses());
    }
}
