import java.util.*;


public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int registerYear;
    private String faculty;
    private String department;
    private String major;


    public void setId(String id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setRegisterYear(int registerYear){
        this.registerYear = registerYear;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setMajor(String major){
        this.major = major;
    }
    


	public String getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public int getRegisterYear(){
        return this.registerYear;
    }

    public String getDepartment(){
        return this.department;

    }

    public String getFaculty(){
        return this.faculty;
    }

    public String getMajor(){
        return this.major;
    }

    public void setId( Map<String,String > facultyMap ,  Map<String,String> majorMap){
        Random rand = new Random();
        this.id = String.format("%s%s1%d1%03d" , 
        facultyMap.get(getFaculty()) , 
        majorMap.get(getMajor()),
        this.registerYear % 100,
        rand.nextInt(60) + 1
        );

    }

    public void setEmail(Map <String,String> facultyMap){
            String fullname = (this.firstName + " " + this.lastName).toLowerCase();
            String[] splitName = fullname.split(" ");
            this.email = splitName[splitName.length - 1];

            for (int i = 0; i < splitName.length - 1 ; i++) {
                this.email += splitName[i].charAt(0);
            }
            this.email += String.format("%d%s@student.unhas.ac.id",
                this.registerYear % 100,
                facultyMap.get(getFaculty())
            );


        // String fullName[] = (firstName.toLowerCase() + " " + lastName.toLowerCase()).split(" ");
        // String lastName = fullName[fullName.length - 1];
        // String firstTw = "";
        // for (int i = 0; i < fullName.length - 1; i++) {
        //     firstTw += fullName[i].charAt(0);
        // }
        // email = String.format("%s%s%s@student.unhas.ac.id",
        //      lastName, firstTw,this.registerYear,facultyMap.get(faculty).toLowerCase());
    }

    public String getFullName(){
        String fullName = (this.firstName + " " + this.lastName).toLowerCase();
        String[] splittedName = fullName.split(" ");
        String name = "";
        for (int i = 0; i < splittedName.length; i++) {
            name += splittedName[i].substring(0, 1).toUpperCase() + splittedName[i].substring(1, splittedName[i].length()) + " ";
        }
        return name;
    }
     public void description(){
        System.out.printf("Nama\t\t : %s\n", getFullName());
        System.out.printf("NIM\t\t : %s\n", getId());
        System.out.printf("Email Mahasiswa  : %s\n", getEmail());
        System.out.printf("Fakultas\t : %s\n", getFaculty());
        System.out.printf("Departemen\t : %s\n", getDepartment());
        System.out.printf("Program Studi\t : %s\n\n", getMajor());

     }


}

