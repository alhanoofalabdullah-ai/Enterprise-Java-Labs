package src;

import src.controllers.CRMController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        CustomerService customerService =
                new CustomerService();

        LeadService leadService =
                new LeadService();

        OpportunityService opportunityService =
                new OpportunityService();

        ReportService reportService =
                new ReportService(
                        customerService,
                        leadService,
                        opportunityService);

        CRMController controller =
                new CRMController(
                        customerService,
                        leadService,
                        opportunityService,
                        reportService);

        controller.addCustomer(
                "Saudi Telecom Company");

        controller.addLead(
                "Riyadh Construction Group");

        controller.createOpportunity(
                "Digital Transformation Program",
                2500000);

        controller.showDashboard();
    }
}
