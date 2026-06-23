package src;

import src.controllers.EmployeeController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        EmployeeService employeeService =
                new EmployeeService();

        DepartmentService departmentService =
                new DepartmentService();

        AttendanceService attendanceService =
                new AttendanceService();

        ReportService reportService =
                new ReportService(
                        employeeService,
                        departmentService,
                        attendanceService);

        EmployeeController controller =
                new EmployeeController(
                        employeeService,
                        departmentService,
                        attendanceService,
                        reportService);

        controller.addEmployee(
                "Ahmed Alabdullah",
                "IT");

        controller.addEmployee(
                "Sara Mohammed",
                "HR");

        controller.recordAttendance(
                "Ahmed Alabdullah");

        controller.showDashboard();
    }
}
