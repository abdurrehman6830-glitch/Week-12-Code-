package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private String appointmentID, patientID, doctorID, status, type;
    private LocalDate date;
    private LocalTime time;

    public Appointment(String aid, String pid, String did,
                       LocalDate date, LocalTime time,
                       String status, String type) {
        this.appointmentID = aid;
        this.patientID = pid;
        this.doctorID = did;
        this.date = date;
        this.time = time;
        this.status = status;
        this.type = type;
    }

    public String getAppointmentID() { return appointmentID; }
    public String getPatientID() { return patientID; }
    public String getDoctorID() { return doctorID; }
    public LocalDate getDate() { return date; }
    public LocalTime getTime() { return time; }
    public String getStatus() { return status; }
    public String getType() { return type; }
}