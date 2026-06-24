package src.models;

public class Risk {

    private int id;
    private String description;
    private String severity;

    public Risk(int id, String description, String severity) {
        this.id = id;
        this.description = description;
        this.severity = severity;
    }

    public String getSeverity() {
        return severity;
    }
}
