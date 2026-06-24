package src.controllers;

import src.models.Document;
import src.services.*;

public class DocumentController {

    private DocumentService documentService;
    private WorkflowService workflowService;
    private ApprovalService approvalService;
    private AuditService auditService;
    private ReportService reportService;

    public DocumentController(
            DocumentService documentService,
            WorkflowService workflowService,
            ApprovalService approvalService,
            AuditService auditService,
            ReportService reportService) {

        this.documentService = documentService;
        this.workflowService = workflowService;
        this.approvalService = approvalService;
        this.auditService = auditService;
        this.reportService = reportService;
    }

    public void registerDocument(String title, String owner) {
        documentService.registerDocument(title, owner);
        auditService.logAction("Document registered: " + title);
    }

    public void assignWorkflow(int documentId, String workflowName) {
        workflowService.assignWorkflow(documentId, workflowName);
        auditService.logAction("Workflow assigned to document: " + documentId);
    }

    public void approveDocument(int documentId) {
        Document document = documentService.findDocument(documentId);
        approvalService.approve(document);
        auditService.logAction("Document approved: " + documentId);
    }

    public void rejectDocument(int documentId) {
        Document document = documentService.findDocument(documentId);
        approvalService.reject(document);
        auditService.logAction("Document rejected: " + documentId);
    }

    public void showDocuments() {
        System.out.println("\n===== DOCUMENTS =====");

        for (Document document : documentService.getDocuments()) {
            System.out.println(document);
        }
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
