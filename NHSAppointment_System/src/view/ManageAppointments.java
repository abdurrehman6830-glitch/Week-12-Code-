package view;

import controller.AppointmentController;

import javax.swing.*;
import java.awt.*;

public class ManageAppointments extends JFrame {

    AppointmentController controller = new AppointmentController();

    public ManageAppointments() {

        setTitle("Manage Appointments");
        setSize(450,250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);

        // 🔷 HEADER
        JLabel title = new JLabel("Manage Appointments", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));

        // 🔷 FORM
        JPanel form = new JPanel(new GridLayout(2,2,15,15));
        form.setBorder(BorderFactory.createEmptyBorder(30,40,30,40));
        form.setBackground(Color.WHITE);

        JTextField id = new JTextField();

        form.add(new JLabel("Appointment ID"));
        form.add(id);

        JButton cancel = new JButton("Cancel");
        JButton res = new JButton("Reschedule");

        cancel.setBackground(new Color(204,0,0));
        cancel.setForeground(Color.WHITE);

        res.setBackground(new Color(255,153,0));
        res.setForeground(Color.WHITE);

        form.add(cancel);
        form.add(res);

        panel.add(title, BorderLayout.NORTH);
        panel.add(form, BorderLayout.CENTER);

        add(panel);

        // 🔘 ACTIONS
        cancel.addActionListener(e -> {
            controller.cancelAppointment(id.getText());
            JOptionPane.showMessageDialog(this,"Cancelled!");
        });

        res.addActionListener(e -> {
            String date = JOptionPane.showInputDialog("Enter new date (YYYY-MM-DD)");
            controller.rescheduleAppointment(id.getText(), date);
            JOptionPane.showMessageDialog(this,"Rescheduled!");
        });
    }
}