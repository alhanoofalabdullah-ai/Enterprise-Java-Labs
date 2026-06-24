package src.services;

import src.models.Workflow;
import java.util.ArrayList;
import java.util.List;

public class WorkflowService {

    private List<Workflow> workflows = new ArrayList<>();
    private int nextId = 1;

    public void createWorkflow(String workflowName) {
        workflows.add(new Workflow(nextId++, workflowName));
    }

    public int totalWorkflows() {
        return workflows.size();
    }
}
