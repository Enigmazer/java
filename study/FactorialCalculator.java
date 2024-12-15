package study;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// 8no question for est
public class FactorialCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Factorial Calculator");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        Panel panel = new Panel();
        frame.add(panel);
        panel.setBackground(Color.white);
        panel.setVisible(true);
        panel.setLayout(null);

        JLabel Label = new JLabel();
        panel.add(Label);
        Label.setVisible(true);
        Label.setText("Enter a number:");
        Label.setFont(new Font("Arial", Font.BOLD, 21));
        Label.setBounds(118, 191, 170, 20);
        Label.setForeground(Color.black);
        JTextField tf = new JTextField();
        panel.add(tf);
        tf.setBounds(300, 181, 190, 45);
        tf.setFont(new Font("Arial", Font.PLAIN, 18));

        JButton bt1 = new JButton();
        panel.add(bt1);
        bt1.setBackground(Color.green);
        bt1.setForeground(Color.white);
        bt1.setText("Enter");
        bt1.setFont(new Font("Arial", Font.BOLD, 17));
        bt1.setToolTipText("Calculate Factorial");
        bt1.setBounds(274, 281, 90, 35);
        bt1.addActionListener(new ActionListener() {
            int fact(int n){
                if (n==0 || n==1)
                return 1;
                else{
                    return n*fact(n-1);
                } 
            }
            public void actionPerformed(ActionEvent e){
                String s = tf.getText();
                int n = Integer.parseInt(s);
                int fact = fact(n);
                JLabel resultLabel = new JLabel("Factorial = "+fact);
                panel.add(resultLabel);
                resultLabel.setFont(new Font("Arial", Font.PLAIN, 21));
                resultLabel.setBounds(200, 400, 550, 30);
                resultLabel.setForeground(Color.black);
            }
        });
    }
}
