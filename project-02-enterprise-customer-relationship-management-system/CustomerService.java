package src.services;

import src.models.Customer;
import java.util.*;

public class CustomerService {

    private List<Customer> customers =
            new ArrayList<>();

    private int nextId = 1;

    public void addCustomer(
            String name) {

        customers.add(
                new Customer(
                        nextId++,
                        name));
    }

    public int totalCustomers() {
        return customers.size();
    }
}
