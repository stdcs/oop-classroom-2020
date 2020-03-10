public class Main {
    public static void main(String[] args) {
        Login login = Login.getInstance();
        login.auth("naim", "Naim");
        login.status();
    }
}