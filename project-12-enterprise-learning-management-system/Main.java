# Main.java

```java
package src;

import src.controllers.LMSController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();
        CertificateService certificateService = new CertificateService();

        ReportService reportService =
                new ReportService(
                        studentService,
                        courseService,
                        enrollmentService,
                        certificateService
                );

        LMSController controller =
                new LMSController(
                        studentService,
                        courseService,
                        enrollmentService,
                        certificateService,
                        reportService
                );

        controller.addStudent("Alhanoof");
        controller.addStudent("Ahmed");

        controller.createCourse("Enterprise Java Development");
        controller.createCourse("Project Governance Fundamentals");

        controller.enrollStudent("Alhanoof", "Enterprise Java Development");
        controller.enrollStudent("Ahmed", "Project Governance Fundamentals");

        controller.completeCourse("Alhanoof", "Enterprise Java Development");

        controller.showDashboard();
    }
}
