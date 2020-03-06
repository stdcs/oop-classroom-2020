/**
 * User
 */
public class User {

    private Integer id;
    private String userName;
    private String password;
    private UserDetail userDetail;

    public User(Integer id, String userName, String password, UserDetail userDetail){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.userDetail = userDetail;
    }

    public int getId(){
        return this.id;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getPassword(){
        return this.password;
    }

    public UserDetail getUserDetail(){
        return this.userDetail;
    }

    public boolean Pass(String password){
        return password.equals(this.password);
    }
}