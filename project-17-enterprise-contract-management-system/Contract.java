package src.models;

public class Contract {

    private int id;
    private String contractName;
    private String vendorName;
    private double value;
    private String status;

    public Contract(int id, String contractName, String vendorName, double value) {
        this.id = id;
        this.contractName = contractName;
        this.vendorName = vendorName;
        this.value = value;
        this.status = "ACTIVE";
    }

    public int getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Contract #" + id
                + " | " + contractName
                + " | Vendor: " + vendorName
                + " | Value: " + value
                + " | Status: " + status;
    }
}
