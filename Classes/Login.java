package Classes;
import java.awt.*;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Login extends LoginCond {
    JFrame f1;
    JPanel panel1;

    JLabel L_log, slogan, L_user, L_pass, l6, l7, slogan2, indexicon,bg,backg;
    JTextField F_text;
    JPasswordField F_passwrd;
    JButton forgetpass, log_in, sign_up, hide, show;
    JCheckBox rember;
    ImageIcon i1;
    JRadioButton r1, r2;
    ButtonGroup bg1;
    int pc = 0;

    public Login(String textField1, String textField2) {
        super(textField1, textField2);

        f1 = new JFrame();

        bg = new JLabel();
        bg.setIcon(new ImageIcon("image/loginbg.jpg"));
        Dimension sizee = bg.getPreferredSize();
        bg.setBounds(0, 0,1366,768);
        f1.add(bg);

        backg = new JLabel();
        backg.setIcon(new ImageIcon("image/panel1.jpg"));
        Dimension size = bg.getPreferredSize();
        backg.setBounds(430, 140,500,540);
        bg.add(backg);



        i1 = new ImageIcon("image/logo.png");
        f1.setIconImage(i1.getImage());

        L_log = new JLabel("Log In");
        L_log.setBounds(200, 15, 200, 70);
        L_log.setForeground(Color.red);
        L_log.setFont(new Font("Segoe UI", Font.BOLD, 35));
        backg.add(L_log);

        slogan = new JLabel("Hello! Let's get started");
        slogan.setBounds(150, 65, 300, 50);
        slogan.setForeground(Color.red);
        slogan.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        backg.add(slogan);

        bg1 = new ButtonGroup();
        r1 = new JRadioButton("Admin Login");
        r1.setBounds(80, 145, 150, 20);
        r1.setFont(new Font("Segoe UI", Font.BOLD, 15));
        r1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        r1.setForeground(Color.black);
        r1.setBorderPainted(false);
        r1.setContentAreaFilled(false);
        r1.setFocusPainted(false);

        r2 = new JRadioButton("User Login");
        r2.setBounds(255, 145, 150, 20);
        r2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        r2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        r2.setForeground(Color.black);
        r2.setBorderPainted(false);
        r2.setContentAreaFilled(false);
        r2.setFocusPainted(false);
        bg1.add(r1);
        bg1.add(r2);
        backg.add(r1);
        backg.add(r2);

        L_user = new JLabel("User Name");
        L_user.setBounds(40, 198, 300, 40);
        L_user.setForeground(Color.black);
        L_user.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        backg.add(L_user);

        F_text = new JTextField();
        F_text.setBounds(40, 240, 380, 30);
        F_text.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        F_text.setForeground(Color.black);
        F_text.setBorder(null);
        F_text.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        backg.add(F_text);


        L_pass = new JLabel("Password");
        L_pass.setBounds(40, 281, 150, 40);
        L_pass.setForeground(Color.black);
        L_pass.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        backg.add(L_pass);

        F_passwrd = new JPasswordField();
        F_passwrd.setBounds(40, 320, 380, 30);
        F_passwrd.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        F_passwrd.setForeground(Color.black);
        F_passwrd.setBorder(null);
        F_passwrd.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        backg.add(F_passwrd);



        indexicon = new JLabel();
        indexicon.setIcon(new ImageIcon("image/icon.png"));
        indexicon.setBounds(430, 216, 50, 80);
        indexicon.setForeground(Color.black);
        indexicon.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        backg.add(indexicon);


        hide = new JButton();
        hide.setIcon(new ImageIcon("image/icon2.png"));
        hide.setBounds(429, 325, 25, 20);
        hide.setForeground(Color.black);
        hide.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        hide.setCursor(new Cursor(Cursor.HAND_CURSOR));
        hide.setFocusPainted(false);
        hide.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        hide.setContentAreaFilled(false);
        backg.add(hide);

        show = new JButton();
        show.setIcon(new ImageIcon("image/icon1.png"));
        show.setBounds(429, 325, 25, 20);
        show.setForeground(Color.black);
        show.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        show.setCursor(new Cursor(Cursor.HAND_CURSOR));
        show.setFocusPainted(false);
        show.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        show.setContentAreaFilled(false);
        show.setVisible(false);
        backg.add(show);

        rember = new JCheckBox("Remember me");
        rember.setBounds(40, 355, 160, 40);
        rember.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        rember.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rember.setForeground(Color.black);
        rember.setFocusPainted(false);
        rember.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        rember.setContentAreaFilled(false);
        backg.add(rember);

        forgetpass = new JButton("Forgot Password?");
        forgetpass.setBounds(245, 355, 170, 40);
        forgetpass.setForeground(Color.black);
        forgetpass.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        forgetpass.setCursor(new Cursor(Cursor.HAND_CURSOR));
        forgetpass.setFocusPainted(false);
        forgetpass.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        forgetpass.setContentAreaFilled(false);
        backg.add(forgetpass);

        log_in = new JButton("Login");
        log_in.setBounds(40, 410, 400, 40);
        log_in.setFont(new Font("Segoe UI", Font.BOLD, 25));
        log_in.setForeground(new Color(255, 255, 255));
        log_in.setBackground(new Color(255, 0, 0));
        log_in.setCursor(new Cursor(Cursor.HAND_CURSOR));
        log_in.setFocusPainted(false);
        backg.add(log_in);

        slogan2 = new JLabel("Don't have an account?");
        slogan2.setBounds(100, 465, 240, 40);
        slogan2.setForeground(Color.black);
        slogan2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        backg.add(slogan2);

        sign_up = new JButton("Sign Up");
        sign_up.setBounds(325, 465, 90, 40);
        sign_up.setForeground(Color.white);
        sign_up.setFont(new Font("Segoe UI", Font.BOLD, 20));
        sign_up.setForeground(new Color(0, 0, 0));
        sign_up.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sign_up.setFocusPainted(false);
        sign_up.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        sign_up.setContentAreaFilled(false);
        backg.add(sign_up);


        f1.setSize(1366, 800);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setResizable(false);
        f1.getContentPane().setBackground(new Color (68, 185, 135));
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        sign_up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == sign_up) {
                    new Registration("textField5", "textField6", "textField4");
                    f1.setVisible(false);

                }
            }
        });

        hide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == hide) {
                    if (F_passwrd.getEchoChar() != '\u0000') {
                        F_passwrd.setEchoChar('\u0000');
                        hide.setVisible(false);
                        show.setVisible(true);
                    }
                }
            }
        });

        show.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == show) {
                    F_passwrd.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
                    show.setVisible(false);
                    hide.setVisible(true);
                } else {
                }
            }
        });


        r1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == r1) {
                    pc = 1;
                }
            }
        });

        r2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == r2) {
                    pc = 2;
                }
            }
        });

        log_in.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = F_text.getText().toLowerCase(); // User Name
                String textField2 = F_passwrd.getText(); // Password
                if (pc == 1) {
                    if ((!textField1.isEmpty() && !textField2.isEmpty())) {

                        matchAdmin(textField1, textField2);

                        if (s == 1) {
                            f1.setVisible(false);
                        }

                    } else {
                        showMessageDialog(null, " Fill the blank fields ", "Message", 2);
                    }
                }

                else if (pc == 2) {
                    if (!textField1.isEmpty() && !textField2.isEmpty()) {

                        matchUser(textField1, textField2);

                        if (s == 2) {
                            f1.setVisible(false);
                        }

                    } else {
                        showMessageDialog(null, " Fill all fields ", "Message", 2);
                    }

                } else if (pc != 2 || pc != 1) {
                    showMessageDialog(null, " Choose User type ", "Message", 2);
                }

            }
        });
    }

}
