

import java.io.IOException;

/**
 * App
 */
public class App {

    public static void main(String[] args) throws IOException{
        Login login = Login.getInstance();
        login.auth("farhan", "Parhan");
        login.status();
    }
}