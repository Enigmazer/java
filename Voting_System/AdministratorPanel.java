package Voting_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdministratorPanel extends JFrame{
    private JPanel panInptP;
    private List<JLabel> LbList = new ArrayList<>();
    AdministratorPanel(){
        setTitle("Administrator Panel");
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("Administrator Panel");
        panel.add(label);
        label.setBounds(160, 40, 300, 40);
        label.setFont(new Font("Calibiri",Font.BOLD,30));

        JLabel resPartyVotes = lb("Reset All Parties Votes            -", 150);
        JButton resPartyVotesB = bt(150);
        panel.add(resPartyVotes);
        panel.add(resPartyVotesB);

        JLabel resUserVotes = lb("Reset All Users Votes             -", 250);
        JButton resUserVotesB = bt(250);
        panel.add(resUserVotes);
        panel.add(resUserVotesB);

        JLabel deleteUser = lb("Remove User From Database -", 350);
        deleteUser.setFont(new Font("Calibiri",Font.BOLD,20));
        JButton deleteUserB = bt(350);
        panel.add(deleteUser);
        panel.add(deleteUserB);

        resPartyVotesB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ResetPartyVotes();
            }
        });
        resUserVotesB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ResetUserVotes();
            }
        });
        deleteUserB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                removeUser();
            }
        });

    }

    JButton bt(int y) {
        JButton button = new JButton("Click");
        button.setBounds(400, y, 100, 40);
        button.setFocusPainted(false);
        button.setBackground(Color.BLUE);
        button.setForeground(Color.white);
        button.setBorder(null);
        return button;
    }

    JLabel lb(String text, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(100, y, 300, 40);
        label.setFont(new Font("Calibiri",Font.BOLD,20));
        return label;
    }

    private void ResetPartyVotes(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingcount","root","MySQL123@");
            conn.prepareStatement("UPDATE votedata SET count = 0").executeUpdate();
            JOptionPane.showMessageDialog(null, "All Parties Vote Count Reset Sucessfull.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            e.printStackTrace();
        }
    }

    private void ResetUserVotes(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","MySQL123@");
            conn.prepareStatement("UPDATE userdata SET isVoted = false").execute();
            JOptionPane.showMessageDialog(null, "User Votes Reset Sucessfull.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            e.printStackTrace();
        }
    }

    private void removeUser(){
            JFrame frame = new JFrame("Pan Number Input");
            frame.setSize(400, 700);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            panInptP = new JPanel();
            frame.add(panInptP);
            panInptP.setLayout(null);
            panInptP.setVisible(true);

            JLabel panLabel = new JLabel("Enter User id to Remove:");
            panInptP.add(panLabel);
            panLabel.setBounds(50, 50, 200, 20);
            JTextField tf = new JTextField();
            panInptP.add(tf);
            tf.setBounds(200, 50, 150, 20);

            JButton remove = new JButton("Remove");
            panInptP.add(remove);
            remove.setBounds(150, 110, 100, 25);

            JButton refresh = new JButton("Refresh");
            panInptP.add(refresh);
            refresh.setBounds(150, 140, 100, 25);
            
            JLabel ULLabel = new JLabel("User List");
            panInptP.add(ULLabel);
            ULLabel.setBounds(50, 200, 150, 30);
            ULLabel.setFont(new Font("Arial", Font.BOLD, 18));

            JLabel IdLbl = new JLabel("ID");
            panInptP.add(IdLbl);
            IdLbl.setBounds(50, 230, 30, 30);
            IdLbl.setFont(new Font("Arial", Font.BOLD, 15));

            JLabel nameLbl = new JLabel("Name");
            panInptP.add(nameLbl);
            nameLbl.setBounds(80, 230, 70, 30);
            nameLbl.setFont(new Font("Arial", Font.BOLD, 15));

            
            JLabel panLbl = new JLabel("Pan No.");
            panInptP.add(panLbl);
            panLbl.setBounds(150, 230, 110, 30);
            panLbl.setFont(new Font("Arial", Font.BOLD, 15));

            
            JLabel votedLbl = new JLabel("IsVoted");
            panInptP.add(votedLbl);
            votedLbl.setBounds(280, 230, 100, 30);
            votedLbl.setFont(new Font("Arial", Font.BOLD, 15));
            showList();              
            refresh.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    for (JLabel jLabel : LbList) {
                        panInptP.remove(jLabel);
                    }
                    LbList.clear();      
                    showList();              
                }
            });

            remove.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    String id = tf.getText();
                    try{
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","MySQL123@");
                    PreparedStatement ps = conn.prepareStatement("SELECT id,name FROM userdata WHERE id = ?");
                    ps.setString(1, id);
                    ResultSet rs = ps.executeQuery();
                    
                    if(rs.next()){
                        String name = rs.getString(2);
                        PreparedStatement remUsr = conn.prepareStatement("DELETE FROM userdata WHERE id = ?");
                        remUsr.setString(1, id);
                        remUsr.executeUpdate();
                        JOptionPane.showMessageDialog(null, "User "+name+" Removed Sucessfull From Database.");
                    }else{
                        JOptionPane.showMessageDialog(null, "No User Found With This id.");
                    }
                    }catch (Exception ee) {
                        JOptionPane.showMessageDialog(null, "Error");
                        ee.printStackTrace();
                    }
                }
            });
    }
    
    private void showList(){
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","MySQL123@");
        PreparedStatement psUL = conn.prepareStatement("SELECT id,name,panNum,isVoted FROM userdata");
        ResultSet rsUL = psUL.executeQuery();
        int y =230;
        while(rsUL.next()){
            int id = rsUL.getInt(1);
            String name = rsUL.getString(2);
            String panNum = rsUL.getString(3);
            boolean isVoted = rsUL.getBoolean(4);
            y += 30;
            JLabel idLbl = new JLabel(id+": ");
            idLbl.setBounds(50, y, 50, 30);
            idLbl.setFont(new Font("Arial", Font.PLAIN, 15));
            LbList.add(idLbl);
            panInptP.add(idLbl);
            JLabel nmLbl = new JLabel(name);
            nmLbl.setBounds(80, y, 70, 30);
            nmLbl.setFont(new Font("Arial", Font.PLAIN, 15));
            LbList.add(nmLbl);
            panInptP.add(nmLbl);
            JLabel panNLbl = new JLabel(panNum);
            panNLbl.setBounds(150, y, 110, 30);
            panNLbl.setFont(new Font("Arial", Font.PLAIN, 15));
            LbList.add(panNLbl);
            panInptP.add(panNLbl);
            JLabel ivLbl = new JLabel(isVoted+"");
            ivLbl.setBounds(280, y, 100, 30);
            ivLbl.setFont(new Font("Arial", Font.PLAIN, 15));
            LbList.add(ivLbl);
            panInptP.add(ivLbl);
        }}catch(Exception e){
            e.printStackTrace();
        }
        panInptP.revalidate();
        panInptP.repaint();
    }
    // public static void main(String[] args) {
        
    // }
}
