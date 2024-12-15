package study;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Title");
        frame.setSize(700,600);
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
        Label.setText("Name");
        Label.setFont(new Font("Arial", Font.BOLD, 21));
        Label.setBounds(187, 158, 110, 20);
        Label.setForeground(Color.black);
        JTextField tf = new JTextField();
        panel.add(tf);
        tf.setBounds(325, 156, 150, 30);
        tf.setFont(new Font("Arial", Font.PLAIN, 18));
        
        JLabel Label2 = new JLabel();
        panel.add(Label2);
        Label2.setText("Password");
        Label2.setFont(new Font("Arial", Font.BOLD, 21));
        Label2.setBounds(187, 218, 110, 20);
        Label2.setForeground(Color.black);
        JPasswordField tf2 = new JPasswordField();
        panel.add(tf2);
        tf2.setBounds(325, 215, 150, 30);
        tf2.setFont(new Font("Arial", Font.PLAIN, 18));

        JButton bt1 = new JButton();
        panel.add(bt1);
        bt1.setBackground(Color.green);
        bt1.setForeground(Color.white);
        bt1.setText("Login");
        bt1.setFont(new Font("Arial", Font.BOLD, 17));
        bt1.setToolTipText("login");
        bt1.setBounds(274, 281, 90, 35);

        bt1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
        String name = tf.getText();
        char[] Password = tf2.getPassword();
        String password = new String(Password);
        if(password.equals("1234")){
            JOptionPane.showMessageDialog(null, "Login Successful");
            // Update the UI with the entered information
            //  JLabel resultLabel = new JLabel("Name: " + name + " \nPassword: " + password);
            JLabel resultLabel = new JLabel("!Congrats " + name + " You have sucessfully loged in to your account");
            panel.add(resultLabel);
            resultLabel.setFont(new Font("Arial", Font.PLAIN, 21));
            resultLabel.setBounds(25, 330, 650, 30);
            resultLabel.setForeground(Color.black);
        }
        else{
            JOptionPane.showMessageDialog(null, "Login Failed");
        }
            }
        });

    }    
}
