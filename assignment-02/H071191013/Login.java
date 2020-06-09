import java.io.IOException;

class Login{
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;
    boolean access = false;
    static Login login = new Login();

    private Login(){
    }

    static Login getObject(){
        return login;
    }

    public void auth(String userName, String password) throws IOException{
        dataSource = DataSource.getObject();
        user = dataSource.getUser(userName);
        access = password.equals(user.getPassword()) ? true:false;
        userDetail = access ? dataSource.getUserDetail(user.getId()):null;
        
    }

    public void status()
{
        if(userDetail == null){
            System.out.println("Gagal Login");
        }
        else{
            System.out.println("Name            : " + userDetail.getName());
            System.out.println("Email           : " + userDetail.getEmail());
            System.out.println("Date of Birth   : " + userDetail.getDateOfBirth());
            System.out.println("UserName        : " + user.getUserName());
            System.out.println("Password        : " + user.getPassword());
        }
    }

}