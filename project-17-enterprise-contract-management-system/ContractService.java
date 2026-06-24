package src.services;

import src.models.Contract;
import java.util.*;

public class ContractService {

    private List<Contract> contracts = new ArrayList<>();
    private int nextId = 1;

    public void createContract(String name, String vendor, double value) {
        contracts.add(new Contract(nextId++, name, vendor, value));
    }

    public Contract findContract(int id) {
        for (Contract contract : contracts) {
            if (contract.getId() == id) {
                return contract;
            }
        }

        return null;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public int totalContracts() {
        return contracts.size();
    }

    public int activeContracts() {
        int count = 0;

        for (Contract contract : contracts) {
            if (contract.getStatus().equals("ACTIVE")) {
                count++;
            }
        }

        return count;
    }

    public double totalContractValue() {
        double total = 0;

        for (Contract contract : contracts) {
            total += contract.getValue();
        }

        return total;
    }
}
