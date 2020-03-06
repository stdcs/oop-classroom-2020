import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Map<String, String> facultyMap = new HashMap<>();
    Map<String, String> majorMap = new HashMap<>();
    facultyMap.put("Ilmu Budaya", "A");
    facultyMap.put("Hukum", "B");
    facultyMap.put("Kedokteran", "C");
    facultyMap.put("Pertanian", "D");
    facultyMap.put("Sosial dan Politik", "E");
    facultyMap.put("Teknik", "F");
    facultyMap.put("Farmasi", "G");
    facultyMap.put("MIPA", "H");
    majorMap.put("Sastra Inggris", "01");
    majorMap.put("Administrasi Negara", "02");
    majorMap.put("Ilmu Kedokteran", "03");
    majorMap.put("Agribisnis", "04");
    majorMap.put("Sosiologi", "05");
    majorMap.put("Teknik Informatika", "06");
    majorMap.put("Ilmu Komputer", "07");

    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();
    
    student1.setFirstName("trULY");
    student1.setLastName("ROSElyne immANuelle RieuwpassA");
    student1.setRegisterYear(2019);
    student1.setFaculty("MIPA");
    student1.setDepartment("Matematika");
    student1.setMajor("Ilmu Komputer");
    student1.setId(facultyMap, majorMap);
    student1.setEmail(facultyMap);
    
    student2.setFirstName("weyNY");
    student2.setLastName("SAN");
    student2.setRegisterYear(2018);
    student2.setFaculty("Hukum");
    student2.setDepartment("Hukum");
    student2.setMajor("Administrasi Negara");
    student2.setId(facultyMap, majorMap);
    student2.setEmail(facultyMap);
    
    student3.setFirstName("puTra");
    student3.setLastName("wahyU");
    student3.setRegisterYear(2017);
    student3.setFaculty("Teknik");
    student3.setDepartment("Teknik Elektro");
    student3.setMajor("Teknik Informatika");
    student3.setId(facultyMap, majorMap);
    student3.setEmail(facultyMap);

    student1.desc();
    student2.desc();
    student3.desc();

  }
}