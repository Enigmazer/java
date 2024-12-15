package Voting_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExitPoll extends JFrame {
    private JPanel panel;
    private List<JLabel> labelList = new ArrayList<>();
    ExitPoll(){
        setTitle("Exit Poll");
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        panel = new JPanel();
        add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("Exit Poll");
        panel.add(label);
        label.setBounds(225, 40, 200, 30);
        label.setFont(new Font("Calibiri",Font.BOLD,40));

        result();
        
        JButton refresh = new JButton("Refresh results");
        panel.add(refresh);
        refresh.setBorder(null);
        refresh.setFocusPainted(false);
        refresh.setBackground(Color.blue);
        refresh.setForeground(Color.white);
        refresh.setBounds(200, 500, 200, 30);
        refresh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                for (JLabel Label : labelList) {
                    panel.remove(Label);
                }
                labelList.clear();
                result();
            }
        });
    }
    public void result(){
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingcount", "root", "MySQL123@");
        PreparedStatement voteData = conn.prepareStatement("SELECT * FROM votedata");
        ResultSet voteDataR = voteData.executeQuery();
        int w = 100;
        while (voteDataR.next()) {
            String party = voteDataR.getString("name");
            int count = voteDataR.getInt("count");
            JLabel label1 = new JLabel(party + "");
            labelList.add(label1);
            panel.add(label1);
            JLabel label3 = new JLabel(" : ");
            labelList.add(label3);
            panel.add(label3);
            JLabel label2 = new JLabel(count + "");
            labelList.add(label2);
            panel.add(label2);
            w += 50;
            label1.setBounds(200, w , 200, 30);   
            label1.setFont(new Font("Arial",Font.BOLD,22));
            label3.setBounds(315, w , 30, 30);   
            label3.setFont(new Font("Arial",Font.BOLD,22));
            label2.setBounds(380, w , 200, 30);   
            label2.setFont(new Font("Arial",Font.BOLD,22));
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        }


    // public static void main(String[] args) {
    //     new ExitPoll();
    // }
}
