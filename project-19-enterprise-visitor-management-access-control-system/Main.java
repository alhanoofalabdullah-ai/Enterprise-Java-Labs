package src;

import src.controllers.VisitorController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        VisitorService visitorService = new VisitorService();
        VisitService visitService = new VisitService();
        AccessControlService accessService = new AccessControlService(visitService);

        ReportService reportService =
                new ReportService(
                        visitorService,
                        visitService,
                        accessService
                );

        VisitorController controller =
                new VisitorController(
                        visitorService,
                        visitService,
                        accessService,
                        reportService
                );

        controller.registerVisitor("Alhanoof", "0550000001");
        controller.registerVisitor("Ahmed", "0550000002");

        controller.createVisit("Alhanoof", "IT Department", "2026-07-01");
        controller.createVisit("Ahmed", "Operations", "2026-07-02");

        controller.approveVisit(1);
        controller.issueAccessPass(1);
        controller.checkIn(1);
        controller.checkOut(1);

        controller.showVisits();
        controller.showDashboard();
    }
}
