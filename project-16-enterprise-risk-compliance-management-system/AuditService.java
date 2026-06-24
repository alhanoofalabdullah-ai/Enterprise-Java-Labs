package src.services;

import src.models.AuditFinding;
import java.util.*;

public class AuditService {

    private List<AuditFinding> findings = new ArrayList<>();

    public void addFinding(String description, String status) {
        findings.add(new AuditFinding(description, status));
    }

    public int openFindings() {
        int count = 0;

        for (AuditFinding finding : findings) {
            if (finding.getStatus().equals("OPEN")) {
                count++;
            }
        }

        return count;
    }
}
