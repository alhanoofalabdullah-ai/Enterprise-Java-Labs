package src.services;

public class ProcurementService {

    private int purchaseRequests = 0;

    public void createPurchaseRequest(
            String title) {

        purchaseRequests++;
    }

    public int totalRequests() {
        return purchaseRequests;
    }
}
