CREATE TABLE risks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    risk_name VARCHAR(255),
    severity VARCHAR(50),
    status VARCHAR(50)
);

CREATE TABLE controls (
    id INT PRIMARY KEY AUTO_INCREMENT,
    control_name VARCHAR(255),
    status VARCHAR(50)
);

CREATE TABLE compliance_checks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    check_name VARCHAR(255),
    passed BOOLEAN
);

CREATE TABLE audit_findings (
    id INT PRIMARY KEY AUTO_INCREMENT,
    description TEXT,
    status VARCHAR(50)
);
