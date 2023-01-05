package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.table.*;
import java.io.*;
import java.nio.file.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class ShowProduct {                                                  // SHOW PRODUCT

    JFrame frame;
    JLabel title1, title,slogan,logo;
    JScrollPane scroll;
    JTable table;
    DefaultTableModel model;
    JButton  signout,deleteP,retrn;
    ImageIcon i1;

    private String[] column = { "Name", "Mg/ml", "Price", "Date and Time" };
    private String[] rows = new String[7];

    ShowProduct(String textField1) {

        frame = new JFrame();

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());
        frame.getContentPane().setBackground(new Color (68, 185, 135));

        logo = new JLabel();
        logo.setIcon(new ImageIcon("image/logo1.png"));
        Dimension size = logo.getPreferredSize();
        logo.setBounds(80, 10, size.width, size.height);
        frame.add(logo);
        
        title = new JLabel("e-Pharamcy");
        title.setBounds(240, 30, 800, 80);
        title.setFont(new Font("Segoe UI", Font.BOLD, 50));
        frame.add(title);


        slogan = new JLabel("Trust in Us for All Your Healthcare Needs");
        slogan.setBounds(245, 85, 500, 60);
        slogan.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        frame.add(slogan);



        retrn = new JButton();
        retrn.setIcon(new ImageIcon("image/return.png"));
        retrn.setBounds(15, 8, 35, 40);
        retrn.setFont(new Font("Segoe UI", Font.BOLD, 25));
        retrn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        retrn.setFocusPainted(false);
        retrn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        retrn.setContentAreaFilled(false);
        frame.add(retrn);

        title1 = new JLabel("All Product Information");
        title1.setBounds(10, 150, 500, 40);
        title1.setForeground(Color.black);
        title1.setFont(new Font("Segoe UI", Font.BOLD, 30));
        frame.add(title1);

        signout = new JButton("Sign Out");
        signout.setBounds(1260, 50, 90, 25);
        signout.setFont(new Font("Segoe UI", Font.BOLD, 16));
        signout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signout.setFocusPainted(false);
        signout.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        signout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signout.setContentAreaFilled(false);
        frame.add(signout);

        deleteP = new JButton("Delete product");
        deleteP.setBounds(1135, 660, 180, 30);
        deleteP.setFont(new Font("Segoe UI", Font.BOLD, 18));
        deleteP.setCursor(new Cursor(Cursor.HAND_CURSOR));
        deleteP.setBackground(Color.orange);
        deleteP.setFocusPainted(false);

        frame.add(deleteP);


        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(150);
        table.getColumnModel().getColumn(1).setPreferredWidth(140);
        table.getColumnModel().getColumn(2).setPreferredWidth(110);
        table.getColumnModel().getColumn(3).setPreferredWidth(240);

        scroll = new JScrollPane(table);
        scroll.setBounds(1, 200, 1366, 500);
        scroll.setBackground(Color.cyan);
        frame.add(scroll);

        String file = ".\\Data\\product_data.txt";
        String temp = ".\\Data\\temp.txt";
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("Name")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(7); // Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(8); // mg/ml
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(8); // price
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(14); // Date and Time
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            showMessageDialog(null, " Something is wrong,Try later", "warning", 2);
            new Category("textField1");
            return;

        }




        // adding button


        frame.setSize(1366, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        deleteP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (table.getSelectionModel().isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select a user to delete", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
                else {
                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

                    File oldFile = new File(file);
                    File newFile = new File(temp);

                    int q = 0;

                    try {

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            String x = line.substring(0, 4);
                            if (x.equals("Name")) {
                                String userName = Files.readAllLines(Paths.get(file)).get(i);
                                if (userName.substring(7).equals(removeUser)) {
                                    q = i;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        return;
                    }

                    try {

                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int j = 0; j < totalLines; j++) {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 4);

                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4)
                                    || j == (q + 5))) {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + userName);
                            } else {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(userName);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);

                    new ShowProduct("textField1");
                    frame.setVisible(false);
                }

            }
        });


        retrn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == retrn) {
                    new Category(textField1);
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

    }
}
