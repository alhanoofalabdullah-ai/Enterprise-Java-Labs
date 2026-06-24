# Main.java

```java
package src;

import src.controllers.HealthcareController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        PatientService patientService = new PatientService();
        DoctorService doctorService = new DoctorService();
        AppointmentService appointmentService = new AppointmentService();

        ReportService reportService =
                new ReportService(
                        patientService,
                        doctorService,
                        appointmentService
                );

        HealthcareController controller =
                new HealthcareController(
                        patientService,
                        doctorService,
                        appointmentService,
                        reportService
                );

        controller.addPatient("Alhanoof", "0550000001");
        controller.addPatient("Ahmed", "0550000002");
        controller.addPatient("Sara", "0550000003");

        controller.addDoctor("Dr. Khalid", "Neurology");
        controller.addDoctor("Dr. Reem", "Dermatology");

        controller.bookAppointment("Alhanoof", "Dr. Khalid", "Neurology", "2026-07-01");
        controller.bookAppointment("Ahmed", "Dr. Reem", "Dermatology", "2026-07-02");
        controller.bookAppointment("Sara", "Dr. Khalid", "Neurology", "2026-07-03");

        controller.cancelAppointment(2);

        controller.showAppointments();
        controller.showDashboard();
    }
}
