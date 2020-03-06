import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int registerYear;
    private String faculty;
    private String department;
    private String major;

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegisterYear(int registerYear) {
        this.registerYear = registerYear;
    }

    public String getRegisterYear() {
        String rgstYr = "" + registerYear;
        String[] rgst = { rgstYr.substring(0, 2), rgstYr.substring(2) };
        String lastTwoDigits = rgst[1];

        return lastTwoDigits;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;

    }

    public void setDepartment(String department) {
        this.department = department;
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

    public String getDepartment() {

        return department;
    }

    public String getMajor() {

        return major;
    }

    public void setId(Map<String, String> facultyMap, Map<String, String> majorMap) {

        Random random = new Random();
        int randomDigit = 1 + random.nextInt(60);
        id = String.format("%s%s1%s1%03d", facultyMap.get(faculty), majorMap.get(major), getRegisterYear(),
                randomDigit);

    }

    public void setEmail(Map<String, String> facultyMap) {
        String fullName[] = (firstName.toLowerCase() + " " + lastName.toLowerCase()).split(" ");
        String lastName = fullName[fullName.length - 1];
        String firstW = "";
        for (int i = 0; i < fullName.length - 1; i++) {
            firstW += fullName[i].charAt(0);
        }
        email = String.format("%s%s%s%s@student.unhas.ac.id", lastName, firstW, getRegisterYear(),
                facultyMap.get(faculty).toLowerCase());

    }

    public String getFullName() {

        String fullName[] = (firstName.toLowerCase() + " " + lastName.toLowerCase()).split(" ");
        String name = "";
        for (int i = 0; i < fullName.length; i++) {
            name += fullName[i].substring(0, 1).toUpperCase() + fullName[i].substring(1, fullName[i].length()) + " ";
        }
        return name;
    }

    public void description() {
        System.out.printf("Nama\t\t : %s\n", getFullName());
        System.out.printf("NIM\t\t : %s\n", getId());
        System.out.printf("Email Mahasiswa  : %s\n", getEmail());
        System.out.printf("Fakultas\t : %s\n", getFaculty());
        System.out.printf("Departemen\t : %s\n", getDepartment());
        System.out.printf("Program Studi\t : %s\n\n", getMajor());

    }

}