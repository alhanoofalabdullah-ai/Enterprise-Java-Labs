package src.models;

public class Workflow {

    private int documentId;
    private String workflowName;
    private String status;

    public Workflow(int documentId, String workflowName) {
        this.documentId = documentId;
        this.workflowName = workflowName;
        this.status = "ACTIVE";
    }

    public String getStatus() {
        return status;
    }
}
