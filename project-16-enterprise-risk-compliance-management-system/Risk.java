package src.models;

public class Risk {

    private int id;
    private String name;
    private String severity;
    private String status;

    public Risk(int id, String name, String severity) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.status = "OPEN";
    }

    public String getSeverity() {
        return severity;
    }

    public String getStatus() {
        return status;
    }
}
