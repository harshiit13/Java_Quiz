

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to IU QUIZ");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 10));
        rules.setText(
            "<html>"+ 
                "1. You have 10 questions " + "<br><br>" +
                "2. There is no optional question " + "<br><br>" +
                "3. You have 4 options select one " + "<br><br>" +
                "4. There is 15 secounds for each question" + "<br><br>" +
                "5. Total point is 100 , you need minimum 40 points topass out" + "<br><br>" + 
                "<br><br>"+
                " This project is created by " + "<br><br>" +
                "Harshit Dabhi  --  IU2141050026" +"<br><br>"+
                "Tirth Darji  --  IU2141050030"+"<br><br>"+
                "Vedant Domadiya -- IU2141050039"+"<br><br>"+
                "Rohan Katara  --  IU2141050069"+"<br><br>"+"<br><br>"+


            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 800);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}