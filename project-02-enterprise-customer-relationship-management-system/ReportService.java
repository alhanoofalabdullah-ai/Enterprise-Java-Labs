package src.services;

public class ReportService {

    private CustomerService customerService;
    private LeadService leadService;
    private OpportunityService opportunityService;

    public ReportService(
            CustomerService customerService,
            LeadService leadService,
            OpportunityService opportunityService) {

        this.customerService = customerService;
        this.leadService = leadService;
        this.opportunityService = opportunityService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== CRM DASHBOARD =====");

        System.out.println(
                "Customers: "
                        + customerService.totalCustomers());

        System.out.println(
                "Leads: "
                        + leadService.totalLeads());

        System.out.println(
                "Open Opportunities: "
                        + opportunityService.totalOpportunities());

        System.out.println(
                "Estimated Revenue: $"
                        + opportunityService.totalRevenue());
    }
}
