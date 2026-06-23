package src.services;

import src.models.Account;

public class TransactionService {

    private AccountService accountService;

    private int transactions = 0;

    public TransactionService(
            AccountService accountService) {

        this.accountService = accountService;
    }

    public void deposit(
            int accountId,
            double amount) {

        Account account =
                accountService.findAccount(accountId);

        if(account != null) {

            account.deposit(amount);
            transactions++;
        }
    }

    public void withdraw(
            int accountId,
            double amount) {

        Account account =
                accountService.findAccount(accountId);

        if(account != null) {

            account.withdraw(amount);
            transactions++;
        }
    }

    public int totalTransactions() {
        return transactions;
    }
}
