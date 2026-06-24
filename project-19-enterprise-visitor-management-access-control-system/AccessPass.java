package src.models;

public class AccessPass {

    private int visitId;
    private String passCode;

    public AccessPass(int visitId, String passCode) {
        this.visitId = visitId;
        this.passCode = passCode;
    }

    public int getVisitId() {
        return visitId;
    }

    public String getPassCode() {
        return passCode;
    }
}
