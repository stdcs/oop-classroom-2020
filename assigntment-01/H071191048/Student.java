import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private int RegisterYear;
    private String faculty;
    private String departement;
    private String major;
    private String id;

    public void setId(Map<String, String> facultyMap, Map<String, String> majorMap) {
        String facultyCode = facultyMap.get(faculty);
        String majorCode = majorMap.get(major);
        int lastDigit = RegisterYear % 100;
        Random random = new Random();
        int random1 = random.nextInt(60) + 1;
        id = String.format("%s%s1%d1%03d", facultyCode, majorCode, lastDigit, random1);
    }

    public String getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(Map<String, String> facultyMap) {
        String fullName = (firstName + " " + lastName).toLowerCase();
        String[] splitName = fullName.split(" ");
        email = splitName[splitName.length - 1];
        for (int i = 0; i < splitName.length - 1; i++) {
            email += splitName[i].charAt(0);
        }
        email += (RegisterYear % 100) + facultyMap.get(faculty).toLowerCase() + "@student.unhas.ac.id";
    }

    public String getEmail() {
        return email;
    }

    public void setRegisterYear(Integer RegisterYear) {
        this.RegisterYear = RegisterYear;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getDepartement() {
        return departement;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public String getFullName() {
        String fullName = (firstName + " " + lastName).toLowerCase();
        String[] splitName = fullName.split(" ");
        String finalName = "";
        for (int i = 0; i < splitName.length; i++) {
            finalName += splitName[i].substring(0, 1).toUpperCase() + splitName[i].substring(1, splitName[i].length())
                    + " ";
        }
        return finalName;
    }

    public void description() {
        System.out.println("Nama            : " + getFullName());
        System.out.println("NIM             : " + getId());
        System.out.println("Email Mahasiswa : " + getEmail());
        System.out.println("Fakultas        : " + getFaculty());
        System.out.println("Departemen      : " + getDepartement());
        System.out.println("Program Studi   : " + getMajor());
        System.out.println();
    }
}
