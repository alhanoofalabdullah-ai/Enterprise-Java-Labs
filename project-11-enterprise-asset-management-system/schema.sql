CREATE TABLE assets (
    id INT PRIMARY KEY AUTO_INCREMENT,
    category VARCHAR(100),
    asset_name VARCHAR(150),
    serial_number VARCHAR(100),
    status VARCHAR(50)
);

CREATE TABLE assignments (
    id INT PRIMARY KEY AUTO_INCREMENT,
    asset_id INT,
    employee_name VARCHAR(150)
);

CREATE TABLE maintenance_records (
    id INT PRIMARY KEY AUTO_INCREMENT,
    asset_id INT,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
