package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;


public class Category {

    JFrame frame;
    JLabel title,slogan,logo;
    JButton abaclor, acelex, napa2, progut3, progut2, penvik2, penvik1, sergel2,napa1,progut1,sergel1;
    JButton price1, price2, price3, price4, price5, price6, price7, price8,price9,price10,price11;
    JButton  ifno, acelex2, napa22, progut33, progut22, penvik22, penvik11, segel22, napa11, progut11,sergel11;
    JButton back,signout;
    JButton retrn;
    JButton showproduct;

  
    ImageIcon i1;


    Category(String textField1) {

        frame = new JFrame();
        
        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        logo = new JLabel();
        logo.setIcon(new ImageIcon("image/logo1.png"));
        Dimension size = logo.getPreferredSize();
        logo.setBounds(80, 10, size.width, size.height);
        frame.add(logo);

        title = new JLabel("e-Pharamcy");
        title.setBounds(215, 30, 800, 80);
        title.setFont(new Font("Segoe UI", Font.BOLD, 50));
        frame.add(title);


        slogan = new JLabel("Trust in Us for All Your Healthcare Needs");
        slogan.setBounds(220, 85, 500, 60);
        slogan.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        frame.add(slogan);

         retrn = new JButton();
         retrn.setIcon(new ImageIcon("image/return.png"));
         retrn.setBounds(15, 8, 35, 40);
         retrn.setFont(new Font("Segeo UI", Font.BOLD, 40));
         retrn.setForeground(Color.black);
         retrn.setBorderPainted(false);
         retrn.setFocusPainted(false);    // boxer dag ba area dekha jabe..
         retrn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
         retrn.setCursor(new Cursor(Cursor.HAND_CURSOR));
         retrn.setContentAreaFilled(false);
         frame.add(retrn);

         showproduct = new JButton("All Product");
         showproduct.setBounds(1110, 540, 210, 41);
         showproduct.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
         showproduct.setForeground(new Color(255, 255, 255));
         showproduct.setBackground(new Color(255, 0, 0));
         showproduct.setCursor(new Cursor(Cursor.HAND_CURSOR));
         showproduct.setFocusPainted(false);
         frame.add(showproduct);

        back = new JButton();
        back.setIcon(new ImageIcon("image/return.png"));
        back.setBounds(15, 8, 35, 40);
        back.setFont(new Font("Segoe UI", Font.BOLD, 25));
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setFocusPainted(false);
        back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        back.setContentAreaFilled(false);
        frame.add(back);

        signout = new JButton("Sign Out");
        signout.setBounds(1260, 50, 90, 25);
        signout.setFont(new Font("Segoe UI", Font.BOLD, 16));
        signout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signout.setFocusPainted(false);
        signout.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        signout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signout.setContentAreaFilled(false);
        frame.add(signout);


        ifno = new JButton();
        ifno.setIcon(new ImageIcon("image/ifno.png"));
        ifno.setBounds(60, 180, 150, 120);
        ifno.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ifno.setBorder(BorderFactory.createEmptyBorder(1, 4, 1, 4));
        ifno.setBackground(Color.white);
        ifno.setFocusPainted(false);
        frame.add(ifno);
        abaclor = new JButton("Abaclor 100ml");
        abaclor.setBounds(60, 310, 170, 35);
        abaclor.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        abaclor.setFocusPainted(false);
        abaclor.setHorizontalAlignment(SwingConstants.LEFT);
        abaclor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        abaclor.setContentAreaFilled(false);
        abaclor.setBorderPainted(false);
        price1 = new JButton("৳193.30 tk");
        price1.setBounds(60, 340, 150, 35);
        price1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        price1.setFocusPainted(false);
        price1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        price1.setHorizontalAlignment(SwingConstants.LEFT);
        price1.setContentAreaFilled(false);
        price1.setBorderPainted(false);
        frame.add(abaclor);
        frame.add(price1);

        acelex2 = new JButton();
        acelex2.setIcon(new ImageIcon("image/Acelex.png"));
        acelex2.setBounds(270, 180, 150, 120);
        acelex2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        acelex2.setBorder(BorderFactory.createEmptyBorder(1, 4, 1, 4));
        acelex2.setBackground(Color.white);
        acelex2.setFocusPainted(false);
        frame.add(acelex2);
        acelex = new JButton("Acelex 250mg");
        acelex.setBounds(270, 310, 170, 35);
        acelex.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        acelex.setFocusPainted(false);
        acelex.setHorizontalAlignment(SwingConstants.LEFT);
        acelex.setCursor(new Cursor(Cursor.HAND_CURSOR));
        acelex.setContentAreaFilled(false);
        acelex.setBorderPainted(false);
        price2 = new JButton("৳6.36 tk");
        price2.setBounds(270, 340, 150, 35);
        price2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        price2.setFocusPainted(false);
        price2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        price2.setHorizontalAlignment(SwingConstants.LEFT);
        price2.setContentAreaFilled(false);
        price2.setBorderPainted(false);
        frame.add(acelex);
        frame.add(price2);

        napa22 = new JButton();
        napa22.setIcon(new ImageIcon("image/napa.png"));
        napa22.setBounds(480, 180, 150, 120);
        napa22.setCursor(new Cursor(Cursor.HAND_CURSOR));
        napa22.setBorder(BorderFactory.createEmptyBorder(1, 4, 1, 4));
        napa22.setBackground(Color.white);
        napa22.setFocusPainted(false);
        frame.add(napa22);
        napa2 = new JButton("Napa 500mg");
        napa2.setBounds(480, 310, 170, 35);
        napa2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        napa2.setFocusPainted(false);
        napa2.setHorizontalAlignment(SwingConstants.LEFT);
        napa2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        napa2.setContentAreaFilled(false);
        napa2.setBorderPainted(false);
        price3 = new JButton("৳1.20 tk");
        price3.setBounds(480, 340, 150, 35);
        price3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        price3.setFocusPainted(false);
        price3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        price3.setHorizontalAlignment(SwingConstants.LEFT);
        price3.setContentAreaFilled(false);
        price3.setBorderPainted(false);
        frame.add(napa2);
        frame.add(price3);

        progut33 = new JButton();
        progut33.setIcon(new ImageIcon("image/progut.png"));
        progut33.setBounds(690, 180, 150, 120);
        progut33.setCursor(new Cursor(Cursor.HAND_CURSOR));
        progut33.setBorder(BorderFactory.createEmptyBorder(1, 4, 1, 4));
        progut33.setBackground(Color.white);
        progut33.setFocusPainted(false);
        frame.add(progut33);
        progut3 = new JButton("Progut 20mg");
        progut3.setBounds(690, 310, 170, 35);
        progut3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        progut3.setFocusPainted(false);
        progut3.setHorizontalAlignment(SwingConstants.LEFT);
        progut3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        progut3.setContentAreaFilled(false);
        progut3.setBorderPainted(false);
        price4 = new JButton("৳7.00 tk");
        price4.setBounds(690, 340, 150, 35);
        price4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        price4.setFocusPainted(false);
        price4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        price4.setHorizontalAlignment(SwingConstants.LEFT);
        price4.setContentAreaFilled(false);
        price4.setBorderPainted(false);
        frame.add(progut3);
        frame.add(price4);

        progut22 = new JButton();
        progut22.setIcon(new ImageIcon("image/progut.png"));
        progut22.setBounds(900, 180, 150, 120);
        progut22.setCursor(new Cursor(Cursor.HAND_CURSOR));
        progut22.setBorder(BorderFactory.createEmptyBorder(1, 4, 1, 4));
        progut22.setBackground(Color.white);
        progut22.setFocusPainted(false);
        frame.add(progut22);
        progut2 = new JButton("Progut 20mg");
        progut2.setBounds(900, 310, 170, 35);
        progut2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        progut2.setFocusPainted(false);
        progut2.setHorizontalAlignment(SwingConstants.LEFT);
        progut2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        progut2.setContentAreaFilled(false);
        progut2.setBorderPainted(false);
        price5 = new JButton("৳7.00 tk");
        price5.setBounds(900, 340, 150, 35);
        price5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        price5.setFocusPainted(false);
        price5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        price5.setHorizontalAlignment(SwingConstants.LEFT);
        price5.setContentAreaFilled(false);
        price5.setBorderPainted(false);
        frame.add(progut2);
        frame.add(price5);

        penvik22 = new JButton();
        penvik22.setIcon(new ImageIcon("image/penvikds.png"));
        penvik22.setBounds(1110, 180, 150, 120);
        penvik22.setCursor(new Cursor(Cursor.HAND_CURSOR));
        penvik22.setBorder(BorderFactory.createEmptyBorder(1, 4, 1, 4));
        penvik22.setBackground(Color.white);
        penvik22.setFocusPainted(false);
        frame.add(penvik22);
        penvik2 = new JButton("Penvik Ds 20mg");
        penvik2.setBounds(1110, 310, 170, 35);
        penvik2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        penvik2.setFocusPainted(false);
        penvik2.setHorizontalAlignment(SwingConstants.LEFT);
        penvik2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        penvik2.setContentAreaFilled(false);
        penvik2.setBorderPainted(false);
        price6 = new JButton("৳4.44 tk");
        price6.setBounds(1110, 340, 150, 35);
        price6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        price6.setFocusPainted(false);
        price6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        price6.setHorizontalAlignment(SwingConstants.LEFT);
        price6.setContentAreaFilled(false);
        price6.setBorderPainted(false);
        frame.add(penvik2);
        frame.add(price6);

/////////////////////////////////////////////////////////////////////////////////////////////

        penvik11 = new JButton();
        penvik11.setIcon(new ImageIcon("image/penvikds.png"));
        penvik11.setBounds(60, 460, 150, 120);
        penvik11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        penvik11.setBorder(BorderFactory.createEmptyBorder(1, 4, 1, 4));
        penvik11.setBackground(Color.white);
        penvik11.setFocusPainted(false);
        frame.add(penvik11);
        penvik1 = new JButton("Penvik Ds 20mg");
        penvik1.setBounds(60, 590, 170, 35);
        penvik1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        penvik1.setFocusPainted(false);
        penvik1.setHorizontalAlignment(SwingConstants.LEFT);
        penvik1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        penvik1.setContentAreaFilled(false);
        penvik1.setBorderPainted(false);
        price7 = new JButton("৳4.44 tk");
        price7.setBounds(60, 620, 150, 35);
        price7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        price7.setFocusPainted(false);
        price7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        price7.setHorizontalAlignment(SwingConstants.LEFT);
        price7.setContentAreaFilled(false);
        price7.setBorderPainted(false);
        frame.add(penvik1);
        frame.add(price7);

        segel22 = new JButton();
        segel22.setIcon(new ImageIcon("image/Sergel.png"));
        segel22.setBounds(270, 460, 150, 120);
        segel22.setCursor(new Cursor(Cursor.HAND_CURSOR));
        segel22.setBorder(BorderFactory.createEmptyBorder(1, 4, 1, 4));
        segel22.setBackground(Color.white);
        segel22.setFocusPainted(false);
        frame.add(segel22);
        sergel2 = new JButton("Sergel 20mg");
        sergel2.setBounds(270, 590, 170, 35);
        sergel2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        sergel2.setFocusPainted(false);
        sergel2.setHorizontalAlignment(SwingConstants.LEFT);
        sergel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sergel2.setContentAreaFilled(false);
        sergel2.setBorderPainted(false);
        price8 = new JButton("৳7.00 tk");
        price8.setBounds(270, 620, 150, 35);
        price8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        price8.setFocusPainted(false);
        price8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        price8.setHorizontalAlignment(SwingConstants.LEFT);
        price8.setContentAreaFilled(false);
        price8.setBorderPainted(false);
        frame.add(sergel2);
        frame.add(price8);

        napa11 = new JButton();
        napa11.setIcon(new ImageIcon("image/napa.png"));
        napa11.setBounds(480, 460, 150, 120);
        napa11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        napa11.setBorder(BorderFactory.createEmptyBorder(1, 4, 1, 4));
        napa11.setBackground(Color.white);
        napa11.setFocusPainted(false);
        frame.add(napa11);
        napa1 = new JButton("Napa 500mg");
        napa1.setBounds(480, 590, 170, 35);
        napa1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        napa1.setFocusPainted(false);
        napa1.setHorizontalAlignment(SwingConstants.LEFT);
        napa1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        napa1.setContentAreaFilled(false);
        napa1.setBorderPainted(false);
        price9 = new JButton("৳1.20 tk");
        price9.setBounds(480, 620, 150, 35);
        price9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        price9.setFocusPainted(false);
        price9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        price9.setHorizontalAlignment(SwingConstants.LEFT);
        price9.setContentAreaFilled(false);
        price9.setBorderPainted(false);
        frame.add(napa1);
        frame.add(price9);

        progut11 = new JButton();
        progut11.setIcon(new ImageIcon("image/progut.png"));
        progut11.setBounds(690, 460, 150, 120);
        progut11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        progut11.setBorder(BorderFactory.createEmptyBorder(1, 4, 1, 4));
        progut11.setBackground(Color.white);
        progut11.setFocusPainted(false);
        frame.add(progut11);
        progut1 = new JButton("Progut 20mg");
        progut1.setBounds(690, 590, 170, 35);
        progut1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        progut1.setFocusPainted(false);
        progut1.setHorizontalAlignment(SwingConstants.LEFT);
        progut1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        progut1.setContentAreaFilled(false);
        progut1.setBorderPainted(false);
        price10 = new JButton("৳7.00 tk");
        price10.setBounds(690, 620, 150, 35);
        price10.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        price10.setFocusPainted(false);
        price10.setCursor(new Cursor(Cursor.HAND_CURSOR));
        price10.setHorizontalAlignment(SwingConstants.LEFT);
        price10.setContentAreaFilled(false);
        price10.setBorderPainted(false);
        frame.add(progut1);
        frame.add(price10);

        sergel11 = new JButton();
        sergel11.setIcon(new ImageIcon("image/Sergel.png"));
        sergel11.setBounds(900, 460, 150, 120);
        sergel11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sergel11.setBorder(BorderFactory.createEmptyBorder(1, 4, 1, 4));
        sergel11.setBackground(Color.white);
        sergel11.setFocusPainted(false);
        frame.add(sergel11);
        sergel1 = new JButton("Sergel 20mg");
        sergel1.setBounds(900, 590, 170, 35);
        sergel1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        sergel1.setFocusPainted(false);
        sergel1.setHorizontalAlignment(SwingConstants.LEFT);
        sergel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sergel1.setContentAreaFilled(false);
        sergel1.setBorderPainted(false);
        price11 = new JButton("৳7.00 tk");
        price11.setBounds(900, 620, 150, 35);
        price11.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        price11.setFocusPainted(false);
        price11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        price11.setHorizontalAlignment(SwingConstants.LEFT);
        price11.setContentAreaFilled(false);
        price11.setBorderPainted(false);
        frame.add(sergel1);
        frame.add(price11);


//////////////////////////////////////////////////////////////////////////////////////////////
        frame.setSize(1366, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color (68, 185, 135));


     retrn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

       if (e.getSource() == retrn) {
        new  UserDashBoard("textField1");
        frame.setVisible(false);
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

     showproduct.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

       if (e.getSource() == showproduct) {
        new ShowProduct("textField1");
        frame.setVisible(false);
       }
      }
     });


        acelex2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == acelex2) {
                    new Product1(textField1);
                    frame.setVisible(false);
                }
            }
        });
        acelex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == acelex) {
                    new Product1(textField1);
                    frame.setVisible(false);
                }
            }
        });



        ifno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == ifno) {
                    new Product2(textField1);
                    frame.setVisible(false);
                }
            }
        });

        abaclor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == abaclor) {
                    new Product2(textField1);
                    frame.setVisible(false);
                }
            }
        });


    }
}
