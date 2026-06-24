package src.models;

public class Budget {

    private int id;
    private String department;
    private double amount;

    public Budget(
            int id,
            String department,
            double amount) {

        this.id = id;
        this.department = department;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
