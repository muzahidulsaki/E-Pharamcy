package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class UserDashBoard {

    JFrame frame;
    JLabel background, slogan1, L_online, L_pharma, userid,slogan2,slogan3;
    JButton buy,signout, B_return;
    ImageIcon i1;

    UserDashBoard(String textField1) {

        frame = new JFrame();

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        background = new JLabel();
        background.setIcon(new ImageIcon("image/dashboard2.jpg"));
        Dimension sizee = background.getPreferredSize();
        background.setBounds(0, 0,1366,768);
        frame.add(background);


        B_return = new JButton();
        B_return.setIcon(new ImageIcon("image/return.png"));
        B_return.setBounds(15, 8, 35, 40);
        B_return.setFont(new Font("Segoe UI", Font.BOLD, 25));
        B_return.setCursor(new Cursor(Cursor.HAND_CURSOR));
        B_return.setFocusPainted(false);
        B_return.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        B_return.setContentAreaFilled(false);
        background.add(B_return);

        userid = new JLabel("User :" + " " + textField1);
        userid.setBounds(1150, 50, 120, 25);
        userid.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        background.add(userid);

        slogan1 = new JLabel("Welcome to e-Pharmacy");
        slogan1.setBounds(150, 20, 800, 80);
        slogan1.setFont(new Font("Segoe UI", Font.BOLD, 40));
        background.add(slogan1);

        L_online = new JLabel("ONLINE");
        L_online.setBounds(355, 200, 600, 55);
        L_online.setFont(new Font("Segoe UI Black", Font.BOLD, 50));
        background.add(L_online);

        L_pharma = new JLabel("PHARMACY");
        L_pharma.setBounds(355, 245, 600, 70);
        L_pharma.setFont(new Font("Segoe UI Black", Font.BOLD, 50));
        background.add(L_pharma);

        slogan2 = new JLabel("Trust in Us for All Your Healthcare Needs,");
        slogan2.setBounds(355, 320, 500, 30);
        slogan2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        background.add(slogan2);

        slogan3 = new JLabel("Your Health is Our Priority.");
        slogan3.setBounds(355, 350, 500, 30);
        slogan3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        background.add(slogan3);

        buy = new JButton("BUY");
        buy.setBounds(370, 385, 120, 45);
        buy.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
        buy.setForeground(new Color(255, 255, 255));
        buy.setBackground(new Color(255, 0, 0));
        buy.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buy.setFocusPainted(false);
        background.add(buy);

        signout = new JButton("Sign Out");
        signout.setBounds(1260, 50, 90, 25);
        signout.setFont(new Font("Segoe UI", Font.BOLD, 16));
        signout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signout.setFocusPainted(false);
        signout.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        signout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signout.setContentAreaFilled(false);
        background.add(signout);




        frame.setSize(1366, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        // Action

        signout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == signout) {
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

        buy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == buy) {
                    new Category("textField1");
                    frame.setVisible(false);
                }
            }
        });

        B_return.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == B_return) {
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });






    }
}
