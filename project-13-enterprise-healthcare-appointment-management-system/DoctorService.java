package src.services;

import src.models.Doctor;
import java.util.*;

public class DoctorService {

    private List<Doctor> doctors = new ArrayList<>();
    private int nextId = 1;

    public void addDoctor(String name, String specialty) {
        doctors.add(new Doctor(nextId++, name, specialty));
    }

    public int totalDoctors() {
        return doctors.size();
    }
}
