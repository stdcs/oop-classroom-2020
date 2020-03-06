package TugasKakFitrah;
import java.util.*;
/**
 * MainClass
 */
public class MainClass {

    public static void main(String[] args) {

        Map<String, String> facultyMap = new HashMap<>();
        Map<String, String> majorMap = new HashMap<>();

        facultyMap.put("Kedokteran", "A");
        facultyMap.put("Teknik", "B");
        facultyMap.put("Ekonomi", "C");
        facultyMap.put("Hukum", "D");
        facultyMap.put("Ilmu Sosial dan Politik", "E");
        facultyMap.put("Kesehatan Masyarakat", "F");
        facultyMap.put("Farmasi", "G");
        facultyMap.put("MIPA", "H");

        majorMap.put("Pendidikan Dokter", "01");
        majorMap.put("Matematika", "02");
        majorMap.put("Kimia", "03");
        majorMap.put("Teknik Informatika", "04");
        majorMap.put("Teknik Lingkungan", "05");
        majorMap.put("Teknik Baper2an", "06");
        majorMap.put("Ilmu Komputer", "07");

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
        student3.setLastName("abdallah ahmad ");
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