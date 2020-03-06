import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Login login = Login.getObject();
        login.auth("ken", "asdf");
        login.status();
    }
}