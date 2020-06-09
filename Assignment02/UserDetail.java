public class UserDetail {
	
	private Integer id;
	private String name, dateOfBirth, email;
	
	UserDetail(Integer a, String b, String c, String d){
		id= a;
		name= b;
		dateOfBirth= c;
		email= d;
	}
	
	public Integer getId() {return id;}
	public String getName() {return name;}
	public String getDateOfBirth() {return dateOfBirth;}
	public String getEmail() {return email;}
	
}
