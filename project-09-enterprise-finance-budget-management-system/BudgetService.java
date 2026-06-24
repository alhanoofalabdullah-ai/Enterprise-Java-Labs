package src.services;

import src.models.Budget;
import java.util.*;

public class BudgetService {

    private List<Budget> budgets =
            new ArrayList<>();

    private int nextId = 1;

    public void createBudget(
            String department,
            double amount) {

        budgets.add(
                new Budget(
                        nextId++,
                        department,
                        amount));
    }

    public int totalBudgets() {
        return budgets.size();
    }

    public double totalBudgetValue() {

        double total = 0;

        for (Budget budget : budgets) {
            total += budget.getAmount();
        }

        return total;
    }
}
