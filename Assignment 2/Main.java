public class Main {
    public static void main(String[] args) throws Exception{
        Login login = Login.getInstance();
        //correct login
        login.auth("fitrh", "12345678");
        login.status();

        //incorrect login
        //login.auth("farha", "Parhan");
        //login.status();
    }
}