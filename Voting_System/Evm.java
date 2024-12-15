package Voting_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

class OnlineVotingSystem implements ActionListener {

    private JButton bjpBtn, congBtn, bspBtn, aapBtn, spBtn, notaBtn;
    private String pan;
    JFrame frame;

    public OnlineVotingSystem(String panT) {
        this.pan = panT;
        frame = new JFrame("EVM");

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        // BJP Button
        JLabel bjp = new JLabel("1. Bhartiya Janta Party");
        bjp.setBounds(20, 60, 250, 30);
        bjp.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(bjp);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("Voting\\logos\\BJP_logo.png"));
        Image i1 = img1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        JLabel image1 = new JLabel(new ImageIcon(i1));
        image1.setBounds(300, 50, 50, 50);
        panel.add(image1);

        bjpBtn = createButton(panel, 450, 60);

        // Congress Button
        JLabel cong = new JLabel("2. Indian National Congress");
        cong.setBounds(20, 150, 250, 30);
        cong.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(cong);

        ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("Voting\\logos\\INC_Logo.png"));
        Image i2 = img2.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        JLabel image2 = new JLabel(new ImageIcon(i2));
        image2.setBounds(300, 140, 50, 50);
        panel.add(image2);

        congBtn = createButton(panel, 450, 150);

        // BSP Button
        JLabel bsp = new JLabel("3. Bahujan Samajwadi Party");
        bsp.setBounds(20, 240, 250, 30);
        bsp.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(bsp);

        ImageIcon img3 = new ImageIcon(ClassLoader.getSystemResource("Voting\\logos\\BSP_logo.png"));
        Image i3 = img3.getImage().getScaledInstance(50, 45, Image.SCALE_DEFAULT);
        JLabel image3 = new JLabel(new ImageIcon(i3));
        image3.setBounds(300, 230, 50, 50);
        panel.add(image3);

        bspBtn = createButton(panel, 450, 240);

        // AAP Button
        JLabel aap = new JLabel("4. Aam Aadmi Party");
        aap.setBounds(20, 330, 250, 30);
        aap.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(aap);

        ImageIcon img4 = new ImageIcon(ClassLoader.getSystemResource("Voting\\logos\\AAP_logo.png"));
        Image i4 = img4.getImage().getScaledInstance(120, 30, Image.SCALE_DEFAULT);
        JLabel image4 = new JLabel(new ImageIcon(i4));
        image4.setBounds(300, 320, 90, 50);
        panel.add(image4);

        aapBtn = createButton(panel, 450, 330);

        // SP Button
        JLabel sp = new JLabel("5. Samajwadi Party");
        sp.setBounds(20, 420, 250, 30);
        sp.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(sp);

        ImageIcon img5 = new ImageIcon(ClassLoader.getSystemResource("Voting\\logos\\SP_logo.png"));
        Image i5 = img5.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        JLabel image5 = new JLabel(new ImageIcon(i5));
        image5.setBounds(300, 410, 50, 50);
        panel.add(image5);

        spBtn = createButton(panel, 450, 420);

        // NOTA Button
        JLabel nota = new JLabel("6. None of the Above");
        nota.setBounds(20, 510, 250, 30);
        nota.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(nota);

        ImageIcon img7 = new ImageIcon(ClassLoader.getSystemResource("Voting\\logos\\NOTA.png"));
        Image i7 = img7.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        JLabel image7 = new JLabel(new ImageIcon(i7));
        image7.setBounds(300, 500, 50, 50);
        panel.add(image7);

        notaBtn = createButton(panel, 450, 510);

        frame.setSize(570, 600);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setBounds(400, 20, 600, 700);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private JButton createButton(JPanel panel, int x, int y) {
        JButton button = new JButton();
        button.setBounds(x, y, 70, 30);
        button.setBackground(Color.blue);
        button.setBorder(null);
        button.addActionListener(this);
        panel.add(button);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingcount", "root", "MySQL123@");
            Connection connUI = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo", "root", "MySQL123@");

            if (e.getSource() == bjpBtn) handleVote(conn, connUI, "BJP", bjpBtn);
            else if (e.getSource() == congBtn) handleVote(conn, connUI, "CONG", congBtn);
            else if (e.getSource() == bspBtn) handleVote(conn, connUI, "BSP", bspBtn);
            else if (e.getSource() == aapBtn) handleVote(conn, connUI, "AAP", aapBtn);
            else if (e.getSource() == spBtn) handleVote(conn, connUI, "SP", spBtn);
            else if (e.getSource() == notaBtn) handleVote(conn, connUI, "NOTA", notaBtn);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void handleVote(Connection conn, Connection connUI, String party, JButton btn) throws SQLException {
        updateVoteCount(conn, connUI, party);
        setBtnColor(btn);
        disableButtons();
        PreparedStatement userName = connUI.prepareStatement("SELECT name From userdata WHERE panNum = ?");
        userName.setString(1, pan);
        ResultSet userNameR = userName.executeQuery();
        String name = "";
        if(userNameR.next()){
            name = userNameR.getString(1);
        }
        JOptionPane.showMessageDialog(frame, "Congratulations "+name+"! Your vote is Successfully registered.", "Success", JOptionPane.PLAIN_MESSAGE);
    }

    private void setBtnColor(JButton btn){
        bjpBtn.setBackground(Color.gray);
        congBtn.setBackground(Color.gray);
        bspBtn.setBackground(Color.gray);
        aapBtn.setBackground(Color.gray);
        spBtn.setBackground(Color.gray);
        notaBtn.setBackground(Color.gray);
        btn.setBackground(Color.green);
    }

    private void updateVoteCount(Connection conn, Connection connUI, String party) throws SQLException {
        PreparedStatement updateVote = connUI.prepareStatement("UPDATE userdata SET isVoted = true WHERE panNum = ?");            
        updateVote.setString(1, pan);
        updateVote.executeUpdate();
        PreparedStatement countS = conn.prepareStatement("SELECT count From votedata WHERE name = ?");
        countS.setString(1, party);
        ResultSet countR = countS.executeQuery();
        int count = 0;
        if(countR.next()){
            count = countR.getInt(1);
        }
        PreparedStatement ps = conn.prepareStatement("UPDATE votedata SET count = ? WHERE name = ?");
        count++;
        ps.setInt(1, count);
        ps.setString(2, party);
        ps.executeUpdate();
    }

    private void disableButtons() {
        bjpBtn.setEnabled(false);
        congBtn.setEnabled(false);
        bspBtn.setEnabled(false);
        aapBtn.setEnabled(false);
        spBtn.setEnabled(false);
        notaBtn.setEnabled(false);
    }
}

public class Evm {
    public static void main(String[] args) {
        // new OnlineVotingSystem(); 
    }
}