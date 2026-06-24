package src.models;

public class Control {

    private int id;
    private String name;
    private String status;

    public Control(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = "ACTIVE";
    }
}
