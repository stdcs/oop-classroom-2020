public class User {

	private Integer id;
	private String userName, password;
	private UserDetail userDetail;
	
	User(Integer a, String b, String c, UserDetail d){
		id= a;
		userName= b;
		password= c;
		userDetail= d;
	}
	
	public Integer getId() {return id;}
	public String getUserName() {return userName;}
	public String getPassword() {return password;}
	public UserDetail getUserDetail() {return userDetail;}
	public boolean checkPass(String a) { return a.equals(password);}
	
}
