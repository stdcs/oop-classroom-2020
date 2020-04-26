package cs.oop.encapsulation;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class DataSource {
  private static DataSource dataSource;
  private Map<String, User> userMap;
  private Map<Integer, UserDetail> userDetailMap;

  private DataSource() {
    userDetailMap = new HashMap<>();
    userMap = new HashMap<>();
    dataSource.putUserDetail();
    dataSource.putUser();
  }

  private void putUserDetail() {
    Path path = Paths.get("db/UserDetails.txt");
    try (Stream<String> stream = Files.lines(path)) {
      stream.forEach(line -> {
        String[] splittedLine = line.split(";");
        Integer id = Integer.valueOf(splittedLine[0]);
        String name = splittedLine[1];
        String dateOfBirth = splittedLine[2];
        String email = splittedLine[3];
        UserDetail userDetail = new UserDetail(id, name, dateOfBirth, email);
        userDetailMap.put(userDetail.getId(), userDetail);
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void putUser() {
    Path path = Paths.get("db/Users.txt");
    try (Stream<String> stream = Files.lines(path)) {
      stream.forEach(line -> {
        String[] splittedLine = line.split(";");
        Integer id = Integer.valueOf(splittedLine[0]);
        String userName = splittedLine[1];
        String password = splittedLine[2];
        UserDetail userDetail = userDetailMap.get(id);
        User user = new User(id, userName, password, userDetail);
        userMap.put(user.getUserName(), user);
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static DataSource getInstance() {
    if (dataSource == null) {
      dataSource = new DataSource();
    }
    return dataSource;
  }

  public User getUser(String key) {
    return userMap.get(key);
  }

  public UserDetail getUserDetail(Integer key) {
    return userDetailMap.get(key);
  }

}