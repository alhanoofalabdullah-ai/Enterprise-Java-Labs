CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(255),
    category VARCHAR(150),
    quantity INT,
    unit_price DECIMAL(18,2)
);

CREATE TABLE warehouses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    warehouse_name VARCHAR(255),
    location VARCHAR(150)
);

CREATE TABLE stock_movements (
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_id INT,
    movement_type VARCHAR(50),
    quantity INT
);
