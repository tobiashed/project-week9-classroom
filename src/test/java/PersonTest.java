import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {

	@Test
	public void testPerson() {
		Person p = new Person("Rafael", "Silva", 30,'M');
		assertEquals(p.getFirstName().equals("Rafael"),true);
		assertEquals(p.getLastName().equals("Silva"),true);
		assertEquals(p.getAge(),30, 0);
		assertEquals(p.getGender(),'M', 0);
	}

}
