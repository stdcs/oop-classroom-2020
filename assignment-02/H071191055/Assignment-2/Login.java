import java.util.NoSuchElementException;

/**
 * Login
 */
public class Login {

    private static Login login;
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;

    private Login() {
        dataSource = DataSource.getInstance();
    }

    public static Login getInstanceLogin() {
        if (login == null) {
            login = new Login();
        }
        return login;
    }

    public void auth(String userName, String password) throws NoSuchElementException{
        user = dataSource.getUser(userName);
        try {
            if (user.verifyPassword(password)) {
                userDetail = user.getUserDetail(dataSource);
            }else {
                System.out.println("Wrong Password");
            }
        } catch (Exception e) {
            throw new NoSuchElementException("No Such Username : " + userName);
        }
    }

    public void status() {
        System.out.printf("Name          : %s\n", userDetail.getname());
        System.out.printf("Email         : %s\n", userDetail.getEmail());
        System.out.printf("Date Of Birth : %s\n", userDetail.getDateOfBirth());
        System.out.printf("Username      : %s\n", user.getUsername());
        System.out.printf("Password      : %s\n", user.getPassword());
    }
}
