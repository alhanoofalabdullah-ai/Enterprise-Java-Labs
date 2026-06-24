package src.controllers;

import src.models.Ticket;
import src.services.*;

public class HelpdeskController {

    private TicketService ticketService;
    private AgentService agentService;
    private SLAService slaService;
    private ReportService reportService;

    public HelpdeskController(
            TicketService ticketService,
            AgentService agentService,
            SLAService slaService,
            ReportService reportService) {

        this.ticketService = ticketService;
        this.agentService = agentService;
        this.slaService = slaService;
        this.reportService = reportService;
    }

    public void addAgent(String name) {
        agentService.addAgent(name);
    }

    public void createTicket(
            String title,
            String description,
            String priority) {

        ticketService.createTicket(
                title,
                description,
                priority);
    }

    public void assignTicket(
            int ticketId,
            String agent) {

        Ticket ticket =
                ticketService.findTicket(ticketId);

        if (ticket != null) {
            ticket.assignTo(agent);
        }
    }

    public void resolveTicket(int ticketId) {

        Ticket ticket =
                ticketService.findTicket(ticketId);

        if (ticket != null) {
            ticket.resolve();
        }
    }

    public void showTickets() {

        System.out.println(
                "\n===== TICKETS =====");

        for (Ticket ticket : ticketService.getTickets()) {
            System.out.println(ticket);
        }
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
