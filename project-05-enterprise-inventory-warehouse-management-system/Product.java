package src.models;

public class Product {

    private int id;
    private String name;
    private String category;
    private int quantity;
    private double unitPrice;

    public Product(
            int id,
            String name,
            String category,
            int quantity,
            double unitPrice) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getStockValue() {
        return quantity * unitPrice;
    }

    public boolean isLowStock() {
        return quantity < 10;
    }

    public void addStock(int amount) {
        quantity += amount;
    }

    public void removeStock(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
        }
    }

    @Override
    public String toString() {
        return "Product #" + id
                + " | " + name
                + " | " + category
                + " | Qty: " + quantity
                + " | Value: " + getStockValue();
    }
}
