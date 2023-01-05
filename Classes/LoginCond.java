package Classes;

import Interfaces.*;
import java.io.*;
import java.nio.file.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class LoginCond implements IloginOperation {
    String textField1;
    String textField2;
    int s = 0;

    LoginCond(String textField1, String textField2) {
        this.textField1 = textField1;
        this.textField2 = textField2;

    }

    public void matchAdmin(String textField1, String textField2) {
        try {
            String userNameS = "User Name: " + textField1;
            String passwordS = "Password: " + textField2;
            BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\admin_data.txt"));

            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i <= totalLines; i++) {
                String line = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i);
                if (line.equals(userNameS)) {
                    String line2 = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt"))
                            .get((i + 1));
                    if (line2.equals(passwordS)) {

                        new AdminDashBoard(textField1);
                        s = 1;
                        break;

                    }
                }
            }
        } catch (Exception ex) {
            showMessageDialog(null, " Wrong User Name or Password ", "Message", 2);
        }
    }

    public void matchUser(String textField1, String textField2) {

        try {
            String userNameS = "User Name : " + textField1;
            String passwordS = "Password : " + textField2;
            BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i <= totalLines; i++) {
                String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
                if (line.equals(userNameS)) {
                    String line2 = Files.readAllLines(Paths.get(".\\Data\\user_data.txt"))
                            .get((i + 1));
                    if (line2.equals(passwordS)) {

                      //f1.setVisible(false);
                        new UserDashBoard(textField1);
                        s = 2;
                        break;
                    }
                }
            }
        } catch (Exception ex) {
            showMessageDialog(null, " Wrong User Name or Password ", "Message", 2);
        }
    }
}
