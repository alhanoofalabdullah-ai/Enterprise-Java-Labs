package src.services;

import src.models.Course;
import java.util.*;

public class CourseService {

    private List<Course> courses = new ArrayList<>();
    private int nextId = 1;

    public void createCourse(String title) {
        courses.add(new Course(nextId++, title));
    }

    public int totalCourses() {
        return courses.size();
    }
}
