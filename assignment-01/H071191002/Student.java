import java.util.Map;
import java.util.Random;

class Student{
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int registerYear;
    private String faculty;
    private String department;
    private String major;

    public String getId(){
        return id;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setRegisterYear(int registerYear){
        this.registerYear = registerYear;
    }

    public void setFaculty(String faculty){
        this.faculty=faculty;
    }
    public String getFaculty(){
        return faculty;
    }

    public void setDepartment(String department){
        this.department=department;
    }
    public String getDepartment() {
        return department;
    }

    public void setMajor(String major){
        this.major=major;
    }
    public String getMajor() {
        return major;
    }


    public void setId(Map<String,String> facultyMap,Map<String,String> majorMap){
        Random random = new Random();
        
        String facultyCode =facultyMap.get(faculty);
        String majorCode = majorMap.get(major);
        String registerCode = String.valueOf(registerYear).substring(2, 4);
        String randomCode = String.format("%03d",random.nextInt(60)+1);
        id = String.format("%s%s1%s1%s",facultyCode,majorCode,registerCode,randomCode);
    }

    public void setEmail(Map<String,String> facultyMap){
        String fullname = getFullName().toLowerCase();
        String [] nameArray = fullname.split(" ");

        String emailName = nameArray[nameArray.length-1].toLowerCase();
        String emailName2 = "";
        
        for(int i = 0; i < nameArray.length-1;i++){
            emailName2 += nameArray[i].toString().charAt(0);
        }

        String registerEmail = String.valueOf(registerYear).substring(2,4);
        String facultyEmail = facultyMap.get(faculty).toLowerCase();
        email = String.format("%s%s%s%s@student.unhas.ac.id",emailName,emailName2,registerEmail,facultyEmail);

    }
    public String getFullName(){
        
        if(firstName==null){
            firstName="";
        }
        if(lastName == null){
            lastName = "";
        }
        
        String fullName = (firstName+" "+lastName).toLowerCase();
        String splitName [] = fullName.split(" ");
        String realName="";
        for(int i=0;i<splitName.length;i++){
            String nameSequence=splitName[i];
            char nameChar[] = nameSequence.toCharArray();
            nameChar[0] = (char)(nameChar[0]-'a'+'A');
            String newName = new String(nameChar);
            realName += newName+" ";
        }
        return realName;
    }
    public void description(){
        System.out.printf("Nama            : %s\n",getFullName());
        System.out.printf("NIM             : %s\n",id);
        System.out.printf("Email Mahasiswa : %s\n",email);
        System.out.printf("Fakultas        : %s\n",faculty);
        System.out.printf("Departemen      : %s\n",department);
        System.out.printf("Program Studi   : %s\n\n",major);
    }
}