package view;

import controller.AppointmentController;
import model.Appointment;

import javax.swing.*;
import java.awt.*;
import java.time.*;

public class AppointmentForm extends JFrame {

    AppointmentController controller = new AppointmentController();

    public AppointmentForm() {

        setTitle("Book Appointment");
        setSize(450,320);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);

        // 🔷 HEADER
        JLabel title = new JLabel("Book Appointment", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));

        // 🔷 FORM PANEL
        JPanel form = new JPanel(new GridLayout(5,2,10,10));
        form.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));
        form.setBackground(Color.WHITE);

        JTextField aid = new JTextField();
        JTextField pid = new JTextField();
        JTextField did = new JTextField();
        JComboBox<String> type = new JComboBox<>(new String[]{"In-person","Video"});

        form.add(new JLabel("Appointment ID"));
        form.add(aid);

        form.add(new JLabel("Patient ID"));
        form.add(pid);

        form.add(new JLabel("Doctor ID"));
        form.add(did);

        form.add(new JLabel("Type"));
        form.add(type);

        JButton btn = new JButton("Book Appointment");
        btn.setBackground(new Color(0,102,204));
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Arial", Font.BOLD, 14));

        form.add(new JLabel()); // empty space
        form.add(btn);

        panel.add(title, BorderLayout.NORTH);
        panel.add(form, BorderLayout.CENTER);

        add(panel);

        // 🔘 ACTION
        btn.addActionListener(e -> {
            Appointment app = new Appointment(
                aid.getText(),
                pid.getText(),
                did.getText(),
                LocalDate.now(),
                LocalTime.now(),
                "Booked",
                type.getSelectedItem().toString()
            );

            controller.bookAppointment(app);
            JOptionPane.showMessageDialog(this,"Appointment Booked!");
        });
    }
}