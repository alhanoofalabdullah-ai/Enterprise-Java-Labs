package src.controllers;

import src.models.Product;
import src.services.*;

public class InventoryController {

    private ProductService productService;
    private WarehouseService warehouseService;
    private StockService stockService;
    private ReportService reportService;

    public InventoryController(
            ProductService productService,
            WarehouseService warehouseService,
            StockService stockService,
            ReportService reportService) {

        this.productService = productService;
        this.warehouseService = warehouseService;
        this.stockService = stockService;
        this.reportService = reportService;
    }

    public void addWarehouse(
            String name,
            String location) {

        warehouseService.addWarehouse(
                name,
                location);
    }

    public void addProduct(
            String name,
            String category,
            int quantity,
            double price) {

        productService.addProduct(
                name,
                category,
                quantity,
                price);
    }

    public void stockIn(
            int productId,
            int quantity) {

        stockService.stockIn(
                productId,
                quantity);
    }

    public void stockOut(
            int productId,
            int quantity) {

        stockService.stockOut(
                productId,
                quantity);
    }

    public void showProducts() {

        System.out.println(
                "\n===== PRODUCTS =====");

        for (Product product : productService.getProducts()) {
            System.out.println(product);
        }
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
