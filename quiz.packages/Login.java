

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, exit;
    JTextField tfname;
    
    public void run() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel heading = new JLabel("QUIZ");
        heading.setBounds(320, 130, 300, 45);
        heading.setFont(new Font(" Monospaced", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(310, 175, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(235, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(395, 240, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        exit = new JButton("Exit");
        exit.setBounds(255, 240, 120, 25);
        exit.setBackground(new Color(254, 100, 30));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        setSize(800, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == exit) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        Login l =new Login();
        l.run();
    }
} 
