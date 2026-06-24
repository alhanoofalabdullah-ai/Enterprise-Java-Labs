package src.controllers;

import src.models.Task;
import src.services.*;

public class ProjectController {

    private ProjectService projectService;
    private TaskService taskService;
    private TeamService teamService;
    private ReportService reportService;

    public ProjectController(
            ProjectService projectService,
            TaskService taskService,
            TeamService teamService,
            ReportService reportService) {

        this.projectService = projectService;
        this.taskService = taskService;
        this.teamService = teamService;
        this.reportService = reportService;
    }

    public void createProject(String name) {
        projectService.createProject(name);
    }

    public void addTeamMember(
            String name,
            String role) {

        teamService.addMember(
                name,
                role);
    }

    public void createTask(
            int projectId,
            String title,
            String priority) {

        taskService.createTask(
                projectId,
                title,
                priority);
    }

    public void completeTask(int taskId) {
        taskService.completeTask(taskId);
    }

    public void showTasks() {

        System.out.println(
                "\n===== TASKS =====");

        for (Task task : taskService.getTasks()) {
            System.out.println(task);
        }
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
