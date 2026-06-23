CREATE TABLE customers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(255)
);

CREATE TABLE accounts (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(255),
    balance DECIMAL(18,2)
);

CREATE TABLE transactions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    account_id INT,
    amount DECIMAL(18,2),
    transaction_type VARCHAR(50)
);

CREATE TABLE loans (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(255),
    loan_amount DECIMAL(18,2)
);
