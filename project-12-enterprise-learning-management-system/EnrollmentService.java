package src.services;

import src.models.Enrollment;
import java.util.*;

public class EnrollmentService {

    private List<Enrollment> enrollments = new ArrayList<>();

    public void enroll(String studentName, String courseTitle) {
        enrollments.add(new Enrollment(studentName, courseTitle));
    }

    public Enrollment findEnrollment(String studentName, String courseTitle) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudentName().equals(studentName)
                    && enrollment.getCourseTitle().equals(courseTitle)) {
                return enrollment;
            }
        }

        return null;
    }

    public void completeCourse(String studentName, String courseTitle) {
        Enrollment enrollment = findEnrollment(studentName, courseTitle);

        if (enrollment != null) {
            enrollment.complete();
        }
    }

    public int totalEnrollments() {
        return enrollments.size();
    }

    public int completedCourses() {
        int count = 0;

        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStatus().equals("COMPLETED")) {
                count++;
            }
        }

        return count;
    }
}
