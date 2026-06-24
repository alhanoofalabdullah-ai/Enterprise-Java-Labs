package src.services;

public class ReportService {

    private BudgetService budgetService;
    private ExpenseService expenseService;
    private CostCenterService costCenterService;

    public ReportService(
            BudgetService budgetService,
            ExpenseService expenseService,
            CostCenterService costCenterService) {

        this.budgetService = budgetService;
        this.expenseService = expenseService;
        this.costCenterService = costCenterService;
    }

    public void showDashboard() {

        double budget =
                budgetService.totalBudgetValue();

        double expenses =
                expenseService.totalExpenseValue();

        double remaining =
                budget - expenses;

        System.out.println(
                "\n===== FINANCE DASHBOARD =====");

        System.out.println(
                "Budgets: "
                        + budgetService.totalBudgets());

        System.out.println(
                "Expenses: "
                        + expenseService.totalExpenses());

        System.out.println(
                "Cost Centers: "
                        + costCenterService.totalCostCenters());

        System.out.println(
                "Total Budget: $"
                        + budget);

        System.out.println(
                "Total Expenses: $"
                        + expenses);

        System.out.println(
                "Remaining Budget: $"
                        + remaining);
    }
}
