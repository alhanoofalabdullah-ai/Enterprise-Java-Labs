package src.services;

import src.models.Task;
import java.util.*;

public class TaskService {

    private List<Task> tasks =
            new ArrayList<>();

    private int nextId = 1;

    public void createTask(
            int projectId,
            String title,
            String priority) {

        tasks.add(
                new Task(
                        nextId++,
                        projectId,
                        title,
                        priority));
    }

    public Task findTask(int id) {

        for (Task task : tasks) {

            if (task.getId() == id) {
                return task;
            }
        }

        return null;
    }

    public void completeTask(int id) {

        Task task = findTask(id);

        if (task != null) {
            task.complete();
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public int totalTasks() {
        return tasks.size();
    }

    public int completedTasks() {

        int count = 0;

        for (Task task : tasks) {

            if (task.getStatus().equals("COMPLETED")) {
                count++;
            }
        }

        return count;
    }

    public int openTasks() {
        return totalTasks() - completedTasks();
    }
}
