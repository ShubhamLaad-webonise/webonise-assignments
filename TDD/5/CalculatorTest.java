import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
Calculator calculator;
	@Before
	public void setUp(){
	calculator =new Calculator();
	}
	
	@Test
	public void testAdd() {
		//addition test cases
		assertEquals(0,calculator.add(0, 0),0);
		assertEquals(-2.1,calculator.add(-1.1, -1),0);
		assertEquals(0.9,calculator.add(0.4, 0.5),0);
		assertEquals(8.9444,calculator.add(8.4444, 0.5),0);
		assertEquals(8.94445555555555555555555555333333333,calculator.add(8.44445555555555555555555555333333333, 0.5),0);
	}
	@Test
	public void testSubtract(){	
		//subtraction test cases
		assertEquals(0,calculator.subtract(0, 0),0);
		assertEquals(0,calculator.subtract(-1, -1),0);
		assertEquals(12.2,calculator.subtract(11.2, -1),0);
	    assertEquals(-0.1,calculator.subtract(0.4, 0.5),0.0000000001);
		assertEquals(7.9444,calculator.subtract(8.4444, 0.5),0);
	}
	@Test
	public void testMultiply(){
		//multiplication test cases
		assertEquals(0,calculator.multiply(0, 0),0);
		assertEquals(0,calculator.multiply(0, 5.5),0);
		assertEquals(-4.2,calculator.multiply(2, -2.1),0);
		assertEquals(12,calculator.multiply(-4, -3),0);
	}
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivision(){
		//division test cases
		assertEquals(0.0,calculator.divide(0, 0),0);
		assertEquals(0,calculator.divide(0, 5.5),0);
		assertEquals(-2,calculator.divide(-6, 2),0);
		assertEquals(2,calculator.divide(-4, -2),0);
		assertEquals(1.3333333333,calculator.divide(-4, -3),10);
		}
}
