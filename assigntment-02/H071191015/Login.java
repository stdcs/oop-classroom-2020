import java.util.*;

public class Login{
    private static Login login;
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;

    private Login(){
        dataSource = DataSource.getInstance();
    }

    public static Login getInstance(){
        if (login == null) {
            login = new Login();
        }
        return login;
    }

    public void auth(String userName, String password){
        user = dataSource.getUser(userName);
        try {
            if(user.verifyPassword(password)){
                userDetail = user.getUserDetail();
            } else {
                System.out.println("Invalid Password");
            }
        } catch (Exception e) {
            throw new NoSuchElementException("No Such Username : " + userName);
            
        }
    }

    public void status(){
        try {
            System.out.println("Name            : " + userDetail.getName());
            System.out.println("Email           : " + userDetail.getEmail());
            System.out.println("Date of Birth   : " + userDetail.getDateOfBirth());
            System.out.println("User Name       : " + user.getUserName());
            System.out.println("Password        : " + user.getPassword());
        } catch (Exception e) {
            System.out.println("Not Logged In");
        }
    }
}