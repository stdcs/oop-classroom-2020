import java.util.Map;
import java.util.Random;

public class Student {

	private String id;
	private String firstName= "";
	private String lastName;
	private String email;
	private String faculty;
	private String department;
	private String major;
	private int registerYear;

  void setFirstName(String fn) { firstName= fn; }
	void setLastName(String ln) { lastName= ln;}
	void setEmail(String email) { this.email= email;}
	void setFaculty(String fakultas) { faculty= fakultas;}
	void setDepartment(String depart) { department= depart;}
	void setMajor(String prodi) { major= prodi;}
	void setRegisterYear(int tahunMasuk) { registerYear= tahunMasuk;}

	String getId() { return id;}
	String getEmail() { return email;}
	String getFaculty() { return faculty;}
	String getDepartment() { return department;}
	String getMajor() { return major;}

	public String getFullName() {
		String a;
		if(firstName.length()==0) a= (lastName.toLowerCase());
		else a= ((firstName+" "+lastName).toLowerCase());

		char [] b= a.toCharArray();
			for (int i=0; i<a.length(); i++) {
	        	if (i==0 && b[i]!=' ' || b[i]!=' ' && b[i-1]==' ') {
	        		if (b[i] >= 'a' && b[i] <= 'z') b[i] = (char)(b[i] - 'a' + 'A');
	            }
	        }
        a= new String(b);
       	return a;
	}

	public void setId(Map<String , String> fakultas, Map<String , String> prodi) {
		Random random= new Random();
		id= fakultas.get(faculty) + prodi.get(major) + 1 + (""+registerYear).substring(2) + 0 +random.nextInt(61);
	}

	public void setEmail(Map <String , String> fakultas) {
		String [] a= (getFullName().toLowerCase()).split(" ");
		String kata1= a[a.length-1];
		String kata2= "";
			for(int i=0; i<a.length; i++) {
				kata2+= a[i].charAt(0);
			}
		email= kata1 + kata2.substring(0,kata2.length()-1) + (""+registerYear).substring(2) + fakultas.get(faculty) + "@student.unhas.ac.id";
	}

	public void description() {
		System.out.printf("Nama\t\t: %s\n", getFullName());
		System.out.printf("NIM\t\t: %s\n", getId());
		System.out.printf("Email Mahasiswa : %s\n", getEmail());
		System.out.printf("Fakultas\t: %s\n", faculty);
		System.out.printf("Departemen\t: %s\n", department);
		System.out.printf("Prodi\t\t: %s\n\n", major);
	}
}
