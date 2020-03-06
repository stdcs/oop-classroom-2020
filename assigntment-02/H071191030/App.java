/**
 * App
 */
public class App {

    public static void main(String[] args) throws Exception{
        Login login = Login.getObject();

        login.auth("arzk", "qwert");
        login.status();
    }
}