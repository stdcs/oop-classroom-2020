
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * DataSource
 */

public class DataSource {

    private static DataSource dataSource;
    private Map<String, User> userMap = new HashMap<>();
    private Map<Integer, UserDetail> userDetailMap = new HashMap<>();

    private DataSource() throws IOException {
        putUserDetail();
        putUser();
    }

    public static DataSource getInstance() throws IOException {
        if (dataSource == null) {
            dataSource = new DataSource();
        }
        return dataSource;
    }

    private void putUserDetail() throws IOException {

        FileReader fileReader = new FileReader("UserDetail.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String tempString = "";
        String cout;

        while((cout = bufferedReader.readLine()) != null){
            tempString += cout + "\n";
        }
        
        String data[] = tempString.split("\n");

        for (int i = 0; i < data.length; i++) {
            String data2[] = data[i].split(";");
            userDetailMap.put(Integer.valueOf(data2[0]),
             new UserDetail(Integer.valueOf(data2[0]), data2[1], data2[2],data2[3]));
        }

        bufferedReader.close();
        
    }

    private void putUser() throws IOException {

        FileReader fileReader = new FileReader("User.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String tempString = "";
        String cout;

        while ((cout = bufferedReader.readLine()) != null) {
            tempString += cout + "\n";    
        }

        String data[] = tempString.split("\n");
        for(int i = 0; i < data.length; i++){
            String data2[] = data[i].split(";");
            userMap.put(data2[1], new User(Integer.valueOf(data2[0]), data2[1], data2[2]));

        }
        
        bufferedReader.close();
        
    }

    public User getUser(String key){
        return userMap.get(key);

    }

    public UserDetail getUserDetail(Integer key){
        return userDetailMap.get(key);
    }

    
    
}