package Games;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class RpcApp {
    public static JPanel topRightPanel = new JPanel(new BorderLayout());
    public static JLabel counterLabel = new JLabel("      Rounds: 0    ---   Your Score: 0    ---   Computer Score: 0", SwingConstants.CENTER);
    public static JLabel resultLabel = new JLabel("        Start", SwingConstants.CENTER);
    public static int userWin = 0, compWin = 0, rounds = 0;

    public static void wl(int a) {
        if (a == 1) {
            rounds++;
            userWin++;
            compWin++;
            counterLabel.setText("      Rounds: " + rounds + "    ---   Your Score: " + userWin + "    ---   Computer Score: " + compWin);
            resultLabel.setText("        Tie!");
            resultLabel.setForeground(Color.ORANGE);
        } else if (a == 2) {
            rounds++;
            userWin++;
            counterLabel.setText("      Rounds: " + rounds + "    ---   Your Score: " + userWin + "    ---   Computer Score: " + compWin);
            resultLabel.setText("          You won");
            resultLabel.setForeground(Color.GREEN);
        } else {
            rounds++;
            compWin++;
            counterLabel.setText("      Rounds: " + rounds + "    ---   Your Score: " + userWin + "    ---   Computer Score: " + compWin);
            resultLabel.setText("           Computer won");
            resultLabel.setForeground(Color.RED);
        }
        resultLabel.setVisible(true);
    }

    public static void restart() {
        userWin = 0;
        compWin = 0;
        rounds = 0;
        counterLabel.setText("      Rounds: " + rounds + "    ---   Your Score: " + userWin + "    ---   Computer Score: " + compWin);
        resultLabel.setForeground(Color.BLACK);
        resultLabel.setText("        Start");
    }

    public static void game(int input) {
        Random rndm = new Random();
        int Randomnumber = rndm.nextInt(3) + 1;
        switch (input) {
            case 1:
                if (1 == Randomnumber) {
                    wl(1);
                } else if (2 == Randomnumber) {
                    wl(3);
                } else {
                    wl(2);
                }
                break;
            case 2:
                if (1 == Randomnumber) {
                    wl(2);
                } else if (2 == Randomnumber) {
                    wl(1);
                } else {
                    wl(3);
                }
                break;
            case 3:
                if (1 == Randomnumber) {
                    wl(3);
                } else if (2 == Randomnumber) {
                    wl(2);
                } else {
                    wl(1);
                }
                break;
        }
    }

    @SuppressWarnings("unused")
    public static void maingame() {
        // frame
        JFrame frame = new JFrame("Rock Paper Scissors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 700);

        // main panel with GridBagLayout to center components
        JPanel mainPanel = new JPanel(new GridBagLayout()); 
        mainPanel.setBackground(Color.lightGray);

    
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0)); 
        buttonPanel.setBackground(Color.lightGray);

        // Rock, Paper, Scissors buttons
        JButton btnRock = createStyledButton("Rock", new Color(230, 100, 100));
        JButton btnPaper = createStyledButton("Paper", new Color(100, 230, 100));
        JButton btnScissors = createStyledButton("Scissors", new Color(100, 100, 230));

        btnRock.addActionListener(e -> game(1));
        btnPaper.addActionListener(e -> game(2));
        btnScissors.addActionListener(e -> game(3));

        // Add buttons to the panel
        buttonPanel.add(btnRock);
        buttonPanel.add(btnPaper);
        buttonPanel.add(btnScissors);

        mainPanel.add(buttonPanel);   

        // Styled the counter label
        counterLabel.setFont(new Font("Arial", Font.BOLD, 35));
        counterLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        counterLabel.setForeground(Color.BLUE);
        topRightPanel.add(counterLabel, BorderLayout.CENTER);

        // bottom right panel for the restart button
        JPanel bottomRightPanel = new JPanel(new BorderLayout());
        JButton restartButton = createStyledButton("Restart", Color.BLACK);
        restartButton.setBackground(Color.BLUE);
        restartButton.addActionListener(e -> restart());

        resultLabel.setFont(new Font("Arial", Font.BOLD, 49));
        bottomRightPanel.add(resultLabel, BorderLayout.CENTER);
        bottomRightPanel.add(restartButton, BorderLayout.EAST);

        // Add panels to frame
        frame.add(mainPanel, BorderLayout.CENTER); 
        frame.add(topRightPanel, BorderLayout.NORTH); 
        frame.add(bottomRightPanel, BorderLayout.SOUTH); 

        frame.setVisible(true);
    }

    // Helper method to create styled buttons
    private static JButton createStyledButton(String text, Color color) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(150, 70));
        button.setBackground(color);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setFocusPainted(false); 
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        return button;
    }

    public static void main(String[] args) {
        maingame();
    }
}
