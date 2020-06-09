import java.util.HashMap;
import java.util.Map;
import java.io.*;

//menangani database
public class DataSource {
    // hashmap
    private Map<String, User> userMap = new HashMap<>();
    private Map<Integer, UserDetail> userDetailMap = new HashMap<>();
    // singleton pattern
    private static DataSource instance;

    private DataSource() {
        try {
            putUserDetail();
            putUser();
        } catch (IOException e) {
        }
    }
    public static DataSource getInstance(){
        if(instance==null){
            instance = new DataSource(); 
        }
        return instance;
    }

    //MEMBACA FILE TXT KEMUDIAN DIMASUKKAN KE HASHMAP
    private String baca (String namaFile) throws IOException{
        FileReader read = null;
        BufferedReader br = null;
        String input = "";
        try{
            read = new FileReader(namaFile);
            br = new BufferedReader(read);
            String str;
            while ((str = br.readLine())!=null){
                input += str+"\n";
            }
        } finally {
            if (br != null) {
                br.close();
            }
            if (read != null) {
                read.close();
            }
        }
        return input; 
        
    }
    //method yang memasukkan nilai dari txt serta kedalam hashmap serta membuat object untuk tiap nilai
    private void putUserDetail() throws IOException {
        String inputUserDetail = baca("UserDetail.txt");
        String barisUD [] = inputUserDetail.split("\\r?\\n");
        for(int i=0;i<barisUD.length;i++){
            String dataUD [] = barisUD [i].split(";");
            userDetailMap.put(Integer.valueOf(dataUD[0]), (new UserDetail(Integer.valueOf(dataUD[0]), dataUD[1], dataUD[2], dataUD[3])));
        }
    }
    private void putUser() throws IOException{
        String inputUser = baca("User.txt");
        String barisUD [] = inputUser.split("\\r?\\n");
        for(int i=0;i<barisUD.length;i++){
            String dataUD [] = barisUD [i].split(";");
            userMap.put(dataUD[1], (new User(Integer.valueOf(dataUD[0]), dataUD[1], dataUD[2], userDetailMap.get(Integer.valueOf(dataUD[0])))));
        }
    }

    //RETURN USER DAN DETAIL KE CLASS LOGIN
    public User getUser(String key){
        //jika username yang masuk ke userMap sebagai key ada maka User akan dilemparkan ke login
        return userMap.get(key);
    }
    // //Method ini tidak digunakan
    // public UserDetail getUserDetail (int key){
    //     return userDetailMap.get(key);
    // }
}