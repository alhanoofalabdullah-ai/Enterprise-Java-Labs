CREATE TABLE guests (
    id INT PRIMARY KEY AUTO_INCREMENT,
    guest_name VARCHAR(150),
    phone VARCHAR(50)
);

CREATE TABLE rooms (
    id INT PRIMARY KEY AUTO_INCREMENT,
    room_number VARCHAR(50),
    room_type VARCHAR(100),
    price_per_night DECIMAL(12,2),
    status VARCHAR(50)
);

CREATE TABLE reservations (
    id INT PRIMARY KEY AUTO_INCREMENT,
    guest_name VARCHAR(150),
    room_id INT,
    check_in DATE,
    check_out DATE,
    status VARCHAR(50)
);
