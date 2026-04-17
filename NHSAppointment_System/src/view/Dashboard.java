package view;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    public Dashboard() {

        setTitle("NHS Appointment System - Dashboard");
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.WHITE);

        // 🔷 TOP HEADER
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(0, 102, 204));
        topPanel.setPreferredSize(new Dimension(600, 60));

        JLabel title = new JLabel("NHS Appointment System");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 20));

        JButton logout = new JButton("Logout");
        logout.setFocusPainted(false);

        topPanel.add(title);
        topPanel.add(Box.createHorizontalStrut(50));
        topPanel.add(logout);

        // 🔷 CENTER PANEL (BUTTONS)
        JPanel centerPanel = new JPanel(new GridLayout(2,1,20,20));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(50,100,50,100));
        centerPanel.setBackground(Color.WHITE);

        JButton book = new JButton("📅 Book Appointment");
        JButton manage = new JButton("⚙ Manage Appointments");

        // Style buttons
        book.setFont(new Font("Arial", Font.BOLD, 16));
        manage.setFont(new Font("Arial", Font.BOLD, 16));

        book.setBackground(new Color(0,153,76));
        book.setForeground(Color.WHITE);

        manage.setBackground(new Color(204,102,0));
        manage.setForeground(Color.WHITE);

        book.setFocusPainted(false);
        manage.setFocusPainted(false);

        centerPanel.add(book);
        centerPanel.add(manage);

        // Add panels
        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);

        add(panel);

        // 🔘 BUTTON ACTIONS
        book.addActionListener(e -> new AppointmentForm().setVisible(true));
        manage.addActionListener(e -> new ManageAppointments().setVisible(true));

        logout.addActionListener(e -> {
            new LoginForm().setVisible(true);
            dispose();
        });
    }
}