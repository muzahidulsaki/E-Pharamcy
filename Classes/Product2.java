package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class Product2 {

    JFrame frame;
    JLabel logo, slogan1, slogan2,  Abaclo1, Abaclo11, generics1, company1, price, qntity;
    JButton  retrn, buynow;
    JComboBox cb1;
    ImageIcon i1;

    Product2(String textField1) {

        frame = new JFrame();

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        logo = new JLabel();
        logo.setIcon(new ImageIcon("image/logo1.png"));
        Dimension size = logo.getPreferredSize();
        logo.setBounds(80, 10, size.width, size.height);

        retrn = new JButton();
        retrn.setIcon(new ImageIcon("image/return.png"));
        retrn.setBounds(15, 8, 35, 40);
        retrn.setFont(new Font("Segoe UI", Font.BOLD, 25));
        retrn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        retrn.setFocusPainted(false);
        retrn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        retrn.setContentAreaFilled(false);

        buynow = new JButton("Buy Now");
        buynow.setBounds(610, 490, 250, 60);
        buynow.setForeground(Color.white);
        buynow.setFont(new Font("Serif", Font.BOLD, 30));
        buynow.setBackground(Color.red);
        buynow.setFocusPainted(false);

        slogan1 = new JLabel("e-Pharamcy");
        slogan1.setBounds(215, 30, 800, 80);
        slogan1.setFont(new Font("Segoe UI", Font.BOLD, 50));

        slogan2 = new JLabel("Trust in Us for All Your Healthcare Needs");
        slogan2.setBounds(220, 85, 500, 60);
        slogan2.setFont(new Font("Segoe UI", Font.PLAIN, 20));


        Abaclo1 = new JLabel("Abaclor");
        Abaclo1.setBounds(600, 190, 1400, 40);
        Abaclo1.setFont(new Font("Serif", Font.BOLD, 22));

        Abaclo11 = new JLabel(new ImageIcon("image/abaclor1.png"));
        // Dimension size1 = Abaclo11.getPreferredSize();
        // Abaclo11.setBounds(100, 180, size1.width, size1.height);
        Abaclo11.setBounds(100, 180, 450, 400);

        generics1 = new JLabel("Generics:Cefaclor Monohydrate 125/5mg/ml");
        generics1.setBounds(610, 230, 290, 40);
        generics1.setFont(new Font("Serif", Font.PLAIN, 15));

        company1 = new JLabel("ACI Limited");
        company1.setBounds(610, 270, 240, 40);
        company1.setFont(new Font("Serif", Font.PLAIN, 15));

        price = new JLabel("BDT 193.30 ");
        price.setBounds(610, 380, 240, 40);
        price.setFont(new Font("Serif", Font.BOLD, 35));
        
        qntity = new JLabel("Quantity");
        qntity.setBounds(610, 330, 240, 40);
        qntity.setFont(new Font("Serif", Font.BOLD, 18));

        String quantity[] = { "1", "2", "3", "4", "4", "5", "6", "7", "8", "9", "10" };
        cb1 = new JComboBox(quantity);
        cb1.setBounds(690, 340, 60, 20);

        // adding lebel

        frame.add(logo);
        frame.add(slogan1);
        frame.add(slogan2);
        frame.add(Abaclo1);
        frame.add(Abaclo11);
        frame.add(generics1);
        frame.add(company1);
        frame.add(price);
        frame.add(qntity);

        frame.add(retrn);
        frame.add(buynow);

        // add
        frame.add(cb1);

        frame.setSize(1366, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        // Action

        retrn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == retrn) {
                    new Category(textField1);
                    frame.setVisible(false);
                }
            }
        });

        buynow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == buynow) {
                    new Payment(textField1);
                    frame.setVisible(false);
                }
            }
        });

    }

}
