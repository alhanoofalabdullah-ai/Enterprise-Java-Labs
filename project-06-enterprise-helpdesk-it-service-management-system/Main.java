package src;

import src.controllers.HelpdeskController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService();
        AgentService agentService = new AgentService();
        SLAService slaService = new SLAService(ticketService);

        ReportService reportService =
                new ReportService(
                        ticketService,
                        agentService,
                        slaService);

        HelpdeskController controller =
                new HelpdeskController(
                        ticketService,
                        agentService,
                        slaService,
                        reportService);

        controller.addAgent("Ahmed");
        controller.addAgent("Sara");

        controller.createTicket(
                "System Login Issue",
                "Employee cannot access the internal portal",
                "HIGH");

        controller.createTicket(
                "Printer Not Working",
                "Finance printer is offline",
                "MEDIUM");

        controller.createTicket(
                "Production Application Down",
                "Critical application outage",
                "CRITICAL");

        controller.assignTicket(1, "Ahmed");
        controller.resolveTicket(2);

        controller.showTickets();
        controller.showDashboard();
    }
}
