package src.services;

import src.models.Agent;
import java.util.*;

public class AgentService {

    private List<Agent> agents =
            new ArrayList<>();

    private int nextId = 1;

    public void addAgent(String name) {

        agents.add(
                new Agent(
                        nextId++,
                        name));
    }

    public int totalAgents() {
        return agents.size();
    }
}
