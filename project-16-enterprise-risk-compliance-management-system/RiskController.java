package src.controllers;

import src.services.*;

public class RiskController {

    private RiskService riskService;
    private ControlService controlService;
    private ComplianceService complianceService;
    private AuditService auditService;
    private ReportService reportService;

    public RiskController(
            RiskService riskService,
            ControlService controlService,
            ComplianceService complianceService,
            AuditService auditService,
            ReportService reportService) {

        this.riskService = riskService;
        this.controlService = controlService;
        this.complianceService = complianceService;
        this.auditService = auditService;
        this.reportService = reportService;
    }

    public void createRisk(String name, String severity) {
        riskService.createRisk(name, severity);
    }

    public void createControl(String name) {
        controlService.createControl(name);
    }

    public void addComplianceCheck(String name, boolean passed) {
        complianceService.addCheck(name, passed);
    }

    public void addAuditFinding(String description, String status) {
        auditService.addFinding(description, status);
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
