package src.models;

public class Driver {

    private int id;
    private String name;
    private String status;

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = "AVAILABLE";
    }
}
