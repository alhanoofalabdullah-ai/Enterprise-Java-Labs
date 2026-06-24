package src.services;

public class ReportService {

    private StudentService studentService;
    private CourseService courseService;
    private EnrollmentService enrollmentService;
    private CertificateService certificateService;

    public ReportService(
            StudentService studentService,
            CourseService courseService,
            EnrollmentService enrollmentService,
            CertificateService certificateService) {

        this.studentService = studentService;
        this.courseService = courseService;
        this.enrollmentService = enrollmentService;
        this.certificateService = certificateService;
    }

    public void showDashboard() {

        System.out.println("\n===== LMS DASHBOARD =====");
        System.out.println("Students: " + studentService.totalStudents());
        System.out.println("Courses: " + courseService.totalCourses());
        System.out.println("Enrollments: " + enrollmentService.totalEnrollments());
        System.out.println("Completed Courses: " + enrollmentService.completedCourses());
        System.out.println("Certificates Issued: " + certificateService.totalCertificates());
    }
}
