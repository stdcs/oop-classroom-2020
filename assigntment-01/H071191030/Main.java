import java.util.HashMap;
import java.util.Map;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Map<String,String> facultyMap = new HashMap<>();
        Map<String, String> majorMap = new HashMap<>();
        facultyMap.put("Ekonomi dan Bisnis", "A");
        facultyMap.put("Hukum", "B");
        facultyMap.put("Kedokteran", "C");
        facultyMap.put("Teknik", "D");
        facultyMap.put("SOSPOL", "E");
        facultyMap.put("Ilmu Budaya", "F");
        facultyMap.put("Pertanian", "G");
        facultyMap.put("MIPA", "H");
 

        majorMap.put("Matematika", "01");
        majorMap.put("Fisika", "02");
        majorMap.put("Sosiologi", "03");
        majorMap.put("Ilmu Politik", "04");
        majorMap.put("Statistika", "05");
        majorMap.put("Hubungan Internasional", "06");
        majorMap.put("Ilmu Komputer", "07");
        majorMap.put("Aktuaria", "08");

        Student student1 = new Student();
        Student student2  = new Student();
        Student student3 = new Student();

        student1.setFirstName("mUHammAd");
        student1.setLastName("ZaKy IrGiaWan");
        student1.setRegisterYear(2019);
        student1.setFaculty("SOSPOL");
        student1.setDepartment("Ilmu Politik");
        student1.setMajor("Ilmu Politik");
        student1.setId(facultyMap, majorMap);
        student1.setEmail(facultyMap);
        
        student2.setFirstName("jAMiL");
        student2.setLastName("HaidiR");
        student2.setRegisterYear(2019);
        student2.setFaculty("SOSPOL");
        student2.setDepartment("Sosiologi");
        student2.setMajor("Sosiologi");
        student2.setId(facultyMap, majorMap);
        student2.setEmail(facultyMap);
        
        student3.setFirstName("Pande");
        student3.setLastName("putu DYLAN sugAnggA");
        student3.setRegisterYear(2019);
        student3.setFaculty("SOSPOL");
        student3.setDepartment("Hubungan Internasional");
        student3.setMajor("Hubungan Internasional");
        student3.setId(facultyMap, majorMap);
        student3.setEmail(facultyMap);
    
        student1.description();
        student2.description();
        student3.description();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}