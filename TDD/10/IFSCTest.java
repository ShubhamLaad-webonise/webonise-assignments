import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class IFSCTest {

	IFSC ifscCode;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ifscCode=new IFSC();
	}
	

	@Test
	public void testCaseFailure()
	{
	assertFalse(ifscCode.isValid("0123456HSBC"));
	assertFalse(ifscCode.isValid("ICICI0123456"));
	assertFalse(ifscCode.isValid("HBCD1023456"));
	assertFalse(ifscCode.isValid("dgdg0457547"));
	assertFalse(ifscCode.isValid(""));
	assertFalse(ifscCode.isValid("     "));
	assertFalse(ifscCode.isValid("abcd0123445"));//bank name in small letter
	assertFalse(ifscCode.isValid("SBIN0abcder"));
	}
	@Test
	public void testCaseSuccess()
	{
	assertTrue(ifscCode.isValid("SBII0123456"));
	assertTrue(ifscCode.isValid("HDFC0345346"));
	assertTrue(ifscCode.isValid("SBIN0002375"));
	assertTrue(ifscCode.isValid("ABCD0ABCDEF"));
	

	
	}

}