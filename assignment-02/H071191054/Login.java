import java.util.NoSuchElementException;

class Login {
    static Login instance = null
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;

    private Login() {

    }

    static public Login getInstance() {
        if (instance == null)
            instance = new Login();
        return instance;
    }

    public void auth(String name, String pass) throws NoSuchElementException {
        dataSource = DataSource.getInstance();
        try {
            user = dataSource.getUser(name);
            if (user.getPassword().equals(pass)) {
                userDetail = user.getUserDetail();
            } else {
                System.out.println("wrong password");
            }
        } catch (Exception e) {
            throw new NoSuchElementException("user not found: " + name);
        }
    }

    public void status() {
        if (userDetail != null) {
            System.out.println(userDetail.getName());
            System.out.println(userDetail.getEmail());
            System.out.println(userDetail.getDateOfBirth());
        }
    }
}