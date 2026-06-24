package src.services;

import src.models.Vendor;
import java.util.*;

public class VendorService {

    private List<Vendor> vendors = new ArrayList<>();
    private int nextId = 1;

    public void addVendor(String name) {
        vendors.add(new Vendor(nextId++, name));
    }

    public int totalVendors() {
        return vendors.size();
    }
}
