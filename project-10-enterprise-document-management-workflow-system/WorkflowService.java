package src.services;

import src.models.Workflow;
import java.util.*;

public class WorkflowService {

    private List<Workflow> workflows = new ArrayList<>();

    public void assignWorkflow(int documentId, String workflowName) {
        workflows.add(new Workflow(documentId, workflowName));
    }

    public int totalWorkflows() {
        return workflows.size();
    }
}
