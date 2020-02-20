import java.util.Map;
import java.util.Random;
public class Student{
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int registerYear;
    private String faculty;
    private String departement;
    private String major;

    public void setId(Map<String, String> facultyMap, Map <String, String>majorMap){
        Random random1 = new Random();
        this.id = facultyMap.get(faculty)+majorMap.get(major)+"1"+String.valueOf(registerYear).substring(String.valueOf(registerYear).length()-2)+"1"+String.format("%03d",random1.nextInt(60)+1);

    }
    public String getId(){
        return id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName.toLowerCase();
    }
    public void setLastName(String lastName){
        this.lastName = lastName.toLowerCase();
    }
    public String getFullName(){
        String [] fullName = (firstName+" "+lastName).split(" ");
        String newFullName = "";
        for(int i=0;i<fullName.length;i++){
            newFullName += fullName[i].substring(0,1).toUpperCase()+fullName[i].substring(1)+ " ";
        }
        return newFullName;
    }
    public void setEmail(Map<String, String>facultyMap){
        String[] FullName = (firstName + " " + lastName).split(" ");
        String nameSub = "";
        for(int i=0;i<FullName.length-1;i++){
            nameSub+=FullName[i].charAt(0);
        }
        this.email = (FullName[FullName.length-1]+nameSub+String.valueOf(registerYear).substring(String.valueOf(registerYear).length()-2)+facultyMap.get(faculty)+"@student.unhas.ac.id").toLowerCase();
    }
    public String getEmail(){
        return email;
    }
    public void setRegisterYear(int registerYear){
        this.registerYear = registerYear;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public String getFaculty(){
        return faculty;
    }
    public void setDepartement(String departement){
        this.departement = departement;
    }
    public String getDepartement(){
        return departement;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
    
    public void description(){
        System.out.println("Nama            = " + getFullName());
        System.out.println("NIM             = " + getId());
        System.out.println("Email Mahasiswa = " + getEmail());
        System.out.println("Fakultas        = " + getFaculty());
        System.out.println("Departemen      = " + getDepartement());
        System.out.println("Program Studi   = " + getMajor());
        System.out.println();
    }

}