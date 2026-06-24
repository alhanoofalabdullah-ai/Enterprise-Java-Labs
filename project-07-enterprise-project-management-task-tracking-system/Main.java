package src;

import src.controllers.ProjectController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        ProjectService projectService = new ProjectService();
        TaskService taskService = new TaskService();
        TeamService teamService = new TeamService();

        ReportService reportService =
                new ReportService(
                        projectService,
                        taskService,
                        teamService);

        ProjectController controller =
                new ProjectController(
                        projectService,
                        taskService,
                        teamService,
                        reportService);

        controller.createProject("Enterprise Java Portfolio");
        controller.createProject("PMIS Governance Platform");

        controller.addTeamMember("Alhanoof", "Project Lead");
        controller.addTeamMember("Ahmed", "Developer");
        controller.addTeamMember("Sara", "QA Analyst");

        controller.createTask(1, "Design project architecture", "HIGH");
        controller.createTask(1, "Develop services layer", "HIGH");
        controller.createTask(1, "Create database schema", "MEDIUM");
        controller.createTask(2, "Prepare governance workflow", "HIGH");
        controller.createTask(2, "Write documentation", "LOW");

        controller.completeTask(1);
        controller.completeTask(3);

        controller.showTasks();
        controller.showDashboard();
    }
}
