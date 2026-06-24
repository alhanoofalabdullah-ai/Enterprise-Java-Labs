package src.services;

public class ReportService {

    private TicketService ticketService;
    private AgentService agentService;
    private SLAService slaService;

    public ReportService(
            TicketService ticketService,
            AgentService agentService,
            SLAService slaService) {

        this.ticketService = ticketService;
        this.agentService = agentService;
        this.slaService = slaService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== HELPDESK DASHBOARD =====");

        System.out.println(
                "Tickets: "
                        + ticketService.totalTickets());

        System.out.println(
                "Open Tickets: "
                        + ticketService.countByStatus("OPEN"));

        System.out.println(
                "Assigned Tickets: "
                        + ticketService.countByStatus("ASSIGNED"));

        System.out.println(
                "Resolved Tickets: "
                        + ticketService.countByStatus("RESOLVED"));

        System.out.println(
                "Critical Tickets: "
                        + ticketService.countByPriority("CRITICAL"));

        System.out.println(
                "Agents: "
                        + agentService.totalAgents());

        System.out.println(
                "SLA Breaches: "
                        + slaService.calculateSLABreaches());
    }
}
