package src.services;

public class ContractService {

    private int contracts = 0;

    public void createContract(
            String contractName) {

        contracts++;
    }

    public int totalContracts() {
        return contracts;
    }
}
