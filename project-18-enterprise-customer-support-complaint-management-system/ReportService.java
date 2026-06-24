package src.services;

public class ReportService {

    private CustomerService customerService;
    private AgentService agentService;
    private ComplaintService complaintService;

    public ReportService(
            CustomerService customerService,
            AgentService agentService,
            ComplaintService complaintService) {

        this.customerService = customerService;
        this.agentService = agentService;
        this.complaintService = complaintService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== CUSTOMER SUPPORT DASHBOARD =====");

        System.out.println(
                "Customers: "
                        + customerService.totalCustomers());

        System.out.println(
                "Agents: "
                        + agentService.totalAgents());

        System.out.println(
                "Complaints: "
                        + complaintService.totalComplaints());

        System.out.println(
                "Open Complaints: "
                        + complaintService.countStatus("OPEN"));

        System.out.println(
                "Resolved Complaints: "
                        + complaintService.countStatus("RESOLVED"));

        System.out.println(
                "Escalated Complaints: "
                        + complaintService.countStatus("ESCALATED"));
    }
}
