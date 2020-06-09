import java.util.*;

public class Student {

    Random rand = new Random();

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int registerYear;
    private String faculty;
    private String department;
    private String major;

    // this is setter section
    public void setId(Map facultyCode, Map majorCode) {
        this.id = (String) facultyCode.get(getFaculty()) + majorCode.get(getMajor()) + "1"
                + String.valueOf(registerYear).substring(2, 4) + "1" + "0" + String.valueOf(rand.nextInt(6))
                + String.valueOf(rand.nextInt(9));
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(Map facultyCode) {
        if (lastName == "") {

            this.email = firstName.toLowerCase() + firstName.substring(0, 1).toLowerCase()
                    + String.valueOf(registerYear).substring(2, 4)
                    + facultyCode.get(getFaculty()).toString().toLowerCase() + "@student.unhas.ac.id";

        } else if (lastName.contains(" ")) {

            String word[] = getFullName().split(" ");
            char newChar[] = new char[word.length - 1];

            for (int i = 0; i < word.length - 1; i++) {
                newChar[i] = (char) +word[i].toLowerCase().charAt(0);
            }

            String newWord = new String(newChar);

            this.email = word[word.length - 1].toLowerCase() + newWord + String.valueOf(registerYear).substring(2, 4)
                    + facultyCode.get(getFaculty()).toString().toLowerCase() + "@student.unhas.ac.id";

        } else {

            this.email = lastName.toLowerCase() + firstName.substring(0, 1).toLowerCase()
                    + String.valueOf(registerYear).substring(2, 4)
                    + facultyCode.get(getFaculty()).toString().toLowerCase() + "@student.unhas.ac.id";

        }
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

    // this is getter section
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

    // description
    public void description() {
        System.out.printf("Nama \t\t: %s\n", getFullName());
        System.out.printf("NIM \t\t: %s\n", getId());
        System.out.printf("Email Mahasiswa : %s\n", getEmail());
        System.out.printf("Fakultas \t: %s\n", getFaculty());
        System.out.printf("Departemen \t: %s\n", getDepartment());
        System.out.printf("Program Studi \t: %s\n\n", getMajor());
    }

    // other method
    public String getFullName() {

        String name = firstName + " " + lastName;
        String finalFullName = "";
        char firstChar = name.charAt(0);

        finalFullName += Character.toUpperCase(firstChar);

        for (int i = 1; i < name.length(); i++) {

            char currentChar = name.charAt(i);
            currentChar = Character.toLowerCase(currentChar);
            char previousChar = name.charAt(i - 1);
            previousChar = Character.toLowerCase(previousChar);

            if (previousChar == ' ') {

                finalFullName += Character.toUpperCase(currentChar);

            } else {

                finalFullName += currentChar;

            }
        }
        return finalFullName;
    }
}
