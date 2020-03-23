class User {
    private int id;
    private String userName;
    private String password;
    private UserDetail userDetail;
    //added some attribute
    private boolean accountChecking = false;

    public User(int id, String userName, String password, UserDetail userDetail) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.userDetail = userDetail;
    }

    public int getId() {
        if (accountChecking) {
            return id;
        }else {
            return 0;
        }
    }
    public String getUserName() {
        if (accountChecking) {
            return userName;
        }else {
            return null;
        }
    }
    public String getPassword() {
        if (accountChecking) {
            return password;
        }else {
            return null;
        }
    }
    public UserDetail getUserDetail() {
        if (accountChecking) {
            return userDetail;
        }else {
            return null;
        }
    }

    public boolean verifyPassword(String password) {
        if(this.password.equals(password)) {
            accountChecking = true;
            return true;
        }else {
            return false;
        }
    }
}