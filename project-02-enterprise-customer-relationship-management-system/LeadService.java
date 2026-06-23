package src.services;

import src.models.Lead;
import java.util.*;

public class LeadService {

    private List<Lead> leads =
            new ArrayList<>();

    private int nextId = 1;

    public void addLead(
            String company) {

        leads.add(
                new Lead(
                        nextId++,
                        company));
    }

    public int totalLeads() {
        return leads.size();
    }
}
