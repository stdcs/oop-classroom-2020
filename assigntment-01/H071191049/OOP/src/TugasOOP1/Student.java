package TugasOOP1;
import java.util.Map;
import java.util.Random;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int registryYear;
    private String faculty;
    private String department;
    private String major;

    //untuk mengatur id
    public void setId (Map<String, String> facultyMap, Map<String, String> majorMap){
        Random r = new Random();
        this.id = facultyMap.get(faculty)+majorMap.get(major)+"1"+String.valueOf(registryYear).substring(String.valueOf(registryYear).length()-2)+"1"+String.format("%03d",r.nextInt(60)+1);
    }
    public String getId (){
        return id;
    }
    //untuk mengatur first name lalu diubah ke huruf kecil
    public void setFirstName (String firstName){
        this.firstName = firstName.toLowerCase();
    }
    //untuk mengatur last name lalu diubah ke huruf kecil
    public void setLastName (String lastName){
        this.lastName = lastName.toLowerCase();
    }
    //untuk mengatur email
    public void setEmail (Map<String, String> facultyMap){
        //menggabungkan nama menjadi array yang di split dengan spasi
        String[] FullName = (firstName + " " + lastName).split(" ");
        String nameSub = "";
        //penambahan huruf pertama pada nama ke email
        for(int i=0;i<FullName.length-1;i++){
            nameSub+=FullName[i].charAt(0);
        }
        this.email = (FullName[FullName.length-1]+nameSub+String.valueOf(registryYear).substring(String.valueOf(registryYear).length()-2)+facultyMap.get(faculty)+"@student.unhas.ac.id").toLowerCase();
    }
    public String getEmail (){
        return email;
    }
    public void setRegisterYear (int registryYear){
        this.registryYear = registryYear;
    }
    public void setFaculty (String faculty){
        this.faculty = faculty;
    }
    public String getFaculty (){
        return faculty;
    }
    public void setDepartment (String department){
        this.department = department;
    }
    public String getDepartment (){
        return department;
    }
    public void setMajor (String major){
        this.major = major;
    }
    public String getMajor (){
        return major;
    }
    //untuk membuat full name
    public String getFullName (){
        //untuk menggabungkan nama yang di split
        String [] fullName = (firstName+" "+lastName).split(" ");
        String newFullName = "";
        //untuk menjadikan huruf pertama nama jadi huruf kapital
        for(int i=0;i<fullName.length;i++){
            newFullName += fullName[i].substring(0,1).toUpperCase()+fullName[i].substring(1)+ " ";
        }
        return newFullName;
    }
    public void description(){
        System.out.printf("\nNama\t\t\t: %s\nNIM\t\t\t\t: %s\nEmail Mahasiswa\t: %s\nFakultas\t\t: %s\nDepartemen\t\t: %s\nProgram Studi\t: %s\n", getFullName(),getId(),getEmail(),getFaculty(),getDepartment(),getMajor());
    }
}
