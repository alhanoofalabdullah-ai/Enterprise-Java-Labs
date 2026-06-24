CREATE TABLE tickets (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    description TEXT,
    priority VARCHAR(50),
    status VARCHAR(50),
    assigned_agent VARCHAR(150)
);

CREATE TABLE agents (
    id INT PRIMARY KEY AUTO_INCREMENT,
    agent_name VARCHAR(150)
);

CREATE TABLE sla_records (
    id INT PRIMARY KEY AUTO_INCREMENT,
    ticket_id INT,
    sla_status VARCHAR(50)
);
