package src;

import src.controllers.SupportController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        CustomerService customerService =
                new CustomerService();

        AgentService agentService =
                new AgentService();

        ComplaintService complaintService =
                new ComplaintService();

        ResolutionService resolutionService =
                new ResolutionService();

        ReportService reportService =
                new ReportService(
                        customerService,
                        agentService,
                        complaintService);

        SupportController controller =
                new SupportController(
                        customerService,
                        agentService,
                        complaintService,
                        resolutionService,
                        reportService);

        controller.addCustomer("Alhanoof");
        controller.addCustomer("Ahmed");
        controller.addCustomer("Sara");

        controller.addAgent("Khalid");
        controller.addAgent("Reem");

        controller.createComplaint(
                "Unable to access account");

        controller.createComplaint(
                "Payment issue");

        controller.createComplaint(
                "Application error");

        controller.createComplaint(
                "Service delay");

        controller.resolveComplaint(1);
        controller.resolveComplaint(2);

        controller.escalateComplaint(3);

        controller.showDashboard();
    }
}
