import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * DataSource
 */
public class DataSource {

    private static DataSource dataSource;
    private HashMap<String,User> userMap = new HashMap<>();
    private HashMap<Integer,UserDetail>userDetailMap =  new HashMap<>();

    private DataSource(){
        putUserDetail();
        putUser();
    }
    public static DataSource getInstance(){
        if(dataSource == null){
            dataSource = new DataSource();
        }
            return dataSource;
    }
    private void putUserDetail(){
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            fr = new FileReader("UserDetail.txt");
            br = new BufferedReader(fr);

            String line;
            String arr [];
            while((line=br.readLine())!=null){
                arr = line.split(";");
                userDetailMap.put(Integer.parseInt(arr[0]),new UserDetail((Integer.parseInt(arr[0])),arr[1],arr[2],arr[3]));
            }
        }catch(IOException io){
            io.printStackTrace();
        }finally{
            try{
                if(br!=null){
                    br.close();
                }
                if(fr!=null){
                    fr.close();
                }
            } catch (IOException io){
                io.printStackTrace();
            }
        }

    }
    private void putUser(){
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            fr = new FileReader("User.txt");
            br = new BufferedReader(fr);

            String line;
            String arr [];
            while((line=br.readLine())!=null){
                arr = line.split(";");
                userMap.put(arr[1], new User(Integer.valueOf(arr[0]),arr[1], arr[2],userDetailMap.get(Integer.parseInt(arr[0]))));
            }
        }catch(IOException io){
            io.printStackTrace();
        }finally{
            try{
                if(br!=null){
                    br.close();
                }
                if(fr!=null){
                    fr.close();
                }
            } catch (IOException io){
                io.printStackTrace();
            }
        }
    }
    public User getUser(String key){
        return userMap.get(key);
    }
    public UserDetail getUserDetail(int key){
        return userDetailMap.get(key);
    }
}

