package src.models;

public class TeamMember {

    private int id;
    private String name;
    private String role;

    public TeamMember(
            int id,
            String name,
            String role) {

        this.id = id;
        this.name = name;
        this.role = role;
    }
}
