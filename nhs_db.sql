CREATE DATABASE nhs_db;
USE nhs_db;
CREATE TABLE appointments (
    appointmentID VARCHAR(20),
    patientID VARCHAR(20),
    doctorID VARCHAR(20),
    date DATE,
    time TIME,
    status VARCHAR(20),
    type VARCHAR(20)
);
SHOW TABLES;