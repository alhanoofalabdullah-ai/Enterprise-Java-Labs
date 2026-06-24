package src.services;

import src.models.Complaint;
import java.util.*;

public class ComplaintService {

    private List<Complaint> complaints =
            new ArrayList<>();

    private int nextId = 1;

    public void createComplaint(
            String title) {

        complaints.add(
                new Complaint(
                        nextId++,
                        title));
    }

    public Complaint getComplaint(int index) {
        return complaints.get(index - 1);
    }

    public int totalComplaints() {
        return complaints.size();
    }

    public int countStatus(String status) {

        int count = 0;

        for (Complaint complaint : complaints) {

            if (complaint.getStatus()
                    .equals(status)) {
                count++;
            }
        }

        return count;
    }
}
