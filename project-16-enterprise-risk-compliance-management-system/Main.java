# Main.java

```java
package src;

import src.controllers.RiskController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        RiskService riskService = new RiskService();
        ControlService controlService = new ControlService();
        ComplianceService complianceService = new ComplianceService();
        AuditService auditService = new AuditService();

        ReportService reportService =
                new ReportService(
                        riskService,
                        controlService,
                        complianceService,
                        auditService
                );

        RiskController controller =
                new RiskController(
                        riskService,
                        controlService,
                        complianceService,
                        auditService,
                        reportService
                );

        controller.createRisk("Unauthorized System Access", "HIGH");
        controller.createRisk("Vendor Review Delay", "MEDIUM");
        controller.createRisk("Backup Evidence Missing", "LOW");

        controller.createControl("Access Review Control");
        controller.createControl("Backup Validation Control");

        controller.addComplianceCheck("ISO 27001 Access Control", true);
        controller.addComplianceCheck("Backup Policy Review", false);
        controller.addComplianceCheck("Vendor Governance Review", true);

        controller.addAuditFinding("Backup evidence is incomplete", "OPEN");

        controller.showDashboard();
    }
}
