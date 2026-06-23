CREATE TABLE vendors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    vendor_name VARCHAR(255)
);

CREATE TABLE purchase_requests (
    id INT PRIMARY KEY AUTO_INCREMENT,
    request_title VARCHAR(255)
);

CREATE TABLE purchase_orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    po_number VARCHAR(100)
);

CREATE TABLE contracts (
    id INT PRIMARY KEY AUTO_INCREMENT,
    contract_name VARCHAR(255)
);
