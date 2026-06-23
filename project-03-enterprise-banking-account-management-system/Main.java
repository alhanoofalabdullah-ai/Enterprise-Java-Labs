package src;

import src.controllers.BankingController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        CustomerService customerService =
                new CustomerService();

        AccountService accountService =
                new AccountService();

        TransactionService transactionService =
                new TransactionService(accountService);

        LoanService loanService =
                new LoanService();

        ReportService reportService =
                new ReportService(
                        customerService,
                        accountService,
                        transactionService,
                        loanService);

        BankingController controller =
                new BankingController(
                        customerService,
                        accountService,
                        transactionService,
                        loanService,
                        reportService);

        controller.createCustomer("Ahmed Alabdullah");

        controller.openAccount(
                "Ahmed Alabdullah",
                10000);

        controller.deposit(1, 5000);

        controller.withdraw(1, 2000);

        controller.createLoan(
                "Ahmed Alabdullah",
                50000);

        controller.showDashboard();
    }
}
