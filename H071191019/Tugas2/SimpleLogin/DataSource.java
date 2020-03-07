package Project.SimpleLogin;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataSource {
    Map<String, User> userMap = new HashMap<String, User>();
    Map<Integer, UserDetail> userDetailMap = new HashMap<Integer, UserDetail>();
    private static DataSource dataSource;

    public static DataSource putData() throws IOException {
        dataSource = new DataSource();
        dataSource.putUser();
        return dataSource;
    }

    private void putUserDetail(int key) throws IOException {
        FileReader file = new FileReader(
                "D:/Kampus/Pemrograman/Santuy/fatwa-app/bin/app/Project/SimpleLogin/UserDetail.txt");
        BufferedReader reader = new BufferedReader(file);
        String line;
        Scanner fa;
        try {
            while ((line = reader.readLine()) != null) {
                fa = new Scanner(line);
                fa.useDelimiter(";");
                while (fa.hasNext()) {
                    int id = Integer.parseInt(fa.next());
                    String userName = fa.next();
                    String dateOfBirth = fa.next();
                    String Email = fa.next();
                    if (id == key) {
                        System.out.println("Id             : " + id);
                        System.out.println("Name           : " + userName);
                        System.out.println("Date of Birth  : " + dateOfBirth);
                        System.out.println("Email          : " + Email);
                    }
                }
            }

        } catch (Exception e) {

        } finally {
            reader.close();
        }
    }

    private void putUser() throws IOException {
        User user = new User();
        FileReader file = new FileReader("D:/Kampus/Pemrograman/Santuy/fatwa-app/bin/app/Project/SimpleLogin/User.txt");
        BufferedReader reader = new BufferedReader(file);
        String line;
        Scanner fa;
        try {
            while ((line = reader.readLine()) != null) {
                fa = new Scanner(line);
                fa.useDelimiter(";");
                while (fa.hasNext()) {
                    int id = Integer.parseInt(fa.next());
                    String userName = fa.next();
                    UserDetail userDetail = userDetailMap.get(id);
                    if (user.getId() == id) {
                    }
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            reader.close();
        }
    }

    public UserDetail getUserDetail(Integer key) throws IOException {
        putUserDetail(key);
        return userDetailMap.get(key);
    }

    public User getUser(String userName) {
        return userMap.get(userName);
    }
}
