/**
 * User
 */
public class User {
    private int id;
    private String userName;
    private String password;
    private UserDetail userDetail;

    public User(){

    }
    public User(int id,String userName, String password, UserDetail userDetail){
        this.id = id;
        this.userName=userName;
        this.password=password;
        this.userDetail = userDetail;
    }

    public UserDetail getUserDetail(){
        return userDetail;
    }

    public String getUsername(){
        return userName;
    }
    public String getPassword(){
        return password;
    }

    public boolean checkPassword(String password){
        if(password.equals(this.password)){
            return true;
        }
        else return false;
    }    
}