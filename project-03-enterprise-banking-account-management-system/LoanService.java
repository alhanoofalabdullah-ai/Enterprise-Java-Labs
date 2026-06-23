package src.services;

public class LoanService {

    private int loans = 0;

    public void createLoan(
            String customer,
            double amount) {

        loans++;
    }

    public int totalLoans() {
        return loans;
    }
}
