package Voting_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class VotingSystemKit extends JFrame{
    private JButton StartVoting, UserRegistration, VotingMachine, ExitPoll, SuperUser;
    private JLabel TimerLabel,StartVotingL,UserRegistrationL, VotingMachineL, ExitPollL, SuperUserL; //TitleL;
    private boolean isActive;
    private Timer timer;
    private int remainingSeconds;
    VotingSystemKit() {
        setTitle("Voting System Kit");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);


        // TitleL = new JLabel("Voting System Kit");
        // TitleL.setBounds(145, 0, 220, 50);
        // TitleL.setFont(new Font("Arial", Font.BOLD, 22));
        // panel.add(TitleL);

        StartVotingL = lb("Start Voting              - ", 30);
        StartVoting = bt(40);
        StartVoting.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isActive = VotingTimer.startOrStopVoting();
                if(isActive){
                    startTimer(30 * 60);
                    JOptionPane.showMessageDialog(panel, "Voting has started for 30 minutes from now.");
                }else{
                    stopTimer();
                    JOptionPane.showMessageDialog(panel, "Voting has been stopped.");
                }
            }
        });
        panel.add(StartVotingL);
        panel.add(StartVoting);

        TimerLabel = new JLabel("Timer: Inactive");
        TimerLabel.setBounds(190, 320, 200, 30);
        TimerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        TimerLabel.setForeground(Color.RED);
        panel.add(TimerLabel);

        UserRegistrationL = lb("Register New User    - ", 90);
        UserRegistration = bt(100);
        UserRegistration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RegistrationForm();
            }
        });
        panel.add(UserRegistrationL);
        panel.add(UserRegistration);


        VotingMachineL = lb("Voting Machine         - ", 150);
        VotingMachine = bt(160);
        VotingMachine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new Verification();
            }
        });
        panel.add(VotingMachineL);
        panel.add(VotingMachine);

        ExitPollL = lb("Exit Poll                     -", 210);
        ExitPoll = bt(220);
        ExitPoll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new ExitPoll();
            }
        });
        panel.add(ExitPollL);
        panel.add(ExitPoll);

        SuperUserL = lb("Administrator Panel   -", 270);
        SuperUser = bt(280);
        SuperUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new AdministratorPanel();
            }
        });
        panel.add(SuperUserL);
        panel.add(SuperUser);

        panel.revalidate();
        panel.repaint();
    }

    JButton bt(int y) {
        JButton button = new JButton("Click");
        button.setBounds(300, y, 80, 25);
        button.setFocusPainted(false);
        button.setBackground(Color.BLUE);
        button.setForeground(Color.white);
        button.setBorder(null);
        return button;
    }
    JLabel lb(String text, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(100, y, 170, 50);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        return label;
    }

    private void startTimer(int seconds) {
        if (timer != null) {
            timer.cancel();
        }

        remainingSeconds = seconds;
        timer = new Timer();
        TimerLabel.setText("Timer: " + formatTime(remainingSeconds));

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> {
                    if (remainingSeconds > 0) {
                        remainingSeconds--;
                        TimerLabel.setText("Timer: " + formatTime(remainingSeconds));
                    } else {
                        stopTimer();
                        isActive = false;
                        JOptionPane.showMessageDialog(null, "Voting has ended automatically.");
                    }
                });
            }
        }, 0, 1000);
    }

    private void stopTimer() {
        if (timer != null) {
            timer.cancel();
        }
        TimerLabel.setText("Timer: Inactive");
    }

    private String formatTime(int seconds) {
        int minutes = seconds / 60;
        int secs = seconds % 60;
        return String.format("%02d:%02d", minutes, secs);
    }
    public static void main(String[] args) {
        new VotingSystemKit();
    }
}
