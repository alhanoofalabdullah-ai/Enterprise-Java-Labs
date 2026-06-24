package src.models;

public class Ticket {

    private int id;
    private String title;
    private String description;
    private String priority;
    private String status;
    private String assignedAgent;

    public Ticket(
            int id,
            String title,
            String description,
            String priority) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = "OPEN";
        this.assignedAgent = "UNASSIGNED";
    }

    public int getId() {
        return id;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void assignTo(String agent) {
        this.assignedAgent = agent;
        this.status = "ASSIGNED";
    }

    public void resolve() {
        this.status = "RESOLVED";
    }

    @Override
    public String toString() {
        return "Ticket #" + id
                + " | " + title
                + " | Priority: " + priority
                + " | Status: " + status
                + " | Agent: " + assignedAgent;
    }
}
