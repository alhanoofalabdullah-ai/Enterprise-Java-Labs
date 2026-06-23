package src.services;

public class ReportService {

    private ProductService productService;
    private WarehouseService warehouseService;
    private StockService stockService;

    public ReportService(
            ProductService productService,
            WarehouseService warehouseService,
            StockService stockService) {

        this.productService = productService;
        this.warehouseService = warehouseService;
        this.stockService = stockService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== INVENTORY DASHBOARD =====");

        System.out.println(
                "Products: "
                        + productService.totalProducts());

        System.out.println(
                "Warehouses: "
                        + warehouseService.totalWarehouses());

        System.out.println(
                "Total Stock Units: "
                        + productService.totalStockUnits());

        System.out.println(
                "Low Stock Products: "
                        + productService.lowStockProducts());

        System.out.println(
                "Inventory Value: $"
                        + productService.inventoryValue());

        System.out.println(
                "Stock Movements: "
                        + stockService.totalMovements());
    }
}
