public class App1 {
    public static void main(String[] args) throws Exception {
        Login login = Login.getInstance();

        login.auth("aris", "Aris");
        login.status();
        login.logout();

        System.out.println("");

        login.auth("Farha", "parhan");
        login.status();
        login.logout();
    }
} 