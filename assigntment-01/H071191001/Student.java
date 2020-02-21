import java.util.Map;
import java.util.Random;

public class Student {

    private Random randomValue = new Random();
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int registerYear;
    private String faculty;
    private String departmen;
    private String major;
    private boolean hasLastName = true;

    public void setId(Map<String, String> facultyMap, Map<String, String> majorMap) {

        int getRandom = 1 + randomValue.nextInt(061);
        if(getRandom > 9){
        id = facultyMap.get(faculty) + majorMap.get(major) + "1" + getRegisterYear() + "1" + "0" + getRandom;
        }
        else if(getRandom <= 9){
            id = facultyMap.get(faculty) + majorMap.get(major) + "1" + getRegisterYear() + "1" + "0" + getRandom;
        }
        
    }

    public String getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        firstName = firstName.toLowerCase();
        char[] toUpper = firstName.toCharArray();
        toUpper[0] -= 32;
        this.firstName = new String(toUpper);
        toUpper = null;
    }

    public void setLastName(String lastName) {
        if (lastName == "") {
            hasLastName = false;
        } else {
            lastName = lastName.toLowerCase();
            char[] toUpper = lastName.toCharArray();
            toUpper[0] -= 32;
            for (int i = 1; i < toUpper.length; i++) {
                if (toUpper[i] == ' ') {
                    toUpper[i + 1] -= 32;
                }
            }

            this.lastName = new String(toUpper);
            toUpper = null;
        }
    }

    public void setEmail(Map<String, String> facultyMap) {
        email = getEmailName() + getRegisterYear() + facultyMap.get(faculty) + "@student.unhas.ac.id";
        email = email.toLowerCase();
    }

    public String getEmailName() {
        char check[] = getFullName().toCharArray();
        String emailName = "";
        emailName = "";
        int checkNumber = 0;
        if (!hasLastName) {
            emailName = firstName;
        } else {
            for (int i = check.length - 1; i > 0; i--) {
                if (check[i] == ' ') {
                    checkNumber = i;
                    for (int j = i + 1; j < check.length; j++) {
                        emailName += check[j];
                    }
                    break;
                }
            }
            emailName += check[0];
            for (int i = 0; i < checkNumber; i++) {
                if (check[i] == ' ') {
                    emailName += check[i + 1];
                }
            }
        }
        return emailName;
    }

    public String getEmail() {
        return email;
    }

    public void setRegisterYear(int registerYear) {
        this.registerYear = registerYear;
    }

    public String getRegisterYear() {
        String checkString = "" + registerYear;
        char[] checkChar = checkString.toCharArray();
        checkString = "";
        for (int i = checkChar.length - 2; i < checkChar.length; i++) {
            checkString += checkChar[i] + "";
        }
        return checkString;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty.toUpperCase().replaceAll(" ", "");
    }

    public String getFaculty() {
        return faculty;
    }

    public void setDepartment(String departmen) {
        this.departmen = departmen;
    }

    public String getDepartment() {
        return departmen;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public String getFullName() {
        if (hasLastName) {
            return firstName + " " + lastName;
        } else {
            return firstName;
        }
    }

    public void description() {
        System.out.printf("\nNama \t\t\t : %s", getFullName());
        System.out.printf("\nNIM \t\t\t : %s", getId());
        System.out.printf("\nEmail Mahasiswa \t : %s", getEmail());
        System.out.printf("\nFakultas \t\t : %s", getFaculty());
        System.out.printf("\nDepartmen \t\t : %s", getDepartment());
        System.out.printf("\nProgram Studi \t\t : %s \n\n", getMajor());
    }

}