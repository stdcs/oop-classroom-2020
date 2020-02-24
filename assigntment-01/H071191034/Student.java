import java.util.Map;
import java.util.Random;


public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer registerYear;
    private String faculty;
    private String department;
    private String major;
    private Random randomValue = new Random();

    // set
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
    public void setRegisterYear (int registerYear){
        this.registerYear= registerYear;
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

    // get
    public String getId (){
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
    public int getRegisterYear(){
        return registerYear;
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

    public void setEmail(Map <String,String> facultyMap) {
        String arr[] = getFullName().split(" ");
        email = "";
        email += arr[arr.length-1].toLowerCase();
        for (int i = 0; i < arr.length - 1; i++){
            email += (arr[i].substring(0,1).toLowerCase());
        }
        email += getRegisterYear()%100;
        email += facultyMap.get(faculty).toLowerCase();
        email += "@student.unhas.ac.id";
    }

    public String getFullName(){
        String fullName = (firstName + " " + lastName).toLowerCase();
        String [] splitName = fullName.split(" ");
        String finalName = "";
        for (int i = 0; i < splitName.length; i++) {
            finalName += splitName[i].substring(0, 1).toUpperCase() + splitName[i].substring(1, splitName[i].length()) + " ";
        }
        return finalName;
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