import java.io.*;
import java.util.Map;
import java.util.HashMap;

class DataSource {
    private static DataSource dataSource;
    private Map<String, User> userMap = new HashMap<String, User>();
    private Map<Integer, UserDetail> userDetailMap = new HashMap<Integer, UserDetail>();

    private DataSource() {
        try{
            putUserDetail();
            putUser();
        } catch(Exception e) {
            e.getMessage();
        }
    }

    public static DataSource getInstance() {
        if(dataSource == null){
            dataSource = new DataSource();
        }
        return dataSource;
    }

    private void putUser() throws IOException {
        FileReader file = new FileReader("user.txt");
        BufferedReader reader = new BufferedReader(file);
        reader.mark(200);
        String dataList[];

        while (reader.ready()) {
            dataList = reader.readLine().split(";");
            if (isInteger(dataList[0])) {
                userMap.put(dataList[1], new User(Integer.valueOf(dataList[0]), dataList[1], dataList[2], userDetailMap.get(Integer.valueOf(dataList[0]))));
            }
        } 
        dataList = null;
        reader.reset();
        reader.close();
        file.close();

    }
    private void putUserDetail() throws IOException {
        FileReader file = new FileReader("userdetail.txt");
        BufferedReader reader = new BufferedReader(file);
        reader.mark(500);
        String dataList[];

        while (reader.ready()) {
            dataList = reader.readLine().split(";");
            if (isInteger(dataList[0])){
                userDetailMap.put(Integer.valueOf(dataList[0]), new UserDetail(Integer.valueOf(dataList[0]), dataList[1], dataList[2], dataList[3]));
            }
        }
        dataList = null;
        reader.reset();
        reader.close();
        file.close();



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
        return
 isValidInteger;
    }
}
