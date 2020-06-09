import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Login login = Login.getInstanceLogin();

        System.out.print("Input Username : ");
        String username = sc.nextLine();
        System.out.print("Input Password : ");
        String pass = sc.nextLine();
        System.out.println();
        login.auth(username, pass);
        login.status();

        sc.close();

    }
}