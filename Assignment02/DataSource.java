import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class DataSource {
	
	private static DataSource dataSource;
	private HashMap <String , User> userMap= new HashMap<>();
	private HashMap <Integer , UserDetail> userDetailMap= new HashMap<>();
	
	private DataSource() {
		try {
			putUserDetail();
			putUser();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	 public static DataSource getInstance() {
		 if (dataSource == null) { dataSource = new DataSource(); }
		 return dataSource;
	 }
	
	private void putUserDetail() throws IOException{
		
		BufferedReader pembacaFile= new BufferedReader(new FileReader("UserDetail.txt"));	
		String baca;	
		while((baca= pembacaFile.readLine())!= null){
			String [] split= baca.split(";");
			userDetailMap.put(keInt(split[0]), new UserDetail(keInt(split[0]), split[1], split[2], split[3]));
		}
		
		if(pembacaFile!=null) pembacaFile.close();
		
	}
	
	private void putUser() throws IOException{
		
		BufferedReader pembacaFile= new BufferedReader(new FileReader("User.txt"));	
		String baca;	
		while((baca= pembacaFile.readLine())!= null){
			String [] split= baca.split(";");
			userMap.put(split[1], new User(keInt(split[0]), split[1], split[2], userDetailMap.get(keInt(split[0]))));
		}
		
		if(pembacaFile!=null) pembacaFile.close();
		
	}
	
	public User getUser(String key) {
		return userMap.get(key);
	}
	
	public UserDetail getUserDetail(Integer key) {
		return userDetailMap.get(key);
	}

	public Integer keInt(String a) { return Integer.parseInt(a);}
	
}
