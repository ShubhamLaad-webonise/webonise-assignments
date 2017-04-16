import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class UserNameTest {

	UserName user;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		user=new UserName();
	}


	@Test
	public void testPass() {
	
		assertEquals(true,user.isValid("asdfg"));
		
		assertTrue(user.isValid("aaaaaa,."));
		assertTrue(user.isValid("ABCDE--"));
		assertEquals(true,user.isValid("abcda-_eaa"));
		
		assertTrue(user.isValid("abcdefghij"));
		assertTrue(user.isValid("aaaaa--"));
		assertTrue(user.isValid("abcde--ss"));
		assertTrue(user.isValid("abcdess"));
		assertTrue(user.isValid("a.ssss"));

	}
@Test
	public void testFail(){
		assertFalse(user.isValid(""));
		assertFalse(user.isValid("sss"));
		assertFalse(user.isValid("-----"));
		assertFalse(user.isValid("--shubham"));
		assertFalse(user.isValid("       "));
		assertFalse(user.isValid("sssss111"));
	

		
	}
}