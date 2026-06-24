package src.services;

import src.models.Student;
import java.util.*;

public class StudentService {

    private List<Student> students = new ArrayList<>();
    private int nextId = 1;

    public void addStudent(String name) {
        students.add(new Student(nextId++, name));
    }

    public int totalStudents() {
        return students.size();
    }
}
