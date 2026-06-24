CREATE TABLE vendors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    vendor_name VARCHAR(150)
);

CREATE TABLE contracts (
    id INT PRIMARY KEY AUTO_INCREMENT,
    contract_name VARCHAR(255),
    vendor_name VARCHAR(150),
    contract_value DECIMAL(18,2),
    status VARCHAR(50)
);

CREATE TABLE renewal_records (
    id INT PRIMARY KEY AUTO_INCREMENT,
    contract_id INT,
    notes TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
