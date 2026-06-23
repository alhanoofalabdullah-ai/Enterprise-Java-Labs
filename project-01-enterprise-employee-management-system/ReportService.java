package src.services;

public class ReportService {

    private EmployeeService employeeService;
    private DepartmentService departmentService;
    private AttendanceService attendanceService;

    public ReportService(
            EmployeeService employeeService,
            DepartmentService departmentService,
            AttendanceService attendanceService) {

        this.employeeService = employeeService;
        this.departmentService = departmentService;
        this.attendanceService = attendanceService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== EMPLOYEE DASHBOARD =====");

        System.out.println(
                "Employees: "
                        + employeeService.totalEmployees());

        System.out.println(
                "Departments: "
                        + departmentService.totalDepartments());

        System.out.println(
                "Attendance Records: "
                        + attendanceService.totalAttendance());
    }
}
