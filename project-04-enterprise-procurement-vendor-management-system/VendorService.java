package src.services;

import src.models.Vendor;
import java.util.*;

public class VendorService {

    private List<Vendor> vendors =
            new ArrayList<>();

    private int nextId = 1;

    public void registerVendor(
            String vendorName) {

        vendors.add(
                new Vendor(
                        nextId++,
                        vendorName));
    }

    public int totalVendors() {
        return vendors.size();
    }
}
