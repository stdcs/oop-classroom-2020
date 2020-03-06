
class User {
     private int id;
     private String userName;
     private String password;
     private UserDetail userDetail;
 
     public User(int id, String userName, String password) {
         this.id = id;
         this.userName = userName;
         this.password = password;
     }
 
     public String getPassword() {
         return password;
     }
 
     public UserDetail getUserDetail(){
         return userDetail;
     }
 
     public Integer getId() {
         return id;
     }
 
     public String getUserName() {
         return userName;
     }
 
 }