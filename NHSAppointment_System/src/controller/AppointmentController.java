package controller;

import dao.DBConnection;
import model.Appointment;
import model.Reminder;

import java.sql.*;

public class AppointmentController {

    public void bookAppointment(Appointment app) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO appointments VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, app.getAppointmentID());
            ps.setString(2, app.getPatientID());
            ps.setString(3, app.getDoctorID());
            ps.setDate(4, Date.valueOf(app.getDate()));
            ps.setTime(5, Time.valueOf(app.getTime()));
            ps.setString(6, app.getStatus());
            ps.setString(7, app.getType());

            ps.executeUpdate();

            new Reminder().sendReminder("Appointment booked!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelAppointment(String id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                "UPDATE appointments SET status='Cancelled' WHERE appointmentID=?"
            );
            ps.setString(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rescheduleAppointment(String id, String date) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                "UPDATE appointments SET date=? WHERE appointmentID=?"
            );
            ps.setDate(1, Date.valueOf(date));
            ps.setString(2, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}