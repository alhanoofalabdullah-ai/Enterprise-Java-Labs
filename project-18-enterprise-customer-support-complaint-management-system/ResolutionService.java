package src.services;

import src.models.Complaint;

public class ResolutionService {

    public void resolve(
            Complaint complaint) {

        complaint.resolve();
    }

    public void escalate(
            Complaint complaint) {

        complaint.escalate();
    }
}
