import java.io.IOException;

class Login
{
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;
    boolean is_accesible = false;
    static Login login = new Login();


    private Login()
    {

    }

    static Login getObject()
    {
        return login;
    }

    public void auth(String userName, String password) throws IOException
    {
        dataSource = DataSource.getObject();
        user = dataSource.getUser(userName);
        is_accesible = password.equals(user.getPassword()) ? true:false;
        userDetail = is_accesible ? dataSource.getUserDetail(user.getId()):null;
        
    }

    public void status()
    {
        if(userDetail == null)
        {
            System.out.println("NoSuchElementException");
        }
        else
        {
            /* 
            Name            : Muhammad Muflihun Naim
            Email           : naimmm17h@student.unhas.ac.id
            Date of Birth   : 00-00-0000
            User Name       : naim
            Password        : Naim
            
            */

            System.out.println("Name            : " + userDetail.getName());
            System.out.println("Email           : " + userDetail.getEmail());
            System.out.println("Date of Birth   : " + userDetail.getBirth());
            System.out.println("UserName        : " + user.getUserName());
            System.out.println("Password        : " + user.getPassword());
        }
    }

}