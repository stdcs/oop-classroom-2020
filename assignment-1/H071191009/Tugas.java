import java.util.HashMap;
import java.util.Map;

public class Tugas {

  public static void main(String[] args) {
    Map<String, String> facultyMap = new HashMap<>();
    Map<String, String> majorMap = new HashMap<>();
    facultyMap.put("Nama Fakultas Lain", "A");
    facultyMap.put("Nama Fakultas Lain", "B");
    facultyMap.put("Nama Fakultas Lain", "C");
    facultyMap.put("Nama Fakultas Lain", "D");
    facultyMap.put("Nama Fakultas Lain", "E");
    facultyMap.put("Nama Fakultas Lain", "F");
    facultyMap.put("Nama Fakultas Lain", "G");
    facultyMap.put("MIPA", "H");
    majorMap.put("Prodi Lain", "01");
    majorMap.put("Prodi Lain", "02");
    majorMap.put("Prodi Lain", "03");
    majorMap.put("Prodi Lain", "04");
    majorMap.put("Prodi Lain", "05");
    majorMap.put("Prodi Lain", "06");
    majorMap.put("Ilmu Komputer", "07");

    Mahasiswa mahasiswa1 = new Mahasiswa();
    Mahasiswa mahasiswa2 = new Mahasiswa();
    Mahasiswa mahasiswa3 = new Mahasiswa();
    
    mahasiswa1.setFirstname("mUHammAd");
    mahasiswa1.setLastname("fITRAH");
    mahasiswa1.setRegisterYear(2017);
    mahasiswa1.setFaculty("MIPA");
    mahasiswa1.setDepartemen("Matematika");
    mahasiswa1.setMajor("Ilmu Komputer");
    mahasiswa1.setId(facultyMap, majorMap);
    mahasiswa1.setEmail(facultyMap);
    
    mahasiswa2.setFirstname("KENNEDY");
    mahasiswa2.setLastname("");
    mahasiswa2.setRegisterYear(2017);
    mahasiswa2.setFaculty("MIPA");
    mahasiswa2.setDepartemen("Matematika");
    mahasiswa2.setMajor("Ilmu Komputer");
    mahasiswa2.setId(facultyMap, majorMap);
    mahasiswa2.setEmail(facultyMap);
    
    mahasiswa3.setFirstname("Khawaritzmi");
    mahasiswa3.setLastname("abdallah ahmad");
    mahasiswa3.setRegisterYear(2017);
    mahasiswa3.setFaculty("MIPA");
    mahasiswa3.setDepartemen("Matematika");
    mahasiswa3.setMajor("Ilmu Komputer");
    mahasiswa3.setId(facultyMap, majorMap);
    mahasiswa3.setEmail(facultyMap);

    mahasiswa1.desc();
    mahasiswa2.desc();
    mahasiswa3.desc();

  }
}