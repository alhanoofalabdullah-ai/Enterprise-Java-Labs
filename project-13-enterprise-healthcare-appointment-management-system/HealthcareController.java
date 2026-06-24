package src.controllers;

import src.models.Appointment;
import src.services.*;

public class HealthcareController {

    private PatientService patientService;
    private DoctorService doctorService;
    private AppointmentService appointmentService;
    private ReportService reportService;

    public HealthcareController(
            PatientService patientService,
            DoctorService doctorService,
            AppointmentService appointmentService,
            ReportService reportService) {

        this.patientService = patientService;
        this.doctorService = doctorService;
        this.appointmentService = appointmentService;
        this.reportService = reportService;
    }

    public void addPatient(String name, String phone) {
        patientService.addPatient(name, phone);
    }

    public void addDoctor(String name, String specialty) {
        doctorService.addDoctor(name, specialty);
    }

    public void bookAppointment(
            String patient,
            String doctor,
            String department,
            String date) {

        appointmentService.bookAppointment(
                patient,
                doctor,
                department,
                date
        );
    }

    public void cancelAppointment(int appointmentId) {
        appointmentService.cancelAppointment(appointmentId);
    }

    public void showAppointments() {
        System.out.println("\n===== APPOINTMENTS =====");

        for (Appointment appointment : appointmentService.getAppointments()) {
            System.out.println(appointment);
        }
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
