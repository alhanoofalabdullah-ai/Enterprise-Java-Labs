package src.models;

public class Task {

    private int id;
    private int projectId;
    private String title;
    private String priority;
    private String status;

    public Task(
            int id,
            int projectId,
            String title,
            String priority) {

        this.id = id;
        this.projectId = projectId;
        this.title = title;
        this.priority = priority;
        this.status = "OPEN";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void complete() {
        status = "COMPLETED";
    }

    @Override
    public String toString() {
        return "Task #" + id
                + " | Project: " + projectId
                + " | " + title
                + " | Priority: " + priority
                + " | Status: " + status;
    }
}
