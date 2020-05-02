public class App {
    public static void main(String[] args) throws Exception{
        Login login = Login.getInstance();
        //Example of a correct login
        login.auth("Arsyi", "lMaO");
        login.status();
        login.logout();

        System.out.println("");

        // Example of an incorrect login
        login.auth("Arsyi", "lmao");
        login.status();
        login.logout();

        System.out.println("");

        // another example of an incorrect login
        login.auth("Aryi", "lMaO");
        login.status();
    }
}