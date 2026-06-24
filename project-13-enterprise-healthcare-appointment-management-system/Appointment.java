package src.models;

public class Appointment {

    private int id;
    private String patientName;
    private String doctorName;
    private String department;
    private String date;
    private String status;

    public Appointment(
            int id,
            String patientName,
            String doctorName,
            String department,
            String date) {

        this.id = id;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.department = department;
        this.date = date;
        this.status = "SCHEDULED";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void cancel() {
        status = "CANCELLED";
    }

    @Override
    public String toString() {
        return "Appointment #" + id
                + " | Patient: " + patientName
                + " | Doctor: " + doctorName
                + " | Department: " + department
                + " | Date: " + date
                + " | Status: " + status;
    }
}
