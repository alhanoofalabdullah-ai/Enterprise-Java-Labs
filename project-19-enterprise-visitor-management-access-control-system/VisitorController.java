package src.controllers;

import src.models.VisitRequest;
import src.services.*;

public class VisitorController {

    private VisitorService visitorService;
    private VisitService visitService;
    private AccessControlService accessService;
    private ReportService reportService;

    public VisitorController(
            VisitorService visitorService,
            VisitService visitService,
            AccessControlService accessService,
            ReportService reportService) {

        this.visitorService = visitorService;
        this.visitService = visitService;
        this.accessService = accessService;
        this.reportService = reportService;
    }

    public void registerVisitor(String name, String phone) {
        visitorService.registerVisitor(name, phone);
    }

    public void createVisit(
            String visitor,
            String hostDepartment,
            String date) {

        visitService.createVisit(
                visitor,
                hostDepartment,
                date
        );
    }

    public void approveVisit(int visitId) {
        accessService.approveVisit(visitId);
    }

    public void issueAccessPass(int visitId) {
        accessService.issuePass(visitId);
    }

    public void checkIn(int visitId) {
        accessService.checkIn(visitId);
    }

    public void checkOut(int visitId) {
        accessService.checkOut(visitId);
    }

    public void showVisits() {

        System.out.println("\n===== VISITS =====");

        for (VisitRequest visit : visitService.getVisits()) {
            System.out.println(visit);
        }
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
