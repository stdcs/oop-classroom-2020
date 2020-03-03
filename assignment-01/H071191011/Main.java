import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

class Main
{
	public static void main(String[] args) throws IOException {
		// Buat mapping
		Map<String, String> facultyMap = new HashMap<String, String>();
		Map<String, String> majorMap = new HashMap<String, String>();
		Map<String, String> departmentMap = new HashMap<String, String>();
		facultyMap.put("MIPA", "H");
		majorMap.put("Ilmu Komputer", "07");
		departmentMap.put("Ilmu Komputer", "Matematika");

		// Daftar student
		ArrayList<Student> students = new ArrayList<Student>();

		// Buat reader
		InputStreamReader r = new InputStreamReader(new FileInputStream("file.txt"), StandardCharsets.UTF_8);
		BufferedReader reader = new BufferedReader(r);

		// Baca file baris per baris
		for (String line = reader.readLine(); line != null; line = reader.readLine())
		{
			// Baris kosong? skip
			if (line.length() == 0) continue;

			// Split
			String[] splitted = line.split(";");

			// Buat "Student" baru
			Student student = new Student();
			student.setFirstName(splitted[0]);
			student.setLastName(splitted[1]);
			student.setFaculty(splitted[2]);
			student.setMajor(splitted[3]);
			student.setDepartment(departmentMap.get(splitted[3]));
			student.setRegisterYear(Integer.parseInt(splitted[4]));
			student.setId(facultyMap, majorMap);
			student.setEmail(facultyMap);
			students.add(student);
		}

		// Tutup file
		reader.close();

		// Tampilkan deskripsi
		for (Student student: students)
			student.description();
	}
}
