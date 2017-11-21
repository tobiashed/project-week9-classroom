import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;
import otherclasses.Student;

public class StudentTest {

	Student s = new Student("Rafael", "Silva", 30,'M',6,7,8);
	Student s2 = new Student("Tobias", "Hedkvist", 38, 'M');
	
	@Test
	public void testStudent() {
		assertEquals(s2.getFirstName().equals("Tobias"),true);
		assertEquals(s2.getLastName().equals("Hedkvist"),true);
		assertEquals(s2.getAge(),38, 0);
		assertEquals(s2.getGender(),'M', 0);
	}
	@Test
	public void testStudent2() {
		
		assertEquals(s.getFirstName().equals("Rafael"),true);
		assertEquals(s.getLastName().equals("Silva"),true);
		assertEquals(s.getAge(),30, 0);
		assertEquals(s.getGender(),'M', 0);
		assertEquals(s.getFirstGrade(),6, 0);
		assertEquals(s.getSecondGrade(),7, 0);
		assertEquals(s.getThirdGrade(),8, 0);
	}
	@Test
	public void testSetFirstGrade() {
		
		s.setFirstGrade(6);
		assertTrue(s.getFirstGrade() == 6);
	}
	@Test
	public void testSetSecondGrade() {
		
		s.setSecondGrade(7);
		assertTrue(s.getSecondGrade() == 7);
	}
	@Test
	public void testSetThirdGrade() {
		
		s.setThirdGrade(8);
		assertTrue(s.getThirdGrade() == 8);
	}
	@Test
	public void testSetAverageGrade() {
	
		s.setAverageGrade(7);
		assertTrue(s.getAverageGrade() == 7);
	}
	
	@Test
	public void testCalculateAverage() {
		
		s.calculateAverage(6, 7, 8);
		assertTrue(s.getAverageGrade() == (6+7+8)/3);
		s.calculateAverage(6);
		assertTrue(s.getAverageGrade() == (6+s.getSecondGrade()+s.getThirdGrade())/3);
		s.calculateAverage();
		assertTrue(s.getAverageGrade() == (s.getFirstGrade()+s.getSecondGrade()+s.getThirdGrade())/3);
	}
	
	@Test
	public void testHasClearedTheCourse() {
		s.setAverageGrade(7);
		s2.setAverageGrade(5);
		assertEquals(s.hasClearedTheCourse(), true);
		assertEquals(s2.hasClearedTheCourse(), false);
	}
	@Test
	public void testToString() {
		String result = s.toString();
		assertEquals(s.toString().equals(result),true);
		String result2 = s2.toString();
		assertEquals(s2.toString().equals(result2),true);
	}
}