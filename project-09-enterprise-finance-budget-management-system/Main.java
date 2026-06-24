package src;

import src.controllers.FinanceController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        BudgetService budgetService =
                new BudgetService();

        ExpenseService expenseService =
                new ExpenseService();

        CostCenterService costCenterService =
                new CostCenterService();

        ReportService reportService =
                new ReportService(
                        budgetService,
                        expenseService,
                        costCenterService);

        FinanceController controller =
                new FinanceController(
                        budgetService,
                        expenseService,
                        costCenterService,
                        reportService);

        controller.createBudget(
                "IT Department",
                500000);

        controller.createBudget(
                "PMO Department",
                300000);

        controller.addExpense(
                "Servers Upgrade",
                75000);

        controller.addExpense(
                "Training Program",
                25000);

        controller.addCostCenter(
                "Technology");

        controller.showDashboard();
    }
}
