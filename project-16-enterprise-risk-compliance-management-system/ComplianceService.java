package src.services;

import src.models.ComplianceCheck;
import java.util.*;

public class ComplianceService {

    private List<ComplianceCheck> checks = new ArrayList<>();

    public void addCheck(String name, boolean passed) {
        checks.add(new ComplianceCheck(name, passed));
    }

    public int totalChecks() {
        return checks.size();
    }

    public int passedChecks() {
        int count = 0;

        for (ComplianceCheck check : checks) {
            if (check.isPassed()) {
                count++;
            }
        }

        return count;
    }

    public int failedChecks() {
        return totalChecks() - passedChecks();
    }
}
