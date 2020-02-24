import java.util.*;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int registerYear;
    private String faculty;
    private String departemen;
    private String major;

    public void setId(Map<String, String> facultyMap, Map<String, String> majorMap) {
        Random random = new Random();
        id = facultyMap.get(faculty) + majorMap.get(major) + "1" + getRegisterYear() % 100 + "1"
                + (random.nextInt(60) + 1);
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(Map<String, String> facultyMap) {

        String arr[] = getFullName().split(" ");
        email = "";
        email += arr[arr.length - 1].toLowerCase();
        for (int i = 0; i < arr.length - 1; i++) {
            email += (arr[i].substring(0, 1).toLowerCase());
        }
        email += getRegisterYear() % 100;
        email += facultyMap.get(faculty).toLowerCase();
        email += "@student.unhas.ac.id";
    }

    public void setRegisterYear(int registerYear) {
        this.registerYear = registerYear;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDepartemen() {
        return departemen;
    }

    public String getMajor() {
        return major;
    }

    public int getRegisterYear() {
        return registerYear;
    }

    public String getFullName() {
        String lowerString = (firstName + " " + lastName).toLowerCase();
        String fullName = "";
        String arr[] = lowerString.split(" ");
        for (int i = 0; i < arr.length; i++) {
            fullName += arr[i].charAt(0) + arr[i].substring(1, arr[i].length()) + " ";
        }
        return fullName;
    }

    public void desc() {
        System.out.println("Nama             : " + getFullName());
        System.out.println("NIM              : " + getId());
        System.out.println("Email Mahasiswa  : " + getEmail());
        System.out.println("Fakultas         : " + getFaculty());
        System.out.println("Departemen       : " + getDepartemen());
        System.out.println("Program Studi    : " + getMajor());
        System.out.println();
    }
}