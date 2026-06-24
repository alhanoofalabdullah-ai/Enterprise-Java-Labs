CREATE TABLE projects (
    id INT PRIMARY KEY AUTO_INCREMENT,
    project_name VARCHAR(255),
    status VARCHAR(50)
);

CREATE TABLE tasks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    project_id INT,
    title VARCHAR(255),
    priority VARCHAR(50),
    status VARCHAR(50)
);

CREATE TABLE team_members (
    id INT PRIMARY KEY AUTO_INCREMENT,
    member_name VARCHAR(150),
    role VARCHAR(100)
);

CREATE TABLE milestones (
    id INT PRIMARY KEY AUTO_INCREMENT,
    project_id INT,
    milestone_name VARCHAR(255),
    status VARCHAR(50)
);
