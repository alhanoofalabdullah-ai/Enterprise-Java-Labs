package src.models;

public class AuditLog {

    private String action;

    public AuditLog(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
