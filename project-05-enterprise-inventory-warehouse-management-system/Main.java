package src;

import src.controllers.InventoryController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductService();
        WarehouseService warehouseService = new WarehouseService();
        StockService stockService = new StockService(productService);

        ReportService reportService =
                new ReportService(
                        productService,
                        warehouseService,
                        stockService);

        InventoryController controller =
                new InventoryController(
                        productService,
                        warehouseService,
                        stockService,
                        reportService);

        controller.addWarehouse("Riyadh Central Warehouse", "Riyadh");
        controller.addWarehouse("Jeddah Distribution Center", "Jeddah");

        controller.addProduct("Laptop", "Electronics", 25, 3500);
        controller.addProduct("Router", "Networking", 8, 1200);
        controller.addProduct("Office Chair", "Furniture", 120, 450);

        controller.stockIn(1, 15);
        controller.stockOut(2, 3);
        controller.stockIn(3, 40);

        controller.showProducts();
        controller.showDashboard();
    }
}
