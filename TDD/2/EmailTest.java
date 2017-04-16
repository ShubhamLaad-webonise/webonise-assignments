import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EmailTest {

	Email email;


	@Before
	public void setUp() throws Exception {
		email=new Email();
	}



	@Test
	public void testFail() {
		assertEquals(false,email.isValid(""));
		assertEquals(false,email.isValid("11"));
		assertEquals(false,email.isValid("@."));
		assertEquals(false,email.isValid("s@s."));
		assertEquals(false,email.isValid("@s.s"));
		assertEquals(false,email.isValid("@.s"));
		assertFalse(email.isValid("1.1@1"));
		assertFalse(email.isValid("1.1.1"));
		assertFalse(email.isValid("1.1@gmail.com.d"));//d should be of length 2
		assertFalse(email.isValid("@gmail.com"));
		assertFalse(email.isValid("s*@gmail.com"));
		
}




	@Test
	public void testPass(){
		assertTrue(email.isValid("shubhamlaad666@1.c"));
		assertTrue(email.isValid("s@s.s"));
		assertTrue(email.isValid("s@s.s.ab"));
		assertTrue(email.isValid("1.1@gmail.com.dd"));
		assertTrue(email.isValid("s.s@gmail.c.ss.ss"));
		assertTrue(email.isValid("s.s@122.c.ss.sssss"));
		assertTrue(email.isValid("s-@gmail.com"));
	
		
	}




}