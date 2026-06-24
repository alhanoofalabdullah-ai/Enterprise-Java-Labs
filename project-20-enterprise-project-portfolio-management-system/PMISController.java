package src.controllers;

import src.services.*;

public class PMISController {

    private ProjectService projectService;
    private DocumentationService documentationService;
    private WorkflowService workflowService;
    private RiskService riskService;
    private IssueService issueService;
    private ReportService reportService;

    public PMISController(
            ProjectService projectService,
            DocumentationService documentationService,
            WorkflowService workflowService,
            RiskService riskService,
            IssueService issueService,
            ReportService reportService) {

        this.projectService = projectService;
        this.documentationService = documentationService;
        this.workflowService = workflowService;
        this.riskService = riskService;
        this.issueService = issueService;
        this.reportService = reportService;
    }

    public void createProject(String name) {
        projectService.createProject(name);
    }

    public void registerDocument(String title, String owner) {
        documentationService.registerDocument(title, owner);
    }

    public void createWorkflow(String workflowName) {
        workflowService.createWorkflow(workflowName);
    }

    public void registerRisk(String description, String severity) {
        riskService.registerRisk(description, severity);
    }

    public void registerIssue(String description, String status) {
        issueService.registerIssue(description, status);
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
