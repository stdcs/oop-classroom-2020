import java.io.*;
import java.util.HashMap;
class DataSource {
    private static DataSource dataSource;
    private HashMap<String, User> userMap = new HashMap<>();
    private HashMap<Integer, UserDetail> userDetailMap = new HashMap<>();
    private void DataSource() {
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
    private void putUser() {
        FileReader file = null;
        BufferedReader reader = null;

        try {
            file = new FileReader("User.txt");
            reader = new BufferedReader(file);
            String s;
            while ((s = reader.readLine())!= null) {
                String a[] = s.split(";");
                for (int i = 0; i < a.length; i++) {
                    if (isInteger(a[0])) {
                        userMap.put(a[1], new User(Integer.valueOf(a[0]), a[1], a[2],
                        userDetailMap.get(Integer.valueOf(a[0]))));
                    }
                } 
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (file != null) {
                    file.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
    private void putUserDetail() {
        FileReader file = null;
        BufferedReader reader = null;
        try {
            file = new FileReader("UserDetail.txt");
            reader = new BufferedReader(file);
            String s;
            while((s = reader.readLine())!= null) {
                String a[] = s.split(";");
                for (int i = 0; i < a.length; i++) {
                    if (isInteger(a[0])) {
                        userDetailMap.put(Integer.valueOf(a[0]),
                        new UserDetail(Integer.valueOf(a[0]), a[1], a[2], a[3]));
                    }
                    
                } 
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (file != null) {
                    file.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
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
        } catch (NumberFormatException ioe) {
        }
        return isValidInteger;
    }
}