class Login {

    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;

    public void auth (String name,String password){
        dataSource = new DataSource();
        if ((user = dataSource.getUser(name)) != null){
            dataSource = new DataSource();
            if ((user = dataSource.getUser(name))!= null){
                userDetail = user.getUserDetail();
            }else{
                System.out.println("wrong password");
            }
        }else{
            System.out.println("user not found");
        }
    }

    public void status(){
        if (userDetail != null){
            System.out.printf("Name             : %s\n", userDetail.getName());
            System.out.printf("Email            : %s\n", userDetail.getEmail());
            System.out.printf("Date of Birth    : %s\n", userDetail.getDateOfBirth());
            System.out.printf("User Name        : %s\n", user.getUserName());
            System.out.printf("Password         : %s\n", user.getPassword());
        }
    }
}