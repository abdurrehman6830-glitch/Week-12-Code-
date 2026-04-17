# NHS Appointment Management System 

## Overview

The **NHS Appointment Management System** is a Java-based desktop application designed to improve healthcare appointment scheduling through digital optimization.

It addresses common issues such as:

* Long waiting times
* Missed appointments (no-shows)
* Inefficient scheduling systems

The system is built using **Object-Oriented Programming (OOP)** principles and follows the **Model-View-Controller (MVC)** architecture for scalability and maintainability.

---

## Features

* Book appointments
* Cancel appointments
* Reschedule appointments
* Reminder system (simulated notifications)
* Basic user authentication
* User-friendly Java Swing GUI
* MySQL database integration

---

## Technologies Used

* **Java (Swing GUI)**
* **MySQL Database**
* **JDBC (Java Database Connectivity)**
* **MVC Architecture**
* **OOP Concepts**

---

## Project Structure

```
project-root/
│
├── controller/
│   └── AppointmentController.java
│
├── dao/
│   └── DBConnection.java
│
├── model/
│   ├── Appointment.java
│   ├── Doctor.java
│   ├── Patient.java
│   └── Reminder.java
│
├── view/
│   ├── LoginForm.java
│   ├── Dashboard.java
│   ├── AppointmentForm.java
│   ├── ManageAppointments.java
│   └── Main.java
```

---

## Setup Instructions

### Clone Repository

```bash
git clone https://github.com/your-username/your-repo-name.git
```

### Setup Database

* Install MySQL
* Create database:

```sql
CREATE DATABASE nhs_db;
```

* Create table:

```sql
CREATE TABLE appointments (
    appointmentID VARCHAR(50),
    patientID VARCHAR(50),
    doctorID VARCHAR(50),
    date DATE,
    time TIME,
    status VARCHAR(50),
    type VARCHAR(50)
);
```

### Configure Database Connection

Update credentials in:

```
DBConnection.java
```

```java
"jdbc:mysql://localhost:3306/nhs_db",
"root",
"root"
```

---

### Run the Project

* Open project in **NetBeans / IntelliJ**
* Run:

```
Main.java
```

---

## Default Login

```
Username: admin  
Password: 123
```

---

## System Architecture

The project follows **MVC Architecture**:

* **Model** → Handles data (Appointment, Patient, Doctor)
* **View** → GUI (Swing Forms)
* **Controller** → Business logic (AppointmentController)

---

## Key Learning Outcomes

* Practical implementation of OOP concepts
* MVC architecture design
* Database integration using JDBC
* GUI development with Java Swing
* Real-world problem solving in healthcare systems

---

## Limitations

* Basic authentication (not secure for production)
* Reminder system is simulated (console-based)
* UI can be improved with modern frameworks

---

## Future Improvements

* Email/SMS notifications
* Advanced authentication system
* Web-based version (Spring Boot / WordPress integration)
* Real-time appointment tracking

---

## Author

**Abdur Rehman**
Student ID: 2534412

---

## 📄 License

This project is for educational purposes.
