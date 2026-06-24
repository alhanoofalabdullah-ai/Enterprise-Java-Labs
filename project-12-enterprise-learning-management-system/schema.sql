CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(150)
);

CREATE TABLE courses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    course_title VARCHAR(255)
);

CREATE TABLE enrollments (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(150),
    course_title VARCHAR(255),
    status VARCHAR(50)
);

CREATE TABLE certificates (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(150),
    course_title VARCHAR(255)
);
