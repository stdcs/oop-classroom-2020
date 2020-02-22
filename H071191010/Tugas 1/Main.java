package com.taufiqalifff;

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
        facultyMap.put("Kesehatan Masyarakat", "G");
        facultyMap.put("MIPA", "H");
        majorMap.put("Matematika", "01");
        majorMap.put("Statistika", "02");
        majorMap.put("Fisika", "03");
        majorMap.put("Geofisika", "04");
        majorMap.put("Kimia", "05");
        majorMap.put("Biologi", "06");
        majorMap.put("Ilmu Komputer", "07");

        Student s1 = new Student();
        s1.setFirstname(sc.nextLine());
        s1.setLastname(sc.nextLine());
        s1.setRegisterYear(sc.nextInt());
        s1.setFaculty("MIPA");
        sc.nextLine();
        s1.setDepartment(sc.nextLine());
        s1.setMajor("Ilmu Komputer");
        s1.setId(facultyMap, majorMap);
        s1.setEmail(facultyMap);

        s1.description();
        sc.close();
    }
}