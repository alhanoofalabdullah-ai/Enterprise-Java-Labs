package src.models;

public class ProjectDocument {

    private int id;
    private String title;
    private String owner;
    private String status;

    public ProjectDocument(int id, String title, String owner) {
        this.id = id;
        this.title = title;
        this.owner = owner;
        this.status = "REGISTERED";
    }
}
