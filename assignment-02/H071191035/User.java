/**
 * User
 */
public class User {

    private int id;
    private String userName;
    private String password;
    private UserDetail userDetail;

   public User(int id, String userName, String password, UserDetail userDetail) {
       this.id = id;
       this.userName = userName;
       this.password = password;
       this.userDetail = userDetail;
   }

   // getter
   public int getId() {
       return id;
   }

   public String getUserName() {
       return userName;
   }

   public String getPassword() {
       return password;
   }

   public UserDetail getUserDetail() {
       return userDetail;
   }

   // check password
   public boolean checkPass(String password) {

    return password.equals(this.password);
   
    }

}