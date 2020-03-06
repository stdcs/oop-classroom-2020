public class Login {
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;

    public void auth(String name, String pass) {
        dataSource = new DataSource();
        if ((user = dataSource.getUser(name)) != null) {
            if (user.getPassword().equals(pass)) {
                userDetail = user.getUserDetail();
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("User not found");
        }
    }

    public void status() {
        if (userDetail != null) {
            System.out.println(userDetail.getName());
            System.out.println(userDetail.getEmail());
            System.out.println(userDetail.getDateOfBirth());
        }
    }
}