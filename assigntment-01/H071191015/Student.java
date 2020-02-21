import java.util.Map;
import java.util.Random;

class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int registerYear;
    private String faculty;
    private String department;
    private String major;

    private Random randomValue = new Random();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getDepartment(){
        return department;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor(){
        return major;
    }

    public void setId(Map<String, String> facultyMap, Map<String, String> majorMap){
        String registerCode = ""+registerYear;


        int getRandom = 1 + randomValue.nextInt(061);
        if (getRandom>9) {
            id = facultyMap.get(faculty) + majorMap.get(major) + "1" + registerCode.substring(2, 4) + "1" + "0" + getRandom ;
        } else if (getRandom<=9){
            id = facultyMap.get(faculty) + majorMap.get(major) + "1" + registerCode.substring(2, 4) + "1" + "00" + getRandom ;
        }
        
    }

    public String getId() {
        return id;
    }

    public void setEmail(Map<String, String> facultyMap) {
        String fullname = (firstName+" "+lastName).toLowerCase();
        String[] name = fullname.split(" ");
        email = name[name.length-1];
        for (int i = 0; i < name.length-1; i++) {
            email += name[i].charAt(0);
        }
        email += (registerYear%100) + facultyMap.get(faculty).toLowerCase() + "@student.unhas.ac.id";
    }

    public String getEmail(){
        return email;
    }

    public String getFullName() {
        String first = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String last = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        return first+" "+last;
    }

    public void desc() {
        System.out.printf("Nama\t\t: %s\n", getFullName());
        System.out.printf("NIM\t\t: %s\n", getId());
        System.out.printf("Email Mahasiswa\t: %s\n", getEmail());
        System.out.printf("Fakultas\t: %s\n", faculty);
        System.out.printf("Departemen\t: %s\n", department);
        System.out.printf("Program Studi\t: %s\n", major);
        System.out.println();
    }
}