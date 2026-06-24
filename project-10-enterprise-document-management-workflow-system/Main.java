# Main.java

```java
package src;

import src.controllers.DocumentController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        DocumentService documentService = new DocumentService();
        WorkflowService workflowService = new WorkflowService();
        ApprovalService approvalService = new ApprovalService();
        AuditService auditService = new AuditService();

        ReportService reportService =
                new ReportService(
                        documentService,
                        workflowService,
                        approvalService,
                        auditService
                );

        DocumentController controller =
                new DocumentController(
                        documentService,
                        workflowService,
                        approvalService,
                        auditService,
                        reportService
                );

        controller.registerDocument("Technical Submittal", "Alhanoof");
        controller.registerDocument("Project Procedure", "Ahmed");
        controller.registerDocument("Design Drawing", "Sara");

        controller.assignWorkflow(1, "Engineering Review");
        controller.assignWorkflow(2, "Management Approval");

        controller.approveDocument(1);
        controller.rejectDocument(2);

        controller.showDocuments();
        controller.showDashboard();
    }
}
