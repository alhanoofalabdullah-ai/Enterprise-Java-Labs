package src.services;

public class ReportService {

    private ProjectService projectService;
    private TaskService taskService;
    private TeamService teamService;

    public ReportService(
            ProjectService projectService,
            TaskService taskService,
            TeamService teamService) {

        this.projectService = projectService;
        this.taskService = taskService;
        this.teamService = teamService;
    }

    public void showDashboard() {

        int totalTasks = taskService.totalTasks();
        int completedTasks = taskService.completedTasks();

        double completionRate = 0;

        if (totalTasks > 0) {
            completionRate =
                    (completedTasks * 100.0)
                            / totalTasks;
        }

        System.out.println(
                "\n===== PROJECT MANAGEMENT DASHBOARD =====");

        System.out.println(
                "Projects: "
                        + projectService.totalProjects());

        System.out.println(
                "Tasks: "
                        + totalTasks);

        System.out.println(
                "Completed Tasks: "
                        + completedTasks);

        System.out.println(
                "Open Tasks: "
                        + taskService.openTasks());

        System.out.println(
                "Team Members: "
                        + teamService.totalMembers());

        System.out.println(
                "Completion Rate: "
                        + completionRate
                        + "%");
    }
}
