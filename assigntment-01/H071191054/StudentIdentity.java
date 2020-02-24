import java.util.Map;
import java.util.Random;

public class StudentIdentity {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int registerYear;
    private String faculty;
    private String department;
    private String major;

    // method set
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

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // method get
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

    // method behaviour
    public void setId(Map<String, String> facultymap, Map<String, String> majormap) {
        Random rdm = new Random();

        id = String.format("%s%s1%d1%03d", facultymap.get(getFaculty()), majormap.get(getMajor()), registerYear % 100,
                rdm.nextInt(60) + 1);

    }

    public void setEmail(Map<String, String> facultymap) {
        String fullName = (firstName + " " + lastName).toLowerCase();
        String[] splitName = fullName.split(" ");
        email = splitName[splitName.length - 1];
        for (int i = 0; i < splitName.length - 1; i++) {
            email += splitName[i].charAt(0);
        }
        email += (registerYear % 100) + facultymap.get(faculty).toLowerCase() + "@student.unhas.ac.id";

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
        System.out.println("Nama            :" + getFullName());
        System.out.println("NIM             :" + getId());
        System.out.println("Email Mahasiswa :" + getEmail());
        System.out.println("Fakultas        :" + getFaculty());
        System.out.println("Departemen      :" + getDepartment());
        System.out.println("Program Studi   :" + getMajor());
    }
}