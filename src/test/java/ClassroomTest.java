import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {
	ArrayList<Student> students = new ArrayList<Student>();
	Classroom cr = new Classroom("TEST15", "Spring 16", students);
	Student student1 = new Student("Rafael", "Silva", 20, 'M', 3.1, 5.4, 6.2);
	Student student2 = new Student("Fredrik", "Mellgren", 20, 'M', 8.0, 8.8, 6.1);
	Student student3 = new Student("Hans", "Ekstr�m", 20, 'M', 8.8, 5.0, 6.0);
	Student student4 = new Student("Patrik", "Hollsten", 20, 'F', 8.2, 7.3, 6.0);
	Student student5 = new Student("Gopi", "Sundarraj", 20, 'M', 8.2, 9.0, 6.0);

	

	@Test
	public void testClassroom() {
		
		assertEquals(cr.getClassroomName().equals("TEST15"),true);
		assertEquals(cr.getClassroomTerm().equals("Spring 16"),true);
		assertEquals(cr.getStudents().equals(students),true);
	}
	@Test
	public void testSetClassroomName() {
		
		cr.setClassroomName("TEST17");
		assertTrue(cr.getClassroomName().equals("TEST17"));
	}
	@Test
	public void testSetClassroomTerm() {
		
		cr.setClassroomTerm("Autumn 17");
		assertTrue(cr.getClassroomTerm().equals("Autumn 17"));
	}
	@Test
	public void testSetStudents() {
		ArrayList<Student> tempArrayList = new ArrayList<Student>();
		Student tempStudent = new Student("Temp", "Student", 20, 'M', 8.2, 9.0, 6.0);
		tempArrayList.add(tempStudent);
		cr.setStudents(tempArrayList);
		assertTrue(cr.getStudents().equals(tempArrayList));
	}
	@Test
	public void testAddANewStudent() {
		ArrayList<Student> tempArrayList = new ArrayList<Student>();
		ArrayList<Student> tempArrayList2 = new ArrayList<Student>();
		Classroom tempClassroom = new Classroom("Test", "Autumn", tempArrayList);
		Student tempStudent = new Student("Temp", "Student", 20, 'M', 8.2, 9.0, 6.0);
		tempArrayList2.add(tempStudent);
		tempClassroom.addANewStudent(tempStudent);
		assertTrue(tempClassroom.getStudents().equals(tempArrayList2));
		
	}
	@Test
	public void testRemoveAStudent() {
		
		cr.addANewStudent(student1);
		cr.addANewStudent(student2);
		cr.removeAStudent("Rafael");
		assertTrue(students.get(0).getFirstName().equals("Fredrik"));
		assertTrue(cr.getStudents().equals(students));
		cr.removeAStudent("Nisse");
		assertTrue(cr.getStudents().equals(students));
	}
	@Test
	public void testPrintFullRelatory() {
		cr.addANewStudent(student1);
		cr.printFullRelatory();
		
	}
}
