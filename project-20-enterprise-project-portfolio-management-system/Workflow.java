package src.models;

public class Workflow {

    private int id;
    private String workflowName;
    private String status;

    public Workflow(int id, String workflowName) {
        this.id = id;
        this.workflowName = workflowName;
        this.status = "ACTIVE";
    }
}
