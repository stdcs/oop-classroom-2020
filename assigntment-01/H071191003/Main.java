
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
        facultyMap.put("Faculty of Magic", "A");
        facultyMap.put("Faculty of Sorcery", "B");
        facultyMap.put("Faculty of Witchcraft", "C");
        facultyMap.put("Faculty of Muggle Sciences", "D");
        facultyMap.put("Faculty of Wizardry", "E");
        facultyMap.put("Random Faculty 1", "F");
        facultyMap.put("Random Faculty 2", "G");
        facultyMap.put("MIPA", "H");
        majorMap.put("Voldemort", "01");
        majorMap.put("Does", "02");
        majorMap.put("Not", "03");
        majorMap.put("Have", "04");
        majorMap.put("A", "05");
        majorMap.put("Nose", "06");
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
        student2.setFaculty("Faculty of Muggle Sciences");
        student2.setDepartment("Muggle Studies");
        student2.setMajor("Voldemort");
        student2.setId(facultyMap, majorMap);
        student2.setEmail(facultyMap);

        student3.setFirstName("ElOn Reeve");
        student3.setLastName("Musk");
        student3.setRegisterYear(2000);
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