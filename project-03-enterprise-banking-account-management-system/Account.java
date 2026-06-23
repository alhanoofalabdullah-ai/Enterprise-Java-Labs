package src.models;

public class Account {

    private int id;
    private String customerName;
    private double balance;

    public Account(
            int id,
            String customerName,
            double balance) {

        this.id = id;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
