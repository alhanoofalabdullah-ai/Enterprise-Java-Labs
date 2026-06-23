package src.services;

import src.models.Account;
import java.util.*;

public class AccountService {

    private List<Account> accounts =
            new ArrayList<>();

    private int nextId = 1;

    public void openAccount(
            String customer,
            double balance) {

        accounts.add(
                new Account(
                        nextId++,
                        customer,
                        balance));
    }

    public Account findAccount(int id) {

        for(Account account : accounts) {

            if(account.getId() == id) {
                return account;
            }
        }

        return null;
    }

    public int totalAccounts() {
        return accounts.size();
    }

    public double totalBalances() {

        double total = 0;

        for(Account account : accounts) {
            total += account.getBalance();
        }

        return total;
    }
}
