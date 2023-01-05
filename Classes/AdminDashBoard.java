package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminDashBoard extends JFrame {

    JFrame frame;
    JLabel  title, user1, logo;
    JButton retrn, signout;
    JButton prdctInfo, addP, addminInfo, addadmin;
    ImageIcon i1;

    AdminDashBoard(String textField1) {

        frame = new JFrame();

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        logo = new JLabel();
        logo.setIcon(new ImageIcon("image/logo1.png"));
        Dimension size = logo.getPreferredSize();
        logo.setBounds(80, 10, size.width, size.height);
        frame.add(logo);


        retrn = new JButton();
        retrn.setIcon(new ImageIcon("image/return.png"));
        retrn.setBounds(15, 8, 35, 40);
        // retrn.setForeground(Color.white);
        retrn.setFont(new Font("Segoe UI", Font.BOLD, 25));
        retrn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        retrn.setFocusPainted(false);
        retrn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        retrn.setContentAreaFilled(false);
        frame.add(retrn);

        title = new JLabel("Admin Dashboard");
        title.setBounds(435, 200, 500, 40);
        title.setForeground(Color.black);
        title.setFont(new Font("Segoe UI", Font.BOLD, 45));
        frame.add(title);


        prdctInfo = new JButton("Product Info");
        prdctInfo.setBounds(470, 300, 300, 40);
        prdctInfo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        prdctInfo.setForeground(Color.red);
        prdctInfo.setBackground(Color.white);
        prdctInfo.setFocusPainted(false);
        prdctInfo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        prdctInfo.setBorderPainted(false);
        frame.add(prdctInfo);


        addP = new JButton("Add Product");
        addP.setBounds(470, 370, 300, 40);
        addP.setFont(new Font("Segoe UI", Font.BOLD, 20));
        addP.setForeground(Color.red);
        addP.setBackground(Color.white);
        addP.setFocusPainted(false);
        addP.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addP.setBorderPainted(false);
        frame.add(addP);


        addminInfo = new JButton("Admin Information");
        addminInfo.setBounds(470, 440, 300, 40);
        addminInfo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        addminInfo.setForeground(Color.red);
        addminInfo.setBackground(Color.white);
        addminInfo.setFocusPainted(false);
        addminInfo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addminInfo.setBorderPainted(false);
        frame.add(addminInfo);

        addadmin = new JButton("Add New Admin");
        addadmin.setBounds(470, 510, 300, 40);
        addadmin.setFont(new Font("Segoe UI", Font.BOLD, 20));
        addadmin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addadmin.setForeground(Color.red);
        addadmin.setBackground(Color.white);
        addadmin.setBorderPainted(false);
        addadmin.setFocusPainted(false);
        frame.add(addadmin);

        user1 = new JLabel("User :" + " " +textField1);
        user1.setBounds(1150, 50, 120, 25);
        user1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        frame.add(user1);

        signout = new JButton("Sign Out");
        signout.setBounds(1260, 50, 90, 25);
        signout.setFont(new Font("Segoe UI", Font.BOLD, 16));
        signout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signout.setFocusPainted(false);
        signout.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        signout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signout.setContentAreaFilled(false);
        frame.add(signout);
        // adding lebel


        frame.setSize(1366, 768);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color (68, 185, 135));



        retrn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == retrn) {
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

        // option

     prdctInfo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

             if (e.getSource() == prdctInfo) {
                 showMessageDialog(null, " Coming Soon... ", "Message", 1);
             }
         }
     });


        addP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == addP) {
                    new AddProduct("textField5","textField6","textField7");
                    frame.setVisible(false);
                }
            }
        });

        addminInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == addminInfo) {
                    showMessageDialog(null, " Not available now ", "Message", 1);
                }
            }
        });


        addadmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == addadmin) {
                    showMessageDialog(null, " Coming Soon... ", "Message", 1);
                }
            }
        });

        signout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == signout) {
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

    }
}
