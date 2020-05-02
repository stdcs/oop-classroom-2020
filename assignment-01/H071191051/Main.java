import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map <String, String> facultyMap = new HashMap<>();
        Map <String, String> majorMap = new HashMap<>();
        facultyMap.put("Kedokteran", "A");
        facultyMap.put("Farmasi", "B");
        facultyMap.put("Teknik", "C");
        facultyMap.put("Kehutanan", "D");
        facultyMap.put("Pertanian", "E");
        facultyMap.put("Keperawatan", "F");
        facultyMap.put("KesMas", "G");
        facultyMap.put("MIPA", "H");
        
        majorMap.put("Matematika", "01");
        majorMap.put("Kimia", "02");
        majorMap.put("Fisika", "03");
        majorMap.put("Biologi", "04");
        majorMap.put("Geofisika", "05");
        majorMap.put("Aktuaria", "06");
        majorMap.put("Ilmu Komputer", "07");

        Student s1 = new Student();
        System.out.print("Nama depan : ");
        s1.setFirstname(sc.nextLine());
        System.out.print("Nama belakang : ");
        s1.setLastname(sc.nextLine());
        System.out.print("Angkatan : ");
        s1.setRegisterYear(sc.nextInt());
        System.out.print("Fakultas : ");
        s1.setFaculty(sc.next());
        sc.nextLine();
        System.out.print("Departemen : ");
        s1.setDepartment(sc.nextLine());
        System.out.print("Prodi : ");
        s1.setMajor(sc.nextLine());
        s1.setId(facultyMap, majorMap);
        s1.setEmail(facultyMap);
        s1.description();
        
        sc.close();
    }
}