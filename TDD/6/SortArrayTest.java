import static org.junit.Assert.*;

import org.junit.Test;

public class SortArrayTest {

	@Test
	public void testDouble() {
	
		assertArrayEquals(new double[]{1,2,3,4},SortArray.sortArray(new double[]{3,2,4,1}),0);
		assertArrayEquals(new double[]{0,0,1,2,3.5,4},SortArray.sortArray(new double[]{3.5,2,0,4,1,0}),0);
		assertArrayEquals(new double[]{},SortArray.sortArray(new double[]{}),0);
		assertArrayEquals(new double[]{0,0,0,0},SortArray.sortArray(new double[]{0,0,0,0}),0);
		assertArrayEquals(new double[]{-9,-1,3,6},SortArray.sortArray(new double[]{-1,3,6,-9}),0);		
		assertArrayEquals(new double[]{0,Double.MIN_VALUE,Double.MAX_VALUE},SortArray.sortArray(new double[]{Double.MAX_VALUE,0,Double.MIN_VALUE}),0);

	}

	

}
