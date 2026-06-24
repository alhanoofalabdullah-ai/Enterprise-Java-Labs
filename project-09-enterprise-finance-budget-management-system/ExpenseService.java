package src.services;

import src.models.Expense;
import java.util.*;

public class ExpenseService {

    private List<Expense> expenses =
            new ArrayList<>();

    public void addExpense(
            String description,
            double amount) {

        expenses.add(
                new Expense(
                        description,
                        amount));
    }

    public int totalExpenses() {
        return expenses.size();
    }

    public double totalExpenseValue() {

        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        return total;
    }
}
