import java.util.NoSuchElementException;

class Login {
    private static Login login;
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;

    public static Login getInstance() {
        if (login == null) {
            login = new Login();
        }
        return login;
    }
    private Login() {
        dataSource = DataSource.getInstance();
    }

    public void auth(String userName, String password) {
        user = dataSource.getUser(userName);
        try {
            if(user.verifyPassword(password)){
                userDetail = user.getUserDetail();
            } else {
                System.out.println("Invalid Password");

            }
        } catch (Exception e) {
            throw new NoSuchElementException("No such Username : " + userName);
        }

    }
    public void status() {
        try{
            System.out.printf("Name\t\t: %s\n", userDetail.getName());
            System.out.printf("Email\t\t: %s\n", userDetail.getEmail());
            System.out.printf("Date of Birth\t: %s\n", userDetail.getBirthDay());
            System.out.printf("Username\t: %s\n", user.getUserName());
            System.out.printf("Password\t: %s\n", user.getPassword());
        } catch (Exception e) {
            System.out.println("Not Logged in");
        }
    }
}
