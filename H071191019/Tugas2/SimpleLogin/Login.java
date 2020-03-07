package Project.SimpleLogin;

import java.io.IOException;
import java.util.NoSuchElementException;

public class Login {
    DataSource dataSource = new DataSource();
    User user;

    public void auth(String userName, String password) throws IOException {
        user = new User(userName, password);
        if (user.getStatus()) {
            dataSource.getUserDetail(user.getId());
        } else {
            System.out.println("No Such UserName = " + userName);
            throw new NoSuchElementException("No Such UserName");
        }
    }

    public void status() throws IOException {

    }
}