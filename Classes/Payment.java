package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class Payment {
    JFrame frame;
    JLabel  cardNo, nameCard, Expire, cvv, payMe, secure;
    JButton retrn, pay;
    JTextField text1, text2, text3, text4;
    ImageIcon i1;

    Payment(String textField1) {

        frame = new JFrame();

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());



        retrn = new JButton();
        retrn.setIcon(new ImageIcon("image/return.png"));
        retrn.setBounds(15, 8, 35, 40);
        retrn.setFont(new Font("Segoe UI", Font.BOLD, 25));
        retrn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        retrn.setFocusPainted(false);
        retrn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        retrn.setContentAreaFilled(false);
        frame.add(retrn);



        pay = new JButton();
        pay.setBounds(450, 550, 400, 40);
        pay.setFont(new Font("Segoe UI", Font.BOLD, 25));
        pay.setBackground(Color.red);
        pay.setForeground(Color.white);
        pay.setFocusPainted(false);
        pay.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(pay);

        cardNo = new JLabel("*Card number");
        cardNo.setBounds(450, 260, 150, 40);
        cardNo.setFont(new Font("Serif", Font.PLAIN, 20));
        frame.add(cardNo);



        nameCard = new JLabel("*Name on card");
        nameCard.setBounds(450, 340, 150, 40);
        nameCard.setFont(new Font("Serif", Font.PLAIN, 20));
        frame.add(nameCard);


        Expire = new JLabel("*Expiration date");
        Expire.setBounds(450, 420, 150, 40);
        Expire.setFont(new Font("Serif", Font.PLAIN, 20));
        frame.add(Expire);


        cvv = new JLabel("*CVV");
        cvv.setBounds(700, 420, 100, 40);
        cvv.setFont(new Font("Serif", Font.PLAIN, 20));
        frame.add(cvv);


        payMe = new JLabel();
        payMe.setIcon(new ImageIcon("image/payment_mathod.png"));
        Dimension size1 = payMe.getPreferredSize();
        payMe.setBounds(450, 210, size1.width, size1.height);
        // payMe.setBounds(740, 120, 250, 100);
        frame.add(payMe);


        secure = new JLabel("Secure Payment");
        secure.setBounds(450, 120, 300, 50);
        secure.setFont(new Font("Serif", Font.BOLD, 42));
        frame.add(secure);

        text1 = new JTextField();
        text1.setBounds(450, 300, 400, 40);
        text1.setFont(new Font("Serif", Font.PLAIN, 18));

        text2 = new JTextField();
        text2.setBounds(450, 380, 400, 40);
        text2.setFont(new Font("Serif", Font.PLAIN, 18));

        text3 = new JTextField();
        text3.setBounds(450, 460, 200, 40);
        text3.setFont(new Font("Serif", Font.PLAIN, 18));

        text4 = new JTextField();
        text4.setBounds(700, 460, 150, 40);
        text4.setFont(new Font("Serif", Font.PLAIN, 18));

        
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);


        frame.setSize(1366, 768);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color (68, 185, 135));
        frame.setVisible(true);

      

        retrn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == retrn) {
                    new Category(textField1);
                    frame.setVisible(false);
                }
            }
        });

        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == pay) {
                    if (text1.getText().equals("") || text2.getText().equals("") || text3.getText().equals("")
                            || text4.getText().equals("")) {
                        showMessageDialog(null, " You need to give all information ", "Message",
                                -1);
                    }

                    else {
                        showMessageDialog(null, "Payment Complete", "Thank You", -1);
                        new UserDashBoard(textField1);
                        frame.setVisible(false);

                    }
                }
            }
        });

    }
}
