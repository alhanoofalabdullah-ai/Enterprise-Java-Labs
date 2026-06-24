package src.models;

public class VisitRequest {

    private int id;
    private String visitorName;
    private String hostDepartment;
    private String date;
    private String status;

    public VisitRequest(
            int id,
            String visitorName,
            String hostDepartment,
            String date) {

        this.id = id;
        this.visitorName = visitorName;
        this.hostDepartment = hostDepartment;
        this.date = date;
        this.status = "PENDING";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void approve() {
        status = "APPROVED";
    }

    public void checkIn() {
        status = "CHECKED_IN";
    }

    public void checkOut() {
        status = "COMPLETED";
    }

    @Override
    public String toString() {
        return "Visit #" + id
                + " | Visitor: " + visitorName
                + " | Host Department: " + hostDepartment
                + " | Date: " + date
                + " | Status: " + status;
    }
}
