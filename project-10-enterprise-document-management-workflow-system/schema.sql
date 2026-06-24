CREATE TABLE documents (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    owner VARCHAR(150),
    status VARCHAR(50),
    revision INT
);

CREATE TABLE workflows (
    id INT PRIMARY KEY AUTO_INCREMENT,
    document_id INT,
    workflow_name VARCHAR(255),
    status VARCHAR(50)
);

CREATE TABLE approvals (
    id INT PRIMARY KEY AUTO_INCREMENT,
    document_id INT,
    approval_status VARCHAR(50)
);

CREATE TABLE audit_logs (
    id INT PRIMARY KEY AUTO_INCREMENT,
    action VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
