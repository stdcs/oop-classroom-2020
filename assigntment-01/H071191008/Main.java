package id.taufiq;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> facultyMap = new HashMap<>();
        Map<String, String> majorMap = new HashMap<>();

        facultyMap.put("Fakultas", "A");
        facultyMap.put("Fakultas A", "B");
        facultyMap.put("Fakultas B", "C");
        facultyMap.put("Fakultas C", "D");
        facultyMap.put("Fakultas D", "E");
        facultyMap.put("Fakultas E", "F");
        facultyMap.put("Fakultas F", "G");
        facultyMap.put("MIPA", "H");

        majorMap.put("Prodi A", "01");
        majorMap.put("Prodi B", "02");
        majorMap.put("Prodi C", "03");
        majorMap.put("Prodi D", "04");
        majorMap.put("Prodi E", "05");
        majorMap.put("Prodi F", "06");
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
