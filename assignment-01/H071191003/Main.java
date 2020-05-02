
/**
 * By Arsyi Syarief Aziz
 * Student ID: H071191003
 *       ◁►2020◀︎▷
*/

import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
        Map<String, String> facultyMap = new HashMap<>();
        Map<String, String> majorMap = new HashMap<>();
        facultyMap.put("Fakultas Ekonomi dan Bisnis", "A");
        facultyMap.put("Fakultas Hukum", "B");
        facultyMap.put("Fakultas Kedokteran", "C");
        facultyMap.put("Fakultas Teknik", "D");
        facultyMap.put("Fakultas Ilmu Sosial dan Ilmu Politik", "E");
        facultyMap.put("Fakultas Ilmu Budaya", "F");
        facultyMap.put("Fakultas Pertanian", "G");
        facultyMap.put("MIPA", "H");
        majorMap.put("Matematika", "01");
        majorMap.put("Fisika", "02");
        majorMap.put("Kimia", "03");
        majorMap.put("Biologi", "04");
        majorMap.put("Statistika", "05");
        majorMap.put("Geofisika", "06");
        majorMap.put("Ilmu Komputer", "07");

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setFirstName("ArSyi SyARIef");
        student1.setLastName("aZiz");
        student1.setRegisterYear(2019);
        student1.setFaculty("MIPA");
        student1.setDepartment("Matematika");
        student1.setMajor("Ilmu Komputer");
        student1.setId(facultyMap, majorMap);
        student1.setEmail(facultyMap);

        student2.setFirstName("haRrY");
        student2.setLastName("PoTTer");
        student2.setRegisterYear(1750);
        student2.setFaculty("MIPA");
        student2.setDepartment("Biologi");
        student2.setMajor("Biologi");
        student2.setId(facultyMap, majorMap);
        student2.setEmail(facultyMap);

        student3.setFirstName("ElOn Reeve");
        student3.setLastName("Musk");
        student3.setRegisterYear(2000);
        student3.setFaculty("MIPA");
        student3.setDepartment("Geofisika");
        student3.setMajor("Geofisika");
        student3.setId(facultyMap, majorMap);
        student3.setEmail(facultyMap);

        student1.description();
        student2.description();
        student3.description();

    }
}