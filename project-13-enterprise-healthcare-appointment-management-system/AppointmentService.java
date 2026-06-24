package src.services;

import src.models.Appointment;
import java.util.*;

public class AppointmentService {

    private List<Appointment> appointments = new ArrayList<>();
    private int nextId = 1;

    public void bookAppointment(
            String patient,
            String doctor,
            String department,
            String date) {

        appointments.add(
                new Appointment(
                        nextId++,
                        patient,
                        doctor,
                        department,
                        date
                )
        );
    }

    public Appointment findAppointment(int id) {
        for (Appointment appointment : appointments) {
            if (appointment.getId() == id) {
                return appointment;
            }
        }

        return null;
    }

    public void cancelAppointment(int id) {
        Appointment appointment = findAppointment(id);

        if (appointment != null) {
            appointment.cancel();
        }
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public int totalAppointments() {
        return appointments.size();
    }

    public int countByStatus(String status) {
        int count = 0;

        for (Appointment appointment : appointments) {
            if (appointment.getStatus().equals(status)) {
                count++;
            }
        }

        return count;
    }
}
