
/**
 * By Arsyi Syarief Aziz
 * Student ID: H071191003
 *       ◁►2020◀︎▷
*/

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Student{
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int registerYear;
    private String faculty;
    private String department;
    private String major;
    
    public void setFirstName(String firstName) {
        this.firstName = upperCamelCase(firstName);
    }
    

    public void setLastName(String lastName) {
        this.lastName = upperCamelCase(lastName);;
    }

    //combines student's first name and last name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * upperCamelCase capitalises the first character of a word and decapitalises the 
     * following characters
     */
    private String upperCamelCase(String str) {
        String newStr;

        //returns an empty string if str has an length of 0
        try{
            newStr = String.valueOf((char) (Character.isLowerCase(str.charAt(0)) ? str.charAt(0)-32 
                                                                                    : str.charAt(0)));
        }catch (IndexOutOfBoundsException e){
            return "";
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {

                //removes recurring  spaces
                while (str.charAt(i) == ' '){
                    i++;
                }
                /**
                 * Adds a space to seperate the previous word and the current one, then adds the
                 * capitalised character at index i of the string str
                 */
                newStr += " " + (char) (Character.isLowerCase(str.charAt(i)) ? str.charAt(i) - 32
                                                                            : str.charAt(i)) ;
            } else {
                
                //adds the decapitalised character at index i of the string str 
                newStr += (char) (Character.isUpperCase(str.charAt(i)) ? str.charAt(i) + 32 
                                                                        : str.charAt(i));
            }
        }
        return newStr;
    }

    public void setRegisterYear(int registerYear) {
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
        return major;
    }

    /*
        * Generates a student id with the following format:         
        * 
        * [faculty code][major code]1[last 2 digits of registry year]10
        *  [random number ranging from 0 to 60]
        */
    public void setId(Map<String, String> facultyMap, Map<String, String> majorMap) {
        id = facultyMap.get(faculty) + majorMap.get(major) + 1 + getLastTwoDigits(registerYear) + 10 
                + ThreadLocalRandom.current().nextInt(0, 61);
    }

    public String getId() {
        return id;
    }

    /*
        * Generates a student email with the following format:
        * 
        * [last Name][first letter of each name component except last name]
        *  [last 2 digits of registry year][faculty code]@student.ac.id
        */
    public void setEmail(Map<String, String> facultyMap) {
        
        //Splits full name to its components
        String nameComponents[] = getFullName().split(" ");

        //takes lastname as the first component of student email
        String output = nameComponents[nameComponents.length -1];
        
        //takes first letter of each name component except the last name
        for (int i = 0; i < nameComponents.length-1; i++) {
            output += nameComponents[i].charAt(0);
        }
        

        //adds university domain to email address
        output += getLastTwoDigits(registerYear)+ facultyMap.get(faculty) + "@student.unhas.ac.id";
        
        email = output.toLowerCase();
    }

    public String getEmail() {
        return email;
    }

    /**
     * Creates a description of all the attributes associated with the Student
     */
    public void description() {
        System.out.printf("Nama\t\t : %s\n", getFullName());
        System.out.printf("NIM\t\t : %s\n", id);
        System.out.printf("Email Mahasiswa\t : %s\n", email);
        System.out.printf("Fakultas\t : %s\n", faculty);
        System.out.printf("Departemen\t : %s\n", department);
        System.out.printf("Program Studi\t : %s\n", major);
    }
    
    //Grabs the last two digits of an integer
    private String getLastTwoDigits(int number) {
        String output = "00" + String.valueOf(number);
        return String.format("%c%c", output.charAt(output.length() - 2), output.charAt(output.length() - 1));
    }
}