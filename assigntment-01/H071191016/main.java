package H071191016;

import java.util.HashMap;
import java.util.Map;

class main {
    public static void main(String [] args) {
        Map<String, String> facultyMap = new HashMap<>();
        Map<String, String> majorMap = new HashMap<>();
            facultyMap.put("Ekonomi dan Bisnis", "A");
            facultyMap.put("MIPA", "H");
            facultyMap.put("Kedokteran", "I");
            
            majorMap.put("Manajemen", "01");
            majorMap.put("Ilmu Komputer", "07");
            majorMap.put("Pendidikan Dokter", "09");
        
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setFirstName("mUHammAd");
        student1.setLastName("aDRIan");
        student1.setRegisterYear(2019);
        student1.setFaculty("Ekonomi dan Bisnis");
        student1.setDepartment("Manajemen");
        student1.setMajor("Manajemen");
        student1.setId(facultyMap, majorMap);
        student1.setEmail(facultyMap);
        
        student2.setFirstName("anDi");
        student2.setLastName("ilhamSyah Idris");
        student2.setRegisterYear(2019);
        student2.setFaculty("MIPA");
        student2.setDepartment("Matematika");
        student2.setMajor("Ilmu Komputer");
        student2.setId(facultyMap, majorMap);
        student2.setEmail(facultyMap);

        student3.setFirstName("risQuL");
        student3.setLastName("");
        student3.setRegisterYear(2019);
        student3.setFaculty("Kedokteran");
        student3.setDepartment("Pendidikan Dokter");
        student3.setMajor("Pendidikan Dokter");
        student3.setId(facultyMap, majorMap);
        student3.setEmail(facultyMap);

        student1.desc();
        student2.desc();
        student3.desc();

        // System.out.println(student2.getId());
        // System.out.println(student2.getEmail());
    }

}