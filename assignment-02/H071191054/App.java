public class App {
    public static void main(String[] args) throws Exception {
        Login login = new Login();
        login.auth("naim", "Naim");
        login.status();
    }
}