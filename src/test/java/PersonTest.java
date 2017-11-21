import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import otherclasses.Person;

public class PersonTest {
	Person p = new Person("Rafael", "Silva", 30,'M');
	@Test
	public void testPerson() {
		
		assertEquals(p.getFirstName().equals("Rafael"),true);
		assertEquals(p.getLastName().equals("Silva"),true);
		assertEquals(p.getAge(),30, 0);
		assertEquals(p.getGender(),'M', 0);
	}
	@Test
	public void testSetFirstName() {
		p.setFirstName("Rafael");
		String firstName = p.getFirstName();
		assertTrue(firstName.equals("Rafael"));
		
	}
	@Test
	public void testSetLastName() {
		p.setLastName("Silva");
		String lastName = p.getLastName();
		assertTrue(lastName.equals("Silva"));
		
	}
	@Test
	public void testSetAge() {
		p.setAge(30);;
		//int age = p.getAge();
		//assertTrue(age == 30);
		assertEquals(30,p.getAge());
	}
	@Test
	public void testSetGender() {
		p.setGender('M');
		//char gender = p.getGender();
		//assertTrue(gender == 'M');
		assertEquals('M',p.getGender());
	}


}
