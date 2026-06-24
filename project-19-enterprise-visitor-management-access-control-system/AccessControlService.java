package src.services;

import src.models.AccessPass;
import src.models.VisitRequest;
import java.util.ArrayList;
import java.util.List;

public class AccessControlService {

    private VisitService visitService;
    private List<AccessPass> passes = new ArrayList<>();

    public AccessControlService(VisitService visitService) {
        this.visitService = visitService;
    }

    public void approveVisit(int visitId) {

        VisitRequest visit =
                visitService.findVisit(visitId);

        if (visit != null) {
            visit.approve();
        }
    }

    public void issuePass(int visitId) {

        VisitRequest visit =
                visitService.findVisit(visitId);

        if (visit != null
                && visit.getStatus().equals("APPROVED")) {

            passes.add(
                    new AccessPass(
                            visitId,
                            "PASS-" + visitId
                    )
            );
        }
    }

    public void checkIn(int visitId) {

        VisitRequest visit =
                visitService.findVisit(visitId);

        if (visit != null) {
            visit.checkIn();
        }
    }

    public void checkOut(int visitId) {

        VisitRequest visit =
                visitService.findVisit(visitId);

        if (visit != null) {
            visit.checkOut();
        }
    }

    public int totalPasses() {
        return passes.size();
    }
}
