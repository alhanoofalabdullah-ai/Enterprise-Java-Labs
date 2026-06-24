package src.services;

public class ReportService {

    private RiskService riskService;
    private ControlService controlService;
    private ComplianceService complianceService;
    private AuditService auditService;

    public ReportService(
            RiskService riskService,
            ControlService controlService,
            ComplianceService complianceService,
            AuditService auditService) {

        this.riskService = riskService;
        this.controlService = controlService;
        this.complianceService = complianceService;
        this.auditService = auditService;
    }

    public void showDashboard() {

        System.out.println("\n===== RISK & COMPLIANCE DASHBOARD =====");
        System.out.println("Risks: " + riskService.totalRisks());
        System.out.println("High Risks: " + riskService.highRisks());
        System.out.println("Controls: " + controlService.totalControls());
        System.out.println("Compliance Checks: " + complianceService.totalChecks());
        System.out.println("Passed Checks: " + complianceService.passedChecks());
        System.out.println("Failed Checks: " + complianceService.failedChecks());
        System.out.println("Open Audit Findings: " + auditService.openFindings());
    }
}
