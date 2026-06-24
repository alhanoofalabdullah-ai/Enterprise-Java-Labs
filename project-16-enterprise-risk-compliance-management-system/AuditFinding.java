package src.models;

public class AuditFinding {

    private String description;
    private String status;

    public AuditFinding(String description, String status) {
        this.description = description;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
