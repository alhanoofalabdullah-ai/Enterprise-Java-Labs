package src.services;

import src.models.VisitRequest;
import java.util.ArrayList;
import java.util.List;

public class VisitService {

    private List<VisitRequest> visits = new ArrayList<>();
    private int nextId = 1;

    public void createVisit(
            String visitor,
            String hostDepartment,
            String date) {

        visits.add(
                new VisitRequest(
                        nextId++,
                        visitor,
                        hostDepartment,
                        date
                )
        );
    }

    public VisitRequest findVisit(int id) {

        for (VisitRequest visit : visits) {
            if (visit.getId() == id) {
                return visit;
            }
        }

        return null;
    }

    public List<VisitRequest> getVisits() {
        return visits;
    }

    public int totalVisits() {
        return visits.size();
    }

    public int countByStatus(String status) {

        int count = 0;

        for (VisitRequest visit : visits) {
            if (visit.getStatus().equals(status)) {
                count++;
            }
        }

        return count;
    }
}
