import java.io.*;
import java.util.*;
class DataSource{
    static DataSource dataSource = new DataSource();
    private Map<String,User> userMap = new HashMap<>();
    private Map<Integer, UserDetail> userDetailMap = new HashMap<>();

    private DataSource(){

    }

    public static DataSource getInstace(){
        if (dataSource == null) {
            dataSource = new DataSource();
        }
        return dataSource;
    }

    private void putUserDetail(){
        String data[] = userDetailCollect().split("\n");

        for (int i = 0; i < data.length; i++) {
            String userDetailData[] = data[i].split(";");
            userDetailMap.put(Integer.parseInt(userDetailData[0]), new UserDetail(Integer.parseInt(userDetailData[0]), userDetailData[1], userDetailData[2], userDetailData[3]));
        }
    }

    private void putUser(){
        String data[] = userCollect().split("\n");

        for (int i = 0; i < data.length; i++) {
            String userData[] = data[i].split(";");
            userMap.put(userData[1], new User(Integer.parseInt(userData[0]), userData[1], userData[2]));
        }
    }

    public User getUser(String key){
        putUser();
        return userMap.get(key);
    }

    public UserDetail getUserDetail(Integer key){
        putUserDetail();
        return userDetailMap.get(key);
    }

    private String userDetailCollect(){
        FileReader fr = null;
        BufferedReader bf = null;
        String data = "";
        try {
            fr = new FileReader("UserDetail.txt");
            bf = new BufferedReader(fr);
            String lineRead;
            while ((lineRead = bf.readLine()) != null ) {
                data += lineRead + "\n";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bf != null){
                    bf.close();
                }
                if (fr != null){
                    fr.close();
                }
            } catch (Exception e) {
               System.out.println(e.getMessage());
            }
        }
        return data;
    }

    private String userCollect(){
        FileReader fr = null;
        BufferedReader bf = null;
        String data = "";
        try {
            fr = new FileReader("User.txt");
            bf = new BufferedReader(fr);
            String lineRead;
            while ((lineRead = bf.readLine()) != null ) {
                data += lineRead + "\n";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bf != null){
                    bf.close();
                }
                if (fr != null){
                    fr.close();
                }
            } catch (Exception e) {
               System.out.println(e.getMessage());
            }
        }
        return data;
    }
}