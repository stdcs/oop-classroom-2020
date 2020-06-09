import java.util.HashMap;
import java.util.Map;
import java.io.*;

/**
 * DataSource
 */
public class DataSource {

    private static DataSource dataSource;
    private Map<String, User> userMap = new HashMap<>();
    private Map<Integer, UserDetail> userDetailMap = new HashMap<>();

    private DataSource() {
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
    private void putUserDetail() throws IOException {
        FileReader fr = new FileReader("UserDetail.txt");
        BufferedReader br = new BufferedReader(fr);
        String tempdata[];
        while (br.ready()) {
            tempdata = br.readLine().split(";");
            
            if (isInteger(tempdata[0])) {
                userDetailMap.put(Integer.valueOf(tempdata[0]), 
                new UserDetail(Integer.valueOf(tempdata[0]), tempdata[1], tempdata[2], tempdata[3]));
            }
        }   
        tempdata = null;
        br.close();
    }

    private void putUser() throws IOException{
        FileReader fr = new FileReader("User.txt");
        BufferedReader br = new BufferedReader(fr);
        String tempdata[];
        while (br.ready()) {
            tempdata = br.readLine().split(";");

            if (isInteger(tempdata[0])) {
                userMap.put(tempdata[1], 
                new User(Integer.valueOf(tempdata[0]), tempdata[1], tempdata[2], 
                userDetailMap.get(Integer.valueOf(tempdata[0]))));
            }
        }
        tempdata = null;
        br.close();
    }

    public User getUser(String key) {
        return userMap.get(key);
    }

    public UserDetail getUserDetail(Integer key) {
        return userDetailMap.get(key);
    }

    public boolean isInteger(String s) {
        boolean isAnInteger = false;
        try {
            Integer.parseInt(s);

            isAnInteger = true;
        } catch (Exception e) {

        }
        
        return isAnInteger;
    }
}