import java.util.NoSuchElementException;

class Login{
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;
    boolean verification = false;
    static Login login = new Login();

    private Login(){
        
    }
    public static Login getInstance(){
        return login;
    }

    public void auth(String userName, String password)throws NoSuchElementException{
        dataSource = DataSource.getInstace();
        try {
            user = dataSource.getUser(userName);
        verification = password.equals(user.getPassword()) ? true : false;
        userDetail = verification ? dataSource.getUserDetail(user.getId()) : null;
        } catch (Exception e) {
            throw new NoSuchElementException("No Such User Name : " + userName);
        }        
    }

    public void status()
    {
        if(userDetail == null)
        {
            System.out.println("NoSuchElementException");
        }
        else
        {
            System.out.println("Name            : " + userDetail.getName());
            System.out.println("Email           : " + userDetail.getEmail());
            System.out.println("Date of Birth   : " + userDetail.getBirth());
            System.out.println("UserName        : " + user.getUserName());
            System.out.println("Password        : " + user.getPassword());
        }
    }



} 