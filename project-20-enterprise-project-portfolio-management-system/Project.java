package src.models;

public class Project {

    private int id;
    private String name;
    private String status;

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = "ACTIVE";
    }
}
