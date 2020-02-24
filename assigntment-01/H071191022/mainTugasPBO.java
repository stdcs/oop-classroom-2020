import java.util.HashMap;
import java.util.Map;

public class mainTugasPBO {

  public static void main(String[] args) {
    Map<String, String> facultyMap = new HashMap<>();
    Map<String, String> majorMap = new HashMap<>();
    facultyMap.put("Ekonomi dan Bisnis", "A");
    facultyMap.put("Hukum", "B");
    facultyMap.put("Kedokteran", "C");
    facultyMap.put("Teknik", "D");
    facultyMap.put("Ilmu Sosial dan Ilmu Politik", "E");
    facultyMap.put("Ilmu Budaya", "F");
    facultyMap.put("Pertanian", "G");
    facultyMap.put("MIPA", "H")
    majorMap.put("Matematika", "01");
    majorMap.put("Statistika", "02");
    majorMap.put("Kimia", "03");
    majorMap.put("Fisika", "04");
    majorMap.put("Biologi", "05");
    majorMap.put("Geofisika", "06");
    majorMap.put("Ilmu Komputer", "07");

    // Student student1 = new Student();
    // Student student2 = new Student();
    // Student student3 = new Student();

    studentPBO student1 = new studentPBO();
    studentPBO student2 = new studentPBO();
    studentPBO student3 = new studentPBO();
    
    student1.setFirstName("SePti");
    student1.setLastName("INtan AmAlia");
    student1.setRegisterYear(2019);
    student1.setFaculty("MIPA");
    student1.setDepartment("Matematika");
    student1.setMajor("Ilmu Komputer");
    student1.setId(facultyMap, majorMap);
    student1.setEmail(facultyMap);
    
    student2.setFirstName("Riskha");
    student2.setLastName("");
    student2.setRegisterYear(2019);
    student2.setFaculty("MIPA");
    student2.setDepartment("Matematika");
    student2.setMajor("Matematika");
    student2.setId(facultyMap, majorMap);
    student2.setEmail(facultyMap);
    
    student3.setFirstName("Muflihun");
    student3.setLastName("Naim");
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