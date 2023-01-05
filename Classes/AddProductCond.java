package Classes;


import Interfaces.*;

import javax.swing.*;
import java.io.*;

import static javax.swing.JOptionPane.showMessageDialog;

import java.time.*;
import java.time.format.*;

public class AddProductCond implements iAddProductOperatuon {

    String textField5;
    String textField6;
    String textField7;
    int s = 0;

    AddProductCond(String textField5, String textField6, String textField7) {
        this.textField5 = textField5;
        this.textField6 = textField6;
        this.textField7 = textField7;

    }

    public void addproduct(String textField5, String textField6, String textField7) {

    {


            try {
                File file = new File(".\\Data\\product_data.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                String timeAndDate = myDateObj.format(myFormatObj);

                pw.println("Name : " + textField5);
                pw.println("Mg/ml : " + textField6);
                pw.println("Price : " + textField7);
                pw.println("Time & Date : " + timeAndDate);
                pw.println("===============================================");
                pw.close();

                JOptionPane.showMessageDialog(null,
                        "Product Added Successfully",
                        "Complete", -1);
                new AdminDashBoard("textField1");
                s = 1;

            } catch (Exception ex) {
                System.out.print(ex);
            }

            // frame2.setVisible(true);
        }
}
}
