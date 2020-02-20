package TugasOOP1;
import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Map<String, String> facultyMap = new HashMap<>();
        Map<String, String> majorMap = new HashMap<>();
        facultyMap.put("FEB", "A");
        facultyMap.put("FK", "B");
        facultyMap.put("FT", "C");
        facultyMap.put("Fasilkom", "D");
        facultyMap.put("FISIP", "E");
        facultyMap.put("FIB", "F");
        facultyMap.put("FIKP", "G");
        facultyMap.put("MIPA", "H");
        majorMap.put("Matematika", "01");
        majorMap.put("Fisika", "02");
        majorMap.put("Biologi", "03");
        majorMap.put("Kimia", "04");
        majorMap.put("Statistika", "05");
        majorMap.put("Geofisika", "06");
        majorMap.put("Ilmu Komputer", "07");
        majorMap.put("Aktuaria", "08");

        boolean repeat = false;
        do{
            Student student = new Student();
            System.out.print("First Name    : ");
            student.setFirstName(inp.nextLine());
            System.out.print("Last Name     : ");
            student.setLastName(inp.nextLine());
            System.out.print("Registry Year : ");
            try{
                student.setRegisterYear(inp.nextInt());
            }catch (InputMismatchException ie){
            }
            inp.nextLine();
            System.out.print("Faculty       : ");
            student.setFaculty(inp.nextLine());
            System.out.print("Department    : ");
            student.setDepartment(inp.nextLine());
            System.out.print("Major         : ");
            student.setMajor(inp.nextLine());
            student.setId(facultyMap, majorMap);
            student.setEmail(facultyMap);
            student.description();
            System.out.println("Do you want to input again y/n");
            String input = inp.next();
            inp.nextLine();
            if(input.equalsIgnoreCase("Y")){
                repeat=true;
            }
        }while(repeat==true);
    }
}


