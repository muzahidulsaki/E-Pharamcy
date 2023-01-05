package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class Product1 {

    JFrame frame;
    JLabel logo1, slogan1, slogan2, acelex1, acelex, genric, company, price,qntity;
    JButton  retrn, buynow;
    JComboBox cb1;
    ImageIcon i1;

    Product1(String textField1) {

        frame = new JFrame();

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        logo1 = new JLabel();
        logo1.setIcon(new ImageIcon("image/logo1.png"));
        Dimension size = logo1.getPreferredSize();
        logo1.setBounds(80, 10, size.width, size.height);
        frame.add(logo1);


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
        frame.add(slogan1);


        slogan2 = new JLabel("Trust in Us for All Your Healthcare Needs");
        slogan2.setBounds(220, 85, 500, 60);
        slogan2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        frame.add(slogan2);


        acelex1 = new JLabel("Acelex");
        acelex1.setBounds(600, 190, 1400, 40);
        acelex1.setFont(new Font("Serif", Font.BOLD, 22));

        acelex = new JLabel(new ImageIcon("image/Acelex1.png"));
        // Dimension size1 = acelex.getPreferredSize();
        // acelex.setBounds(100, 180, size1.width, size1.height);
        acelex.setBounds(100, 180, 450, 400);

        genric = new JLabel("Generics:Cephalexin 250mg");
        genric.setBounds(610, 230, 290, 40);
        genric.setFont(new Font("Serif", Font.PLAIN, 15));

        company = new JLabel("The ACME Laboratories Ltd.");
        company.setBounds(610, 270, 240, 40);
        company.setFont(new Font("Serif", Font.PLAIN, 15));

        price = new JLabel("BDT 6.36 ");
        price.setBounds(610, 380, 270, 40);
        price.setFont(new Font("Serif", Font.BOLD, 35));
        

        qntity = new JLabel("Quantity");
        qntity.setBounds(610, 330, 240, 40);
        qntity.setFont(new Font("Serif", Font.BOLD, 18));

        String quantity[] = { "1", "2", "3", "4", "4", "5", "6", "7", "8", "9", "10" };
        cb1 = new JComboBox(quantity);
        cb1.setBounds(690, 340, 60, 20);

        // adding lebel


        frame.add(acelex1);
        frame.add(acelex);
        frame.add(genric);
        frame.add(company);
        frame.add(price);
        frame.add(qntity);

        frame.add(retrn);
        frame.add(buynow);

        // add
        frame.add(cb1);
        frame.add(logo1);

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
