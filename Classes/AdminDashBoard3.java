package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.io.*;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminDashBoard3 {

    JFrame frame;
    JLabel label1, label2, label3, label4;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, lp1;
    JPanel panel1;
    JTextField tf1;
    JPasswordField pf1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
    ImageIcon i1;

    AdminDashBoard3(String textField1) {

        frame = new JFrame();
        frame.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        panel1 = new JPanel();
        panel1.setBounds(0, 0, 700, 768);
        panel1.setBackground(new Color(25, 118, 211));

        lp1 = new JLabel();
        lp1.setIcon(new ImageIcon("image/addadmin2.png"));
        Dimension size = lp1.getPreferredSize();
        lp1.setBounds(100, 120, size.width, size.height);

        label1 = new JLabel();
        label1.setIcon(new ImageIcon("image/back.png"));
        Dimension size1 = label1.getPreferredSize();
        label1.setBounds(0, 0, size1.width, size1.height);

        b1 = new JButton("X");
        b1.setBounds(1320, 4, 30, 40);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton("-");
        b2.setBounds(1290, 4, 25, 30);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);

        b3 = new JButton();
        b3.setIcon(new ImageIcon("image/return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);

        b4 = new JButton("Add New Admin");
        b4.setBounds(850, 550, 400, 40);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b4.setForeground(new Color(25, 118, 211));
        b4.setBackground(new Color(255, 255, 255));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);

        label2 = new JLabel("");
        label2.setBounds(850, 80, 500, 40);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 40));

        l1 = new JLabel("Add New Admin");
        l1.setBounds(930, 180, 300, 60);
        l1.setForeground(Color.black);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 35));

        l3 = new JLabel("User Name");
        l3.setBounds(850, 280, 300, 40);
        l3.setForeground(Color.black);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l4 = new JLabel("Password");
        l4.setBounds(850, 380, 150, 40);
        l4.setForeground(Color.black);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l6 = new JLabel("________________________________________________________");
        l6.setBounds(850, 330, 400, 40);
        l6.setForeground(Color.black);
        l6.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        l7 = new JLabel("________________________________________________________");
        l7.setBounds(850, 430, 400, 40);
        l7.setForeground(Color.black);
        l7.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        tf1 = new JTextField();
        tf1.setBounds(855, 320, 380, 30);
        tf1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        tf1.setForeground(Color.black);
        tf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        tf1.setCaretColor(Color.black);
        tf1.setBorder(null);
        tf1.setOpaque(false);

        pf1 = new JPasswordField();
        pf1.setBounds(855, 420, 380, 30);
        pf1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        pf1.setForeground(Color.black);
        pf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pf1.setCaretColor(Color.black);
        pf1.setBorder(null);
        pf1.setOpaque(false);

        

        b12 = new JButton();
        b12.setIcon(new ImageIcon("image/icon2.png"));
        b12.setBounds(1250, 430, 25, 20);
        b12.setForeground(Color.black);
        b12.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        b12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b12.setFocusPainted(false);
        b12.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b12.setContentAreaFilled(false);

        b13 = new JButton();
        b13.setIcon(new ImageIcon("image/icon3.png"));
        b13.setBounds(1250, 430, 25, 20);
        b13.setForeground(Color.black);
        b13.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        b13.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b13.setFocusPainted(false);
        b13.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b13.setContentAreaFilled(false);
        b13.setVisible(false);

        label3 = new JLabel("User :" + " " + textField1);
        label3.setBounds(1150, 50, 120, 25);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        b12 = new JButton("Sign Out");
        b12.setBounds(1260, 50, 90, 25);
        b12.setFont(new Font("Segoe UI", Font.BOLD, 16));
        b12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b12.setFocusPainted(false);
        b12.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b12.setContentAreaFilled(false);

        frame.add(label3);
        frame.add(b12);

        // adding lebel

        frame.add(label1);
        frame.add(label2);
        frame.add(l1);
        frame.add(l3);
        frame.add(l4);
        frame.add(l6);
        frame.add(l7);
        frame.add(lp1);

        frame.add(tf1);
        frame.add(pf1);

        // adding button

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b12);
        frame.add(b13);

        // add
        frame.add(label1);
        frame.add(panel1);

        frame.setSize(1366, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        // Action
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b1) {
                    frame.setVisible(false);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b2) {
                    frame.setState(Frame.ICONIFIED);
                }

            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b3) {
                    new AdminDashBoard(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = pf1.getText(); // Password

                if ((!textField1.isEmpty() || !textField2.isEmpty())) {

                    try {
                        File file = new File(".\\Data\\admin_data.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        pw.println("User Name: " + textField1);
                        pw.println("Password: " + textField2);
                        pw.println();
                        pw.println("-------------------------");
                        pw.println();
                        pw.close();

                        showMessageDialog(null, " New Admin Added Succesfully", "Registration Complete", 1);
                        new AdminDashBoard3(textField1);
                        frame.setVisible(false);
                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    // frame2.setVisible(true);
                }
            }
        });

        

        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b12) {
                    if (pf1.getEchoChar() != '\u0000') {
                        pf1.setEchoChar('\u0000');
                        b12.setVisible(false);
                        b13.setVisible(true);
                    }
                }
            }
        });

        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b13) {
                    pf1.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
                    b13.setVisible(false);
                    b12.setVisible(true);
                } else {
                }
            }
        });

        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b12) {
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

    }
}
