package src.services;

public class ReportService {

    private CustomerService customerService;
    private AccountService accountService;
    private TransactionService transactionService;
    private LoanService loanService;

    public ReportService(
            CustomerService customerService,
            AccountService accountService,
            TransactionService transactionService,
            LoanService loanService) {

        this.customerService = customerService;
        this.accountService = accountService;
        this.transactionService = transactionService;
        this.loanService = loanService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== BANKING DASHBOARD =====");

        System.out.println(
                "Customers: "
                        + customerService.totalCustomers());

        System.out.println(
                "Accounts: "
                        + accountService.totalAccounts());

        System.out.println(
                "Transactions: "
                        + transactionService.totalTransactions());

        System.out.println(
                "Loans: "
                        + loanService.totalLoans());

        System.out.println(
                "Total Balances: $"
                        + accountService.totalBalances());
    }
}
