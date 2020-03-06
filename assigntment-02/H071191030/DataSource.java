import java.util.*;
import java.io.*;

/**
 * DataSource
 */
public class DataSource {

    private static DataSource dataSource;
    private HashMap<String, User> userMap = new HashMap<>();
    private HashMap<Integer, UserDetail> userDetailMap = new HashMap<>();

    private DataSource() {

        try {
            putUserDetail();
            putUser();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static DataSource getObject() {

        if (dataSource == null) {
            dataSource = new DataSource();
        }

        return dataSource;

    }

    private void putUserDetail() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("UserDetail.txt"));
        String s[];

        while (reader.ready()) {

            s = reader.readLine().split(";");

            if (isInt(s[0])) {
                userDetailMap.put(Integer.valueOf(s[0]), new UserDetail(Integer.valueOf(s[0]), s[1], s[2], s[3]));
            }
        }

        s = null;
        reader.close();

    }

    private void putUser() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("User.txt"));
        String s[];

        while (reader.ready()) {

            s = reader.readLine().split(";");

            if (isInt(s[0])) {
                userMap.put(s[1],
                        new User(Integer.valueOf(s[0]), s[1], s[2], userDetailMap.get(Integer.valueOf(s[0]))));
            }
        }

        s = null;
        reader.close();

    }

    public User getUser(String key) {

        return userMap.get(key);

    }

    public UserDetail getUserDetail(int key) {

        return userDetailMap.get(key);

    }

    public static boolean isInt(String sm) {

        boolean isInt = false;

        try {
            Integer.parseInt(sm);
            isInt = true;
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        return isInt;
    }

}