package OOP.Assignment02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

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
        // This Method Reads data from the UserDetail.txt file, then saves the data
        // into UserDetailMap
        BufferedReader br = new BufferedReader(new FileReader("UserDetail.txt"));
        String data[];
        while(br.ready()){
            data = br.readLine().split(";");
            //inputs user detail into user detail Map if the data starts with a valid id
            if(isInteger(data[0])){
                userDetailMap.put(Integer.valueOf(data[0]),
                        new UserDetail(Integer.valueOf(data[0]), data[1], data[2], data[3]));

            }
        }
        data = null;
        br.close();
    }

    private void putUser() throws Exception{
        // This Method Reads data from the User.txt file, then saves the data
        // into UserMap
        BufferedReader br = new BufferedReader(new FileReader("User.txt"));
        String data[];
        while(br.ready()){
            data = br.readLine().split(";");
            // inputs user into userMap if the data starts with a valid id
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
        //This method checks if a string is an integer
        boolean isValidInteger = false;
        try {
            Integer.parseInt(s);
            // s is a valid integer

            isValidInteger = true;
        } catch (NumberFormatException ex) {
            // s is not an integer
        }

        return isValidInteger;
    }

}