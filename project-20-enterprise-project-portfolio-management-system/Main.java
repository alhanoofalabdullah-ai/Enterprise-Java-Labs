package src;

import src.controllers.PMISController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        ProjectService projectService = new ProjectService();
        DocumentationService documentationService = new DocumentationService();
        WorkflowService workflowService = new WorkflowService();
        RiskService riskService = new RiskService();
        IssueService issueService = new IssueService();

        ReportService reportService =
                new ReportService(
                        projectService,
                        documentationService,
                        workflowService,
                        riskService,
                        issueService
                );

        PMISController controller =
                new PMISController(
                        projectService,
                        documentationService,
                        workflowService,
                        riskService,
                        issueService,
                        reportService
                );

        controller.createProject("Laheq Island Development");
        controller.createProject("Digital Transformation Program");

        controller.registerDocument("Technical Submittal", "Alhanoof");
        controller.registerDocument("Design Drawing", "Ahmed");
        controller.registerDocument("Project Procedure", "Sara");

        controller.createWorkflow("Engineering Review");
        controller.createWorkflow("Management Approval");

        controller.registerRisk("Delayed approval cycle", "HIGH");
        controller.registerRisk("Incomplete documentation", "MEDIUM");
        controller.registerRisk("Resource availability", "LOW");

        controller.registerIssue("Pending workflow response", "OPEN");
        controller.registerIssue("Document metadata correction", "CLOSED");

        controller.showDashboard();
    }
}
