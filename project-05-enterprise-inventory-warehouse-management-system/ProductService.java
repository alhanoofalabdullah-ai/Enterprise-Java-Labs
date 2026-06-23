package src.services;

import src.models.Product;
import java.util.*;

public class ProductService {

    private List<Product> products =
            new ArrayList<>();

    private int nextId = 1;

    public void addProduct(
            String name,
            String category,
            int quantity,
            double price) {

        products.add(
                new Product(
                        nextId++,
                        name,
                        category,
                        quantity,
                        price));
    }

    public Product findProduct(int id) {

        for (Product product : products) {

            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int totalProducts() {
        return products.size();
    }

    public int totalStockUnits() {

        int total = 0;

        for (Product product : products) {
            total += product.getQuantity();
        }

        return total;
    }

    public int lowStockProducts() {

        int count = 0;

        for (Product product : products) {
            if (product.isLowStock()) {
                count++;
            }
        }

        return count;
    }

    public double inventoryValue() {

        double total = 0;

        for (Product product : products) {
            total += product.getStockValue();
        }

        return total;
    }
}
