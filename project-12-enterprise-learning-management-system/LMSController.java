package src.controllers;

import src.services.*;

public class LMSController {

    private StudentService studentService;
    private CourseService courseService;
    private EnrollmentService enrollmentService;
    private CertificateService certificateService;
    private ReportService reportService;

    public LMSController(
            StudentService studentService,
            CourseService courseService,
            EnrollmentService enrollmentService,
            CertificateService certificateService,
            ReportService reportService) {

        this.studentService = studentService;
        this.courseService = courseService;
        this.enrollmentService = enrollmentService;
        this.certificateService = certificateService;
        this.reportService = reportService;
    }

    public void addStudent(String name) {
        studentService.addStudent(name);
    }

    public void createCourse(String title) {
        courseService.createCourse(title);
    }

    public void enrollStudent(String studentName, String courseTitle) {
        enrollmentService.enroll(studentName, courseTitle);
    }

    public void completeCourse(String studentName, String courseTitle) {
        enrollmentService.completeCourse(studentName, courseTitle);
        certificateService.issueCertificate(studentName, courseTitle);
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
