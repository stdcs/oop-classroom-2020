package H071191016;

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
   private String fullName[];
   private String name;


   public String getId() {
      return this.id;
   }

   public void setFirstName(String firstName ) {
      this.firstName = firstName;
   }
   public void setLastName(String lastName) {
      name = firstName.toLowerCase() + " " + lastName.toLowerCase();
      fullName = name.split(" ");
      name = "";
      for (int i = 0; i < fullName.length; i++) {
         if(i == fullName.length - 1) {
            name += fullName[i].substring(0, 1).toUpperCase() + fullName[i].substring(1).toLowerCase();
         }
         else {
            name += fullName[i].substring(0, 1).toUpperCase() + fullName[i].substring(1).toLowerCase() +" ";
         }
      }
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

   public void setId(Map<String, String> facultyMap, Map<String, String> majorMap) {
      String facultyCode = facultyMap.get(getFaculty());
      String majorCode = majorMap.get(getMajor());

      Random rand = new Random();
      this.id = String.format("%s%s1%d1%03d",
         facultyCode,
         majorCode,
         this.registerYear % 100,
         rand.nextInt(60) + 1
      );
   }

   public void setEmail(Map<String, String> facultyMap) {
      for(int i = 0; i < fullName.length; i++) {
         email = fullName[fullName.length - 1];
      }
      for(int i = 0; i < fullName.length - 1; i++) {
         email += fullName[i].substring(0, 1);
      }
      email += registerYear % 100 + facultyMap.get(getFaculty()) + "@student.unhas.ac.id";
      email = email.toLowerCase(); 
   }
   
   public String getName() {
      
      return this.name;
   }
   public void desc() {
      System.out.println("Nama            = "+ getName());
      System.out.println("NIM             = "+ getId());
      System.out.println("Email           = "+ getEmail());
      System.out.println("Fakultas        = "+ faculty);
      System.out.println("Department      = "+ department);
      System.out.println("Program Studi   = "+ major);
      System.out.println();
   }
   
   
}
