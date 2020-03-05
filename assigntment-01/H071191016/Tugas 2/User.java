class User {
    private int id;
    private String username;
    private String password;
    private UserDetail userDetail;
    private boolean authenticated = false;
    
    public User(int id, String userName, String password, UserDetail userDetail) {
        this.id = id;
        this.username = username;
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
        if(this.password.equals(password)) {
            authenticated = true;
            return true;
        } else {
            return false;
        }
    }

    public String getUsername() {
        if (authenticated) {
            return username;
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
}