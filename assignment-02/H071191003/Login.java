import java.util.NoSuchElementException;

public class Login {
    //The class login serves as a gateway for a user to login
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
    public void auth(String userName, String password) throws NoSuchElementException {
        //this method authenticates the user
        user = dataSource.getUser(userName);
        try {
            if(user.verifyPassword(password)){
                userDetail = user.getUserDetail();
            } else {
                System.out.println("Invalid Password");
            }
        } catch (Exception e) {
            //if username is invalid
            throw new NoSuchElementException("No such Username : " + userName);
        }
    }

    public void status() {
        //This method prints out information about the current user that is logged in
        try{
            System.out.printf("Name\t\t: %s\n", userDetail.getName());
            System.out.printf("Email\t\t: %s\n", userDetail.getEmail());
            System.out.printf("Date of Birth\t: %s\n", userDetail.getDateOfBirth());
            System.out.printf("Username\t: %s\n", user.getUsername());
            System.out.printf("Password\t: %s\n", user.getPassword());
        } catch (Exception e) {
            System.out.println("Not Logged in");
        }
    }

    public void logout() {
        //logout deautheticates the current user
        if(user != null){
            user.logout();
            user = null;
            userDetail = null;
        } else {
            System.out.println("Not logged in");
        }
    }
}