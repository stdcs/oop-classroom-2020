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

    public static DataSource getInstance() {

        if (dataSource == null) {
            dataSource = new DataSource();
        }

        return dataSource;

    }

    private void putUserDetail() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("UserDetail.txt"));
        String data[];

        while(reader.ready()) {

            data = reader.readLine().split(";");

            if (isInt(data[0])) {
                userDetailMap.put(Integer.valueOf(data[0]), new UserDetail(Integer.valueOf(data[0]), data[1], data[2], data[3]));
            }
        }

        data = null;
        reader.close();

    }

    private void putUser() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("User.txt"));
        String data[];

        while(reader.ready()) {

            data = reader.readLine().split(";");

            if (isInt(data[0])) {
                userMap.put(data[1], new User(Integer.valueOf(data[0]), data[1], data[2], userDetailMap.get(Integer.valueOf(data[0]))));
            }
        }

        data = null;
        reader.close();

    }

    public User getUser(String key) {

        return userMap.get(key);

    }

    public UserDetail getUserDetail(int key) {

        return userDetailMap.get(key);

    }

    public static boolean isInt(String str) {

        boolean isInt = false;

        try {
            Integer.parseInt(str);
            isInt = true;
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
        }

        return isInt;
    }

}