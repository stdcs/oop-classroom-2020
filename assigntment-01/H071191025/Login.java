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

    public static Login getInstance() {

        if (login == null) {
            login = new Login();
        }

        return login;

    }

    public void auth(String userName, String password) throws NoSuchElementException {

        user = dataSource.getUser(userName);

        try {

            if (user.checkPass(password)) {
                userDetail = user.getUserDetail();
            } else {
                System.out.println("Wrong Password...");
            }

        } catch (Exception e) {
            throw new NoSuchElementException("Username " + userName + " not found");
        }

    }

    public void status() {

        try{
            System.out.printf("Name\t\t: %s\n", userDetail.getName());
            System.out.printf("Email\t\t: %s\n", userDetail.getEmail());
            System.out.printf("Date of Birth\t: %s\n", userDetail.getBirth());
            System.out.printf("Username\t: %s\n", user.getUserName());
            System.out.printf("Password\t: %s\n", user.getPassword());
        } catch (Exception e) {
            System.out.println("Who are you...?");
        }

    }

    public void logout() {

        user = null;

    }

} 