public class Login {

    private static Login login;
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;

    private Login() { dataSource = DataSource.getInstance();}

    public static Login getInstance() {
        if (login == null) login = new Login();
        return login;
    }

    public void auth(String userName, String password) throws Exception {
        user = dataSource.getUser(userName);

        try{
            if(user.checkPass(password)) userDetail = user.getUserDetail();
            else System.out.println("Wrong Password...");
        }catch (Exception e) {
			System.out.println("Exception in thread \"main\" java.util.NoSuchElementException: No such Username : "+userName);
        }

    }

    public void status() {
		System.out.println("Name\t\t: "+userDetail.getName()+"\nEmail\t\t: "+userDetail.getEmail()+"\nDate of Birth\t: "+userDetail.getDateOfBirth()+"\nUser Name\t: "+user.getUserName()+"\nPassword\t: "+user.getPassword());
    }

    public void logout() {

        user = null;

    }
}