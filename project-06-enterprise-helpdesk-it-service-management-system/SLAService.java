package src.services;

public class SLAService {

    private TicketService ticketService;

    public SLAService(
            TicketService ticketService) {

        this.ticketService = ticketService;
    }

    public int calculateSLABreaches() {

        return 0;
    }
}
