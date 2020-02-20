import java.util.*;

public class Main {

    public static void main(String[] args) {

    Map<String, String> facultyCode = new HashMap<>();
    Map<String, String> majorCode = new HashMap<>();

    facultyCode.put("Nama Fakultas Lain", "A");
    facultyCode.put("Nama Fakultas Lain", "B");
    facultyCode.put("Nama Fakultas Lain", "C");
    facultyCode.put("Nama Fakultas Lain", "D");
    facultyCode.put("Nama Fakultas Lain", "E");
    facultyCode.put("Nama Fakultas Lain", "F");
    facultyCode.put("Nama Fakultas Lain", "G");
    facultyCode.put("MIPA", "H");
    majorCode.put("Matematika", "01");
    majorCode.put("Fisika", "02");
    majorCode.put("Kimia", "03");
    majorCode.put("Biologi", "04");
    majorCode.put("Statistika", "05");
    majorCode.put("Geofisika", "06");
    majorCode.put("Ilmu Komputer", "07");

    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();

    student1.setFirstName("Agus");
    student1.setLastName("Sutomo");
    student1.setRegisterYear(2019);
    student1.setFaculty("MIPA");
    student1.setDepartment("Kimia");
    student1.setMajor("Kimia");
    student1.setId(facultyCode, majorCode);
    student1.setEmail(facultyCode);

    student2.setFirstName("Bambang");
    student2.setLastName("");
    student2.setRegisterYear(2018);
    student2.setFaculty("MIPA");
    student2.setDepartment("Biologi");
    student2.setMajor("Biologi");
    student2.setId(facultyCode, majorCode);
    student2.setEmail(facultyCode);

    student3.setFirstName("Christian");
    student3.setLastName("Pentagon Batlayar");
    student3.setRegisterYear(2019);
    student3.setFaculty("MIPA");
    student3.setDepartment("Matematika");
    student3.setMajor("Ilmu Komputer");
    student3.setId(facultyCode, majorCode);
    student3.setEmail(facultyCode);

    student1.description();
    student2.description();
    student3.description();

    }
}
