CREATE TABLE visitors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    visitor_name VARCHAR(150),
    phone VARCHAR(50)
);

CREATE TABLE visit_requests (
    id INT PRIMARY KEY AUTO_INCREMENT,
    visitor_name VARCHAR(150),
    host_department VARCHAR(150),
    visit_date DATE,
    status VARCHAR(50)
);

CREATE TABLE access_passes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    visit_id INT,
    pass_code VARCHAR(100)
);
