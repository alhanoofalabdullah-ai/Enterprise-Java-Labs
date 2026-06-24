package src.services;

import src.models.Issue;
import java.util.ArrayList;
import java.util.List;

public class IssueService {

    private List<Issue> issues = new ArrayList<>();
    private int nextId = 1;

    public void registerIssue(String description, String status) {
        issues.add(new Issue(nextId++, description, status));
    }

    public int totalIssues() {
        return issues.size();
    }

    public int openIssues() {
        int count = 0;

        for (Issue issue : issues) {
            if (issue.getStatus().equals("OPEN")) {
                count++;
            }
        }

        return count;
    }
}
