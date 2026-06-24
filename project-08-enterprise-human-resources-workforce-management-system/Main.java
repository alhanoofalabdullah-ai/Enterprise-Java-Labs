package src;

import src.controllers.HRController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        AttendanceService attendanceService = new AttendanceService();
        LeaveService leaveService = new LeaveService();
        PerformanceService performanceService = new PerformanceService();

        ReportService reportService =
                new ReportService(
                        employeeService,
                        attendanceService,
                        leaveService,
                        performanceService);

        HRController controller =
                new HRController(
                        employeeService,
                        attendanceService,
                        leaveService,
                        performanceService,
                        reportService);

        controller.addEmployee("Alhanoof", "PMO");
        controller.addEmployee("Ahmed", "IT");

        controller.recordAttendance("Alhanoof");
        controller.recordAttendance("Ahmed");

        controller.submitLeaveRequest("Ahmed");

        controller.addPerformanceReview(
                "Alhanoof",
                5);

        controller.showDashboard();
    }
}
