package src.services;

import src.models.Risk;
import java.util.*;

public class RiskService {

    private List<Risk> risks = new ArrayList<>();
    private int nextId = 1;

    public void createRisk(String name, String severity) {
        risks.add(new Risk(nextId++, name, severity));
    }

    public int totalRisks() {
        return risks.size();
    }

    public int highRisks() {
        int count = 0;

        for (Risk risk : risks) {
            if (risk.getSeverity().equals("HIGH")) {
                count++;
            }
        }

        return count;
    }
}
