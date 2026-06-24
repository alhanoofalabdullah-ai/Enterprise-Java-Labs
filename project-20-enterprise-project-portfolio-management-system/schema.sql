CREATE TABLE projects (
    id INT PRIMARY KEY AUTO_INCREMENT,
    project_name VARCHAR(255),
    status VARCHAR(50)
);

CREATE TABLE project_documents (
    id INT PRIMARY KEY AUTO_INCREMENT,
    document_title VARCHAR(255),
    owner VARCHAR(150),
    status VARCHAR(50)
);

CREATE TABLE workflows (
    id INT PRIMARY KEY AUTO_INCREMENT,
    workflow_name VARCHAR(255),
    status VARCHAR(50)
);

CREATE TABLE risks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(255),
    severity VARCHAR(50)
);

CREATE TABLE issues (
    id INT PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(255),
    status VARCHAR(50)
);
