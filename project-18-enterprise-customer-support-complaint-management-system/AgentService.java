package src.services;

import java.util.*;

public class AgentService {

    private List<String> agents =
            new ArrayList<>();

    public void addAgent(String name) {
        agents.add(name);
    }

    public int totalAgents() {
        return agents.size();
    }
}
