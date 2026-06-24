package src.models;

public class Issue {

    private int id;
    private String description;
    private String status;

    public Issue(int id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
