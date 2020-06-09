import java.util.Map;
import java.util.Random;

public class IdentitasPelajar{
    private String id;
    private String firstName;
    private String lastName;
    private String Email;
    private Integer registerYear;
    private String faculty;
    private String department;
    private String major;
    
    public void setId (String id){
        this.id = id;
    }
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public void setRegiterYear (int registerYear){
        this.registerYear = registerYear;
    }
    public void setFaculty (String faculty){
        this.faculty = faculty;
    }
    public void setDepartment (String department){
        this.department = department;
    }
    public void setMajor (String major){
        this.major = major;
    }

    public String getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public String getFaculty(){
        return faculty;
    }
    public String getDepartment(){
        return department;
    }
    public String getMajor(){
        return major;
    }

    public void setId(Map <String, String> facultyMap, Map <String, String> majorMap){
        String facultyCode = facultyMap.get(faculty);
        String majorCode = majorMap.get(major);
        int lastDigit = registerYear % 100;
        Random randDigit = new Random();
        int randDigit2 = randDigit.nextInt(60) + 1;
        id = String.format("%s%s1%d1%03d", facultyCode, majorCode, lastDigit, randDigit2);
    }
    
    public void setEmail (Map <String, String> facultyMap){
        String fullName = (firstName + " " + lastName).toLowerCase();
        String [] splitName = fullName.split(" ");
        String finalName = " ";
        for (int i = 0; i < splitName.length; i++){
            finalName += splitName[i].substring(0, 1).toUpperCase() + splitName[i].substring(1, splitName[i].length()) + " "; 
        } 
        return finalName;
    }
        public void description(){
           System.out.println("Nama             : "+ getFullName());
           System.out.println("Nim              : "+ getId());
           System.out.println("Email Mahasiswa  : "+ getEmail());
           System.out.println("Fakultas         : "+ getFaculty());
           System.out.println("Department       : "+ getDepartment());
           System.out.println("Program Studi    : "+ getMajor());
           System.out.println(); 
        }
}