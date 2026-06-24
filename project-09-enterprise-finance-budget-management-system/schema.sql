CREATE TABLE budgets (
    id INT PRIMARY KEY AUTO_INCREMENT,
    department VARCHAR(150),
    amount DECIMAL(18,2)
);

CREATE TABLE expenses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(255),
    amount DECIMAL(18,2)
);

CREATE TABLE cost_centers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    cost_center_name VARCHAR(150)
);
