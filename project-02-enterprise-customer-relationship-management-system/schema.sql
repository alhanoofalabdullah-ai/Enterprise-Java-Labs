CREATE TABLE customers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(255)
);

CREATE TABLE leads (
    id INT PRIMARY KEY AUTO_INCREMENT,
    company_name VARCHAR(255)
);

CREATE TABLE opportunities (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    estimated_value DECIMAL(18,2)
);

CREATE TABLE interactions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(255),
    interaction_type VARCHAR(100),
    interaction_date DATE
);
