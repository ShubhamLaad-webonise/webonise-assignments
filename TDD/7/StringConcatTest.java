import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringConcatTest {
	StringConcat stringConcatObj;
	
	@Before
	public void setUp(){
		stringConcatObj=new StringConcat();
	}
	@Test
		public void test() {
		assertEquals("shubham",stringConcatObj.ArrayToString(new String[]{"sh","ubham"}));
		assertEquals("",stringConcatObj.ArrayToString(new String[]{""}));
		assertEquals("shubham hi",stringConcatObj.ArrayToString(new String[]{"shubham"," ","hi"}));
		assertEquals("01s",stringConcatObj.ArrayToString(new String[]{"0","1","s"}));
		assertEquals("  ",stringConcatObj.ArrayToString(new String[]{" "," "}));
		assertEquals("s  ",stringConcatObj.ArrayToString(new String[]{"s "," "}));
	}

}
