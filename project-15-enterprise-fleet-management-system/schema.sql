CREATE TABLE vehicles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    model VARCHAR(150),
    plate_number VARCHAR(50),
    mileage DECIMAL(12,2),
    status VARCHAR(50)
);

CREATE TABLE drivers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    driver_name VARCHAR(150),
    status VARCHAR(50)
);

CREATE TABLE trips (
    id INT PRIMARY KEY AUTO_INCREMENT,
    vehicle_id INT,
    driver_name VARCHAR(150),
    origin VARCHAR(150),
    destination VARCHAR(150),
    distance DECIMAL(12,2),
    status VARCHAR(50)
);

CREATE TABLE maintenance_records (
    id INT PRIMARY KEY AUTO_INCREMENT,
    vehicle_id INT,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
