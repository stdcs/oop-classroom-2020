
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> facultyMap = new HashMap<>();
        facultyMap.put("ILMU SOSIAL POLITIK", "A");
        facultyMap.put("KEDOKTERAN", "B");
        facultyMap.put("ILMU BUDAYA", "C");
        facultyMap.put("HUKUM", "D");
        facultyMap.put("EKONOMI", "E");
        facultyMap.put("KESMAS", "F");
        facultyMap.put("PETERNAKAN", "G");
        facultyMap.put("MIPA", "H");

        Map<String, String> majorMap = new HashMap<>();
        majorMap.put("MATEMATIKA", "01");
        majorMap.put("STATISTIKA", "02");
        majorMap.put("KIMIA", "03");
        majorMap.put("FISIKA", "04");
        majorMap.put("GEOFISIKA", "05");
        majorMap.put("BIOLOGI", "06");
        majorMap.put("Ilmu Komputer", "07");

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setFirstName("Siti");
        student1.setLastName("Nisrina Nabilah Puteri Sulfi Yudo");
        student1.setRegisterYear(2019);
        student1.setFaculty("MIPA");
        student1.setDepartment("Matematika");
        student1.setMajor("Ilmu Komputer");
        student1.getRegisterYear();
        student1.setId(facultyMap, majorMap);
        student1.setEmail(facultyMap);

        student2.setFirstName("SINTA");
        student2.setLastName("");
        student2.setRegisterYear(2018);
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