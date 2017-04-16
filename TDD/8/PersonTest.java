import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PersonTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=java.lang.NullPointerException.class)
	public void test() {
		assertEquals("1shubham22male",Person.getInstancePerson("shubham", 22, "male").toString());
		assertEquals("20male",Person.getInstancePerson("", 0, "male").toString());
		//all test show NullPointerException
		assertEquals("Exception",Person.getInstancePerson("", 0, "mal").toString());//because wrong gender
		assertEquals("Exception",Person.getInstancePerson("", -1, "male").toString());//because wrong age
		assertEquals("Exception",Person.getInstancePerson("", 200, "male").toString());//because wrong age
		
		assertEquals("3Aishwariya22female",Person.getInstancePerson("Aishwariya", 22, "female").toString());
	}

}
