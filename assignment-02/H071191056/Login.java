

import java.io.IOException;
import java.util.NoSuchElementException;

/**
 * Login
 */
public class Login {

    private static Login login;
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;
    
    private Login() throws IOException{
        
    }
    
    public static Login getInstance() throws IOException {
        if(login == null){
            login = new Login();
        }
        return login;
    }

    public UserDetail getUserDetail(DataSource dataSource) {
        return userDetail;
    }
    
    public void auth(String userName, String password) throws IOException{
        dataSource =  DataSource.getInstance();
        user = dataSource.getUser(userName);

        try{
            if(user.passwordVerication(password)){
                userDetail = dataSource.getUserDetail(user.getId());
            }
            else{
                System.out.println("Wrong Password");
            }
        }catch(Exception e){
            throw new NoSuchElementException("No such UserName " + userName);
            
        }
    }

    public void status(){
        System.out.println("Nama\t\t: " + userDetail.getName());
        System.out.println("Email\t\t: " + userDetail.getEmail());
        System.out.println("Date Of Birth\t: " + userDetail.getDateOfBirth());
        System.out.println("User Name\t: " + user.getUserName());
        System.out.println("Password\t: " + user.getPassword());
        
    }
}