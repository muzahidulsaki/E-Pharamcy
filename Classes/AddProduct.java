package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.io.*;
import java.awt.Cursor;
import java.time.*;
import java.time.format.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class AddProduct extends AddProductCond{                                                      //ADD PRODUCT

    JFrame frame;
    JLabel label1, title1;
    JLabel  name, mg_ml, lebel12, logo;
    
    JTextField  field5, field6, field7;
    JButton  b3, b4, b12;
    
  
    ImageIcon i1;

    AddProduct(String textField5,String textField6,String textField7) {
        super(textField5, textField6, textField7);
        frame = new JFrame();

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        logo = new JLabel();
        logo.setIcon(new ImageIcon("image/logo1.png"));
        Dimension size = logo.getPreferredSize();
        logo.setBounds(80, 10, size.width, size.height);
        frame.add(logo);


        b12 = new JButton("Sign Out");
        b12.setBounds(1260, 50, 90, 25);
        b12.setFont(new Font("Segoe UI", Font.BOLD, 16));
        b12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b12.setFocusPainted(false);
        b12.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b12.setContentAreaFilled(false);
        frame.add(b12);

        b3 = new JButton();
        b3.setIcon(new ImageIcon("image/return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);
        frame.add(b3);


        title1 = new JLabel("Add New Product");
        title1.setBounds(450, 157, 500, 60);
        title1.setForeground(Color.black);
        title1.setFont(new Font("Segoe UI", Font.BOLD, 40));
        frame.add(title1);

        name = new JLabel("Name");
        name.setBounds(400, 250, 100, 40);
        name.setForeground(Color.black);
        name.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        frame.add(name);

        field5 = new JTextField();
        field5.setBounds(510, 255, 250, 30);
        field5.setForeground(Color.black);
        field5.setCaretColor(Color.black);
        field5.setBorder(null);
        frame.add(field5);


        mg_ml = new JLabel("Mg/Ml");
        mg_ml.setBounds(400, 310, 200, 40);
        mg_ml.setForeground(Color.black);
        mg_ml.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        frame.add(mg_ml);

        field6 = new JTextField();
        field6.setBounds(510, 315, 250, 30);
        field6.setForeground(Color.black);
        field6.setBorder(null);
        frame.add(field6);


        lebel12 = new JLabel("Price");
        lebel12.setBounds(400, 360, 200, 40);
        lebel12.setForeground(Color.black);
        lebel12.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        frame.add(lebel12);

        field7 = new JTextField();
        field7.setBounds(510, 365, 250, 30);
        field7.setForeground(Color.black);
        field7.setBorder(null);
        frame.add(field7);

        b4 = new JButton("Submit");
        b4.setBounds(520, 430, 135, 40);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 20));
        b4.setBackground(Color.red);
        b4.setForeground(Color.white);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
        frame.add(b4);

        frame.setSize(1366, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color (68, 185, 135));
        frame.setVisible(true);
        frame.setResizable(false);



        // Action
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b3) {
                    new AdminDashBoard("textField1");
                    frame.setVisible(false);
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textField5 = field5.getText().toLowerCase(); // User Name
                String textField6 = field6.getText(); // Password
                String textField7 = field7.getText(); // Retype Password

                int result = 0;

                if ( textField5.isEmpty() || textField6.isEmpty() || textField7.isEmpty()
                         ) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);

                } else {


                    addproduct(textField5, textField6, textField7);

                    if (s == 1) {
                        frame.setVisible(false);
                    }




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
