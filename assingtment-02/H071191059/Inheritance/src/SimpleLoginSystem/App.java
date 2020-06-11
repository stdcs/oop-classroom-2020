package SimpleLoginSystem;

public class App {
    public static void main(String[] args) throws Exception{
        Login login = Login.getInstance();
        //Example of a correct login
        login.auth("farhan", "Parhan");
        login.status();
        login.logout();

        System.out.println("");
    }
}