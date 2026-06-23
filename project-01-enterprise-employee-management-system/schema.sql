CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(255),
    department VARCHAR(150)
);

CREATE TABLE departments (
    id INT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(150)
);

CREATE TABLE attendance_records (
    id INT PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(255),
    attendance_date DATE
);
