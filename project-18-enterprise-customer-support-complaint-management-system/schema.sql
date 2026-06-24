CREATE TABLE customers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(150)
);

CREATE TABLE support_agents (
    id INT PRIMARY KEY AUTO_INCREMENT,
    agent_name VARCHAR(150)
);

CREATE TABLE complaints (
    id INT PRIMARY KEY AUTO_INCREMENT,
    complaint_title VARCHAR(255),
    status VARCHAR(50)
);

CREATE TABLE resolutions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    complaint_id INT,
    resolution_date TIMESTAMP
);
