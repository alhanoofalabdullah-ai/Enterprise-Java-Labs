package src.services;

public class ReportService {

    private EmployeeService employeeService;
    private AttendanceService attendanceService;
    private LeaveService leaveService;
    private PerformanceService performanceService;

    public ReportService(
            EmployeeService employeeService,
            AttendanceService attendanceService,
            LeaveService leaveService,
            PerformanceService performanceService) {

        this.employeeService = employeeService;
        this.attendanceService = attendanceService;
        this.leaveService = leaveService;
        this.performanceService = performanceService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== HR DASHBOARD =====");

        System.out.println(
                "Employees: "
                        + employeeService.totalEmployees());

        System.out.println(
                "Attendance Records: "
                        + attendanceService.totalAttendance());

        System.out.println(
                "Leave Requests: "
                        + leaveService.totalLeaveRequests());

        System.out.println(
                "Performance Reviews: "
                        + performanceService.totalReviews());
    }
}
