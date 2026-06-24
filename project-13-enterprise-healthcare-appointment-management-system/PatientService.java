package src.services;

import src.models.Patient;
import java.util.*;

public class PatientService {

    private List<Patient> patients = new ArrayList<>();
    private int nextId = 1;

    public void addPatient(String name, String phone) {
        patients.add(new Patient(nextId++, name, phone));
    }

    public int totalPatients() {
        return patients.size();
    }
}
