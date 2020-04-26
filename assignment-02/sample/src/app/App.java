package app;

import cs.oop.encapsulation.Login;

public class App {
    public static void main(String[] args) throws Exception {
        Login login = Login.getInstance();
        login.auth("Farha", "parhan");
        login.status();
    }
}