package src.services;

import src.models.Contract;
import src.models.RenewalRecord;
import java.util.*;

public class RenewalService {

    private List<RenewalRecord> renewals = new ArrayList<>();

    public void renewContract(Contract contract, String notes) {
        if (contract != null) {
            renewals.add(new RenewalRecord(contract.getId(), notes));
        }
    }

    public int totalRenewals() {
        return renewals.size();
    }
}
