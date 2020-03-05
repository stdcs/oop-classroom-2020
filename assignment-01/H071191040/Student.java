import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Student
{
	static Map <String, Integer> departNumber = new HashMap<>();
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private int registerYear;
	private String faculty;
	private String department;
	private String major;


	void setId(String id)
	{

		this.id = id;
	}

	String getId()
	{
		return id;
	}

	void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	void setEmail(String email)
	{
		this.email = email;
	}

	String getEmail()
	{
		return email;
	}

	void setRegisterYear(int registerYear)
	{
		this.registerYear = registerYear;
	}

	void setFaculty(String faculty)
	{
		this.faculty = faculty;
	}

	String getFaculty()
	{
		return faculty;
	}

	void setDepartment(String department)
	{
		this.department = department;
	}

	String getDepartment()
	{
		return department;
	}

	void setMajor(String major)
	{
		this.major = major;
		setMap();
	}

	String getMajor()
	{
		return major;
	}

	void setId(Map <String, String> facultyMap, Map <String, String> majorMap)
	{
		int lastdigit = departNumber.get(major) + 1;
		String facultyCode = facultyMap.get(faculty);
		String majorCode = majorMap.get(major);
		id = String.format("%s%s1%s1%03d",facultyCode, majorCode, registerYear%100, lastdigit);
		departNumber.put(major, departNumber.get(major)+1);

	}

	void setEmail(Map <String, String> facultyMap)
	{
		String splitName[] = getFullName().split(" ");
		String lname = splitName[splitName.length-1].toLowerCase();
		char [] letter = new char[splitName.length-1];
		String facultyCode = facultyMap.get(faculty).toLowerCase();

		for(int i = 0; i < letter.length; i++)
		{
			letter[i] = splitName[i].charAt(0);
		}

		String letters = new String(letter).toLowerCase();
		email = String.format("%s%s%d%s@student.unhas.ac.id", lname, letters, registerYear%100, facultyCode);


	}

	String getFullName()
	{
			String splitFname[] = (firstName + " " + lastName).split(" ");
			String fullName = "";
		try
		{
			for(int i = 0; i < splitFname.length; i++)
			{
				fullName += camelCase(splitFname[i]) + " ";
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			splitFname = lastName.split(" ");

			for(int i = 0; i < splitFname.length; i++)
			{
				fullName += camelCase(splitFname[i]) + " ";
			}
		}
		

		return fullName;
	}

	void description()
	{
		System.out.println("Name 			: " + getFullName());
		System.out.println("NIM 			: " + getId());
		System.out.println("Email Mahasiswa 	: " + getEmail());
		System.out.println("Fakultas 		: " + getFaculty());
		System.out.println("Departemen 		: " + getDepartment());
		System.out.println("Program Studi 		: " + getMajor());
		System.out.println();
	}

	String camelCase(String name)
	{
		name = name.toLowerCase();

		return String.format("%c%s", name.charAt(0)-('a'-'A'), name.substring(1, name.length()));
	}

	void setMap() 
	{ 

		if(departNumber.get(major) == null)
		{
			departNumber.put(major, 0);
		}

	}


}