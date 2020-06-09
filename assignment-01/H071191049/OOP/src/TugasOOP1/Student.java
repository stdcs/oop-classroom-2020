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
    public boolean checkIt = true;
    //untuk mengecek adanya input yang tidak beres
    public void check (Map<String,String> facultyMap, Map<String, String> majorMap){
        if(facultyMap.get(faculty)==null || majorMap.get(major)==null || registryYear<100){
            checkIt=false;
        }
    }
    //untuk mengatur id
    public void setId (Map<String, String> facultyMap, Map<String, String> majorMap){
        Random r = new Random();
        check(facultyMap, majorMap);
        id = checkIt == true ? facultyMap.get(faculty)+majorMap.get(major)+"1"+String.valueOf(registryYear).substring(String.valueOf(registryYear).length()-2)+"1"+String.format("%03d",r.nextInt(60)+1):"";
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
        //jika first name kosong
        if(firstName.equals("")){
            firstName=lastName;
            lastName="";
        }
        //menggabungkan nama menjadi array yang di split dengan spasi
        String [] fullName = (firstName+" "+lastName).split(" ");
        String nameSub = "";
        //penambahan huruf pertama pada nama ke email
        for(int i=0;i<fullName.length-1;i++){
            nameSub+=fullName[i].substring(0,1);
        }
        //jika first name dan last name kosong
        if(firstName.equals("")&&lastName.equals("")){
            checkIt = false;
        }
        email = checkIt==true ? (fullName[fullName.length-1]+nameSub+String.valueOf(registryYear).substring(String.valueOf(registryYear).length()-2)+facultyMap.get(faculty)+"@student.unhas.ac.id").toLowerCase():"";
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
    public void setMajor (String major){
        this.major = major;
    }
    public void setDepartment (String department){
        this.department = department;
    }

    public String getFaculty (){
        return faculty;
    }
    public String getDepartment (){
        return department;
    }
    public String getMajor (){
        return major;
    }
    //untuk membuat full name
    public String getFullName (){
        //jika first name kosong maka last name jadi first name
        if(firstName.equals("")){
            firstName=lastName;
            lastName="";
        }
        //jika first name dan last name kosong
        if(firstName.equals("")&&lastName.equals("")){
            checkIt = false;
            return "";
        }
        //untuk menggabungkan nama yang di split
        String [] fullName = (firstName+" "+lastName).split(" ");
        String newFullName = "";
        //untuk menjadikan huruf pertama nama jadi huruf kapital
        for(int i=0;i<fullName.length;i++){
            newFullName += fullName[i].substring(0,1).toUpperCase()+fullName[i].substring(1)+ " ";
        }
        return newFullName;
    }
    public String getLastName (){
        return lastName;
    }
    public void description(){   
        if(checkIt == true){
        System.out.println("\nDATA MAHASISWA");
        System.out.printf("Nama            : %s\n",getFullName());
        System.out.printf("NIM             : %s\n",getId());
        System.out.printf("Email Mahasiswa : %s\n",getEmail());
        System.out.printf("Fakultas        : %s\n",getFaculty());
        System.out.printf("Departemen      : %s\n",getDepartment());
        System.out.printf("Program Studi   : %s\n\n",getMajor());
        }
        else{
            System.out.println("Harap Periksa Data yang anda input");
        }
    }
}
