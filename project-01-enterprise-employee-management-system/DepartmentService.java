package src.services;

import java.util.*;

public class DepartmentService {

    private Set<String> departments =
            new HashSet<>();

    public void addDepartment(
            String department) {

        departments.add(department);
    }

    public int totalDepartments() {
        return departments.size();
    }
}
