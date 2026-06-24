package src.controllers;

import src.services.*;

public class HRController {

    private EmployeeService employeeService;
    private AttendanceService attendanceService;
    private LeaveService leaveService;
    private PerformanceService performanceService;
    private ReportService reportService;

    public HRController(
            EmployeeService employeeService,
            AttendanceService attendanceService,
            LeaveService leaveService,
            PerformanceService performanceService,
            ReportService reportService) {

        this.employeeService = employeeService;
        this.attendanceService = attendanceService;
        this.leaveService = leaveService;
        this.performanceService = performanceService;
        this.reportService = reportService;
    }

    public void addEmployee(
            String name,
            String department) {

        employeeService.addEmployee(
                name,
                department);
    }

    public void recordAttendance(
            String employee) {

        attendanceService.recordAttendance(
                employee);
    }

    public void submitLeaveRequest(
            String employee) {

        leaveService.submitLeaveRequest(
                employee);
    }

    public void addPerformanceReview(
            String employee,
            int rating) {

        performanceService.addReview(
                employee,
                rating);
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
