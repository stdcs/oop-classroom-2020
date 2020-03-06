package id.pbo;

import java.util.Map;
import java.util.Random;

public class Student {

    int registerYear;
    String id;
    String firstName;
    String lastName;
    String email;
    String faculty;
    String department;
    String major;
    String fullName;
    String nameSplit[];

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setFaculty(String Faculty) {
        this.faculty = Faculty;
    }

    public void setMajor(String Major) {
        this.major = Major;
    }

    public void setRegisterYear(Integer registerYear) {
        this.registerYear = registerYear;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getFullName() {
        fullName = "";
        for (int i = 0; i < nameSplit.length; i++) {
            if (i == nameSplit.length - 1) {
                fullName += nameSplit[i].substring(0, 1).toUpperCase() + nameSplit[i].substring(1).toLowerCase();
            } else {
                fullName += nameSplit[i].substring(0, 1).toUpperCase() + nameSplit[i].substring(1).toLowerCase() + " ";
            }
        }
        return fullName;
    }

    public void setEmail(Map<String, String> facultyMap) {
        email = nameSplit[nameSplit.length - 1];
        for (int i = 0; i < nameSplit.length - 1; i++) {
            email += Character.toLowerCase(nameSplit[i].charAt(0));
        }
        email += registerYear % 100 + facultyMap.get(faculty).toLowerCase()+"@student.unhas.ac.id";
    }

    public void setId(Map<String, String> facultyMap, Map<String, String> majorMap) {
        Random random = new Random();
        id = String.format("%s%s1%02d1%03d", facultyMap.get(faculty), majorMap.get(major), registerYear % 100, random.nextInt(60) + 1);
    }

    public void setLastName(String lastName) {
        String namef = firstName.toLowerCase() + " " + lastName.toLowerCase();
        nameSplit = namef.split(" ");
        this.lastName = lastName;
    }

    public void description() {
        System.out.printf("Nama\t\t\t:%s\nNIM\t\t\t\t:%s\n",getFullName(),getId());
        System.out.printf("Email Mahasiswa\t:%s\nFakultas\t\t:%s\n",getEmail(),faculty);
        System.out.printf("Departemen\t\t:%s\nProgram Studi\t:%s\n\n",getDepartment(),major);
    }
}