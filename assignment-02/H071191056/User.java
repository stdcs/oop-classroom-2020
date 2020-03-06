

import java.io.IOException;
import java.util.NoSuchElementException;

/**
 * User
 */
public class User {
    private int id;
    private String userName;
    private String password;
    private  DataSource dataSource;
    private UserDetail userDetail;
    
    public User(int id, String userName, String password){
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public int getId(){
        return id;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
        
    }

    public boolean passwordVerication(String password) throws NoSuchElementException{
        
        if(this.password.equals(password)){
            return true;
        }
        else{
            return false;
        }
    }

    public UserDetail getUserDetail(){ 
        return userDetail; 
    }

    
}