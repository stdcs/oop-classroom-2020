import java.util.NoSuchElementException;

public class Login {
    private static Login login;
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;

    private Login() {
       dataSource = DataSource.getInstance();
    }

    public static Login getInstance() {
        if(login == null){
            login = new Login();
        }
        return login;
    }
    public void auth(String username, String password) throws NoSuchElementException {
        user = dataSource.getUser(username);
        try {
            if(user.verifyPassword(password)){
                userDetail = user.getUserDetail();
            } else {
                System.out.println("Invalid Password");
            }
        } catch (Exception e) {
            throw new NoSuchElementException("No such Username : " + username);
        }
    }

    public void status() {
        try{
            System.out.println("Name            : "+ userDetail.getName());
            System.out.println("Email           : "+ userDetail.getEmail());
            System.out.println("Date of Birth   : "+  userDetail.getDateOfBirth());
            System.out.println("Username        : "+ user.getUsername());
            System.out.println("Password        : "+ user.getPassword());
        } catch (Exception e) {
            System.out.println("Not Logged in");
        }
    }
}