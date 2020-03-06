import java.util.HashMap;
import java.util.Map;
import java.io.FileReader;
import java.io.BufferedReader;

public class DataSource {
    private static DataSource dataSource;
    private Map<String, User> userMap = new HashMap<>();
    private Map<Integer, UserDetail> userDetailMap = new HashMap<>();

    private DataSource() {
        try{
            putUserDetail();
            putUser();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getInstance() {
        if(dataSource == null){
            dataSource = new DataSource();
        }
        return dataSource;
    }

    private void putUserDetail() throws Exception{
    
        BufferedReader br = new BufferedReader(new FileReader("UserDetail.txt"));
        String data[];
        while(br.ready()){
            data = br.readLine().split(";");
           
            if(isInteger(data[0])){
                userDetailMap.put(Integer.valueOf(data[0]),
                        new UserDetail(Integer.valueOf(data[0]), data[1], data[2], data[3]));

            }
        }
        data = null;
        br.close();
    }

    private void putUser() throws Exception{
       
        BufferedReader br = new BufferedReader(new FileReader("User.txt"));
        String data[];
        while(br.ready()){
            data = br.readLine().split(";");
            
            if(isInteger(data[0])){
                userMap.put(data[1], new User(Integer.valueOf(data[0]), data[1], data[2],
                        userDetailMap.get(Integer.valueOf(data[0]))));
            }
        } 
        data = null;
        br.close();
    }

    public User getUser(String key) {
        return userMap.get(key);
    }
    public UserDetail getUserDetail(int key) {
        return userDetailMap.get(key);
    }

    public static boolean isInteger(String s) {
       
        boolean isValidInteger = false;
        try {
            Integer.parseInt(s);
          

            isValidInteger = true;
        } catch (NumberFormatException ex) {
           
        }

        return isValidInteger;
    }
}