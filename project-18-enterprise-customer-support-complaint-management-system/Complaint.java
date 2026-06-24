package src.models;

public class Complaint {

    private int id;
    private String title;
    private String status;

    public Complaint(
            int id,
            String title) {

        this.id = id;
        this.title = title;
        this.status = "OPEN";
    }

    public String getStatus() {
        return status;
    }

    public void resolve() {
        status = "RESOLVED";
    }

    public void escalate() {
        status = "ESCALATED";
    }
}
