import java.io.*;
 import java.util.HashMap;
 import java.util.ArrayList;
 import java.util.Arrays;

 class DataSource {
     static DataSource instance = null;
     private HashMap<String, User> userMap = new HashMap<>();
     private HashMap<Integer, UserDetail> userDetailMap = new HashMap<>();

     private DataSource() {
         putUserDetail();
         putUser();
     }

     static public DataSource getInstance() {
         if (instance == null)
             instance = new DataSource();
         return instance;
     }

     private void putUserDetail() {
         BufferedReader br = null;
         try {
             br = new BufferedReader(new FileReader("UserDetail.txt"));
             String s = "";
             while ((s = br.readLine()) != null) {
                 ArrayList<String> sList = new ArrayList<String>(Arrays.asList(s.split(";")));
                 UserDetail userDetail = new UserDetail(Integer.valueOf(sList.get(0)), sList.get(1), sList.get(2),
                         sList.get(3));
                 userDetailMap.put(Integer.valueOf(sList.get(0)), userDetail);
             }
         } catch (IOException e) {
             System.out.println(e.getMessage());
         } finally {
             try {
                 if (br != null) {
                     br.close();
                 }
             } catch (IOException e) {
                 System.out.println(e);
             }
         }
     }

     private void putUser() {
         BufferedReader br = null;
         try {
             br = new BufferedReader(new FileReader("User.txt"));
             String s;
             while ((s = br.readLine()) != null) {
                 ArrayList<String> sList = new ArrayList<String>(Arrays.asList(s.split(";")));
                 User user = new User(Integer.valueOf(sList.get(0)), sList.get(1), sList.get(2),
                         userDetailMap.get(Integer.valueOf(sList.get(0))));
                 userMap.put(sList.get(1), user);
             }
         } catch (IOException e) {
             System.out.println(e.getMessage());
         } finally {
             try {
                 if (br != null) {
                     br.close();
                 }
             } catch (IOException e) {
                 System.out.println(e);
             }
         }
     }

     public User getUser(String key) {
         return userMap.get(key);
     }

     public UserDetail getUserDetail(Integer key) {
         return userDetailMap.get(key);
     }
 } 
