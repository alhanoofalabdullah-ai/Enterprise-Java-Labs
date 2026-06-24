package src.models;

public class ComplianceCheck {

    private String name;
    private boolean passed;

    public ComplianceCheck(String name, boolean passed) {
        this.name = name;
        this.passed = passed;
    }

    public boolean isPassed() {
        return passed;
    }
}
