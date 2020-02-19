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

    public String getId() {
        return id;
    }
    public void setId(Map <String, String> facultyMap, Map <String, String> majorMap) {
        Random r = new Random();
        int randomNumber = r.nextInt(061);
        String fixId = facultyMap.get(getFaculty()) + majorMap.get(getMajor()) + 1 + String.valueOf(registerYear).substring(2, 4) + 1 + String.format("%03d", randomNumber);
        this.id = fixId;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }
    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(Map <String,String> facultyMap) {
        String[] name = getfullName().split(" ");
        String name_2 = "";
        for (int i = 0 ; i < name.length-1 ; i++) {
            name_2 = name_2 + name[i].charAt(0);
        }
        String fixEmail = name[name.length-1].toLowerCase() + name_2.toLowerCase() + String.valueOf(registerYear).substring(2, 4) + facultyMap.get(getFaculty()).toLowerCase() + "@student.unhas.ac.id";
        this.email = fixEmail;
    }

    public void setRegisterYear(int registerYear) {
        this.registerYear = registerYear;
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
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getfullName() {
        String fullName = firstName.toLowerCase() + " " + lastName.toLowerCase();
        String fixName = "";
        for (int i = 0 ; i < fullName.length() ; i++) {
            if (i == 0 || fullName.codePointBefore(i) == 32) {
                fixName = fixName + ((char)(fullName.codePointAt(i) -32));
            }else {
                fixName += fullName.charAt(i);
            }
        }
        return fixName;
    }
    public void description() {
        System.out.printf("Nama \t\t: %s\nNIM \t\t: %s\nEmail Mahasiswa : %s\nFakultas \t: %s\nDepartemen \t: %s\nProgram Studi \t: %s",getfullName(),getId(),getEmail(),getFaculty(),getDepartment(),getMajor());
    }
}