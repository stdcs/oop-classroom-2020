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
        dataSource = DataSource.getObject();
    }

    public static Login getObject() {

        if (login == null) {
            login = new Login();
        }

        return login;

    }

    public void auth(String userName, String password) throws NoSuchElementException {

        user = dataSource.getUser(userName);

        try {

            if (user.Pass(password)) {
                userDetail = user.getUserDetail();
            }

        } catch (Exception e) {
            throw new NoSuchElementException("No such Username : " + userName);
        }

    }

    public void status() {

        System.out.println("Name            : " + userDetail.getName());
        System.out.println("Email           : " + userDetail.getEmail());
        System.out.println("Date of Birth   : " + userDetail.getDateOfBirth());
        System.out.println("UserName        : " + user.getUserName());
        System.out.println("Password        : " + user.getPassword());

    }

}