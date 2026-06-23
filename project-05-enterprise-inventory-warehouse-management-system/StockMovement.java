package src.models;

public class StockMovement {

    private int productId;
    private String movementType;
    private int quantity;

    public StockMovement(
            int productId,
            String movementType,
            int quantity) {

        this.productId = productId;
        this.movementType = movementType;
        this.quantity = quantity;
    }
}
