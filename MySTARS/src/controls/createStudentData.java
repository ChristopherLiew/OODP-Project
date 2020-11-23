package controls;
import entities.Student;
import entities.Hash;
import entities.Student;
import controls.SerializeDB;
import java.util.ArrayList;
import java.util.List;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class createStudentData {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		ArrayList<Student> studentData = new ArrayList();

		// scse students
		Student student1 = new Student("Tom", "Tom1998", Hash.encode("TomPassword"), "Male", "Singaporean", 11, "U190123A");

		student1.setAcademicUnits(6);
		HashMap<String,String> stud1Courses = new HashMap<String, String>();
		stud1Courses.put("CZ1007", "CZ1007SS1");
		stud1Courses.put("CZ2001", "CZ2001SS1");
		student1.setRegisteredCourses(stud1Courses);

		Student student2 = new Student("Dick", "Dick1998", Hash.encode("DickPassword"), "Male", "Singaporean", 11, "U234234D");

		student2.setAcademicUnits(6);
		HashMap<String,String> stud2Courses = new HashMap<String, String>();
		stud2Courses.put("CZ1007", "CZ1007SS1");
		stud2Courses.put("CZ2001", "CZ2001SS1");	
		student2.setRegisteredCourses(stud2Courses);

		Student student3 = new Student("Harry", "Harry1998", Hash.encode("HarryPassword"), "Male", "Singaporean", 11, "U234760H");

		student3.setAcademicUnits(6);
		HashMap<String,String> stud3Courses = new HashMap<String, String>();
		stud3Courses.put("CZ1007", "CZ1007SS2");
		stud3Courses.put("CZ2001", "CZ2001SS2");
		student3.setRegisteredCourses(stud3Courses);
		

		Student student4 = new Student("John", "John1997", Hash.encode("JohnPassword"), "Male", "Malaysian", 11, "U084287J");
		
		student4.setAcademicUnits(6);
		HashMap<String,String> stud4Courses = new HashMap<String, String>();
		stud4Courses.put("CZ1007", "CZ1007SS2");
		stud4Courses.put("CZ2001", "CZ2001SS2");
		student4.setRegisteredCourses(stud4Courses);
		
		 
		Student student5 = new Student("Peter", "Peter1997", Hash.encode("PeterPassword"), "Male", "Chinese", 11, "U092367P");

		// nbs students
		Student student6 = new Student("Alexander", "Alexander1997", Hash.encode("AlexanderPassword"), "Male", "Indian", 21, "U092134A");
		student6.setAcademicUnits(6);
		HashMap<String,String> stud6Courses = new HashMap<String, String>();
		stud6Courses.put("BU8201", "BU8201BU1");
		stud6Courses.put("AB1301", "AB1301BU1");
		student6.setRegisteredCourses(stud6Courses);

		Student student7 = new Student("Jane", "Jane1999", Hash.encode("JanePassword"), "Female", "Malaysian", 21, "U093154J");
		student7.setAcademicUnits(6);
		HashMap<String,String> stud7Courses = new HashMap<String, String>();
		stud7Courses.put("BU8201", "BU8201BU1");
		stud7Courses.put("AB1301", "AB1301BU1");
		student7.setRegisteredCourses(stud7Courses);

		Student student8 = new Student("Elizabeth", "Elizabeth1999", Hash.encode("ElizabethPassword"), "Female", "Indonesian", 21, "U973243E");
		student8.setAcademicUnits(6);
		HashMap<String,String> stud8Courses = new HashMap<String, String>();
		stud8Courses.put("BU8201", "BU8201BU2");
		stud8Courses.put("AB1301", "AB1301BU2");
		student8.setRegisteredCourses(stud8Courses);

		Student student9 = new Student("Catherine", "Catherine1999", Hash.encode("CatherinePassword"), "Female", "Vietnamnese", 21, "U998342C");
		student9.setAcademicUnits(6);
		HashMap<String,String> stud9Courses = new HashMap<String, String>();
		stud9Courses.put("BU8201", "BU8201BU2");
		stud9Courses.put("AB1301", "AB1301BU2");
		student9.setRegisteredCourses(stud9Courses);

		Student student10 = new Student("Adeline", "Adeline1999", Hash.encode("AdelinePassword"), "Female", "Malaysian", 21, "U198752A");

		// sss students

		Student student11 = new Student("George", "George1999", Hash.encode("GeorgePassword"), "Male", "Indonesian", 31, "U912734G");
		student11.setAcademicUnits(6);
		HashMap<String,String> stud11Courses = new HashMap<String, String>();
		stud11Courses.put("HP1000", "HP1000HP1");
		stud11Courses.put("HE9091", "HE9091HP1");
		student11.setRegisteredCourses(stud11Courses);

		Student student12 = new Student("Paul", "Paul1999", Hash.encode("PaulPassword"), "Male", "Singaporean", 31, "U193274P");
		student12.setAcademicUnits(6);
		HashMap<String,String> stud12Courses = new HashMap<String, String>();
		stud12Courses.put("HP1000", "HP1000HP1");
		stud12Courses.put("HE9091", "HE9091HP1");
		student12.setRegisteredCourses(stud12Courses);

		Student student13 = new Student("Jack", "Jack1998", Hash.encode("JackPassword"), "Male", "Malaysian", 31, "U298733J");
		student13.setAcademicUnits(6);
		HashMap<String,String> stud13Courses = new HashMap<String, String>();
		stud13Courses.put("HP1000", "HP1000HP2");
		stud13Courses.put("HE9091", "HE9091HP2");
		student13.setRegisteredCourses(stud13Courses);

		Student student14 = new Student("Jacqueline", "Jacqueline1999", Hash.encode("JacquelinePassword"), "Female", "Singaporean", 31, "U129248J");
		student14.setAcademicUnits(6);
		HashMap<String,String> stud14Courses = new HashMap<String, String>();
		stud14Courses.put("HP1000", "HP1000HP2");
		stud14Courses.put("HE9091", "HE9091HP2");
		student14.setRegisteredCourses(stud14Courses);

		
		Student student15 = new Student("Kenny", "Kenny1999", Hash.encode("KennyPassword"), "Male", "Singaporean", 31, "U193844K");
		

		studentData.add(student1);
		studentData.add(student2);
		studentData.add(student3);
		studentData.add(student4);
		studentData.add(student5);
		studentData.add(student6);
		studentData.add(student7);
		studentData.add(student8);
		studentData.add(student9);
		studentData.add(student10);
		studentData.add(student11);
		studentData.add(student12);
		studentData.add(student13);
		studentData.add(student14);
		studentData.add(student15);


		try {
			SerializeDB sdb = new SerializeDB();

			// write to serialized file - update/insert/delete
			sdb.writeSerializedObject("student.dat", studentData);
		}

		catch (Exception e) {
			System.out.println("Exception >> " + e.getMessage());
		}
	}
}

