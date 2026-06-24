package src.services;

import src.models.Ticket;
import java.util.*;

public class TicketService {

    private List<Ticket> tickets =
            new ArrayList<>();

    private int nextId = 1;

    public void createTicket(
            String title,
            String description,
            String priority) {

        tickets.add(
                new Ticket(
                        nextId++,
                        title,
                        description,
                        priority));
    }

    public Ticket findTicket(int id) {

        for (Ticket ticket : tickets) {

            if (ticket.getId() == id) {
                return ticket;
            }
        }

        return null;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public int totalTickets() {
        return tickets.size();
    }

    public int countByStatus(String status) {

        int count = 0;

        for (Ticket ticket : tickets) {

            if (ticket.getStatus().equals(status)) {
                count++;
            }
        }

        return count;
    }

    public int countByPriority(String priority) {

        int count = 0;

        for (Ticket ticket : tickets) {

            if (ticket.getPriority().equals(priority)) {
                count++;
            }
        }

        return count;
    }
}
