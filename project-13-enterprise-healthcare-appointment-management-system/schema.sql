CREATE TABLE patients (
    id INT PRIMARY KEY AUTO_INCREMENT,
    patient_name VARCHAR(150),
    phone VARCHAR(50)
);

CREATE TABLE doctors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    doctor_name VARCHAR(150),
    specialty VARCHAR(150)
);

CREATE TABLE appointments (
    id INT PRIMARY KEY AUTO_INCREMENT,
    patient_name VARCHAR(150),
    doctor_name VARCHAR(150),
    department VARCHAR(150),
    appointment_date DATE,
    status VARCHAR(50)
);
