package Project.SimpleLogin;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class User {
    private int id;
    private String userName;
    private String password;
    UserDetail userDetail;
    private boolean isUser;

    User() {

    }

    User(String userName, String password) throws IOException {
        FileReader file = new FileReader("D:/Kampus/Pemrograman/Santuy/fatwa-app/bin/app/Project/SimpleLogin/User.txt");
        BufferedReader reader = new BufferedReader(file);
        String line;
        Scanner fa;
        try {
            while ((line = reader.readLine()) != null) {
                fa = new Scanner(line);
                fa.useDelimiter(";");
                while (fa.hasNext()) {
                    this.id = Integer.parseInt(fa.next());
                    this.userName = fa.next();
                    this.password = fa.next();
                    if (isUser(userName, password)) {
                        isUser = true;
                    }
                }
                if (isUser) {
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            reader.close();
        }
    }

    boolean getStatus() {
        return isUser;
    }

    int getId() {
        return this.id;
    }

    String getUserName() {
        return this.userName;
    }

    String getPassword() {
        return this.password;
    }

    public boolean isUser(String userName, String password) {
        if (userName.equals(this.userName) && password.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

}