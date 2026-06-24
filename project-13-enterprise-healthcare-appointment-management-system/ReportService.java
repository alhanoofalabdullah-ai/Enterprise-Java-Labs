package src.services;

public class ReportService {

    private PatientService patientService;
    private DoctorService doctorService;
    private AppointmentService appointmentService;

    public ReportService(
            PatientService patientService,
            DoctorService doctorService,
            AppointmentService appointmentService) {

        this.patientService = patientService;
        this.doctorService = doctorService;
        this.appointmentService = appointmentService;
    }

    public void showDashboard() {

        System.out.println("\n===== HEALTHCARE DASHBOARD =====");
        System.out.println("Patients: " + patientService.totalPatients());
        System.out.println("Doctors: " + doctorService.totalDoctors());
        System.out.println("Appointments: " + appointmentService.totalAppointments());
        System.out.println("Active Appointments: " + appointmentService.countByStatus("SCHEDULED"));
        System.out.println("Cancelled Appointments: " + appointmentService.countByStatus("CANCELLED"));
    }
}
