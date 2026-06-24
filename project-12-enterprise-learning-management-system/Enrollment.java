package src.models;

public class Enrollment {

    private String studentName;
    private String courseTitle;
    private String status;

    public Enrollment(String studentName, String courseTitle) {
        this.studentName = studentName;
        this.courseTitle = courseTitle;
        this.status = "ENROLLED";
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getStatus() {
        return status;
    }

    public void complete() {
        status = "COMPLETED";
    }
}
