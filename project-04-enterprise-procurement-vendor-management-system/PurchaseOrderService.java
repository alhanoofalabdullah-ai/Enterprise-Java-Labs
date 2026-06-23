package src.services;

public class PurchaseOrderService {

    private int purchaseOrders = 0;

    public void createPurchaseOrder(
            String poNumber) {

        purchaseOrders++;
    }

    public int totalPurchaseOrders() {
        return purchaseOrders;
    }
}
