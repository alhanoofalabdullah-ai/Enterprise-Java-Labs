package src.controllers;

import src.models.Complaint;
import src.services.*;

public class SupportController {

    private CustomerService customerService;
    private AgentService agentService;
    private ComplaintService complaintService;
    private ResolutionService resolutionService;
    private ReportService reportService;

    public SupportController(
            CustomerService customerService,
            AgentService agentService,
            ComplaintService complaintService,
            ResolutionService resolutionService,
            ReportService reportService) {

        this.customerService = customerService;
        this.agentService = agentService;
        this.complaintService = complaintService;
        this.resolutionService = resolutionService;
        this.reportService = reportService;
    }

    public void addCustomer(String name) {
        customerService.addCustomer(name);
    }

    public void addAgent(String name) {
        agentService.addAgent(name);
    }

    public void createComplaint(String title) {
        complaintService.createComplaint(title);
    }

    public void resolveComplaint(int id) {

        Complaint complaint =
                complaintService.getComplaint(id);

        resolutionService.resolve(complaint);
    }

    public void escalateComplaint(int id) {

        Complaint complaint =
                complaintService.getComplaint(id);

        resolutionService.escalate(complaint);
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
