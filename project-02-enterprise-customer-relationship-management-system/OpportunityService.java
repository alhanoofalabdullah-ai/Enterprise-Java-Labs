package src.services;

import src.models.Opportunity;
import java.util.*;

public class OpportunityService {

    private List<Opportunity> opportunities =
            new ArrayList<>();

    private int nextId = 1;

    public void createOpportunity(
            String title,
            double value) {

        opportunities.add(
                new Opportunity(
                        nextId++,
                        title,
                        value));
    }

    public int totalOpportunities() {
        return opportunities.size();
    }

    public double totalRevenue() {

        double total = 0;

        for (Opportunity opportunity : opportunities) {
            total += opportunity.getValue();
        }

        return total;
    }
}
