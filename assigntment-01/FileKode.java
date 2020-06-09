import java.util.Map;
import java.util.HashMap;

public class FileKode{
    public static void main (String []args){

    Map<String, String> facultyMap = new HashMap<>();
    Map<String, String> majorMap = new HashMap<>();
        facultyMap.put("FIKP", "A");
        facultyMap.put("FKM", "B");
        facultyMap.put("FK", "C");
        facultyMap.put("FH", "D");
        facultyMap.put("FISIP", "F");
        facultyMap.put("FIB", "G");
        facultyMap.put("FMIPA", "H");
        majorMap.put("MATEMATIKA", "01");
        majorMap.put("FISIKA", "02");
        majorMap.put("BIOLOGI", "03");
        majorMap.put("GOEFISIKA", "04");
        majorMap.put("STATISTIKA", "05");
        majorMap.put("KIMIA", "06");
        majorMap.put("ILMU KOMPUTER", "07");

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        student1.setFirstName("aDriSumaTri");
        student1.setLastName("sAkri");
        student1.setRegisterYear("2019");
        student1.setDepartement("MATEMATIKA");
        student1.setMAjor("ILMU KOMPUTER");
        student1.setId(facultyMap, majorMap);
        student1.setEmail(facultyMap);

        student1.setFirstName("aDriSumaTri");
        student1.setLastName("sAkri");
        student1.setRegisterYear("2019");
        student1.setDepartement("MATEMATIKA");
        student1.setMAjor("ILMU KOMPUTER");
        student1.setId(facultyMap, majorMap);
        student1.setEmail(facultyMap);

        student2.setFirstName("mUHammAd");
        student2.setLastName("fITRAH");
        student2.setRegisterYear(2017);
        student2.setDepartement("MATEMATIKA");
        student2.setMAjor("ILMU KOMPUTER");
        student2.setId(facultyMap, majorMap);
        student2.setEmail(facultyMap);

        student3.setFirstName("KENNEDY");
        student3.setLastName(" ");
        student3.setRegisterYear(2017);
        student3.setDepartement("MATEMATIKA");
        student3.setMAjor("ILMU KOMPUTER");
        student3.setId(facultyMap, majorMap);
        student3.setEmail(facultyMap);

        student3.setFirstName("khawaritzmi");
        student3.setLastName("abdallah ahmad");
        student3.setRegisterYear(2017);
        student3.setDepartement("MATEMATIKA");
        student3.setMAjor("ILMU KOMPUTER");
        student3.setId(facultyMap, majorMap);
        student3.setEmail(facultyMap);

        student1.description();
        student2.description();
        student3.description();
        student4.description();
    }
}