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

    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setId(Map <String, String> facultyMap, Map <String,String> majorMap) {
        String facultyCode = facultyMap.get(faculty);
        String majorCode = majorMap.get(major);
        int Idregister = registerYear % 100;
        Random rand = new Random();
        int rnd = rand.nextInt(69) + 1;
        id = String.format("%s%s1%02d%03d", facultyCode, majorCode, Idregister,rnd);
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(Map <String, String> facultyMap) {
        String fullname = (firstName + " " + lastName).toLowerCase();
        String[] nameByWord = fullname.split(" ");
        email = nameByWord[nameByWord.length - 1];
        for (int i = 0; i < nameByWord.length - 1; i++) {
            email += nameByWord[i].charAt(0);
        }
        email += (registerYear % 100) + facultyMap.get(faculty).toLowerCase() + "@student.unhas.ac.id";
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setRegisterYear(int registerYear){
        this.registerYear = registerYear;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getMajor() {
        return major = major;
    }
    public String getFullName() {
        String fullName = (firstName + " " + lastName).toLowerCase();
        String[] splitName = fullName.split(" ");
        String finalName = "";
        for (int i = 0; i < splitName.length; i++) {
            finalName += splitName[i].substring(0,1).toUpperCase() + splitName[i].substring(1, splitName[i].length()) + " ";
        }
        return finalName;
    }
    public void description() {
        System.out.println("Nama              : " + getFullName());
        System.out.println("NIM               : " + getId());
        System.out.println("Email Mahasiswa   : " + getEmail());
        System.out.println("Fakultas          : " + getFaculty());
        System.out.println("Departemen        : " + getDepartment());
        System.out.println("Program Studi     : " + getMajor());
        System.out.println();
    }
}