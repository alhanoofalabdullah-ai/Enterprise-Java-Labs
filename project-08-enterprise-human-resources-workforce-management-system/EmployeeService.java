package src.services;

import src.models.Employee;
import java.util.*;

public class EmployeeService {

    private List<Employee> employees =
            new ArrayList<>();

    private int nextId = 1;

    public void addEmployee(
            String name,
            String department) {

        employees.add(
                new Employee(
                        nextId++,
                        name,
                        department));
    }

    public int totalEmployees() {
        return employees.size();
    }
}
