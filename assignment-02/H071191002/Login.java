import java.util.NoSuchElementException;

/**
 * Login
 */
public class Login {

    private static Login login;
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;
    
    private Login (){
        if(dataSource == null){
            dataSource = DataSource.getInstance();
        }
    } 

    public static Login getInstance(){
        if(login==null){
            login = new Login();
        }
        return login;
    }

    public void auth(String userName, String password) throws NoSuchElementException {
        user = dataSource.getUser(userName);
        try{
            if(user.checkPassword(password)){
                userDetail = user.getUserDetail();
            }else{
                System.out.println("Wrong Password");
            }
        }catch(Exception e){
            throw new NoSuchElementException("No such Username : "+userName);
        }

    }
    public void status(){
        try{
            System.out.printf("Name          : %s%n",userDetail.getName());
            System.out.printf("Email         : %s%n", userDetail.getEmail());
            System.out.printf("Date of Birth : %s%n", userDetail.getDateOfBirth());
            System.out.printf("User Name     : %s%n", user.getUsername());
            System.out.printf("Password      : %s%n",user.getPassword());
        }catch(Exception e){
            System.out.println("");
        }
    }
}