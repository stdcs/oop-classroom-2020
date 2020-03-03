import java.util.*;

class Student {
	private String id, firstName, lastName, email;
	private int registerYear = 0;
	private String faculty, department, major;

	// Random number generator
	private static Random rng = new Random();

	// getter untuk "id"
	public String getId() {
		return id;
	}

	// setter untuk "id"
	public void setId(Map<String, String> facultyMap, Map<String, String> majorMap) {
		// Cek parameter
		if (facultyMap == null)
			throw new IllegalArgumentException("'facultyMap' null");
		if (majorMap == null)
			throw new IllegalArgumentException("'majorMap' null");
		if (faculty == null)
			throw new IllegalStateException("Fakultas belum diatur");
		if (registerYear == 0)
			throw new IllegalStateException("Tahun mendaftar belum diatur");

		// Ambil kode
		String facultyCode = facultyMap.get(faculty);
		if (facultyCode == null)
			throw new IllegalStateException("Fakultas '" + faculty + "'hilang");

		String majorCode = majorMap.get(major);
		if (majorCode == null)
			throw new IllegalStateException("Prodi '" + major + "'hilang");

		// Format
		id = String.format("%s%s1%02d1%03d", facultyCode, majorCode, registerYear % 100, rng.nextInt(60) + 1);
	}

	// setter untuk "firstName"
	public void setFirstName(String name)
	{
		if (name == null)
			throw new IllegalArgumentException("'name' null");

		firstName = fixName(name);
	}

	// setter untuk "lastName"
	public void setLastName(String name)
	{
		lastName = name == null || name.length() == 0 ? null : fixName(name);
	}

	// getter untuk "email"
	public String getEmail()
	{
		return email;
	}

	// setter untuk "email"
	public void setEmail(Map<String, String> facultyMap)
	{
		// Cek parameter
		if (facultyMap == null)
			throw new IllegalArgumentException("'facultyMap' null");
		if (faculty == null)
			throw new IllegalStateException("Fakultas belum diatur");
		if (registerYear == 0)
			throw new IllegalStateException("Tahun mendaftar belum diatur");

		// Ambil nama lengkap
		String completeName = getFullName().toLowerCase();

		// Ambil kode fakultas
		String facultyCode = facultyMap.get(faculty);
		if (facultyCode == null)
			throw new IllegalStateException("Fakultas '" + faculty + "'hilang");
		
		// Bentuk huruf pertama setiap suku kata dari setiap pecahan nama
		String[] splittedName = completeName.split("\\s+");
		char[] firstCharOfNames = new char[splittedName.length - 1];

		for (int i = 0; i < splittedName.length - 1; i++)
			firstCharOfNames[i] = splittedName[i].charAt(0);
		
		// Format email
		email = String.format(
			//1 2   3 4
			"%s%s%02d%s@student.unhas.ac.id",
			splittedName[splittedName.length - 1], // 1
			new String(firstCharOfNames).toLowerCase(), // 2
			registerYear % 100, // 3
			facultyCode.toLowerCase() // 4
		);
	}

	// setter untuk "registerYear"
	public void setRegisterYear(int year)
	{
		registerYear = year;
	}

	// getter untuk "faculty"
	public String getFaculty()
	{
		return faculty;
	}

	// setter untuk "faculty"
	public void setFaculty(String faculty)
	{
		if (faculty == null)
			throw new IllegalArgumentException("'faculty' null");
		
		this.faculty = faculty;
	}

	// getter untuk "department"
	public String getDepartment()
	{
		return department;
	}

	// setter untuk "department"
	public void setDepartment(String department)
	{
		if (department == null)
			throw new IllegalArgumentException("'department' null");
		
		this.department = department;
	}

	// getter untuk "major"/prodi
	public String getMajor()
	{
		return major;
	}

	// setter untuk "major"/prodi
	public void setMajor(String major)
	{
		if (major == null)
			throw new IllegalArgumentException("'major' null");
		
		this.major = major;
	}

	public String getFullName()
	{
		if (firstName == null)
			throw new IllegalStateException("Nama belum diatur");

		if (lastName != null)
			return String.format("%s %s", firstName, lastName);
		else
			return firstName;
	}

	public void description()
	{
		if (id == null)
			throw new IllegalStateException("NIM belum diatur");
		if (email == null)
			throw new IllegalStateException("E-Mail belum diatur");
		if (faculty == null)
			throw new IllegalStateException("Fakultas belum diatur");
		if (department == null)
			throw new IllegalStateException("Departemen belum diatur");
		if (major == null)
			throw new IllegalStateException("Prodi belum diatur");

		System.out.printf("Nama            : %s\n", getFullName());
		System.out.printf("NIM             : %s\n", id);
		System.out.printf("Email Mahasiswa : %s\n", email);
		System.out.printf("Fakultas        : %s\n", faculty);
		System.out.printf("Departemen      : %s\n", department);
		System.out.printf("Program Studi   : %s\n\n", major);
	}

	// Meperbaiki kapitalisasi nama
	private static String fixName(String name)
	{
		String[] list = name.split("\\s+");
		for (int i = 0; i < list.length; i++)
			// substring(0, 1) = huruf pertama
			// substring(1) = huruf kedua dan seterusnya
			list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1).toLowerCase();
		
		return String.join(" ", list);
	}
}
