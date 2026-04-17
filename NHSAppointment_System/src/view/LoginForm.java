package view;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {

    public LoginForm() {

        setTitle("NHS Appointment System - Login");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,40,20,40));

        JLabel title = new JLabel("NHS Login", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));

        JTextField user = new JTextField();
        JPasswordField pass = new JPasswordField();

        JButton btn = new JButton("Login");
        btn.setBackground(new Color(0,120,215));
        btn.setForeground(Color.WHITE);

        panel.add(title);
        panel.add(user);
        panel.add(pass);
        panel.add(btn);

        add(panel);

        btn.addActionListener(e -> {
            if(user.getText().equals("admin") && pass.getText().equals("123")){
                new Dashboard().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this,"Invalid Login");
            }
        });
    }
}