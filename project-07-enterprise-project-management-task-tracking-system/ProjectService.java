package src.services;

import src.models.Project;
import java.util.*;

public class ProjectService {

    private List<Project> projects =
            new ArrayList<>();

    private int nextId = 1;

    public void createProject(String name) {

        projects.add(
                new Project(
                        nextId++,
                        name));
    }

    public int totalProjects() {
        return projects.size();
    }
}
