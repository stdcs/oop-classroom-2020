import java.util.NoSuchElementException;

/**
 * User
 */
public class User {

    private Integer id;
    private String userName;
    private String password;
    private UserDetail userDetail;
    private boolean checkPass = false;
    
    public User(Integer id, String userName, String password, UserDetail userDetail) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.userDetail = userDetail;
    }

    public boolean verifyPassword(String password) {
        try {
            if(this.password.equals(password)) {
                return checkPass = true;
            }
            return checkPass;
        } catch (Exception e) {
            throw new NoSuchElementException("No Such Username : " + userName);
        }
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    // public UserDetail getUserDetail(){
    //     return userDetail;
    // }
    public UserDetail getUserDetail(DataSource dataSource) {
        return userDetail;
    }
}