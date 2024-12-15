package Voting_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Verification {
    public Verification(){
        JFrame frame = new JFrame("Online Voting Application");

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        JLabel label = new JLabel("Verification Form");
        panel.add(label);
        label.setBounds(150, 40, 200, 30);
        label.setFont(new Font("Calibiri",Font.BOLD,22));

        JLabel name = new JLabel("Name");
        panel.add(name);
        name.setBounds(150, 120, 70, 30);
        name.setFont(new Font("Calibiri",Font.BOLD,18));
        
        JTextField nameField = new JTextField();
        panel.add(nameField);
        nameField.setBounds(150, 160, 350, 30);
        nameField.setFont(new Font("Calibiri",Font.PLAIN,16));
        nameField.setBorder(null);
        nameField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        JLabel pswd = new JLabel("Password");
        panel.add(pswd);
        pswd.setBounds(150, 220, 100, 30);
        pswd.setFont(new Font("Calibiri",Font.BOLD,18));

        JPasswordField pswdField = new JPasswordField();
        panel.add(pswdField);
        pswdField.setBounds(150, 260, 350, 30);
        pswdField.setFont(new Font("Calibiri",Font.PLAIN,16));
        pswdField.setBorder(null);
        pswdField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        JLabel panNum = new JLabel("PAN Number");
        panel.add(panNum);
        panNum.setBounds(150, 320, 150, 30);
        panNum.setFont(new Font("Calibiri",Font.BOLD,18));

        JTextField panField = new JTextField();
        panel.add(panField);
        panField.setBounds(150, 370, 350, 30);
        panField.setFont(new Font("Calibiri",Font.PLAIN,16));
        panField.setBorder(null);
        panField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        JButton verify = new JButton("Verify");
        panel.add(verify);
        verify.setBounds(150, 420, 350, 40);
        verify.setFont(new Font("Calibiri",Font.BOLD,18));
        verify.setBorder(null);
        verify.setBackground(Color.BLUE);
        verify.setForeground(Color.WHITE);
        verify.setBorder(null);

        frame.setSize(650,600);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        verify.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String name = nameField.getText();
                char[] str = pswdField.getPassword();
                String pswd = new String(str);  
                String pan = panField.getText();

                if (!VotingTimer.isVotingActive()) {
                    JOptionPane.showMessageDialog(frame, "Voting is not currently active. Please try again later.");
                    return;  // Don't proceed with the voting logic
                }

                if(name.isEmpty() || pswd.isEmpty() || pan.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Complete all field!");
                    return;
                }

                if(!isValidPAN(pan)){
                    JOptionPane.showMessageDialog(frame, "Invalid PAN Number!");
                    return;
                }

                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","MySQL123@");
                    PreparedStatement ps = conn.prepareStatement("SELECT COUNT(*) FROM userdata WHERE name = ? and panNum = ? and pswd = ?");
                    ps.setString(1, name);
                    ps.setString(2, pan);
                    ps.setString(3, pswd);

                    ResultSet rs = ps.executeQuery();

                    if (rs.next() && rs.getInt(1) > 0) {
                        PreparedStatement isVotedS = conn.prepareStatement("SELECT isVoted FROM userdata WHERE panNum = ?");
                        isVotedS.setString(1, pan);
                        ResultSet isVotedR = isVotedS.executeQuery();
                        if(isVotedR.next() && isVotedR.getInt(1) == 1){
                            JOptionPane.showMessageDialog(frame, "Verified! You have already voted.");
                            return;
                        }
                        JOptionPane.showMessageDialog(frame, "Verified! Click ok to vote.");
                        frame.dispose();
                        new OnlineVotingSystem(pan);
                        return;
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "No user found in database with certain information!");
                        return;
                    }
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
    }
    public boolean isValidPAN(String pan){
        String regex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$"; // PAN format: 5 letters, 4 digits, 1 letter
        return pan != null && pan.matches(regex);
    }
}
