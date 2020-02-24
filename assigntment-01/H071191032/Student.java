
import java.util.Random;
import java.util.Map;

public class Student {
    private String id, firstName, lastName, email;
    private int registerYear;
    private String faculty, department, major;

    public String getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setRegisterYear(int registerYear) {
        this.registerYear = registerYear;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return this.major;
    }

    public void setId(Map<String, String> facultyMap, Map <String, String>majorMap) {
        Random rand = new Random();

        this.id = String.format("%s%s1%d1%03d",
            facultyMap.get(getFaculty()),
            majorMap.get(getMajor()),
            this.registerYear % 100,
            rand.nextInt(60) + 1
        );
    }

    public void setEmail(Map<String, String> facultyMap) {
        this.email = "";
        String lastWordName = "";
        String firstLetterName = "";
        boolean hasSpace = false;
        if (this.lastName.contains(" ")) {
            hasSpace = true;
        }

        int lastSpace = 0;
        if (hasSpace == true) {
            for (int i = this.lastName.length() - 1; i >= 0; i--) {
                if (this.lastName.charAt(i) == 32) {
                    lastSpace += i;
                    break;
                }
            }
            for (int i = lastSpace + 1; i < this.lastName.length(); i++) {
                lastWordName += this.lastName.charAt(i);
            }
        } else {
            lastWordName += this.lastName;
        }

        firstLetterName += this.lastName == "" ? this.firstName : this.firstName.charAt(0);
        firstLetterName += this.lastName == "" ? "" : hasSpace == true ? this.lastName.charAt(0) : "";
        
        if (hasSpace == true) {
            for (int i = 0; i < this.lastName.length(); i++) {
                if (this.lastName.charAt(i) == 32 && i < lastSpace) {
                    firstLetterName += this.lastName.charAt(i + 1);
                }
            }
        }

        this.email = String.format("%s%s%d%s@student.unhas.ac.id",
            lastWordName,
            firstLetterName,
            this.registerYear % 100,
            facultyMap.get(getFaculty())
        );
        this.email = this.email.toLowerCase();
    }

    public String getFullName() {
        String fullName = "";
        for (int i = 0; i < this.firstName.length(); i++) {
            if (i == 0) { 
                fullName += this.firstName.toUpperCase().charAt(i);
            } else {
                fullName += this.firstName.toLowerCase().charAt(i);
            }
        }
        if (this.lastName.equals("")) {
            return fullName;  
        }

        fullName += " " + this.lastName.toUpperCase().charAt(0);
        int help = 0;
        for (int i = 1; i < this.lastName.length(); i++) {
            if (this.lastName.charAt(i) == 32) {
                help = i;
                fullName += this.lastName.toUpperCase().charAt(i);
            } else{
                if (i == help + 1 && i > 1) {
                    fullName += this.lastName.toUpperCase().charAt(i);
                    continue;
                }
                fullName += this.lastName.toLowerCase().charAt(i);
            }
        }
        return fullName;
    }

    public void description() {
        System.out.println("Nama\t\t : " + this.getFullName());
        System.out.println("NIM\t\t : " + this.getId());
        System.out.println("Email Mahasiswa  : " + this.getEmail());
        System.out.println("Fakultas\t : " + this.faculty);
        System.out.println("Departemen\t : " + this.department);
        System.out.println("Program Studi\t : " + this.major + "\n");
    }
}