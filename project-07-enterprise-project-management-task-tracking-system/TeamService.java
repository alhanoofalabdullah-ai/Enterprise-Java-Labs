package src.services;

import src.models.TeamMember;
import java.util.*;

public class TeamService {

    private List<TeamMember> members =
            new ArrayList<>();

    private int nextId = 1;

    public void addMember(
            String name,
            String role) {

        members.add(
                new TeamMember(
                        nextId++,
                        name,
                        role));
    }

    public int totalMembers() {
        return members.size();
    }
}
