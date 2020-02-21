import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String [] args) {
		Map<String, String> facultyMap = new HashMap<>();
	    Map<String, String> majorMap = new HashMap<>();
	    
	    facultyMap.put("Ekonomi dan Bisnis", "A");
	    facultyMap.put("Hukum", "B");
	    facultyMap.put("Kedokteram", "C");
	    facultyMap.put("Teknik", "D");
	    facultyMap.put("Ilmu Sosial dan Politik", "E");
	    facultyMap.put("Ilmu Budaya", "F");
	    facultyMap.put("Pertanian", "G");
	    facultyMap.put("MIPA", "H");
	    facultyMap.put("Peternakan", "I");
	    facultyMap.put("Kedokteran Gigi", "J");
	    facultyMap.put("Kesehatan Masyarakat", "K");
	    facultyMap.put("Ilmu Kelautan dan Perikanan", "L");
	    facultyMap.put("Kehutanan", "M");
	    facultyMap.put("Farmasi", "N");
	    
	    majorMap.put("Metematika", "01");
	    majorMap.put("Fisika", "02");
	    majorMap.put("Biologi", "03");
	    majorMap.put("Kimia", "04");
	    majorMap.put("Geofisika", "05");
	    majorMap.put("Statistika", "06");
	    majorMap.put("Ilmu Komputer", "07");
	    majorMap.put("Aktuaria", "08");
		
	    Student student1 = new Student();
	    Student student2 = new Student();
	    Student student3 = new Student();
	    
	    student1.setFirstName("mUHammAd");
	    student1.setLastName("fITRAH");
	    student1.setRegisterYear(2017);
	    student1.setFaculty("MIPA");
	    student1.setDepartment("Matematika");
	    student1.setMajor("Ilmu Komputer");
	    student1.setId(facultyMap, majorMap);
	    student1.setEmail(facultyMap);
	    
	    student2.setFirstName("KENNEDY");
	    student2.setLastName("");
	    student2.setRegisterYear(2017);
	    student2.setFaculty("MIPA");
	    student2.setDepartment("Matematika");
	    student2.setMajor("Ilmu Komputer");
	    student2.setId(facultyMap, majorMap);
	    student2.setEmail(facultyMap);
	    
	    student3.setFirstName("Khawaritzmi");
	    student3.setLastName("abdallah ahmad");
	    student3.setRegisterYear(2017);
	    student3.setFaculty("MIPA");
	    student3.setDepartment("Matematika");
	    student3.setMajor("Ilmu Komputer");
	    student3.setId(facultyMap, majorMap);
	    student3.setEmail(facultyMap);

	    student1.description();
	    student2.description();
	    student3.description();

	}
}
