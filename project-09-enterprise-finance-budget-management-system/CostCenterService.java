package src.services;

import java.util.*;

public class CostCenterService {

    private Set<String> costCenters =
            new HashSet<>();

    public void addCostCenter(
            String name) {

        costCenters.add(name);
    }

    public int totalCostCenters() {
        return costCenters.size();
    }
}
