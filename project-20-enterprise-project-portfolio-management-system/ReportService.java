package src.services;

public class ReportService {

    private ProjectService projectService;
    private DocumentationService documentationService;
    private WorkflowService workflowService;
    private RiskService riskService;
    private IssueService issueService;

    public ReportService(
            ProjectService projectService,
            DocumentationService documentationService,
            WorkflowService workflowService,
            RiskService riskService,
            IssueService issueService) {

        this.projectService = projectService;
        this.documentationService = documentationService;
        this.workflowService = workflowService;
        this.riskService = riskService;
        this.issueService = issueService;
    }

    public void showDashboard() {

        System.out.println("\n===== EXECUTIVE PMIS DASHBOARD =====");
        System.out.println("Projects: " + projectService.totalProjects());
        System.out.println("Documents: " + documentationService.totalDocuments());
        System.out.println("Workflows: " + workflowService.totalWorkflows());
        System.out.println("Risks: " + riskService.totalRisks());
        System.out.println("High Risks: " + riskService.highRisks());
        System.out.println("Issues: " + issueService.totalIssues());
        System.out.println("Open Issues: " + issueService.openIssues());
        System.out.println("Governance Status: ACTIVE");
    }
}
