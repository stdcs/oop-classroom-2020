public class User{
    private int id;
    private String userName;
    private String password;
    private UserDetail userDetail;
    //user berisikan Userdetail agar bisa menyesuaikan antara id user dan id user detail 
    public User(int id, String userName, String password, UserDetail userDetail){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.userDetail = userDetail;
    }
    public int getId (){
        return id;  
    }
    public String getUserName (){
        return userName;
    }
    public String getPassword (){
        return password;
    }
    //digunakan untuk mereturn kelas User Detail dari id yang dimasukkan
    public UserDetail getUserDetail(){
        return userDetail;
    }

    //behavior yang memeriksa password yang dikirim dari Login
    //jika password valid maka akan dikembalikan nilai true ke login
    public boolean pemeriksaPassword (String password){
        if(this.password.equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}

