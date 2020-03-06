public class User {
    private int id;
    private String userName;
    private String password;
    private UserDetail userDetail;
    private boolean authenticated = false;

    public User(int id, String userName, String password, UserDetail userDetail) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.userDetail = userDetail;
    }

    public UserDetail getUserDetail() {
        if (authenticated) {
            return userDetail;
        } else {
            System.out.println("Not Authenticated");
            return null;
        }
    }

    public int getId() {
        if (authenticated) {
            return id;
        } else {
            System.out.println("Not Authenticated");
            return 0;
        }
    }

    public boolean verifyPassword(String password) {
        if (this.password.equals(password)) {
            authenticated = true;
            // jika password benar, maka authenticated user masuk
            return true;
        } else {
            // jika password salah, maka authenticated user tdk masuk
            return false;
        }
    }

    public String getUsername() {
        if (authenticated) {
            return userName;
        } else {
            System.out.println("Not Authenticated");
            return null;
        }
    }

    public String getPassword() {
        if (authenticated) {
            return password;
        } else {
            System.out.println("Not Authenticated");
            return null;
        }
    }

    public void logout() {
        authenticated = false;
    }
}
