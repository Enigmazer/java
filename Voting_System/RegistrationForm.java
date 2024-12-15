package Voting_System;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.sql.*;

class RegistrationForm {
    public RegistrationForm(){
        JFrame frame = new JFrame("Registration Form");
        
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);


        JLabel label = new JLabel("Registration Form");
        panel.add(label);
        label.setBounds(100, 40, 200, 30);
        label.setFont(new Font("Calibiri",Font.BOLD,22));

        JLabel name = new JLabel("Name");
        panel.add(name);
        name.setBounds(100, 120, 70, 30);
        name.setFont(new Font("Calibiri",Font.BOLD,18));

        JTextField nameField = new JTextField();
        panel.add(nameField);
        nameField.setBounds(100, 150, 350, 30);
        nameField.setFont(new Font("Calibiri",Font.PLAIN,16));
        nameField.setBorder(null);
        nameField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        JLabel pswd = new JLabel("Password");
        panel.add(pswd);
        pswd.setBounds(100, 210, 100, 30);
        pswd.setFont(new Font("Calibiri",Font.BOLD,18));

        JPasswordField pswdField = new JPasswordField();
        panel.add(pswdField);
        pswdField.setBounds(100, 250, 350, 30);
        pswdField.setFont(new Font("Calibiri",Font.PLAIN,16));
        pswdField.setBorder(null);
        pswdField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        JLabel cpswd = new JLabel("Confirm Password");
        panel.add(cpswd);
        cpswd.setBounds(100, 300, 200, 30);
        cpswd.setFont(new Font("Calibiri",Font.BOLD,18));

        JPasswordField cpswdField = new JPasswordField();
        panel.add(cpswdField);
        cpswdField.setBounds(100, 340, 350, 30);
        cpswdField.setFont(new Font("Calibiri",Font.PLAIN,16));
        cpswdField.setBorder(null);
        cpswdField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));


        JLabel panNum = new JLabel("PAN Number");
        panel.add(panNum);
        panNum.setBounds(100, 390, 150, 30);
        panNum.setFont(new Font("Calibiri",Font.BOLD,18));

        JTextField panField = new JTextField();
        panel.add(panField);
        panField.setBounds(100, 430, 350, 30);
        panField.setFont(new Font("Calibiri",Font.PLAIN,16));
        panField.setBorder(null);
        panField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        JButton regBtn = new JButton("Register");
        panel.add(regBtn);
        regBtn.setBounds(100, 500, 350, 40);
        regBtn.setFont(new Font("Calibiri",Font.BOLD,18));
        regBtn.setBorder(null);
        regBtn.setBackground(Color.BLUE);
        regBtn.setForeground(Color.WHITE);

        frame.setSize(550,650);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        regBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                String name = nameField.getText();
                char[] str = pswdField.getPassword();
                String pswd = new String(str);
                char[] cstr = cpswdField.getPassword();
                String cpswd = new String(cstr);
                String pan = panField.getText();

                if(name.isEmpty() || pswd.isEmpty() || pan.isEmpty() || cpswd.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Complete all field!");
                    return;
                }

                if (!isValidPAN(pan)) {
                    JOptionPane.showMessageDialog(frame, "Invalid PAN number!");
                    return;
                }

                if(!pswd.equals(cpswd)){
                    JOptionPane.showMessageDialog(frame, "Password did not match!");
                    return;
                }

                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","MySQL123@");

                    PreparedStatement checkPs = conn.prepareStatement("SELECT COUNT(*) FROM userdata WHERE panNum = ?");
                    checkPs.setString(1, pan);
                    ResultSet rs = checkPs.executeQuery();

                    if (rs.next() && rs.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(frame, "PAN number already registered!");
                        return;
                    }
                    PreparedStatement ps = conn.prepareStatement("insert into userdata (name, pswd, panNum) values (?,?,?)");
                    ps.setString(1, name);
                    ps.setString(2, pswd);
                    ps.setString(3, pan);

                    int i = ps.executeUpdate();

                    if(i > 0){
                        JOptionPane.showMessageDialog(frame , "Successfully registered");
                        nameField.setText("");
                        pswdField.setText("");
                        cpswdField.setText("");
                        panField.setText("");
                    }
                    else{
                            JOptionPane.showMessageDialog(frame, "Try again!");
                    }
                }
                catch(Exception ex){
                    // ex.printStackTrace();
                    JOptionPane.showMessageDialog(frame, "Something went wrong!");
                    
                }  
            }
        });
    }

    public boolean isValidPAN(String pan) {
        String regex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$"; // PAN format: 5 letters, 4 digits, 1 letter
        return pan != null && pan.matches(regex);
    }  
    // public static void main(String[] args) {
    //     new RegistrationForm();
    // }
}
