package Classes;

import Interfaces.*;

import javax.swing.*;
import java.io.*;

import static javax.swing.JOptionPane.showMessageDialog;

import java.time.*;
import java.time.format.*;

public class RegistrationCond implements iRegistrationOperation {

    String textField5;
    String textField6;
    String textField4;
    int s = 0;

    RegistrationCond(String textField5, String textField6, String textField4) {
        this.textField5 = textField5;
        this.textField6 = textField6;
        this.textField4 = textField4;


    }

    public void registration(String textField5, String textField6, String textField4) {
        try {

            File file = new File(".\\Data\\user_data.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

            String timeAndDate = myDateObj.format(myFormatObj);

            pw.println("User Name : " + textField5);
            pw.println("Password : " + textField6);
            pw.println("Email : " + textField4);
            pw.println("Time & Date : " + timeAndDate);
            pw.println("===============================================");
            pw.close();

            showMessageDialog(null,
                    "Registration Successfully Completed \n         You Can Log In now ",
                    "Registration Complete", JOptionPane.INFORMATION_MESSAGE);
            new Login("textField1", "textField2");
            s = 1;

        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
}
