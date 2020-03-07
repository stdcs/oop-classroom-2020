package Project.SimpleLogin;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Login user = new Login();
        user.auth("farhan", "Parhan");
        user.status();
    }
}