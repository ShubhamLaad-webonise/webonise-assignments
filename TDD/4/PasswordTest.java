import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PasswordTest {
	Password password;
	@Before
	public void setUp() throws Exception {
		password=new Password();
	}
	@Test
	public void testPass() {
		assertTrue(password.isValid("shubham123456@"));
		assertTrue(password.isValid("s12345678@"));
		assertTrue(password.isValid("12sshhsss@"));
		assertTrue(password.isValid("@1222ssssss"));
		assertTrue(password.isValid("@#1222ssssss"));
		assertTrue(password.isValid("-_@#!@#$%^&*1S"));
		assertTrue(password.isValid("-_---------1S"));


	}
	@Test
	public void testFail() {
	assertFalse(password.isValid(""));
	assertFalse(password.isValid("----"));
	assertFalse(password.isValid("123"));
	assertFalse(password.isValid("aaa"));	
	assertFalse(password.isValid("DDD.DDD"));
	assertFalse(password.isValid(" "));//space	
	assertFalse(password.isValid("aaaaaaaaaa"));
	assertFalse(password.isValid("@@aaaaaaaaaa"));
	assertFalse(password.isValid("@@11111"));
	assertEquals(false,password.isValid("aaaa11111"));
	assertFalse(password.isValid("@@SSSSSSS"));
	assertFalse(password.isValid("@@11Sa"));//length
	
	
		
	}
	

}
