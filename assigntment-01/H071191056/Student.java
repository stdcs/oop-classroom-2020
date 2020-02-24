package TugasKakFitrah;
import java.util.*;
/**
 * Student
 */
public class Student {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int registerYear;
    private String faculty;
    private String department;
    private String major;
    private String toSplit[];

    public void setFirstName(String firstName){
        String firstNameToLower = firstName.toLowerCase();
        firstName = firstNameToLower;
        this.firstName = firstName;
    }


    public void setLastName(String lastName){

        String lastNameToLower = lastName.toLowerCase();
        lastName = lastNameToLower;
        this.lastName = lastName;

        String getFullName = this.firstName + " " + this.lastName;
        toSplit = getFullName.split(" ");
    }


    public void setFaculty(String faculty){
        this.faculty = faculty;
    }

    public String getFaculty(){
        return this.faculty;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getMajor(){
        return this.major;
    }

    public String getFullName() {

        
        String setFullName = "";
        
        for(int i = 0; i < toSplit.length; i++){
            
            if (toSplit[i].equals("")){
                setFullName += toSplit[i].toUpperCase().charAt(0) + toSplit[i].substring(1, toSplit[i].length());
            }
            else{
                setFullName += toSplit[i].toUpperCase().charAt(0) + toSplit[i].substring(1, toSplit[i].length()) + " ";
            }
        }
            /*if (lastName.equals("")) {
                getFullName = toSplit[0].toUpperCase().charAt(0) + toSplit[0].substring(1, toSplit[0].length());
            } 
            else if(lastNameToSplit.length == 1){
                getFullName = toSplit[0].toUpperCase().charAt(0) + toSplit[0].substring(1, toSplit[0].length()) + " " + 
                toSplit[1].toUpperCase().charAt(0) + toSplit[1].substring(1, toSplit[1].length());
                
            }
            else{
               getFullName = toSplit[0].toUpperCase().charAt(0) + toSplit[0].substring(1, toSplit[0].length()) + " " + 
                lastNameToSplit[0].toUpperCase().charAt(0) + lastNameToSplit[0].substring(1, lastNameToSplit[0].length()) + " "  +
                lastNameToSplit[1].toUpperCase().charAt(0) + lastNameToSplit[1].substring(1, lastNameToSplit[1].length()); 
            }*/

        return setFullName;
    }

    public void setRegisterYear(int registerYear) {

        this.registerYear = registerYear; 
        String toString = String.valueOf(this.registerYear);
        String getTwoDigit = toString.substring(2, 4);
        this.registerYear = Integer.valueOf(getTwoDigit);

    }


    public void setId(Map<String, String> facultyCode, Map<String, String> majorCode){
       Random angka = new Random();
       int getRandom = 001 + angka.nextInt(061);
        
        if (getRandom > 9) {
            id = facultyCode.get(faculty) + majorCode.get(major) + 1 + this.registerYear + 1 + "0" + getRandom;
        } 
        else if (getRandom <= 9) {
            id = facultyCode.get(faculty) + majorCode.get(major) + 1 + this.registerYear + 1 + "00" + getRandom;
        }        
    }

    public String getId(){
        return id;
    }

    public void setEmail(Map<String, String> facultyCode){
        
        email = toSplit[toSplit.length - 1];
        for(int i = 0; i < toSplit.length - 1; i++){
            email += toSplit[i].charAt(0);
        }
        email = email + this.registerYear + facultyCode.get(faculty).toLowerCase() + "@student.unhas.ac.id";


    }

    public String getEmail(){
        return email;
    }

    public void description(){

        System.out.println("Nama\t\t: " + getFullName());
        System.out.println("NIM\t\t: " + getId());
        System.out.println("Email\t\t: " + getEmail());
        System.out.println("Fakultas\t: " + getFaculty());
        System.out.println("Departement\t: " + getDepartment());
        System.out.println("Prodi\t\t: " + getMajor());

        for (int i = 0; i < 1; i++) {
                System.out.println();
        }
    }

    
}