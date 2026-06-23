package src.services;

import src.models.Product;
import src.models.StockMovement;
import java.util.*;

public class StockService {

    private ProductService productService;

    private List<StockMovement> movements =
            new ArrayList<>();

    public StockService(
            ProductService productService) {

        this.productService = productService;
    }

    public void stockIn(
            int productId,
            int quantity) {

        Product product =
                productService.findProduct(productId);

        if (product != null) {
            product.addStock(quantity);
            movements.add(
                    new StockMovement(
                            productId,
                            "STOCK_IN",
                            quantity));
        }
    }

    public void stockOut(
            int productId,
            int quantity) {

        Product product =
                productService.findProduct(productId);

        if (product != null) {
            product.removeStock(quantity);
            movements.add(
                    new StockMovement(
                            productId,
                            "STOCK_OUT",
                            quantity));
        }
    }

    public int totalMovements() {
        return movements.size();
    }
}
