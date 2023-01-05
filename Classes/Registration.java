package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.font.*;
import java.awt.Cursor;
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.awt.EventQueue;

import static javax.swing.JOptionPane.showMessageDialog;

public class Registration extends RegistrationCond {

    JFrame frame1;
    JPanel panel1;
    JLabel lebel1, lebel2, lebel3, lebel4, lebel5, lebel6, lebel7, lebel9, lebel10, lebel11, lebel12, lebel99;
    JTextField field1, field2, field3, field4, field5, field6, field7, field8, field9;
    JButton  button2,  button4, button5;
    JRadioButton Box1, Box2, Box3;
    ButtonGroup bg;
    JCheckBox c;
    ImageIcon i1;

    Registration(String textField5, String textField6, String textField4) {
        super(textField5, textField6, textField4);

        frame1 = new JFrame();

        i1 = new ImageIcon("image/logo.png");
        frame1.setIconImage(i1.getImage());

        button4 = new JButton();
        button4.setIcon(new ImageIcon("image/return.png"));
        button4.setBounds(15, 8, 35, 40);
        button4.setFont(new Font("Segeo UI", Font.BOLD, 40));
        button4.setForeground(Color.black);
        button4.setBorderPainted(false);
        button4.setFocusPainted(false);    // boxer dag ba area dekha jabe..
        button4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button4.setContentAreaFilled(false);  // button er color dekha jave..

        lebel1 = new JLabel("Create Account");
        lebel1.setBounds(890, 30, 300, 60);
        lebel1.setForeground(Color.black);
        lebel1.setFont(new Font("Default", Font.BOLD, 40));

        lebel2 = new JLabel("First Name");
        lebel2.setBounds(800, 120, 200, 40);
        lebel2.setForeground(Color.black);
        lebel2.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field1 = new JTextField();
        field1.setBounds(800, 155, 230, 30);
        field1.setForeground(Color.black);
        field1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field1.setCaretColor(Color.black);
        field1.setBorder(null);

        lebel3 = new JLabel("Surname");
        lebel3.setBounds(1100, 120, 200, 40);
        lebel3.setForeground(Color.black);
        lebel3.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field2 = new JTextField();
        field2.setBounds(1100, 155, 180, 30);
        field2.setForeground(Color.black);
        field2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field2.setCaretColor(Color.black);
        field2.setBorder(null);

        lebel4 = new JLabel("Date of Birth (dd/mm/yyyy)");
        lebel4.setBounds(800, 190, 250, 40);
        lebel4.setForeground(Color.black);
        lebel4.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field3 = new JTextField();
        field3.setBounds(800, 225, 230, 30);
        field3.setForeground(Color.black);
        field3.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field3.setCaretColor(Color.black);
        field3.setBorder(null);

        lebel6 = new JLabel("Gender:");
        lebel6.setBounds(800, 260, 300, 40);
        lebel6.setForeground(Color.black);
        lebel6.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        bg = new ButtonGroup();

        Box1 = new JRadioButton("Male");
        Box1.setBounds(880, 270, 100, 25);
        Box1.setForeground(Color.black);
        Box1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Box1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Box1.setFocusPainted(false);
        Box1.setBorderPainted(false);
        Box1.setContentAreaFilled(false);

        Box2 = new JRadioButton("Female", true);
        Box2.setForeground(Color.black);
        Box2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Box2.setBounds(980, 270, 100, 25);
        Box2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Box2.setFocusPainted(false);
        Box2.setBorderPainted(false);
        Box2.setContentAreaFilled(false);

        Box3 = new JRadioButton("Other", true);
        Box3.setForeground(Color.black);
        Box3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Box3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Box3.setBounds(1090, 270, 100, 25);
        Box3.setFocusPainted(false);
        Box3.setBorderPainted(false);
        Box3.setContentAreaFilled(false);

        bg.add(Box1);
        bg.add(Box2);
        bg.add(Box3);

        frame1.add(Box1);
        frame1.add(Box2);
        frame1.add(Box3);

        lebel7 = new JLabel("Email");
        lebel7.setBounds(800, 300, 300, 40);
        lebel7.setForeground(Color.black);
        lebel7.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field4 = new JTextField();
        field4.setBounds(800, 335, 380, 30);
        field4.setForeground(Color.black);
        field4.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field4.setCaretColor(Color.black);
        field4.setBorder(null);

        lebel10 = new JLabel("User Name");
        lebel10.setBounds(800, 370, 200, 40);
        lebel10.setForeground(Color.black);
        lebel10.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field5 = new JTextField();
        field5.setBounds(800, 405, 200, 30);
        field5.setForeground(Color.black);
        field5.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field5.setCaretColor(Color.black);
        field5.setBorder(null);

        lebel11 = new JLabel("Password");
        lebel11.setBounds(800, 440, 200, 40);
        lebel11.setForeground(Color.black);
        lebel11.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field6 = new JTextField();
        field6.setBounds(800, 475, 200, 30);
        field6.setForeground(Color.black);
        field6.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        field6.setCaretColor(Color.black);
        field6.setBorder(null);

        lebel12 = new JLabel("Re-type Password");
        lebel12.setBounds(1100, 440, 200, 40);
        lebel12.setForeground(Color.black);
        lebel12.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        field7 = new JTextField();
        field7.setBounds(1100, 475, 200, 30);
        field7.setForeground(Color.black);
        field7.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        field7.setCaretColor(Color.black);
        field7.setBorder(null);

        lebel99 = new JLabel();
        lebel99.setIcon(new ImageIcon("image/Registration.png"));
        Dimension size = lebel99.getPreferredSize();
        lebel99.setBounds(0, 0, 683, 760);

        button2 = new JButton("Submit");
        button2.setBounds(832, 560, 400, 40);
        button2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        button2.setBackground(new Color(95, 112, 234));
        button2.setForeground(Color.black);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.setFocusPainted(false);

        lebel9 = new JLabel("Already have an account?");
        lebel9.setBounds(920, 610, 320, 30);
        lebel9.setForeground(Color.black);
        lebel9.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        button5 = new JButton("Login");
        button5.setBounds(1100, 610, 105, 30);
        button5.setFont(new Font("Segoe UI", Font.BOLD, 18));
        button5.setForeground(Color.black);
        button5.setBorderPainted(false);
        button5.setFocusPainted(false);
        button5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button5.setContentAreaFilled(false);

        // adding all level
        frame1.add(lebel1);
        frame1.add(lebel2);
        frame1.add(lebel3);
        frame1.add(lebel4);
        frame1.add(lebel6);
        frame1.add(lebel7);
        frame1.add(lebel9);
        frame1.add(lebel10);
        frame1.add(lebel11);
        frame1.add(lebel12);

        // adding all button

        frame1.add(button2);
        frame1.add(button4);
        frame1.add(button5);

        // adding all text field
        frame1.add(field1);
        frame1.add(field2);
        frame1.add(field3);
        frame1.add(field4);
        frame1.add(field5);
        frame1.add(field6);
        frame1.add(field7);


        // adding panel
        frame1.add(lebel99);

        frame1.setSize(1366, 768);
        frame1.setLayout(null);
        frame1.setLocationRelativeTo(null);
        frame1.getContentPane().setBackground(new Color (68, 185, 135));
        frame1.setVisible(true);

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textField1 = field1.getText(); // First Name
                String textField2 = field2.getText(); // Sure Name
                String textField3 = field3.getText(); // Date Of Birth
                String textField4 = field4.getText(); // Email
                String textField5 = field5.getText().toLowerCase(); // User Name
                String textField6 = field6.getText(); // Password
                String textField7 = field7.getText(); // Retype Password


                int result = 0;

                if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                        || textField5.isEmpty() || textField6.isEmpty() || textField7.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);

                } else {

                     if (!textField6.equals(textField7)) {
                        showMessageDialog(null, "Password & Re-type Password must be same", "null", 2);
                    }

                    else {

                        registration(textField5, textField6, textField4);

                        if (s == 1) {
                            frame1.setVisible(false);
                        }

                    }
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button4) {
                    new Login("textField1", "textField2");
                    frame1.setVisible(false);
                }
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button5) {
                    new Login("textField1", "textField2");
                    frame1.setVisible(false);
                }
            }
        });

    }
}