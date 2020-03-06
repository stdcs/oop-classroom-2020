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

    Mahasiswa mahasiswa1 = new Mahasiswa();
    Mahasiswa mahasiswa2 = new Mahasiswa();
    Mahasiswa mahasiswa3 = new Mahasiswa();

    mahasiswa1.setFirstName("farhan");
    mahasiswa1.setLastName("Ramdani");
    mahasiswa1.setRegisterYear(2017);
    mahasiswa1.setFaculty("MIPA");
    mahasiswa1.setDepartment("Matematika");
    mahasiswa1.setMajor("ilmu Komputer");
    mahasiswa1.setId(facultyCode, majorCode);
    mahasiswa1.setEmail(facultyCode);

    mahasiswa2.setFirstName("Alfandy");
    mahasiswa2.setLastName("ruslan");
    mahasiswa2.setRegisterYear(2019);
    mahasiswa2.setFaculty("MIPA");
    mahasiswa2.setDepartment("Matematika");
    mahasiswa2.setMajor("ilmu Komputer");
    mahasiswa2.setId(facultyCode, majorCode);
    mahasiswa2.setEmail(facultyCode);

    mahasiswa3.setFirstName("Dicky");
    mahasiswa3.setLastName("Ikbal Pratama");
    mahasiswa3.setRegisterYear(2017);
    mahasiswa3.setFaculty("MIPA");
    mahasiswa3.setDepartment("Matematika");
    mahasiswa3.setMajor("Ilmu Komputer");
    mahasiswa3.setId(facultyCode, majorCode);
    mahasiswa3.setEmail(facultyCode);

    mahasiswa1.description();
    mahasiswa2.description();
    mahasiswa3.description();

    }
}