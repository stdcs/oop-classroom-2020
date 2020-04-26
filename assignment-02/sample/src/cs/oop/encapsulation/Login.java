package cs.oop.encapsulation;

import java.util.NoSuchElementException;

public  class Login {
  private static Login login;
  private User user;
  private UserDetail userDetail;
  private DataSource dataSource;

  private Login() {
    dataSource = DataSource.getInstance();
  }

  public static Login getInstance() {
    if (login == null) {
      login = new Login();
    }
    return login;
  }

  public void auth(String userName, String password) {
    this.user = dataSource.getUser(userName);
    if (user == null) {
      String message = String.format("No such Username : %s", userName);
      throw new NoSuchElementException(message);
    }
    if (this.user.getUserName().equals(userName)) {
      if (this.user.getPassword().equals(password)) {
        this.userDetail = dataSource.getUserDetail(user.getId());
      } else {
        String message = String.format("Wrong Password for User %s", userName);
        throw new NoSuchElementException(message);
      }
    } else {
      String message = String.format("No such Username : %s", userName);
      throw new NoSuchElementException(message);
    }
  }

  public void status() {
    if (this.userDetail == null) {
      throw new NoSuchElementException("UserDetail is NULL");
    }
    System.out.printf("Name\t\t: %s\n", userDetail.getName());
    System.out.printf("Email\t\t: %s\n", userDetail.getEmail());
    System.out.printf("Date of Birth\t: %s\n", userDetail.getDateOfBirth());
    System.out.printf("User Name\t: %s\n", user.getUserName());
    System.out.printf("Password\t: %s\n", user.getPassword());
  }

}