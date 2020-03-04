public class User {
    // This class contains the login details of a user
    private int id;
    private String userName;
    private String password;
    private UserDetail userDetail; 
    private boolean authenticated = false; // prevents access to vital information 
                                           // without authentication

    public User(int id, String userName, String password, UserDetail userDetail) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.userDetail = userDetail;
    }

    public UserDetail geUserDetail() {
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
        //this method authenticates the user if the password is correct
        if(this.password.equals(password)) {
            //if password is correct then authenticate the user
            authenticated = true;
            return true;
        } else {
            //if the password is incorrect  then don't authenticate the user
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

    public UserDetail getUserDetail() {
        if (authenticated) {
            return userDetail;
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