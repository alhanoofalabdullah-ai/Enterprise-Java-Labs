package src.services;

import src.models.Document;

public class ApprovalService {

    private int approved = 0;
    private int rejected = 0;

    public void approve(Document document) {
        if (document != null) {
            document.approve();
            approved++;
        }
    }

    public void reject(Document document) {
        if (document != null) {
            document.reject();
            rejected++;
        }
    }

    public int totalApproved() {
        return approved;
    }

    public int totalRejected() {
        return rejected;
    }
}
