import java.util.HashMap;
import java.util.Map;
import java.io.FileReader;
import java.io.BufferedReader;

public class DataSource{

    private static DataSource dataSource;
    private Map<String, User> userMap = new HashMap<>();
    private Map<Integer, UserDetail> userDetailMap = new HashMap<>();
    
    private DataSource(){
        try {
            putUserDetail();
            putUser();
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

    private void putUserDetail() throws Exception {
        FileReader file = new FileReader("UserDetail.txt");
        BufferedReader reader = new BufferedReader(file);
        String s[];
        while (reader.ready()) {
            s = reader.readLine().split(";");
            if (isInteger(s[0])) {
                userDetailMap.put(Integer.valueOf(s[0]), 
                        new UserDetail(Integer.valueOf(s[0]), s[1], s[2], s[3]));
            }
        }
        s = null;
        reader.close();
    }

    private void putUser() throws Exception {
        FileReader file = new FileReader("User.txt");
        BufferedReader reader = new BufferedReader(file);
        String s[];
        while (reader.ready()) {
            s = reader.readLine().split(";");
            if (isInteger(s[0])) {
                userMap.put(s[1], new User(Integer.valueOf(s[0]), s[1], s[2], userDetailMap.get(Integer.valueOf(s[0]))));
            }
        }
        s = null;
        reader.close();

    }

    public User getUser(String key){
        return userMap.get(key);
    }

    public UserDetail getUserDetail(int key){
        return userDetailMap.get(key);
    }

    public boolean isInteger(String a) {
        boolean isValidInteger = false;
        try {
            Integer.parseInt(a);
            isValidInteger = true;
        } catch (NumberFormatException ex) {
            
        }
        return isValidInteger;
    }
}